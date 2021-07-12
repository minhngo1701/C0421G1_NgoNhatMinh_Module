package _case_study.controller;

import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.services.EmployeeServiceImpl;

public class EmployeeManagement extends Exception {

    public void displayEmployeesMenu() {
        while (true) {
            System.out.println("-----Employees Menu-----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice:");
            switch (choiceNumber()) {
                case 1:
                    new EmployeeServiceImpl().display();
                    break;
                case 2:
                    new EmployeeServiceImpl().add();
                    break;
                case 3:
                    new EmployeeServiceImpl().edit();
                    break;
                case 4:
                    new FuramaController().displayMainMenu();
                    break;
                default:
                    System.out.println("Please re-enter:");
            }
        }
    }
}
