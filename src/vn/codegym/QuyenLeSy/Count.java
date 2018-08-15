package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string ="";
        char substr;
        int count=0;

        System.out.print("Nhập vào chuỗi bất kỳ: ");
        string = scanner.next();

        System.out.print("Nhập vào ký tự cần đếm: ");
        substr = scanner.next().charAt(0);

        for (int i = 0; i < string.length(); i++)
        {
            if(substr == string.charAt(i)){
                count+=1;
            }
        }

        System.out.println("Số ký tự "+substr+" có trong chuỗi là: "+count);
    }
}