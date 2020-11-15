/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import entities.Phones;

/**
 *
 * @author Mads
 */
public class PhoneDTO {

    String number;
    String user;

    public PhoneDTO() {
    }

    public PhoneDTO(String number, String user) {
        this.number = number;
        this.user = user;
    }

    PhoneDTO(Phones phone) {
        this.number = phone.getPhone();
        this.user = phone.getUser().getUserName();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
