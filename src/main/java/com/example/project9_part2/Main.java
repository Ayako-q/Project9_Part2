package com.example.project9_part2;

public class Main {
    public static void main(String[] args){
        //creating object 1
        Camera cam1 = new Camera();
        cam1.setBrand("Olympus");
        cam1.setModel("AF-10XB");
        cam1.setType("Film");
        //creating object 2
        Camera cam2 = new Camera();
        cam2.setBrand("Canon");
        cam2.setModel("Rebel XS");
        cam2.setType("Digital");
        cam2.setIsoMin(100);
        cam2.setIsoMax(1600);
        //creating object 3
        Camera cam3 = new Camera();
        cam3.setBrand("Leica");
        cam3.setModel("D-Lux 3");
        cam3.setType("Digital");
        cam3.setIsoMin(80);
        cam3.setIsoMax(1600);
        //Output full description of every object
        System.out.println("Camera 1:");
        cam1.printDescription();
        System.out.println("\nCamera 2:");
        cam2.printDescription();
        System.out.println("\nCamera 3:");
        cam3.printDescription();
    }
}
