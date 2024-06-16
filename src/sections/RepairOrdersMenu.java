package sections;

import dao.custom.impl.RepairOrderDaoImpl;
import model.RepairOrder;
import util.MenuSetup;

import java.util.List;
import java.util.Scanner;

public class RepairOrdersMenu {

    public static void repairOrderSection(List<RepairOrder> repairOrders, Scanner input){

        String[] repairOrderMenuItems = new String[6];
        repairOrderMenuItems[0] = "(1) Add Order";
        repairOrderMenuItems[1] = "(2) Find Order";
        repairOrderMenuItems[2] = "(3) Update Order";
        repairOrderMenuItems[3] = "(4) Delete Order";
        repairOrderMenuItems[4] = "(5) View All Orders";
        repairOrderMenuItems[5] = "(6) Back";

        subMenuSection(repairOrders, input, repairOrderMenuItems);

    }

    private static void subMenuSection(List<RepairOrder> repairOrders, Scanner input, String[] menuItems){


        while(true){
        int selectedItem = MenuSetup.printMenu(menuItems, input);
            switch (selectedItem){
                case 0:
                    addOrders(repairOrders, input);
                    break;
                case 1:
                    findOrders(repairOrders, input);
                    break;
                case 2:
                    updateOrders(repairOrders, input);
                    break;
                case 3:
                    deleteOrders(repairOrders, input);
                    break;
                case 4:
                    viewAllOrders(repairOrders);
                    break;
                case 5:
                    System.out.println("Main Menu");
                    return;
            }
        }
    }

    private static void viewAllOrders(List<RepairOrder> repairOrders) {
        new RepairOrderDaoImpl().viewAll(repairOrders);
    }

    private static void deleteOrders(List<RepairOrder> repairOrders, Scanner input) {
        System.out.println("Delete orders");
    }

    private static void updateOrders(List<RepairOrder> repairOrders, Scanner input) {
        new RepairOrderDaoImpl().update(repairOrders, input);
    }

    private static void findOrders(List<RepairOrder> repairOrders, Scanner input) {
        System.out.println("Find orders");
    }

    private static void addOrders(List<RepairOrder> repairOrders, Scanner input) {
        new RepairOrderDaoImpl().add(repairOrders, input);
    }
}
