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
public class Candidate {
    private int CandidateId;
    private String CandidateName;
    private int Result;
    private int BallotId;

    /**
     * @return the CandidateId
     */
    public int getCandidateId() {
        return CandidateId;
    }

    /**
     * @param CandidateId the CandidateId to set
     */
    public void setCandidateId(int CandidateId) {
        this.CandidateId = CandidateId;
    }

    /**
     * @return the CandidateName
     */
    public String getCandidateName() {
        return CandidateName;
    }

    /**
     * @param CandidateName the CandidateName to set
     */
    public void setCandidateName(String CandidateName) {
        this.CandidateName = CandidateName;
    }

    /**
     * @return the Result
     */
    public int getResult() {
        return Result;
    }

    /**
     * @param Result the Result to set
     */
    public void setResult(int Result) {
        this.Result = Result;
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
}
