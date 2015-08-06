/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Participant;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class ParticipantDAO {
      HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveParticipant(Participant e){  
    template.save(e);  
}  
//method to update employee  
public void updateParticipant(Participant e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteParticipant(Participant e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Participant getById(String code){  
    Participant e=(Participant)template.get(Participant.class,code);  
    return e;  
}   
//method to return all employees  
public List<Participant> getParticipant(){  
    List<Participant> list=new ArrayList<Participant>();  
    list=template.loadAll(Participant.class);  
    return list;  
}
}
