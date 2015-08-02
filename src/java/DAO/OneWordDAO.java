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
public class OneWordDAO {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveOneWord(Pojo.OneWord e){  
    template.save(e);  
}  
//method to update employee  
public void updateOneWord(Pojo.OneWord e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteOneWord(Pojo.OneWord e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.OneWord getById(String code){  
    Pojo.OneWord e=(Pojo.OneWord)template.get(Pojo.OneWord.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.OneWord> getOneWord(){  
    List<Pojo.OneWord> list=new ArrayList<Pojo.OneWord>();  
    list=template.loadAll(Pojo.OneWord.class);  
    return list;  
}
}
