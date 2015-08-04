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
public class OpenEnded {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveOpenEnded(Pojo.OpenEnded e){  
    template.save(e);  
}  
//method to update employee  
public void updateOpenEnded(Pojo.OpenEnded e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteOpenEnded(Pojo.OpenEnded e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.OpenEnded getById(String code){  
    Pojo.OpenEnded e=(Pojo.OpenEnded)template.get(Pojo.OpenEnded.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.OpenEnded> getOpenEnded(){  
    List<Pojo.OpenEnded> list=new ArrayList<Pojo.OpenEnded>();  
    list=template.loadAll(Pojo.OpenEnded.class);  
    return list;  
}
}
