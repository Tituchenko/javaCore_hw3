package org.example;

/**
 * 2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты
 * в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
 * кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Director extends Employer{
    public Director(String fio, String phone, int salary, int age) {
        super(fio, "Руководитель", phone, salary, age);
    }
    @Override
    public void increaseSalary(int sum){
        if (!(this instanceof Director)) super.increaseSalary(sum);
    }
}
