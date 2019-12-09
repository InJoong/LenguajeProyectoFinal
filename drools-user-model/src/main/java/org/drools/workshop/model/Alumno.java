package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.ArrayList;

public class Alumno {
    private String name;
    private int semester;
    private String course;
	private int point;
	private Categoria category;
	private List<Pregunta> nextQuestion = new ArrayList<>();

    public Alumno() {}

    public Alumno(String name, int semester, String course) {
		this.name = name;
		this.semester = semester;
		this.course = course;
		this.point = 50;
	}
	
	public Alumno(String name, int semester, int point, String course, List<Pregunta> nextQuestion) {
		this.name = name;
		this.semester = semester;
		this.course = course;
		this.point = point;
		this.nextQuestion = nextQuestion;
	}

	public Categoria getCategory() {
		return category;
	}

	public void setCategory(Categoria category) {
		this.category = category;
	}

    public String getName(){
		return name;
	}

	public void setName(String name){
		this.name =  name;
	}

	public int getSemester(){
		return semester;
	}

	public void setSemester(int semester){
		this.semester = semester;
	}

	public String getCourse(){
		return course;
	}

	public void setCourse(String course){
		this.course = course;
	}

	public int getPoint(){
		return point;
	}

	public void setPoint(int point){
		this.point = point;
	}

	public List<Pregunta> getPregunta(){
		return nextQuestion;
	}

	public void setPregunta(List<Pregunta> nextQuestion){
		this.nextQuestion = nextQuestion;
	}

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", semester=" + semester + ", point=" + point + ", nextQuestion=" + nextQuestion + " }";
    }
}
