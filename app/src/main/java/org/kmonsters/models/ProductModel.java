package org.kmonsters.models;

public class ProductModel {

    private String imgUrl,productName, deliveryMan;
    private Boolean productState;
    private CustomerModel customerModel;



    public ProductModel(String imgUrl, String productName, Boolean productState, CustomerModel customerModel) {
        this.imgUrl = imgUrl;
        this.productName = productName;
        this.productState = productState;
        this.customerModel = customerModel;
    }

    public ProductModel(String imgUrl, String productName, String deliveryMan, Boolean productState, CustomerModel customerModel) {
        this.imgUrl = imgUrl;
        this.productName = productName;
        this.deliveryMan = deliveryMan;
        this.productState = productState;
        this.customerModel = customerModel;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "imgUrl='" + imgUrl + '\'' +
                ", productName='" + productName + '\'' +
                ", deliveryMan='" + deliveryMan + '\'' +
                ", productState=" + productState +
                ", customerModel=" + customerModel +
                '}';
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Boolean getProductState() {
        return productState;
    }

    public void setProductState(Boolean productState) {
        this.productState = productState;
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

}
