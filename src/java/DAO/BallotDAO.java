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
public class BallotDAO {
    HibernateTemplate template;
        public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
        this.template.setCheckWriteOperations(false);
}  
//method to save employee  
public void saveBallot(Pojo.Ballot e){  
    template.save(e);  
}  
//method to update employee  
public void updateBallot(Pojo.Ballot e){  
    template.update(e);  
}  
//method to delete employee  
public void deleteBallot(Pojo.Ballot e){  
    template.delete(e);  
}  
//method to return one employee of given id  
public Pojo.Ballot getById(String code){  
    Pojo.Ballot e=(Pojo.Ballot)template.get(Pojo.Ballot.class,code);  
    return e;  
}   
//method to return all employees  
public List<Pojo.Ballot> getBallot(){  
    List<Pojo.Ballot> list=new ArrayList<Pojo.Ballot>();  
    list=template.loadAll(Pojo.Ballot.class);  
    return list;  
}
}
