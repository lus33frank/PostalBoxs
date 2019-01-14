package com.box;

import java.util.Scanner;


public class PostalBox {

    public static void main(String[] args) {
        Box box3 = new Box3();
        Box box5 = new Box5();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter object's lenght : ");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width : ");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height : ");
        float height = scanner.nextFloat();

        if (box3.validate(length, width, height)){
            System.out.println(box3.getName());
        } else if (box5.validate(length, width, height)) {
            System.out.println(box5.getName());
        } else {
            System.out.println("No suitable box.");
        }
    }

}
