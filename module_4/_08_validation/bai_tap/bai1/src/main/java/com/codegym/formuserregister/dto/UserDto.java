package com.codegym.formuserregister.dto;

import javax.validation.constraints.*;

public class UserDto {
    private Integer id;
    @NotEmpty(message = "Name not empty")
    @Size(min = 5, max = 45)
    private String firstName;
    @NotEmpty(message = "Name not empty")
    @Size(min = 5, max = 45)
    private String lastName;
    @NotEmpty
    @Pattern(regexp = "(84|0[3|5|7|8|9])+([0-9]{8})\\b", message = "Phone không đúng định dạng")
    private String phoneNumber;
    @Min(18)
    private int age;
    @Email(message = "Email không đúng")
    @NotEmpty
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
