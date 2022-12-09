package org.example;


import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int number;
    private int time;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void setClock(int time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public int getTime() {
        return time;
    }
    @Override
    public String toString() {
        return
                "Ad: "+
                name+ " Nomre: "+number+" Tarix: "+time;
    }
}
