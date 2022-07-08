package com.learn.online.lawyer.system.entity;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer payID;
    private  String pay_code;
    private  String pay_amount;
    private  String pay_date;

    @OneToOne(
            targetEntity = User.class,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "client_id",referencedColumnName = "id"
    )
    private User user;

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public String getPay_code() {
        return pay_code;
    }

    public void setPay_code(String pay_code) {
        this.pay_code = pay_code;
    }

    public String getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(String pay_amount) {
        this.pay_amount = pay_amount;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }
}
