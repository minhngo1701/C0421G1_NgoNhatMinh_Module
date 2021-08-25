package bai2.healthinfo.model.bean;

public class Health {
    private String name;
    private String year;
    private boolean gender;
    private String nationality;
    private String idCard;
    private String transporter;
    private String idTransport;
    private String seatNumber;
    private String startDay;
    private String endDay;
    private String information;
    private String city;
    private String district;
    private String ward;
    private String address;
    private String phoneNumber;
    private String email;
    private String[] symptom;
    private String history;

    public Health() {
    }

    public Health(String name, String year, boolean gender, String nationality, String idCard, String transporter,
                  String idTransport, String seatNumber, String startDay, String endDay, String information, String city
            , String district, String ward, String address, String phoneNumber, String email, String[] symptom, String history) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.transporter = transporter;
        this.idTransport = idTransport;
        this.seatNumber = seatNumber;
        this.startDay = startDay;
        this.endDay = endDay;
        this.information = information;
        this.city = city;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.symptom = symptom;
        this.history = history;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTransporter() {
        return transporter;
    }

    public void setTransporter(String transporter) {
        this.transporter = transporter;
    }

    public String getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(String idTransport) {
        this.idTransport = idTransport;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getSymptom() {
        return symptom;
    }

    public void setSymptom(String[] symptom) {
        this.symptom = symptom;
    }

}
