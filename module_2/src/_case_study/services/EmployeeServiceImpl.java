package _case_study.services;

import _case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> list = new ArrayList<>(50);
    public  Scanner sc = new Scanner(System.in);
    private  Employee employee = new Employee();
    @Override
    public void add() {
        System.out.println("Enter id: ");
        employee.setId(Integer.parseInt(sc.nextLine()));
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
        employee.setSalary(sc.nextDouble());
        list.add(employee);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        System.out.println("Enter id need to edit: ");
        int idEdit = Integer.parseInt(sc.nextLine());
        if (list.isEmpty()) {
            System.out.println("Nothing to edit");
        } else {
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
                    employee.setSalary(sc.nextDouble());
                } else {
                    System.out.println("Can't find id of employee");
                }
            }
        }
    }

    @Override
    public void display() {
        if (list.size() == 0) {
            System.out.println("List is empty");
        } else {
            for (Employee employee : list) {
                System.out.println(employee);
            }
        }
    }
}
