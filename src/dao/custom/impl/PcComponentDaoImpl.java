package dao.custom.impl;

import dao.custom.PcComponentDao;
import model.Laptop;
import model.PcComponent;
import type.ComputerType;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PcComponentDaoImpl implements PcComponentDao {
    @Override
    public void viewAll(List<PcComponent> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<PcComponent> list, Scanner input) {
        System.out.println("Enter Laptop id to delete");
        int id = input.nextInt();
        Optional<PcComponent> componentFind = list.stream().filter(component -> component.getId() == id).findFirst();
        list.remove(componentFind);
    }

    @Override
    public void update(List<PcComponent> list, Scanner input) {
        System.out.println("Enter Component id for update");
        int id = input.nextInt();
        PcComponent pcComponent = list.get(id - 1);

        boolean updateStatus = true;

        while(updateStatus){

            System.out.println("Enter new Brand");
            String newBrand = input.nextLine();
            pcComponent.setBrand(newBrand);
            input.nextLine();

            System.out.println("Enter new Date");
            String newDate = input.nextLine();
            pcComponent.setEntryDate(newDate);
            input.nextLine();

            System.out.println("Component has been updated");
            updateStatus = false;
        }
        list.forEach(System.out::println);
    }

    @Override
    public void findById(List<PcComponent> list, Scanner input) {
        System.out.println("Enter the ID of Laptop");
        int id = input.nextInt();
        Optional<PcComponent> firstComponent = list.stream().filter(desktop -> desktop.getId() == id).findFirst();
        System.out.println(firstComponent);
    }

    @Override
    public void add(List<PcComponent> list, Scanner input) {
        boolean addStatus = true;
        while (addStatus){

            System.out.println("Enter Component Id");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("Enter Brand");
            String brand = input.nextLine();
            input.nextLine();

            System.out.println("Enter Date received");
            String date = input.nextLine();
            input.nextLine();

            PcComponent pcComponent = new PcComponent(id, ComputerType.DESKTOP, brand, date);

            list.add(pcComponent);

            System.out.println("Pc Component has added!");

            System.out.println("Need to add another Computer?");
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
