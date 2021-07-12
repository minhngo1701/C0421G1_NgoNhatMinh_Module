package _case_study.services;

import _case_study.libs.BookingComparator;
import _case_study.libs.Exception;
import _case_study.libs.Regex;
import _case_study.models.Booking;
import _case_study.models.Contract;
import _case_study.models.Facility;
import _case_study.utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl extends Exception implements ContractService {
    private static Queue<Booking> queue = new LinkedList<>();
    private static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    private static ArrayList<Contract> contracts = new ArrayList<>();
    private static final String FILE_PATH = "src\\_case_study\\data\\Contract.csv";
    private static Regex regex = new Regex();

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
            double depositAmount = choiceDouble();
            System.out.println("Enter total payment:");
            double totalPayment = choiceDouble();
            String idBooking = booking.getCode();
            int idCustomer = booking.getCustomerID();

            contracts.add(new Contract(idContract, idBooking, depositAmount, totalPayment, idCustomer));
        }
        new ReadAndWriteFile<Contract>().writeFileByByteStream(contracts, FILE_PATH);

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
                contract.setDepositAmount(choiceDouble());
                System.out.println("Enter new total payment:");
                contract.setTotalPayment(choiceDouble());
                System.out.println("Enter new id customer:");
                contract.setCustomerID(choiceNumber());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Can't find");
        }
        new ReadAndWriteFile<Contract>().writeFileByByteStream(contracts, FILE_PATH);
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
