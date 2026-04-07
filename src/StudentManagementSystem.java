import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String roll;

    Student(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();

        students.add(new Student(name, roll));
        System.out.println("Student added successfully!\n");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.\n");
        } else {
            for (Student s : students) {
                System.out.println("Name: " + s.name + ", Roll No: " + s.roll);
            }
            System.out.println();
        }
    }

    public static void deleteStudent() {
        System.out.print("Enter roll number to delete: ");
        String roll = sc.nextLine();

        for (Student s : students) {
            if (s.roll.equals(roll)) {
                students.remove(s);
                System.out.println("Student deleted.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    viewStudents();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!\n");
            }
        }
    }
}