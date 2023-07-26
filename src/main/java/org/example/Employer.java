package org.example;

/**
 * – Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
 * – Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк.
 * – Создать массив из 5 сотрудников
 * – Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и размер повышения
 * должны быть параметрами метода.
 * – Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен принимать
 * в качестве параметра массив сотрудников.
 * – Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и
 * среднюю зарплату сотрудников, вывести результаты работы в консоль.
 */
public class Employer {
    public Employer(String fio, String position, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(int sum){
        this.salary+=sum;
    }

    public static void increaseSalaryByAge(Employer[] employers, int increaseSum, int ageWho){
        for (Employer e:employers) {
            if (e.getAge()>=ageWho){
                e.increaseSalary(increaseSum);
            }
        }

    }
    public static void printArray(Employer[] employers){

        for (Employer e:employers) {
            System.out.println(e);
        }
    }

    public static float getAverageSalary (Employer[] employers){
        if (employers.length==0){
            return 0;
        }
        float sumSlary=0;
        for (Employer e:employers) {
           sumSlary+=e.getSalary();
        }
        return sumSlary/ employers.length;
    }
    public static float getAverageAge (Employer[] employers){
        if (employers.length==0){
            return 0;
        }
        float sumAge=0;
        for (Employer e:employers) {
            sumAge+=e.getAge();
        }
        return sumAge/ employers.length;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s\n" +
                        "Должность: %s\n" +
                        "Телефон: %s\n" +
                        "Зарплата: %d\n" +
                        "Возраст: %d\n" ,fio,position,phone,salary,age)+
                "-".repeat(50);
    }

    private String fio;
    private String position;
    private String phone;
    private int salary;
    private int age;

}
