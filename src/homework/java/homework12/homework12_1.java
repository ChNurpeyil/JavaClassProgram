package com.java.homework.homework12;

import java.util.Scanner;

public class homework12_1 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word : ");
        String words =sc.nextLine();
        System.out.println(" star with \"hi\"  " + starWithHi(words)  );
    }
    public static boolean starWithHi(String words){
        return words.startsWith("hi");
    }
}
