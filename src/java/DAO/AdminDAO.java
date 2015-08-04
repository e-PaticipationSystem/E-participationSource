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
public class AdminDAO {

        HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveAdmin(Pojo.Admin e){  
    template.save(e);  
}  
//method to update employee  
public void updateAdmin(Pojo.Admin e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteAdmin(Pojo.Admin e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Admin getById(String code){  
    Pojo.Admin e=(Pojo.Admin)template.get(Pojo.Admin.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Admin> getAdmin(){  
    List<Pojo.Admin> list=new ArrayList<Pojo.Admin>();  
    list=template.loadAll(Pojo.Admin.class);  
    return list;  
}
}
