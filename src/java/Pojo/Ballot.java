/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import java.util.Date;

/**
 *
 * @author EDU
 */
public class Ballot {
    private int BallotId;
    private String BallotDescription;
    private Date dateCreated;
    private String Password;

    /**
     * @return the BallotId
     */
    public int getBallotId() {
        return BallotId;
    }

    /**
     * @param BallotId the BallotId to set
     */
    public void setBallotId(int BallotId) {
        this.BallotId = BallotId;
    }

    /**
     * @return the BallotDescription
     */
    public String getBallotDescription() {
        return BallotDescription;
    }

    /**
     * @param BallotDescription the BallotDescription to set
     */
    public void setBallotDescription(String BallotDescription) {
        this.BallotDescription = BallotDescription;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
