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
public class OneWord {
    private int OneWordId;
    private String Question;
    private int Positive;
    private int Negative;

    /**
     * @return the OneWordId
     */
    public int getOneWordId() {
        return OneWordId;
    }

    /**
     * @param OneWordId the OneWordId to set
     */
    public void setOneWordId(int OneWordId) {
        this.OneWordId = OneWordId;
    }

    /**
     * @return the Question
     */
    public String getQuestion() {
        return Question;
    }

    /**
     * @param Question the Question to set
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * @return the Positive
     */
    public int getPositive() {
        return Positive;
    }

    /**
     * @param Positive the Positive to set
     */
    public void setPositive(int Positive) {
        this.Positive = Positive;
    }

    /**
     * @return the Negative
     */
    public int getNegative() {
        return Negative;
    }

    /**
     * @param Negative the Negative to set
     */
    public void setNegative(int Negative) {
        this.Negative = Negative;
    }
}
