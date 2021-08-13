package model.bean.employee;

public class Education {
    private int edudcationId;
    private String educationName;

    public Education() {
    }

    public Education(int edudcationId, String educationName) {
        this.edudcationId = edudcationId;
        this.educationName = educationName;
    }

    public int getEdudcationId() {
        return edudcationId;
    }

    public void setEdudcationId(int edudcationId) {
        this.edudcationId = edudcationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}
