package oop.project1.service;

import oop.project1.bean.Customer;

/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/28 13:22
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    /**
     * Description: 添加客户信息
     * @author Mrkino
     * @date 2020/8/28 14:59
     * @param customer;
     * @return true:添加成功;false:添加失败;
     **/
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }
    /**
     * Description 修改指定索引位置的客户信息
     * @author Mrkino
     * @date 2020/8/28 15:27
     * @param index
     * @param customer
     * @return true:修改成功;false:修改失败;
     **/
    public boolean replaceCustomer(int index,Customer customer){
        if (index<0||index>=total){
            return false;
        }
        customers[index] = customer;
        return true;
    }
    /**
     * Description 删除指定索引位置的客户信息
     * @author Mrkino
     * @date 2020/8/28 15:33
     * @param index
     * @return boolean
     **/
    public boolean deleteCustomer(int index){
        if (index<0||index>=total){
            return false;
        }
        for (int i = index;i<total-1;i++){
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){
        if(index<0||index>total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }
}
