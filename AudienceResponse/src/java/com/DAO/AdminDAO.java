/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Admin;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class AdminDAO {
     HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveAdmin(Admin e){  
    template.save(e);  
}  
//method to update employee  
public void updateAdmin(Admin e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteAdmin(Admin e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Admin getById(String code){  
    Admin e=(Admin)template.get(Admin.class,code);  
    return e;  
}   
//method to return all employees  
public List<Admin> getAdmin(){  
    List<Admin> list=new ArrayList<Admin>();  
    list=template.loadAll(Admin.class);  
    return list;  
}

public String check(String username,String password){
           List<Admin> list=new ArrayList<Admin>();  
           list=template.loadAll(Admin.class); 
    
           Admin a=new Admin();
    
           String mess="no";

    for(Admin c:list){
         if(c.getUsername().matches(username) && c.getPassword().matches(password)){
         mess="yes";
     }
    }
    return mess;
}
}
