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
public class AnswerDAO {
     HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveAnswer(Pojo.Answers e){  
    template.save(e);  
}  
//method to update employee  
public void updateAnswer(Pojo.Answers e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteAnswer(Pojo.Answers e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Answers getById(String code){  
    Pojo.Answers e=(Pojo.Answers)template.get(Pojo.Answers.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Answers> getAnswer(){  
    List<Pojo.Answers> list=new ArrayList<Pojo.Answers>();  
    list=template.loadAll(Pojo.Answers.class);  
    return list;  
}
}
