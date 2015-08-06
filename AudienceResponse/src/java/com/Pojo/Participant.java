/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pojo;

/**
 *
 * @author EDU-Admin
 */
public class Participant {
       private int ParticipantId;
    private String ParticipantName;
    private String ParticipantSurname;

    /**
     * @return the ParticipantId
     */
    public int getParticipantId() {
        return ParticipantId;
    }

    /**
     * @param ParticipantId the ParticipantId to set
     */
    public void setParticipantId(int ParticipantId) {
        this.ParticipantId = ParticipantId;
    }

    /**
     * @return the ParticipantName
     */
    public String getParticipantName() {
        return ParticipantName;
    }

    /**
     * @param ParticipantName the ParticipantName to set
     */
    public void setParticipantName(String ParticipantName) {
        this.ParticipantName = ParticipantName;
    }

    /**
     * @return the ParticipantSurname
     */
    public String getParticipantSurname() {
        return ParticipantSurname;
    }

    /**
     * @param ParticipantSurname the ParticipantSurname to set
     */
    public void setParticipantSurname(String ParticipantSurname) {
        this.ParticipantSurname = ParticipantSurname;
    }
}
