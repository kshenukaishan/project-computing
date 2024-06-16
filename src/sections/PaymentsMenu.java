package sections;

import dao.custom.impl.PaymentDaoImpl;
import model.Payment;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class PaymentsMenu {

    public static void paymentsSection(List<Payment> payments, Scanner input){

        String[] paymentMenuItems = new String[5];

        paymentMenuItems[0] = "(1) Add Payment";
        paymentMenuItems[1] = "(2) Find Payment";
        paymentMenuItems[2] = "(3) Update Payment Status";
        paymentMenuItems[3] = "(4) View All Completed Payments";
        paymentMenuItems[4] = "(5) Back";

        subMenuSection(payments, input, paymentMenuItems);

    }

    private static void subMenuSection(List<Payment> payments, Scanner input, String[] menuItems){

        while (true){
            int selectedItem = MenuSetup.printMenu(menuItems, input);

            switch (selectedItem){
                case 0:
                    addPayment(payments, input);
                    break;
                case 1:
                    findPayment(payments, input);
                    break;
                case 2:
                    updatePayment(payments, input);
                    break;
                case 3:
                    viewAllPayments(payments);
                    break;
                case 4:
                    System.out.println("Main Menu");
                    return;
            }
        }
    }

    private static void viewAllPayments(List<Payment> payments) {
        new PaymentDaoImpl().viewAll(payments);
    }

    private static void updatePayment(List<Payment> payments, Scanner input) {
        new PaymentDaoImpl().update(payments, input);
    }

    private static void findPayment(List<Payment> payments, Scanner input) {
        new PaymentDaoImpl().findById(payments, input);
    }

    private static void addPayment(List<Payment> payments, Scanner input) {
        new PaymentDaoImpl().add(payments, input);
    }
}
