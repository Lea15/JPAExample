package com.efrei.JPAExample;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;

public class Rent {

    public int Id_rent;
    private Date beginRent;
    private Date endRent;


    public Rent(int id_rent, Date beginRent, Date endRent) {
        Id_rent = id_rent;
        this.beginRent = beginRent;
        this.endRent = endRent;
    }

    @Id
    public int getId_rent() {
        return Id_rent;
    }

    public void setId_rent(int id_rent) {
        Id_rent = id_rent;
    }

    @ManyToOne

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    @OneToMany

}
