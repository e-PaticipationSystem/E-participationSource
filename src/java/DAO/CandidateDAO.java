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
public class CandidateDAO {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveCandidate(Pojo.Candidate e){  
    template.save(e);  
}  
//method to update employee  
public void updateCandidate(Pojo.Candidate e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteCandidate(Pojo.Candidate e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Candidate getById(String code){  
    Pojo.Candidate e=(Pojo.Candidate)template.get(Pojo.Candidate.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Candidate> getCandidate(){  
    List<Pojo.Candidate> list=new ArrayList<Pojo.Candidate>();  
    list=template.loadAll(Pojo.Candidate.class);  
    return list;  
}
}