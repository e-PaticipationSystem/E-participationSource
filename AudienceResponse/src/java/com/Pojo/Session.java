/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pojo;

import java.util.Date;

/**
 *
 * @author EDU-Admin
 */
public class Session {
     private int SessionId;
    private int AdminId;
    private Date Date;
    private int BallotId;
    private int SessionNumber;

    /**
     * @return the SessionId
     */
    public int getSessionId() {
        return SessionId;
    }

    /**
     * @param SessionId the SessionId to set
     */
    public void setSessionId(int SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * @return the AdminId
     */
    public int getAdminId() {
        return AdminId;
    }

    /**
     * @param AdminId the AdminId to set
     */
    public void setAdminId(int AdminId) {
        this.AdminId = AdminId;
    }

    /**
     * @return the Date
     */
    public Date getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(Date Date) {
        this.Date = Date;
    }

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
     * @return the SessionNumber
     */
    public int getSessionNumber() {
        return SessionNumber;
    }

    /**
     * @param SessionNumber the SessionNumber to set
     */
    public void setSessionNumber(int SessionNumber) {
        this.SessionNumber = SessionNumber;
    }
}
