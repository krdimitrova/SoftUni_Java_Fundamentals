package Lecture_01_BasicSyntaxConditionalStatementsAndLoops.P_01_Lab;

import java.util.Scanner;

public class T_04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes > 59) {
            if (hour + 1 > 23) {
                hour = 0;
            } else {
                hour++;
            }
            minutes -= 60;
        }

        System.out.printf("%d:%02d", hour, minutes);
    }
}
