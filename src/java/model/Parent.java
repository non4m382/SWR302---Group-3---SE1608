/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Parent {

    private int parent_id;
    private String first_name;
    private String last_name;
    private boolean gender;
    private String email;
    private String password;
    private String dob;
    private String phone;
    private String address;
    private String img;
    private String role;

    public Parent() {
    }

    public Parent(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;

    }

    public Parent(int parent_id, String first_name, String last_name, boolean gender, String email, String password, String dob, String phone, String address, String img, String role) {
        this.parent_id = parent_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.img = img;
        this.role = role;
    }

    public Parent(String first_name, String last_name, boolean gender, String email, String password, String dob, String phone, String address, String img, String role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
        this.img = img;
        this.role = role;
    }

    public Parent(String first_name, String last_name, String email, String password, String role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.role = role;

    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String ToString() {
        return email + " " + password + " " + role;
    }
}
