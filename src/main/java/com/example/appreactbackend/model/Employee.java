package com.example.appreactbackend.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "profession")
    private String profession;

    @Column(name = "type_of_employment")
    private String typeOfEmployment;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finish_date")
    private LocalDate finishDate;

    @Column(name = "salary_gross")
    private BigDecimal salaryGross;

    @Column(name = "salary_net")
    private BigDecimal salaryNet;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String city, String zipCode, String street, String number, LocalDate dateOfBirth, String profession, String typeOfEmployment, LocalDate startDate, LocalDate finishDate, BigDecimal salaryGross, BigDecimal salaryNet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
        this.dateOfBirth = dateOfBirth;
        this.profession = profession;
        this.typeOfEmployment = typeOfEmployment;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.salaryGross = salaryGross;
        this.salaryNet = salaryNet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTypeOfEmployment() {
        return typeOfEmployment;
    }

    public void setTypeOfEmployment(String typeOfEmployment) {
        this.typeOfEmployment = typeOfEmployment;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public BigDecimal getSalaryGross() {
        return salaryGross;
    }

    public void setSalaryGross(BigDecimal salaryGross) {
        this.salaryGross = salaryGross;
    }

    public BigDecimal getSalaryNet() {
        return salaryNet;
    }

    public void setSalaryNet(BigDecimal salaryNet) {
        this.salaryNet = salaryNet;
    }
}
