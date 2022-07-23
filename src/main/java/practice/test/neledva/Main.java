package practice.test.neledva;

class Main {
    public static void main(String[] args) {
        System.out.println("Choice the menu: ");
        System.out.println("1. Display all Products");
        System.out.println("2. Display all Customers");
        System.out.println("3. Buy product for current customer");
        System.out.println("4. Display list of user products by user id");
        System.out.println("5. Display list of users that bought product by product id");
        System.out.println("6. Exit");
        Menu menu = new Menu();
        menu.getInfo();
    }
}
