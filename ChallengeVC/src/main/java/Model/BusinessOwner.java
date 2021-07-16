package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BusinessOwner {

    @Id
    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private String address;
    private String businessOwnerBackground;


    public BusinessOwner(){

    }

    public BusinessOwner(String id, String fullName,
                         String phoneNumber, String email, String address,
                         String businessOwnerBackground) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.businessOwnerBackground = businessOwnerBackground;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessOwnerBackground() {
        return businessOwnerBackground;
    }

    public void setBusinessOwnerBackground(String businessOwnerBackground) {
        this.businessOwnerBackground = businessOwnerBackground;
    }
}
