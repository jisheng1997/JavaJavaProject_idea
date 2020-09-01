package project3.service;

import project3.domain.Architect;
import project3.domain.Designer;
import project3.domain.Employee;
import project3.domain.Programmer;

/**
 * @ClassName : TeamService
 * @Description : 关于开发团队成员的管理：添加，删除等
 * @Author : MrKino
 * @Date : 2020/8/31 23:23
 * @Version : 1.0
 **/
public class TeamService {
    private static int counter = 1;//给memberID赋值使用
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队人数

    public TeamService() {
    }

    public Programmer[] getTeam(){
        Programmer [] team = new Programmer[total];
        for (int i= 0;i<team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }
    /**
     *
     * @Description 将指定的员工添加到开发团队中
     * @author Mrkino
     * @date 2020/8/31 23:31
     * @param employee
     * @return void
     */
    public void addMember(Employee employee) throws TeamException {
        if (total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        if (!(employee instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if (isExist(employee)){
            throw new TeamException("该员工已在本开发团队中");
        }

        Programmer programmer = (Programmer)employee;
        if ("BUSY".equals(programmer.getStatus().getNAME())){
            throw new TeamException("该员工已在本开发团队中");
        }else if ("VOCATION".equals(programmer.getStatus().getNAME())){
            throw new TeamException("该员工在休假");
        }

        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i = 0 ;i<total;i++){
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDes++;
            }else{
                numOfPro++;
            }
        }

        if (programmer instanceof Architect){
            if (numOfArch >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if (programmer instanceof Designer){
            if (numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else{
            if (numOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //将Employee添加到现有的team中
        team[total++] = programmer;
        programmer.setStatus(Status.BUSY);
        programmer.setMemberId(counter++);

    }
    /**
     *
     * @Description 删除团队成员
     * @author Mrkino
     * @date 2020/9/1 10:05
     * @param memberId
     * @return void
     */
    public void removeMember(int memberId) throws TeamException {
        int i =0;
        for(;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i==total){
            throw new TeamException("未找到该员工");
        }
        for (int j = i+1;j<total;j++){
                team[j-1] = team[j];
        }
        team[--total] = null;
    }
    /**
     *
     * @Description 判断指定的员工是否已经存在于现有的开发团队中
     * @author Mrkino
     * @date 2020/8/31 23:39
     * @param employee
     * @return boolean
     */
    private boolean isExist(Employee employee){
        for (int i= 0;i<total;i++){
            if (team[i].getId() == employee.getId()){
                return true;
            }
        }
        return false;
    }

}
