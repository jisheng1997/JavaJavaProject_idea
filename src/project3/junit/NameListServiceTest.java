package project3.junit;

import org.junit.Test;
import project3.domain.Employee;
import project3.service.NameListService;
import project3.service.TeamException;

/**
 * @ClassName : NameListServiceTest
 * @Description : 对NameListService类测试
 * @Author : MrKino
 * @Date : 2020/8/31 22:49
 * @Version : 1.0
 **/
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService nameListService = new NameListService();
        int id = 15;
        try {
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        };
    }

}
