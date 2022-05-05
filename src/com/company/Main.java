package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int sp=sc.nextInt();

    Car car=new Car();
    car.setName("Lexus");
    car.setModel("Lx570");
    car.setColour("white");
    car.setYear(2022);
    car.setSpeed(sp);


        System.out.println("Speed Control");
        System.out.println("Car:"+car.getName()+"\n"+"Model:"+car.getModel()+"\n"+"Colour:"+car.getColour()+"\n"+"Year:"+car.getYear()+"\n"+"Speed:"+car.getSpeed());
        car.checkspeed(sp);

    }
}
