package org.kmonsters.models;

import java.util.ArrayList;

public class CustomerModel {

    private String customerName,customerId,customerPhoneNumber;
    private  Boolean isSeller;
    private ArrayList<OrderModel> customerOrderList;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Boolean getSeller() {
        return isSeller;
    }

    public void setSeller(Boolean seller) {
        isSeller = seller;
    }

    public ArrayList<OrderModel> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(ArrayList<OrderModel> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }

    public CustomerModel(String customerName, String customerId, String customerPhoneNumber, Boolean isSeller, ArrayList<OrderModel> customerOrderList) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerPhoneNumber = customerPhoneNumber;
        this.isSeller = isSeller;
        this.customerOrderList = customerOrderList;
    }

    public CustomerModel(String customerName, String customerId, String customerPhoneNumber, Boolean isSeller) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerPhoneNumber = customerPhoneNumber;
        this.isSeller = isSeller;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", isSeller=" + isSeller +
                ", customerOrderList=" + customerOrderList +
                '}';
    }
}
