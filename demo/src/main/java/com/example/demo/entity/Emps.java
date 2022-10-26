package com.example.demo.entity;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/10/21  14:40
 */
public class Emps {
    private int id;
    private String name;
    private int age;
    private String salary;

    public Emps() {
    }

    public Emps(int id, String name, int age, String salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emps{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }
}
