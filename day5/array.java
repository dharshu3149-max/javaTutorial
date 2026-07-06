package day5;

import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++)
        {
            arr[i] = sc.next();
        }
        for (int i = 0; i < 6; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
