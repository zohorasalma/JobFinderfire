package com.example.salma.jobfinder;

import java.util.PropertyResourceBundle;

public class jobdetails {
    private String title;
    private String location;
    private String salary;
    private String vacancy;
    private String minimumqual;
    private String jobtype;
    private String appdeadline;
    private String companyname,email;

    public jobdetails() {
    }

    public jobdetails(String title, String location, String salary, String vacancy,String minimumqual,String jobtype,String appdeadline,String companyname,String email) {
        this.title = title;
        this.location = location;
        this.salary = salary;
        this.vacancy = vacancy;
        this.minimumqual=minimumqual;
        this.jobtype=jobtype;
        this.appdeadline=appdeadline;
        this.companyname=companyname;
        this.email=email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getAppdeadline() {
        return appdeadline;
    }

    public void setAppdeadline(String appdeadline) {
        this.appdeadline = appdeadline;
    }
    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getVacancy() {
        return vacancy;
    }
    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }


    public void setMinimumqual(String minimumqual) {
        this.minimumqual = minimumqual;
    }
    public String getMinimumqual() {
        return minimumqual;
    }


}
