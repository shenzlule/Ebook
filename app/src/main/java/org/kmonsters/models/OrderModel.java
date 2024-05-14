package org.kmonsters.models;

public class OrderModel {

    private String dateTime,product,amountOrdered,orderId,orderDeliveryLocation,orderCustomerId;
    private  CustomerModel customerModel;
    private Boolean orderState;

    public OrderModel(String dateTime, String product, String amountOrdered, String orderId, String orderDeliveryLocation, String orderCustomerId, CustomerModel customerModel, Boolean orderState) {
        this.dateTime = dateTime;
        this.product = product;
        this.amountOrdered = amountOrdered;
        this.orderId = orderId;
        this.orderDeliveryLocation = orderDeliveryLocation;
        this.orderCustomerId = orderCustomerId;
        this.customerModel = customerModel;
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "dateTime='" + dateTime + '\'' +
                ", product='" + product + '\'' +
                ", amountOrdered='" + amountOrdered + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderDeliveryLocation='" + orderDeliveryLocation + '\'' +
                ", orderCustomerId='" + orderCustomerId + '\'' +
                ", orderState=" + orderState +
                '}';
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAmountOrdered() {
        return amountOrdered;
    }

    public void setAmountOrdered(String amountOrdered) {
        this.amountOrdered = amountOrdered;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDeliveryLocation() {
        return orderDeliveryLocation;
    }

    public void setOrderDeliveryLocation(String orderDeliveryLocation) {
        this.orderDeliveryLocation = orderDeliveryLocation;
    }

    public String getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(String orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
    }

    public Boolean getOrderState() {
        return orderState;
    }

    public void setOrderState(Boolean orderState) {
        this.orderState = orderState;
    }
}
