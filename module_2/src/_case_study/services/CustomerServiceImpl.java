package _case_study.services;

import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.models.Customer;
import _case_study.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Exception implements CustomerService {
    public static List<Customer> linkedList = new LinkedList<>();
    public static Customer customer = new Customer();
    public static Scanner sc = new Scanner(System.in);
    private static final String FILE_PATH = "src\\_case_study\\data\\Customer.csv";
    private static Regex regex = new Regex();
    @Override
    public void add() {
        linkedList = (List<Customer>) new ReadAndWriteFile<Customer>().readFile(FILE_PATH);
        int id = 0;
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            id = 1;
            customer.setId(id);
        } else {
            customer.setId(linkedList.get(linkedList.size()-1).getId() + 1);
        }
        System.out.println("Enter name customer: ");
        customer.setName(regex.regexNameTest());
        System.out.println("Enter date of birth customer: ");
        customer.setDateOfbirth(regex.regexDateMonthTest());
        System.out.println("Enter gender customer: ");
        customer.setGender(regex.regexNameTest());
        System.out.println("Enter identity number customer: ");
        customer.setIdentityNumber(regex.regexIdentityNumberTest());
        System.out.println("Enter phone number customer: ");
        customer.setPhoneNumber(regex.regexPhoneNumberTest());
        System.out.println("Enter email customer: ");
        customer.setEmail(regex.regexEmailTest());
        System.out.println("Enter type of customer : ");
        customer.setTypeCustomer(regex.regexNameTest());
        System.out.println("Enter address: ");
        customer.setAddress(regex.regexNameTest());
        linkedList.add(customer);
        new ReadAndWriteFile<Customer>().writeFileByByteStream(linkedList, FILE_PATH);
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        linkedList = (List<Customer>) new ReadAndWriteFile<Customer>().readFile(FILE_PATH);
        System.out.println("Enter id need to edit: ");
        int idEdit = choiceNumber();
        if (linkedList.isEmpty()) {
            System.out.println("Nothing to edit");
        } else {
            boolean check = false;
            for (Customer customer : linkedList) {
                if (idEdit == customer.getId()) {
                    System.out.println("Enter new name customer: ");
                    customer.setName(regex.regexNameTest());
                    System.out.println("Enter new date of birth customer: ");
                    customer.setDateOfbirth(regex.regexDateMonthTest());
                    System.out.println("Enter new gender customer: ");
                    customer.setGender(regex.regexNameTest());
                    System.out.println("Enter new identity number customer: ");
                    customer.setIdentityNumber(regex.regexIdentityNumberTest());
                    System.out.println("Enter new phone number customer: ");
                    customer.setPhoneNumber(regex.regexPhoneNumberTest());
                    System.out.println("Enter new email customer: ");
                    customer.setEmail(regex.regexEmailTest());
                    System.out.println("Enter new type of customer: ");
                    customer.setTypeCustomer(regex.regexNameTest());
                    System.out.println("Enter new address: ");
                    customer.setAddress(regex.regexNameTest());
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("Can't find customer in list");
            }
        }
        new ReadAndWriteFile<Customer>().writeFileByByteStream(linkedList,FILE_PATH);
    }

    @Override
    public void display() {
        linkedList = (LinkedList<Customer>) new ReadAndWriteFile<Customer>().readFile(FILE_PATH);
        if (linkedList == null) {
            System.out.println("list is empty");
        } else {
            for (Customer customer : linkedList) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public List<Customer> getAll() {
        linkedList = (List<Customer>) new ReadAndWriteFile<Customer>().readFile(FILE_PATH);
        return linkedList;
    }
}
