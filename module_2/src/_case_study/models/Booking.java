package _case_study.models;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class Booking implements Serializable {
    private String code;
    private String dateStart;
    private String dateEnd;
    private int customerID;
    private String nameService;
    private String typeService;


    public Booking() {
    }

    public Booking(String code, String dateStart, String dateEnd, int customerID, String nameService, String typeService) {
        this.code = code;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.customerID = customerID;
        this.nameService = nameService;
        this.typeService = typeService;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "code='" + code + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", customerID=" + customerID +
                ", nameService='" + nameService + '\'' +
                ", typeService='" + typeService + '\'' +
                '}';
    }

}
