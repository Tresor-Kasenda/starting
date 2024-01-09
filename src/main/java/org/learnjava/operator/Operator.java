package org.learnjava.operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first percentage: ");
        double firstPercentage = scanner.nextDouble();

        System.out.print("Enter the second percentage: ");
        double secondPercentage = scanner.nextDouble();

        System.out.print("Enter the third percentage: ");
        double thirdPercentage = scanner.nextDouble();

        int greatestPercentage;

if (firstPercentage >= secondPercentage && firstPercentage >= thirdPercentage) {
    greatestPercentage = 1;
} else if (secondPercentage >= firstPercentage && secondPercentage >= thirdPercentage) {
    greatestPercentage = 2;
} else if (thirdPercentage >= secondPercentage) {
    greatestPercentage = 3;
} else {
    greatestPercentage = 0;
}

switch (greatestPercentage) {
    case 1:
        System.out.println("The first percentage is the greatest.");
        break;
    case 2:
        System.out.println("The second percentage is the greatest.");
        break;
    case 3:
        System.out.println("The third percentage is the greatest.");
        break;
    default:
        System.out.println("All percentages are equal.");
        break;
}
    }
}
