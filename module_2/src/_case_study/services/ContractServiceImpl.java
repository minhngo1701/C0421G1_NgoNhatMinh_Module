package _case_study.services;

import _case_study.models.Booking;
import _case_study.models.Contract;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ContractServiceImpl implements ContractService {
    private static Queue<Contract> queue = new LinkedList<Contract>();
    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }
    private static Contract contract = new Contract();
    @Override
    public void add() {
        for (Booking booking : new BookingServiceImpl().getAll()) {
            System.out.println("Enter contract id: ");
            int idContract = input().nextInt();
            System.out.println("Enter deposit amount money:");
            double depositAmount = input().nextDouble();
            System.out.println("Enter total payment:");
            double totalPayment = input().nextDouble();
            String idBooking = booking.getCode();
            int idCustomer = booking.getCustomerID();
            queue.offer(new Contract(idContract,idBooking,depositAmount,totalPayment,idCustomer));
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        for (Contract contract : queue) {
            System.out.println(contract);
        }
    }
}
