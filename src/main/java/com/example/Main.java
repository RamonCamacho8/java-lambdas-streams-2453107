package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            
            @Override
            public void sayHello() {
                System.out.println("Hello World 2");
                
            }
        };

        greeting2.sayHello();

        Greeting greeting3 = () -> System.out.println("Hello World 3");

        greeting3.sayHello();

        Calculator calculator = (a,b) -> { 
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return a*b+randomNumber;

        };

        System.out.println(calculator.calculate(2, 3));


        IntBinaryOperator intBinaryOperator = (a,b) -> a*b;

        System.out.println(intBinaryOperator.applyAsInt(2, 3));
    }

    
    
}
