package Week2PracticeProblems;

import java.util.*;

public class Week2Q2CSVParser {

    static void parseStudentRecord(String csvLine) {
        String[] parts = csvLine.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + parts[0]);
        System.out.println("Roll No: " + parts[1]);
        System.out.println("Dept: " + parts[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV record: ");
        String csvLine = sc.nextLine();

        parseStudentRecord(csvLine);
    }
}