package practice.test.neledva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu {

    protected void getInfo() {
        Scanner scanner = new Scanner(System.in);
        int choiceMenu = scanner.nextInt();

        switch (choiceMenu) {
            case 1:
                showProducts();
                break;
            case 2:
                showCustomers();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6: scanner.close();
                break;
        }
    }

    protected void showProducts() {
        List<Products> prod = new ArrayList<>();
        prod.add(new Products(0, "milk", 12.4));
        prod.add(new Products(1, "chips", 31.6));
        prod.add(new Products(2, "Butter", 20));

        for (Products products : prod) {
            System.out.println(products.getId() + "\t" +
                    products.getProductName() + "\t" +
                    products.getProductPrice() + "$");
        }
    }

    protected void showCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(0, "Stas", "Neledva", 345));
        customers.add(new Customer(1, "Jonh", "Snow", 153));
        customers.add(new Customer(2, "Elias", "Don", 20));

        for (Customer cus : customers) {
            System.out.println(cus.getIdCustomer() + "\t" +
                    cus.getFirstName() + "\t" +
                    cus.getLastName() + "\t" +
                    cus.getAmountMoney() + "$");
        }
    }

}
