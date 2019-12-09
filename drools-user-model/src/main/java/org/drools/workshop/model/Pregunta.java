package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Pregunta {
    private String course;
    private String category;
    private String question;
    private String answer;
    private String feedback;
    private int difficulty;
    private int semester;

    public Pregunta() {}

    public Pregunta(String course, String question, String answer, String feedback, String category, int difficulty, int semester) {
        this.course = course;
        this.category = category;
        this.question = question;
        this.answer = answer;
        this.feedback = feedback;
        this.difficulty = difficulty;
        this.semester = semester;
    }

    public String getCourse(){
        return course;
    }
    
    public void setCourse(String course){
        this.course = course;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getQuestion(){
        return question;
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getFeedback(){
        return feedback;
    }

    public void setFeedback(String feedback){
        this.feedback = feedback;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public int getSemester(){
        return semester;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "course=" + course  + ", semester=" + semester + ", question=" + question + ", answer=" + answer + ", difficulty=" + difficulty +  "}";
    }
}