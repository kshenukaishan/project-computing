package dao.custom.impl;

import dao.custom.RepairOrderDao;
import model.RepairOrder;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class RepairOrderDaoImpl implements RepairOrderDao {
    @Override
    public void viewAll(List<RepairOrder> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<RepairOrder> list, Scanner input) {
        System.out.println("Enter Repair Order id to delete");
        int selectedOrder = input.nextInt();
        RepairOrder orderToDelete = list.get(selectedOrder - 1);
        list.remove(orderToDelete);
    }

    @Override
    public void update(List<RepairOrder> list, Scanner input) {
        System.out.println("Enter Repair Order for update");
        int id = input.nextInt();
        RepairOrder repairOrderUpdate = list.get(id - 1);

        boolean updateStatus = true;

        while(updateStatus){

            System.out.println("Enter new Description");
            String newDescription = input.nextLine();
            repairOrderUpdate.setDescription(newDescription);
            input.nextLine();

            System.out.println("Enter new Status");
            int status = input.nextInt();
            repairOrderUpdate.setCompleted(status);
            input.nextLine();

            System.out.println("Enter new Return Date");
            String date = input.nextLine();
            repairOrderUpdate.setReturnDate(date);
            input.nextLine();

            System.out.println("Repair Order has been updated");
            updateStatus = false;
        }
        list.forEach(System.out::println);
    }

    @Override
    public void findById(List<RepairOrder> list, Scanner input) {
        System.out.println("Enter the ID of Repair Order");
        int id = input.nextInt();
        Optional<RepairOrder> foundRepairOrder = list.stream().filter(order -> order.getId() == id).findFirst();
        System.out.println(foundRepairOrder);
    }

    @Override
    public void add(List<RepairOrder> list, Scanner input) {
        boolean addStatus = true;

        while (addStatus){
            RepairOrder repairOrder = new RepairOrder();

            System.out.println("Enter Repair Order Id");
            int id = input.nextInt();
            repairOrder.setId(id);
            input.nextLine();

            System.out.println("Enter Description");
            String description = input.nextLine();
            repairOrder.setDescription(description);
            input.nextLine();

            System.out.println("Enter Status Completed");
            int status = input.nextInt();
            repairOrder.setCompleted(status);
            input.nextLine();

            System.out.println("Enter Return Date");
            String date = input.nextLine();
            repairOrder.setReturnDate(date);
            input.nextLine();


            list.add(repairOrder);

            System.out.println("Order has added!");

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
