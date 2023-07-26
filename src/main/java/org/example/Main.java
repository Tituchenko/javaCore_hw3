package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employer[] employers = new Employer[6];
        employers[0]=new Employer("Петров П.В.","Менеджер","12345678",83000,32);
        employers[1]=new Employer("Иванов А.Н.","Менеджер","78687687",120000,26);
        employers[2]=new Employer("Сидоров А.Н.","Рабочий","78687686",30000,45);
        employers[3]=new Employer("Маркова Н.И.","Бухгалтер","9786464",60000,65);
        employers[4]=new Employer("Сидоркина Г.Ш.","Уборщица","897988",20000,50);
        employers[5]=new Director("Шишкин В.Г.","777",300000,60);
        System.out.println("Информация о сотрудниках:");
        Employer.printArray(employers);
        Employer.increaseSalaryByAge(employers,5000,45);
        System.out.println("Информация о сотрудниках (после повышения):");
        Employer.printArray(employers);
        System.out.println("Средняя зарплата: "+Employer.getAverageSalary(employers));
        System.out.println("Средний возраст: "+Employer.getAverageAge(employers));
        System.out.println("Информация о сотрудниках (после второго повышения):");
        Director.increaseSalaryByAge(employers,5000,40);
        Employer.printArray(employers);
    }
}