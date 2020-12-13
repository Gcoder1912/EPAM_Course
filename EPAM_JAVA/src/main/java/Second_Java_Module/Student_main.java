package Second_Java_Module;

import java.util.Scanner;

public class Student_main {

    public static void main(String[] args) {

        System.out.println("What criterion you want to use? You can use:" + '\n' +
                "faculty" + '\n' +
                "Older than input year" + '\n' +
                "All students" + '\n' +
                "group" + '\n' +
                "faculty and course" + '\n');

        Scanner choose_criterion = new Scanner(System.in);
        String criterion = choose_criterion.nextLine();

        Scanner student_criterion = new Scanner(System.in);
        int students_counter = 0;

        switch (criterion) {//switch-case для обработки того, какую информацию хочет вывести пользователь
            case "faculty":
                System.out.println("Please, enter student's faculty, for our search");

                String faculty_criterion = student_criterion.nextLine();
                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getFaculty().equals(faculty_criterion)) {
                        students_counter++;
                        if (students_counter > 0) {
                            System.out.println(Student.students_list[i]);
                        }
                    }
                }
                break;

            case "All students"://вывод всех студентов без каких либо фильтров
                for(int i = 0; i < Student.students_list.length; i++) {
                    System.out.println(Student.students_list[i]);
                }
                break;

            case "faculty and course"://Списки студентов всех курсов и всех факультетов(Студент может не принадлежать сразу к обоим)
                System.out.println("Below, contains all students from all courses and faculty " + '\n');
                students_counter = 1;
                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getCourse().equals(1)) {
                        if (students_counter > 0) {
                            System.out.println("First course students are: ");
                        }
                        System.out.println(Student.students_list[i].getFirst_name() + ' ' + Student.students_list[i].getSecond_name());
                        students_counter--;
                    }

                }
                students_counter = 1;

                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getCourse().equals(2)) {
                        if (students_counter > 0) {
                            System.out.println("\nSecond course students are: " + '\n' +
                                    Student.students_list[i].getFirst_name() + ' ' + Student.students_list[i].getSecond_name());
                        }
                        students_counter--;

                    }
                }
                students_counter = 1;

                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getCourse().equals(3)) {
                        if (students_counter > 0) {
                            System.out.println("\nThird course students: " + '\n' +
                                    Student.students_list[i].getFirst_name() + ' ' + Student.students_list[i].getSecond_name());
                        }
                        students_counter--;

                    }
                }
                students_counter = 1;
                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getCourse().equals(4)) {
                        if (students_counter > 0) {
                            System.out.println("\nFourth course students: " + '\n' +
                                    Student.students_list[i].getFirst_name() + ' ' + Student.students_list[i].getSecond_name());
                        }
                        students_counter--;

                    }
                }
                System.out.println("Information security faculty students: " + '\n');
                for (Student value : Student.students_list) {
                    if (value.getFaculty().equals("Information security")) {
                        System.out.println(value);
                    }

                }
                System.out.println("Computer Science faculty students: " + '\n');
                for (Student student : Student.students_list) {
                    if (student.getFaculty().equals("Computer Science")) {
                        System.out.println(student);
                    }

                }
                System.out.println("Python-Backend faculty students: " + '\n');
                for (Student student : Student.students_list) {
                    if (student.getFaculty().equals("Python-Developer")) {
                        System.out.println(student);
                    }

                }

                break;

            case "Older than input year"://Вывод студентов родившихся после введенного года
                Scanner student_year_of_birth = new Scanner(System.in);
                System.out.println("Please, enter student's year of birth for our search");

                Integer year_of_birth = student_year_of_birth.nextInt();
                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getYear_of_birth() > year_of_birth) {
                        System.out.println(Student.students_list[i]);
                        students_counter++;
                    }
                }
                if (students_counter == 0) {
                    System.out.println("Sorry, but we not have students older than this year of birth");
                }
                break;

            case "group"://Вывод университетской группы
                Scanner student_group = new Scanner(System.in);
                System.out.println("Please, enter student's work group");

                String students_group = student_group.nextLine();
                for (int i = 0; i < 5; i++) {
                    if (Student.students_list[i].getGroup().equals(students_group)) {
                        System.out.println(Student.students_list[i]);
                        students_counter++;
                    }
                }
                if (students_counter == 0) {
                    System.out.println("Sorry, but we not have students older than this year of birth");

                }
        }
    }
}
