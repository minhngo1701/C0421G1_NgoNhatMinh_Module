package _case_study.services;

import _case_study.models.Facility;

import java.util.Map;

public interface FacilityService extends Service {
     void addNewVilla();
     void addNewHouse();
     void addNewRoom();
     Map<Facility, Integer> getAllVilla();
     Map<Facility, Integer> getAllHouse();
     Map<Facility, Integer> getAllRoom();
     Map<Facility, Integer> getAll();
}
