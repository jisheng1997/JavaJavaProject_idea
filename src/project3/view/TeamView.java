package project3.view;

import project3.domain.Employee;
import project3.domain.Programmer;
import project3.service.NameListService;
import project3.service.TeamException;
import project3.service.TeamService;


/**
 * @ClassName : TeamView
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/1 10:16
 * @Version : 1.0
 **/
public class TeamView {
    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }

    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    public NameListService getNameListService() {
        return nameListService;
    }

    public void setNameListService(NameListService nameListService) {
        this.nameListService = nameListService;
    }

    public TeamService getTeamService() {
        return teamService;
    }

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }

    public void enterMainMenu(){
        boolean loopflag = true;
        while (loopflag){
            listAllEmployee();
            System.out.print("1-团队列表 2-添加团队员工 3-删除团队成员 4-退出 请选择(1-4)");
            char menu = TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N):");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        loopflag = false;
                    }
                    break;
            }
        }


    }
    /**
     *
     * @Description 显示所有员工信息
     * @author Mrkino
     * @date 2020/9/1 10:19
     * @param
     * @return void
     */
    private void listAllEmployee(){
        System.out.println("-------------------------开发团队调度软件--------------------------");
        nameListService.getAllEmployees();
        Employee [] employees = nameListService.getAllEmployees();
        System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (int i = 1;i<employees.length;i++){
            System.out.println(employees[i]);
        }
        System.out.println("---------------------------------------------------------------");
    }
    private void getTeam(){
        System.out.println("------------------团队成员列表-------------------");
        Programmer[] team = teamService.getTeam();
        if (team == null||team.length ==0){
            System.out.println("开发团队目前没有成员");
        }else{
            System.out.println("TID/ID\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票");
            for (Programmer programmer : team) {
                System.out.println(programmer.getDetailForTeam());
            }
        }
        System.out.println("-----------------------------------------------");
    }

    private void addMember(){
        System.out.println("------------------添加成员-------------------");
        System.out.println("请输入要添加的员工的ID");
        int id =  TSUtility.readInt();
        Employee employee = null;
        try {
            employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
    }

    private void deleteMember(){
        System.out.println("------------------删除成员-------------------");
        System.out.println("请输入要添加的员工的TID");
        int memberId = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N):");

        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N'){
            return;
        }

        try {
            teamService.removeMember(memberId);
            System.out.println("删除成功");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }

    }
}
