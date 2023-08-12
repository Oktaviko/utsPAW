package classuts.uts;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        String grade = hitungGrade(nilai);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String hitungGrade(int nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 77.5 && nilai < 79.99) {
            return "A-";
        } else if (nilai >= 75 && nilai < 77.49) {
            return "A/B";
        } else if (nilai >= 72.5 && nilai < 74.99) {
            return "B+";
        } else if (nilai >= 70 && nilai < 72.49) {
            return "B";
        } else if (nilai >= 67.5 && nilai < 69.99) {
            return "B-";
        } else if (nilai >= 65 && nilai < 67.49) {
            return "B/C";
        } else if (nilai >= 62.5 && nilai < 64.99) {
            return "C+";
        } else if (nilai >= 60 && nilai < 62.49) {
            return "C";
        } else if (nilai >= 55 && nilai < 59.99) {
            return "C-";
        } else if (nilai >= 50 && nilai < 54.99) {
            return "C/D";
        } else if (nilai >= 45 && nilai < 49.99) {
            return "D+";
        } else if (nilai >= 40 && nilai < 44.99) {
            return "D";
        } else {
            return "E"; // X untuk nilai di luar rentang 0-100
        }
    }
}
