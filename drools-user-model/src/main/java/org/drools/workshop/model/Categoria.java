package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Categoria {
    private String nextCat;
    private String lastCat;
    private String name;

    public Categoria() {}

    public Categoria(String name) {
        this.name = name;
    }

    public Categoria(String name, String nextCat, String lastCat) {
        this.name = name;
        this.nextCat = nextCat;
        this.lastCat = lastCat;
    }

    public String getNextCat(){
        return nextCat;
    }
    
    public void setNextCat(String nextCat){
        this.nextCat = nextCat;
    }

    public String getLastCat(){
        return lastCat;
    }
    
    public void setLastCat(String lastCat){
        this.lastCat = lastCat;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Categoria{" + "next_category=" + nextCat  + ", last_category=" + lastCat + ", name=" + name + "}";
    }
}