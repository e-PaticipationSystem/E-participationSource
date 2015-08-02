/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU
 */
public class ParticipantDAO {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveParticipant(Pojo.Participant e){  
    template.save(e);  
}  
//method to update employee  
public void updateParticipant(Pojo.Participant e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteParticipant(Pojo.Participant e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Participant getById(String code){  
    Pojo.Participant e=(Pojo.Participant)template.get(Pojo.Participant.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Participant> getParticipant(){  
    List<Pojo.Participant> list=new ArrayList<Pojo.Participant>();  
    list=template.loadAll(Pojo.Participant.class);  
    return list;  
}
}
