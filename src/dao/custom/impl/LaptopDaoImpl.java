package dao.custom.impl;

import dao.custom.LaptopDao;
import model.Desktop;
import model.Laptop;
import type.ComputerType;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class LaptopDaoImpl implements LaptopDao {
    @Override
    public void viewAll(List<Laptop> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<Laptop> list, Scanner input) {
        System.out.println("Enter Desktop id to delete");
        int id = input.nextInt();
        Laptop laptop = list.get(id - 1);
        list.remove(laptop);
    }

    @Override
    public void update(List<Laptop> list, Scanner input) {
        System.out.println("Enter Desktop id for update");
        int id = input.nextInt();
        Laptop laptopUpdate = list.get(id - 1);

        boolean updateStatus = true;

        while(updateStatus){

            System.out.println("Enter new Brand");
            String newBrand = input.nextLine();
            laptopUpdate.setBrand(newBrand);
            input.nextLine();

            System.out.println("Enter new Date");
            String newDate = input.nextLine();
            laptopUpdate.setEntryDate(newDate);
            input.nextLine();

            System.out.println("Laptop has been updated");
            updateStatus = false;
        }
        list.forEach(System.out::println);
    }

    @Override
    public void findById(List<Laptop> list, Scanner input) {
        System.out.println("Enter the ID of Desktop");
        int id = input.nextInt();
        Optional<Laptop> findLaptop = list.stream().filter(desktop -> desktop.getId() == id).findFirst();
        System.out.println(findLaptop);
    }

    @Override
    public void add(List<Laptop> list, Scanner input) {
        boolean addStatus = true;
        while (addStatus){

            System.out.println("Enter Laptop Id");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("Enter Brand");
            String brand = input.nextLine();
            input.nextLine();

            System.out.println("Enter Date received");
            String date = input.nextLine();
            input.nextLine();

            Laptop laptop = new Laptop(id, ComputerType.DESKTOP, brand, date);

            list.add(laptop);

            System.out.println("Laptop has added!");

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
