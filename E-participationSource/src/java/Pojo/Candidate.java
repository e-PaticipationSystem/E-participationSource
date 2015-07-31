/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author EDU
 */
public class Candidate {
    private String CandidateId;
    private String CandidateName;
    private double Result;
    private int BallotId;

    /**
     * @return the CandidateId
     */
    public String getCandidateId() {
        return CandidateId;
    }

    /**
     * @param CandidateId the CandidateId to set
     */
    public void setCandidateId(String CandidateId) {
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
    public double getResult() {
        return Result;
    }

    /**
     * @param Result the Result to set
     */
    public void setResult(double Result) {
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
