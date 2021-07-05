package _case_study.models;

public class Employee extends Person {
    private String education;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, String education, String position, double salary) {
        super(id, name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.education = education;
        this.position = position;
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + ", education = " + getEducation() + ", position = " + getPosition() + ", salary = " + getSalary() + "}";
    }
}
