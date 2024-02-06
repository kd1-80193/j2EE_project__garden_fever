package com.app.dto;

public class ProductDTO {
    private int product_id;
    private String product_name;
    private double product_price;
    private String product_imageName;
    private int product_quantity;
    private boolean stock;
    private boolean live;
    private String product_description;

    public ProductDTO() {
        super();
    }

    public ProductDTO(int product_id, String product_name, double product_price, String product_imageName,
                      int product_quantity, boolean stock, boolean live, String product_description) {
        super();
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_imageName = product_imageName;
        this.product_quantity = product_quantity;
        this.stock = stock;
        this.live = live;
        this.product_description = product_description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_imageName() {
        return product_imageName;
    }

    public void setProduct_imageName(String product_imageName) {
        this.product_imageName = product_imageName;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    @Override
    public String toString() {
        return "ProductDTO [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
                + product_price + ", product_imageName=" + product_imageName + ", product_quantity=" + product_quantity
                + ", stock=" + stock + ", live=" + live + ", product_description=" + product_description + "]";
    }
}
