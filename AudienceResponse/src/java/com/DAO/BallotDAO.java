/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Pojo.Ballot;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 *
 * @author EDU-Admin
 */
public class BallotDAO {
        HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveBallot(Ballot e){  
    template.save(e);  
}  
//method to update employee  
public void updateBallot(Ballot e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteBallot(Ballot e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Ballot getById(String code){  
    Ballot e=(Ballot)template.get(Ballot.class,code);  
    return e;  
}   
//method to return all employees  
public List<Ballot> getBallot(){  
    List<Ballot> list=new ArrayList<Ballot>();  
    list=template.loadAll(Ballot.class);  
    return list;  
}  
}
