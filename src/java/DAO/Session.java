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
public class Session {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveSession(Pojo.Session e){  
    template.save(e);  
}  
//method to update employee  
public void updateSession(Pojo.Session e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteSession(Pojo.Session e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Session getById(String code){  
    Pojo.Session e=(Pojo.Session)template.get(Pojo.Session.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Session> getSession(){  
    List<Pojo.Session> list=new ArrayList<Pojo.Session>();  
    list=template.loadAll(Pojo.Session.class);  
    return list;  
}
}
