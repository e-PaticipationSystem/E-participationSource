/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Session;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class SessionDAO {
     HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveSession(Session e){  
    template.save(e);  
}  
//method to update employee  
public void updateSession(Session e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteSession(Session e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Session getById(String code){  
    Session e=(Session)template.get(Session.class,code);  
    return e;  
}   
//method to return all employees  
public List<Session> getSession(){  
    List<Session> list=new ArrayList<Session>();  
    list=template.loadAll(Session.class);  
    return list;  
}
}
