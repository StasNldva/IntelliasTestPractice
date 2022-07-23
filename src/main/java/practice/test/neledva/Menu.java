package practice.test.neledva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu {

    final Scanner scanner = new Scanner(System.in);

    protected void getInfo() {
        int choiceMenu = scanner.nextInt();

        List<Products> prod = new ArrayList<Products>();
        prod.add(new Products(0, "milk", 12.4));
        prod.add(new Products(1, "chips", 31.6));
        prod.add(new Products(2, "Butter", 20));

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(0, "Stas", "Neledva", 345));
        customers.add(new Customer(1, "Jonh", "Snow", 153));
        customers.add(new Customer(2, "Elias", "Don", 20));


        switch (choiceMenu) {
            case 1:
                showProducts(prod);
                break;
            case 2:
                showCustomers(customers);
                break;
            case 3:buyProduct(prod, customers);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                scanner.close();
                break;
        }
    }

    protected void showProducts(List<Products> prod) {
        for (Products pr: prod) {
            System.out.println(pr.getId() + "\t" +
                    pr.getProductName() + "\t" +
                    pr.getProductPrice() + "$");
        }
    }

    protected void showCustomers(List<Customer> customers) {
        for (Customer cus : customers) {
            System.out.println(cus.getIdCustomer() + "\t" +
                    cus.getFirstName() + "\t" +
                    cus.getLastName() + "\t\t" +
                    cus.getAmountMoney() + "$");
        }
    }

    protected void buyProduct(List<Products> product, List<Customer> customer){
        System.out.println("choose the customer to buy the product(0,1,2): ");
        int numberOfCLient = scanner.nextInt();
        if (numberOfCLient >= 0 || numberOfCLient <=2){
            System.out.println(customer.get(numberOfCLient).getFirstName());
        }else{
            System.out.println("Customer not found");
        }
    }

}
