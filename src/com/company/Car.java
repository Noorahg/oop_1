
package com.company;

public class Car {
    private String name;
    private String model;
    private String colour;
    private int year;
    private int speed;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getModel(){
        return model;

    }
    public void setModel(String model){
        this.model=model;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }
    void checkspeed(int speed){
        if(speed>110){
            System.out.println("Too fast");
        }else if(speed<30){
            System.out.println("Too slow");
        }else {
            System.out.println("You are good at driving");
        }
    }
}
