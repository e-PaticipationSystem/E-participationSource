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
public class Answer {
        private int AnswerId;
        private int OpenEndedId;
        private String Answer;

    /**
     * @return the AnswerId
     */
    public int getAnswerId() {
        return AnswerId;
    }

    /**
     * @param AnswerId the AnswerId to set
     */
    public void setAnswerId(int AnswerId) {
        this.AnswerId = AnswerId;
    }

    /**
     * @return the OpenEndedId
     */
    public int getOpenEndedId() {
        return OpenEndedId;
    }

    /**
     * @param OpenEndedId the OpenEndedId to set
     */
    public void setOpenEndedId(int OpenEndedId) {
        this.OpenEndedId = OpenEndedId;
    }

    /**
     * @return the Answer
     */
    public String getAnswer() {
        return Answer;
    }

    /**
     * @param Answer the Answer to set
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

}
