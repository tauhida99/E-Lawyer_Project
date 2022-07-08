package com.learn.online.lawyer.system.entity;

import javax.persistence.*;

@Entity
public class Cases {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer caseID;
    private String casesName;
    private String case_type;
    private String location;
    private String case_souce;
    private String creation_date;


//    ref case and lawyer
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "lawyer_id"
    )
    private Lawyer lawyer;



    public String getCasesName() {
        return casesName;
    }

    public void setCasesName(String casesName) {
        this.casesName = casesName;
    }



    public Integer getCaseID() {
        return caseID;
    }

    public void setCaseID(Integer caseID) {
        this.caseID = caseID;
    }

    public String getCase_type() {
        return case_type;
    }

    public void setCase_type(String case_type) {
        this.case_type = case_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCase_souce() {
        return case_souce;
    }

    public void setCase_souce(String case_souce) {
        this.case_souce = case_souce;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }
}
