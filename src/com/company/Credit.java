package com.company;

import javax.naming.Name;
import java.util.Scanner;

public class Credit {
    private String User;
    private int Credit;
    private int CreditStatus;


    int getCredit() {
        return Credit;
    }

    public void setCredit(int credit) {
        this.Credit+=credit;
        this.CreditStatus = this.Credit;

    }

    String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    int getCreditStatus() {
        return CreditStatus;
    }

    public void setCreditStatus(int creditStatus) {
        CreditStatus = creditStatus;
    }


    Credit(String _user, int _credit, int creditstatus) {
        this.User = _user;
        this.Credit = _credit;
        this.CreditStatus = creditstatus;
    }


}
