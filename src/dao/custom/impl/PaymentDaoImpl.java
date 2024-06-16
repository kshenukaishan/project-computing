package dao.custom.impl;

import dao.custom.PaymentDao;
import model.Payment;
import model.PurchaseOrder;

import java.util.List;
import java.util.Scanner;

public class PaymentDaoImpl implements PaymentDao {
    @Override
    public void viewAll(List<Payment> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<Payment> list, Scanner input) {

    }

    @Override
    public void update(List<Payment> list, Scanner input) {
        System.out.println("Enter Payment id for update");
        int id = input.nextInt();
        Payment payment = list.get(id - 1);

        boolean updateStatus = true;

        while(updateStatus){

            System.out.println("Enter new Description");
            String newDescription = input.nextLine();
            payment.setDescription(newDescription);
            input.nextLine();

            System.out.println("Enter new Amount");
            double amount = input.nextDouble();
            payment.setAmount(amount);
            input.nextLine();

            System.out.println("Enter Completed Status");
            int status = input.nextInt();
            payment.setCompleted(status);
            input.nextLine();

            System.out.println("Payment has been updated");
            updateStatus = false;
        }
        list.forEach(System.out::println);
    }

    @Override
    public void findById(List<Payment> list, Scanner input) {

    }

    @Override
    public void add(List<Payment> list, Scanner input) {
        boolean addStatus = true;
        while (addStatus){

            Payment payment = new Payment();

            System.out.println("Enter Payment Id");
            int id = input.nextInt();
            payment.setId(id);
            input.nextLine();

            System.out.println("Enter Description");
            String description = input.nextLine();
            payment.setDescription(description);
            input.nextLine();

            System.out.println("Enter Status Delivered");
            double amount = input.nextDouble();
            payment.setAmount(amount);
            input.nextLine();

            System.out.println("Enter Complete Status");
            int completed = input.nextInt();
            payment.setCompleted(completed);
            input.nextLine();

            list.add(payment);

            System.out.println("Payment has added!");

            System.out.println("Need to add another Payment?");
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
