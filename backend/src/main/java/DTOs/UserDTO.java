/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import entities.User;
import java.util.List;

public class UserDTO {

    private String username;
    private String password;
    private List<String> roles;
    private List<String> phones;

    public UserDTO(String name, String password, List<String> roles, List<String> phones) {
        this.username = name;
        this.roles = roles;
        this.password = password;
        this.phones = phones;
    }

    public UserDTO(User user) {
        this.username = user.getUserName();
        this.roles = user.getRolesAsStrings();
        this.phones = user.getPhonesAsStrings();
    }

    public String getName() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getPhones() {
        return phones;
    }

}
