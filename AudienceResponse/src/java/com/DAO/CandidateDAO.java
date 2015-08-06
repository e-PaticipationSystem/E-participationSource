/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Candidate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class CandidateDAO {
        HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveCandidate(Candidate e){  
    template.save(e);  
}  
//method to update employee  
public void updateCandidate(Candidate e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteCandidate(Candidate e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Candidate getById(String code){  
    Candidate e=(Candidate)template.get(Candidate.class,code);  
    return e;  
}   
//method to return all employees  
public List<Candidate> getCandidate(){  
    List<Candidate> list=new ArrayList<Candidate>();  
    list=template.loadAll(Candidate.class);  
    return list;  
}
}
