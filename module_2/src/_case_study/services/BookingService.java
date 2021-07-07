package _case_study.services;

import _case_study.models.Booking;

import java.util.Set;

public interface BookingService extends Service {
    Set<Booking> getAll();
}
