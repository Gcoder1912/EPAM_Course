//ЭТОЙ ХЕРНЕ, НИКАКИЕ КОММЕНТАРИИ НЕ ПОМОГУТ!!!
///НЕ ЛЕЗЬ - УБЬЕТ!
package Second_Java_Module;

import java.util.Scanner;

public class Student { //определение полей
    private String first_name;
    private String second_name;
    private String patronymic;
    private String address;
    private String faculty;
    private Integer year_of_birth;
    private Integer id;
    private String telephone_number;
    private Integer course;
    private String group;

    public Student(String first_name, String second_name, String patronymic,
                   String address, Integer year_of_birth, Integer id,
                   String telephone_number, String faculty, Integer course,
                   String group) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.patronymic = patronymic;
        this.address = address;
        this.year_of_birth = year_of_birth;
        this.id = id;
        this.telephone_number = telephone_number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;

    }

    public Student() {
    }

    //геттеры-сеттеры
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setDate_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public static final Student[] students_list = new Student[5];//массив из студентов
    static {
        students_list[0] = new Student("Dmitriy", "Titatrenko", "Vitalievich-Genadiekanovich",
                "Bokonbaeva", 2001, 2, "+996****5005",
                "Information security", 2, "OBIS--2");

        students_list[1] = new Student("Stanislav", "Kazantsev", "Alexandrovich",
                "Orozbekova", 1996, 3,
                "+99655****457", "Python-Developer", 3, "PBD");

        students_list[2] = new Student("Dmitriy", "Evseev", "Alekseevich",
                "Gorkogo", 2002, 1, "+9965517****7",
                "Information security", 1, "OBIS--2");

        students_list[3] = new Student("Artem", "Skvortsov", "Alekseevich",
                "Gorkogo", 2002, 5, "+9965517****5",
                "Computer Science", 4, "OBIS");

        students_list[4] = new Student("Kristina", "Panasenko", "Artemovna",
                "Gorkogo", 2002, 4, "+9965517****5",
                "Computer Science", 1, "OBIS--2");


        /*Конечно, в данный момент легче просто посчитатьразличные группы,но если мы расширим базу студентов,
        нам придется изменять значения вручную, а этого ой как не хочется
         */


    }
    @Override
    public String toString() {
        return "Student_information: " + '\n' + "full name:" + ' ' + getFirst_name() + ' ' +
                getSecond_name() + ' ' + getPatronymic() + '\n' +
                "telephone number: " + getTelephone_number() + '\n' +
                "address: " + getAddress() + '\n' +
                "faculty: " + getFaculty() + '\n' +
                "course: " + getCourse() + '\n' +
                "group: " + getGroup() + '\n';
    }

}




