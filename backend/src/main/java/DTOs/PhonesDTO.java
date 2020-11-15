/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import entities.Phones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mads
 */
public class PhonesDTO {
    private List<PhoneDTO> all = new ArrayList<>();
    
    public PhonesDTO(List<Phones> phoneEntity){
        phoneEntity.forEach((phone) -> {
            all.add(new PhoneDTO(phone));
        });
    }

    public PhonesDTO() {
    }

    public List<PhoneDTO> getAll() {
        return all;
    }

    public void setAll(List<PhoneDTO> all) {
        this.all = all;
    }
    
    
}
