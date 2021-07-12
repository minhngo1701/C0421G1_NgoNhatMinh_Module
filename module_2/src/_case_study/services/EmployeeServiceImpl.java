package _case_study.services;

import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.models.Employee;
import _case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Exception implements EmployeeService {
    private static List<Employee> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private Employee employee = new Employee();
    private static ReadAndWriteFile readandWriteFile = new ReadAndWriteFile();
    private static final String FILE_PATH = "src\\_case_study\\data\\Employee.csv";
    private static Regex regex = new Regex();
    @Override
    public void add() {
        list = (List<Employee>) new ReadAndWriteFile<Employee>().readFile(FILE_PATH);
        int id = 0;
        if (list == null) {
            list = new ArrayList<>();
            id = 1;
            employee.setId(id);
        } else {
            employee.setId(list.get(list.size() - 1).getId() + 1);
        }

        System.out.println("Enter name: ");
        employee.setName(regex.regexNameTest());
        System.out.println("Enter date of birth: ");
        employee.setDateOfbirth(regex.regexDateMonthTest());
        System.out.println("Enter gender: ");
        employee.setGender(regex.regexNameTest());
        System.out.println("Enter identity number: ");
        employee.setIdentityNumber(regex.regexIdentityNumberTest());
        System.out.println("Enter phone number: ");
        employee.setPhoneNumber(regex.regexPhoneNumberTest());
        System.out.println("Enter email: ");
        employee.setEmail(regex.regexEmailTest());
        System.out.println("Enter education: ");
        employee.setEducation(regex.regexNameTest());
        System.out.println("Enter position: ");
        employee.setPosition(regex.regexNameTest());
        System.out.println("Enter salary: ");
        employee.setSalary(choiceDouble());
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
                    employee.setName(regex.regexNameTest());
                    System.out.println("Enter new date of birth: ");
                    employee.setDateOfbirth(regex.regexDateMonthTest());
                    System.out.println("Enter new gender: ");
                    employee.setGender(regex.regexNameTest());
                    System.out.println("Enter new identity number: ");
                    employee.setIdentityNumber(regex.regexIdentityNumberTest());
                    System.out.println("Enter new phone number: ");
                    employee.setPhoneNumber(regex.regexPhoneNumberTest());
                    System.out.println("Enter new email: ");
                    employee.setEmail(regex.regexEmailTest());
                    System.out.println("Enter new education: ");
                    employee.setEducation(regex.regexNameTest());
                    System.out.println("Enter new position: ");
                    employee.setPosition(regex.regexNameTest());
                    System.out.println("Enter new salary: ");
                    employee.setSalary(choiceDouble());
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Can't find employee in list");
            }
        }
        readandWriteFile.writeFileByByteStream(list, FILE_PATH);
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

