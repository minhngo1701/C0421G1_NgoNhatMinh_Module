package _case_study.models;

public class Booking {
    private String code;
    private String dateStart;
    private String dateEnd;
    private int id;

    public Booking(String code, String dateStart, String dateEnd, int id) {
        this.code = code;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "code='" + code + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", id=" + id +
                '}';
    }
}
