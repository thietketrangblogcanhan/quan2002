package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int num1 = input.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
}
