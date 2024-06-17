package dao.custom.impl;

import dao.custom.DesktopDao;
import model.Desktop;
import type.ComputerType;

import java.util.List;
import java.util.Scanner;

public class DesktopDaoImpl implements DesktopDao {
    @Override
    public void viewAll(List<Desktop> list) {
        list.forEach(System.out::println);
    }

    @Override
    public void delete(List<Desktop> list, Scanner input) {

    }

    @Override
    public void update(List<Desktop> list, Scanner input) {
        System.out.println("Enter Desktop id for update");
        int id = input.nextInt();
        Desktop desktopUpdate = list.get(id - 1);

        boolean updateStatus = true;

        while(updateStatus){

            System.out.println("Enter new Brand");
            String newBrand = input.nextLine();
            desktopUpdate.setBrand(newBrand);
            input.nextLine();

            System.out.println("Enter new Date");
            String newDate = input.nextLine();
            desktopUpdate.setEntryDate(newDate);
            input.nextLine();

            System.out.println("Desktop has been updated");
            updateStatus = false;
        }
        list.forEach(System.out::println);
    }

    @Override
    public void findById(List<Desktop> list, Scanner input) {

    }

    @Override
    public void add(List<Desktop> list, Scanner input) {
        boolean addStatus = true;
        while (addStatus){

            System.out.println("Enter Desktop Id");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("Enter Brand");
            String brand = input.nextLine();
            input.nextLine();

            System.out.println("Enter Date received");
            String date = input.nextLine();
            input.nextLine();

            Desktop desktop = new Desktop(id, ComputerType.DESKTOP, brand, date);

            list.add(desktop);

            System.out.println("Desktop has added!");

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
