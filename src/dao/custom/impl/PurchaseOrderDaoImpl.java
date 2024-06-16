package dao.custom.impl;

import dao.custom.PurchaseOrderDao;
import model.PurchaseOrder;
import model.RepairOrder;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class PurchaseOrderDaoImpl implements PurchaseOrderDao {
    @Override
    public void viewAll(List<PurchaseOrder> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<PurchaseOrder> list, Scanner input) {
        System.out.println("Enter Repair Order id to delete");
        int selectedOrder = input.nextInt();
        PurchaseOrder orderToDelete = list.get(selectedOrder - 1);
        list.remove(orderToDelete);
    }

    @Override
    public void update(List<PurchaseOrder> list, Scanner input) {

    }

    @Override
    public void findById(List<PurchaseOrder> list, Scanner input) {
        System.out.println("Enter the ID of Repair Order");
        int id = input.nextInt();
        Stream<PurchaseOrder> purchaseOrderStream = list.stream().filter(order -> order.getId() == id);
        System.out.println(purchaseOrderStream);
    }

    @Override
    public void add(List<PurchaseOrder> list, Scanner input) {
        boolean addStatus = true;

        while (addStatus){

            PurchaseOrder purchaseOrder = new PurchaseOrder();

            System.out.println("Enter Purchase Order Id");
            int id = input.nextInt();
            purchaseOrder.setId(id);
            input.nextLine();

            System.out.println("Enter Description");
            String description = input.nextLine();
            purchaseOrder.setDescription(description);
            input.nextLine();

            System.out.println("Enter Status Completed");
            int status = input.nextInt();
            purchaseOrder.setDelivered(status);
            input.nextLine();

            System.out.println("Enter Return Date");
            String date = input.nextLine();
            purchaseOrder.setDeadLine(date);
            input.nextLine();


            list.add(purchaseOrder);

            System.out.println("Purchase Order has added!");

            System.out.println("Need to add another Order?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");

            int answer = input.nextInt();

            if (answer != 1) {
                addStatus = false;
            } else {
                addStatus = true;
            }
        }
        list.forEach(System.out::println);
    }
}
