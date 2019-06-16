package com.example.projektmanagment;

public class Vorlesung {
    private String name;
    private String verstaendnis;


    public Vorlesung(String name, String verstaendnis){
        this.name = name;
        this.verstaendnis = verstaendnis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerstaendnis() {
        return verstaendnis;
    }

    public void setVerstaendnis(String verstaendnis) {
        this.verstaendnis = verstaendnis;
    }
}
