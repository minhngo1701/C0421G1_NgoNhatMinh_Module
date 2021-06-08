package _05_access_modifier_static_method_static_property.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

//    private void setName(String name) {
//        this.name = name;
//    }
//    private void setClasses(String classes) {
//        this.classes = classes;
//    }

//    protected void setName(String name) {
//        this.name = name;
//    }
//    protected void setClasses(String classes) {
//        this.classes = classes;
//    }

//    void setName(String name) {
//        this.name = name;
//    }
//    void setClasses(String classes) {
//        this.classes = classes;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
