package com.company;

public class Araba {
    private int year;
    private String color;
    private String name;
    private int beygirGucu;
    private boolean otomatikVitesMi;


    public void setYear(int year){
        if (year<=2017){
            this.year = year;
        } else System.out.println("Wrong value");
    }
    public int getYear(){
        return this.year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public boolean isOtomatikVitesMi() {
        return otomatikVitesMi;
    }

    public void setOtomatikVitesMi(boolean otomatikVitesMi) {
        this.otomatikVitesMi = otomatikVitesMi;
    }
}
