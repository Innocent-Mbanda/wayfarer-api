package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BusinessProfile {

    @Id
    private String id;
    private String businessName;
    private String missionStatement;
    private float amountFunding;
    private String businessInfo;


    public BusinessProfile(){

    }

    public BusinessProfile(String id, String name, String missionStatement, float amountFunding,
                           String businessInfo ) {
        this.id = id;
        this.businessName = name;
        this.






                missionStatement = missionStatement;
        this.amountFunding = amountFunding;
        this.businessInfo = businessInfo;
//
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getMissionStatement() {
        return missionStatement;
    }

    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }

    public float getAmountFunding() {
        return amountFunding;
    }

    public void setAmountFunding(float amountFunding) {
        this.amountFunding = amountFunding;
    }

    public String getBusinessInfo() {
        return businessInfo;
    }


}
