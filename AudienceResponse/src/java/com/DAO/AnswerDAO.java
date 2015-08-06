/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Answer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class AnswerDAO {
        HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveAnswer(Answer e){  
    template.save(e);  
}  
//method to update employee  
public void updateAnswer(Answer e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteAnswer(Answer e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Answer getById(String code){  
    Answer e=(Answer)template.get(Answer.class,code);  
    return e;  
}   
//method to return all employees  
public List<Answer> getAnswer(){  
    List<Answer> list=new ArrayList<Answer>();  
    list=template.loadAll(Answer.class);  
    return list;  
}
}
