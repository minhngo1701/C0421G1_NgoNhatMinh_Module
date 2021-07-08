package _case_study.services;

import _case_study.libs.BookingComparator;
import _case_study.models.Booking;
import _case_study.models.Contract;
import _case_study.models.Facility;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    private static Queue<Booking> queue = new LinkedList<>();
    private static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
   private static ArrayList<Contract> contracts = new ArrayList<>();
    private static final String FILE_PATH = "src\\_case_study\\data\\Contract.csv";
    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    private static int choiceNumber() {
        boolean checkValid = false;
        int choice = 0;
        while (!checkValid) {
            try {
                choice = Integer.parseInt(input().nextLine());
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
                choice = Double.parseDouble(input().nextLine());
                checkValid = true;
            } catch (NumberFormatException e) {
                System.out.print("You must enter a number: ");
            }
        }
        return choice;
    }
    private static Contract contract = new Contract();
    @Override
    public void add() {
        queue = (Queue<Booking>) new ReadAndWriteFile<Contract>().readFile(FILE_PATH);
        if (queue == null) {
            queue = new LinkedList<>();
        }
        bookings = (Set<Booking>) new ReadAndWriteFile<Booking>().readFile("src\\_case_study\\data\\Booking.csv");
        queue.addAll(bookings);
        for (Booking booking : queue) {
            System.out.println("Enter contract id: ");
            int idContract = choiceNumber();
            System.out.println("Enter deposit amount money:");
            double depositAmount = choiceNumberDouble();
            System.out.println("Enter total payment:");
            double totalPayment = choiceNumberDouble();
            String idBooking = booking.getCode();
            int idCustomer = booking.getCustomerID();

            contracts.add(new Contract(idContract,idBooking,depositAmount,totalPayment,idCustomer));
        }
        new ReadAndWriteFile<Contract>().writeFileByByteStream(contracts,FILE_PATH);

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {
        contracts = (ArrayList<Contract>) new ReadAndWriteFile<Contract>().readFile(FILE_PATH);
        System.out.println("Enter id contract to edit:");
        int idContract = choiceNumber();
        boolean check = false;
        for (Contract contract : contracts) {
            if (idContract == contract.getContractID()) {
                System.out.println("Enter new deposit amount money:");
                contract.setDepositAmount(input().nextDouble());
                System.out.println("Enter new total payment:");
                contract.setTotalPayment(input().nextDouble());
                System.out.println("Enter new id customer:");
                contract.setCustomerID(input().nextInt());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Can't find");
        }
        new ReadAndWriteFile<Contract>().writeFileByByteStream(contracts,FILE_PATH);
    }

    @Override
    public void display() {
        contracts = (ArrayList<Contract>) new ReadAndWriteFile<Contract>().readFile(FILE_PATH);
        if (contracts == null) {
            System.out.println("List is empty");
        }
        for (Contract contract : contracts) {
            System.out.println(contract);
        }
    }
}
