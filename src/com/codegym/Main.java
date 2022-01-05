package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[] students = {"Minh", "Viet","Sang","Lich"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien:");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i< students.length; i++){
            if(students[i].equals(inputName)){
                System.out.println("Hoc sinh "+inputName+" co vi tri la "+(i+1));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Hoc sinh "+inputName+" khong co trong danh sach");
        }
    }
}
