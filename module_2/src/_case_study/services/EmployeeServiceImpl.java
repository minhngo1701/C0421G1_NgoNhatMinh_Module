package _case_study.services;

import _case_study.models.Employee;
import _case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private  Employee employee = new Employee();
    private static  ReadAndWriteFile readandWriteFile = new ReadAndWriteFile();
    private static final String FILE_PATH = "src\\_case_study\\data\\Employee.csv";
    private static int choiceNumber() {
        boolean checkValid = false;
        int choice = 0;
        while (!checkValid) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                checkValid = true;
            } catch (NumberFormatException e) {
                System.out.print("You must enter a number: ");
            }
        }
        return choice;
    }
    private static double choiceNumberDouble() {
        boolean checkValid = false;
        double choice = 0.0;
        while (!checkValid) {
            try {
                choice = Double.parseDouble(sc.nextLine());
                checkValid = true;
            } catch (NumberFormatException e) {
                System.out.print("You must enter a number: ");
            }
        }
        return choice;
    }

    @Override
    public void add() {
        list = (List<Employee>) new ReadAndWriteFile<Employee>().readFile(FILE_PATH);
        if (list == null) {
            list = new ArrayList<>();
        }

        System.out.println("Enter id: ");
        employee.setId(choiceNumber());
        System.out.println("Enter name: ");
        employee.setName(sc.nextLine());
        System.out.println("Enter date of birth: ");
        employee.setDateOfbirth(sc.nextLine());
        System.out.println("Enter gender: ");
        employee.setGender(sc.nextLine());
        System.out.println("Enter identity number: ");
        employee.setIdentityNumber(sc.nextLine());
        System.out.println("Enter phone number: ");
        employee.setPhoneNumber(sc.nextLine());
        System.out.println("Enter email: ");
        employee.setEmail(sc.nextLine());
        System.out.println("Enter education: ");
        employee.setEducation(sc.nextLine());
        System.out.println("Enter position: ");
        employee.setPosition(sc.nextLine());
        System.out.println("Enter salary: ");
        employee.setSalary(choiceNumberDouble());
        list.add(employee);
        readandWriteFile.writeFileByByteStream(list, FILE_PATH);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        list = (List<Employee>) readandWriteFile.readFile(FILE_PATH);
        System.out.println("Enter id need to edit: ");
        int idEdit = choiceNumber();
        if (list.isEmpty()) {
            System.out.println("Nothing to edit");
        } else {
            boolean check = false;
            for (Employee employee : list) {
                if (idEdit == employee.getId()) {
                    System.out.println("Enter new name: ");
                    employee.setName(sc.nextLine());
                    System.out.println("Enter new date of birth: ");
                    employee.setDateOfbirth(sc.nextLine());
                    System.out.println("Enter new gender: ");
                    employee.setGender(sc.nextLine());
                    System.out.println("Enter new identity number: ");
                    employee.setIdentityNumber(sc.nextLine());
                    System.out.println("Enter new phone number: ");
                    employee.setPhoneNumber(sc.nextLine());
                    System.out.println("Enter new email: ");
                    employee.setEmail(sc.nextLine());
                    System.out.println("Enter new education: ");
                    employee.setEducation(sc.nextLine());
                    System.out.println("Enter new position: ");
                    employee.setPosition(sc.nextLine());
                    System.out.println("Enter new salary: ");
                    employee.setSalary(choiceNumberDouble());
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Can't find employee in list");
            }
        }
        readandWriteFile.writeFileByByteStream(list,FILE_PATH);
    }

    @Override
    public void display() {
        list = (List<Employee>) readandWriteFile.readFile(FILE_PATH);

        if (list == null) {
            System.out.println("list is empty");
        } else {
            for (Employee employee : list) {
                System.out.println(employee);
            }
        }
    }

}

