import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Details =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);

        System.out.println("\n===== Student Result =====");
        System.out.println("Student Name : " + s.getName());
        System.out.println("Average Marks: " + s.calculateAverage());

        sc.close();
    }
}