package _case_study.libs;

import _case_study.models.Booking;

import java.io.Serializable;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>, Serializable {
    @Override
    public int compare(Booking o1, Booking o2) {
        if (!o1.getDateStart().equals(o2.getDateStart())) {
            return o1.getDateStart().compareTo(o2.getDateStart());
        } else {
            return o1.getDateEnd().compareTo(o2.getDateEnd());
        }
    }
}
