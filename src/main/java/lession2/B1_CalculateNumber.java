package lession2;

import java.util.Scanner;

public class B1_CalculateNumber {
    public static void main( String[] args )
    {
        int n, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập một số có 3 chữ số: ");
        n = scan.nextInt();
        int a = n/100;
        int b = n%100/10;
        int c = n%100%10;
        sum= a+b+c;
        System.out.println("Tổng 3 số của số có 3 chữ số là: "+sum);
        System.out.println("hello");

    }
}
