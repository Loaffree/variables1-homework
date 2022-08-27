package com.company;

public class Main {

    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + ", " + cat + ", " + paper);
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        double dog1 = dog * 1.0 - 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog1 + ", " + cat + ", " + paper);
        System.out.println();

        // Задание 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        // Задание 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        // Задание 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        var differenceBoxerWeight = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("общий вес двух бойцов: " + totalBoxerWeight);
        System.out.println("разница между весами бойцов: " + differenceBoxerWeight);
        System.out.println();

        // Задание 7
        System.out.println("Задача 7");
        System.out.println("1 способ: разница весов спортсменов: " + (secondBoxerWeight - firstBoxerWeight));
        System.out.println("2 способ: разница весов спортсменов: " + (secondBoxerWeight % firstBoxerWeight));
        System.out.println();

        // Задание 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var workingDay = 8;
        var totalWorker = totalHours / workingDay;
        var newTotalWorker = totalWorker + 94;
        System.out.println("Всего работников в компании – " + totalWorker + " человек");
        System.out.println("Если в компании работает " + newTotalWorker + " человек, то всего " + (newTotalWorker * workingDay) + " часов работы может быть поделено между сотрудниками");
    }
}
