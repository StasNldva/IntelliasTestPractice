package practice.test.neledva;

class Products {

    private int id;
    private String productName;
    private double productPrice;

    Products() {
        id = -1;
        productName = null;
        productPrice = -1.0;
    }

    Products(int id, String productName, double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    protected String getProductName() {
        return productName;
    }

    protected double getProductPrice() {
        return productPrice;
    }

    protected int getId() {
        return id;
    }

}
