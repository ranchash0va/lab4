package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    /**
     * Фамилия
     * Год рождения
     * Должность
     * Зарплата
     * Образование
     *
     * Определить количество работников - инженеров и
     * напечатать все сведения о них.
     */
    private static void task1() {
        Scanner readInt = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        int countWorker = 0;
        int count = 0;
        System.out.println("Enter amount of workers :");
        countWorker = readInt.nextInt();
        Workers[] worker = new Workers[countWorker];
        for(int i = 0; i < countWorker; i++) {
            worker[i] = new Workers();
            System.out.println("Enter surname:");
            worker[i].Surname = readString.nextLine();
            System.out.println("Enter year of birth:");
            worker[i].Year = readInt.nextInt();
            System.out.println("Enter position:");
            worker[i].Position = readString.nextLine();
            System.out.println("Enter salary:");
            worker[i].Salary = readInt.nextInt();
            System.out.println("Enter education:");
            worker[i].Education = readString.nextLine();
        }

        for (int k = 0; k < countWorker; k++) {
            if (worker[k].Position.equals("Engineer")) {
                count++;
                System.out.println("Surname: " + worker[k].Surname);
                System.out.println("Year of birth: " + worker[k].Year);
                System.out.println("Position: " + worker[k].Position);
                System.out.println("Salary: " + worker[k].Salary);
                System.out.println("Education: " + worker[k].Education);
            }
        }
        System.out.println("Engineers count:" + count);
    }

    /**
     * Марка автомобиля
     * Производитель
     * Тип
     * Год выпуска
     * Дата регистрации
     *
     * Вывести сведения о машинах, произведённых до 2000-го
     * года и зарегистрированных менее года назад.
     */
    public static void task2(){
        LocalDate ld = LocalDate.now();
        Scanner readInt = new Scanner(System.in);
        Scanner readString = new Scanner(System.in);
        int countcar = 0;
        System.out.println("Enter amount of cars: ");
        countcar = readInt.nextInt();
        Cars[] car = new Cars[countcar];
        for(int i = 0; i < countcar; i++) {
            car[i] = new Cars();
            System.out.println("Enter company:");
            car[i].Company = readString.nextLine();
            System.out.println("Enter manufacturer:");
            car[i].Manufacturer = readString.nextLine();
            System.out.println("Enter car type:");
            car[i].Type = readString.nextLine();
            System.out.println("Enter year of assembly:");
            car[i].Yearassembly = readInt.nextInt();
            System.out.println("Enter year of registration:");
            car[i].Year = readString.nextInt();
            System.out.println("Enter month of registration:");
            car[i].Month = readString.nextInt();
            System.out.println("Enter day of registration:");
            car[i].Day = readString.nextInt();
        }
        for (int k = 0; k < countcar; k++) {
            if ((car[k].Yearassembly < ld.getYear() - 22) && (car[k].Year == ld.getYear()) && (car[k].Month <= ld.getMonthValue()) && (car[k].Day <= ld.getDayOfMonth())) {
                System.out.println("Company: " + car[k].Company);
                System.out.println("Manufacturer: " + car[k].Manufacturer);
                System.out.println("Car type: " + car[k].Type);
                System.out.println("Year of assembly: " + car[k].Yearassembly);
                System.out.println("Year of registration: " + car[k].Year);
                System.out.println("Month of registration: " + car[k].Month);
                System.out.println("Day of registration: " + car[k].Day);
            } else if ((car[k].Yearassembly < ld.getYear() - 22) && (car[k].Year <= ld.getYear() - 1) && (car[k].Month >= ld.getMonthValue()) && (car[k].Day >= ld.getDayOfMonth())) {
                System.out.println("Company: " + car[k].Company);
                System.out.println("Manufacturer: " + car[k].Manufacturer);
                System.out.println("Car type: " + car[k].Type);
                System.out.println("Year of assembly: " + car[k].Yearassembly);
                System.out.println("Year of registration: " + car[k].Year);
                System.out.println("Month of registration: " + car[k].Month);
                System.out.println("Day of registration: " + car[k].Day);
            }
        }
    }
}