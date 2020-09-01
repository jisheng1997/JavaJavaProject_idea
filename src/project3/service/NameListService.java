package project3.service;

import project3.domain.*;

import static project3.service.Data.*;

/**
 * @ClassName : NameListService
 * @Description : 负责将data中的数据封装到Employee[]数组中吗，同时提供相关操作Employee[]方法
 * @Author : MrKino
 * @Date : 2020/8/31 22:11
 * @Version : 1.0
 **/
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0;i<EMPLOYEES.length;i++){
            //获取
            int type = Integer.parseInt(EMPLOYEES[i][0]);

            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    employees[i] = new Designer(id,name,age,salary,equipment,Double.parseDouble(EMPLOYEES[i][5]));
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    employees[i] = new Architect(id,name,age,salary,equipment,Double.parseDouble(EMPLOYEES[i][5]),Integer.parseInt(EMPLOYEES[i][6]));
                    break;
            }
        }
    }
    /**
     * @Description 获取指定index上员工的设备
     * @author Mrkino
     * @date 2020/8/31 22:28
     * @param i
     * @return Equipment
     **/
    private Equipment createEquipment(int i) {
        int type = Integer.parseInt(EQUIPMENTS[i][0]);
        switch (type){
            case PC://21
                return new PC(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
            case NOTEBOOK://22
                return new NoteBook(EQUIPMENTS[i][1],Double.parseDouble(EQUIPMENTS[i][2]));
            case PRINTER://23
                return new Printer(EQUIPMENTS[i][1],EQUIPMENTS[i][2]);
        }
        return null;
    }
    /**
     * @Description 获取当前所有的员工
     * @author Mrkino
     * @date 2020/8/31 22:40
     * @param
     * @return Employee[]
     **/
    public Employee[] getAllEmployees(){
        return employees;
    }
    /**
     * @Description 获取指定ID的员工对象
     * @author Mrkino
     * @date 2020/8/31 22:41
     * @param id
     * @return Employee
     **/
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0;i<employees.length;i++){
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }

}
