package model;

import java.sql.Time;
import java.util.Date;

public class PassangerModel {

    private String pssangerId;
    private String name;
    private String phone;
    private String Destination;
    private String arrival;
    private Date date;
    private Time time;

    public PassangerModel(){

    }

    public String getPssangerId() {
        return pssangerId;
    }

    public void setPssangerId(String pssangerId) {
        this.pssangerId = pssangerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
