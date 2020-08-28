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
    /*
     * @Description:
     * @Author: Mrkino
     * @Date: 2020/8/28 13:41
     * @Parameter: customer
     * @Return: false:添加失败，true:添加成功
     **/
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index,Customer customer){

        return true;
    }
}
