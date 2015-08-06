/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.OneWord;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class OneWordDAO {
     HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveOneWord(OneWord e){  
    template.save(e);  
}  
//method to update employee  
public void updateOneWord(OneWord e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteOneWord(OneWord e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public OneWord getById(String code){  
    OneWord e=(OneWord)template.get(OneWord.class,code);  
    return e;  
}   
//method to return all employees  
public List<OneWord> getOneWord(){  
    List<OneWord> list=new ArrayList<OneWord>();  
    list=template.loadAll(OneWord.class);  
    return list;  
}
}
