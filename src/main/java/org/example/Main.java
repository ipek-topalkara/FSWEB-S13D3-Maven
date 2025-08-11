package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person = new Person("John", "Doe", 20);

        System.out.println("First name: " + person.getFirstName()  );

        System.out.println("Last name: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Person secondPerson = new Person("İpek", "Topalkara", 29, 50000.5, false, new String[] {"watercolor", "model making", "photography"});

        System.out.println("First name: " + secondPerson.getFirstName()  );

        System.out.println("Last name: " + secondPerson.getLastName());

        System.out.println("Age: " + secondPerson.getAge());

        System.out.println("Salary: " + secondPerson.getSalary());

        System.out.println("Hobbies: " + Arrays.toString(secondPerson.getHobbies()));


        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }



}
