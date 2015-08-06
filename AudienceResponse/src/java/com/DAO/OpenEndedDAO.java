/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.OpenEnded;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class OpenEndedDAO {
        HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveOpenEnded(OpenEnded e){  
    template.save(e);  
}  
//method to update employee  
public void updateOpenEnded(OpenEnded e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteOpenEnded(OpenEnded e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public OpenEnded getById(String code){  
    OpenEnded e=(OpenEnded)template.get(OpenEnded.class,code);  
    return e;  
}   
//method to return all employees  
public List<OpenEnded> getOpenEnded(){  
    List<OpenEnded> list=new ArrayList<OpenEnded>();  
    list=template.loadAll(OpenEnded.class);  
    return list;  
}
}
