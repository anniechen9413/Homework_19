package HW3;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//a b c三邊長
//正三角形 a=b=c

import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("請輸入三個整數：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if (isTriangle(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("這是一個等腰三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("這是一個正三角形");
            } else {
                System.out.println("這是一個其他三角形");
            }
        } else {
            System.out.println("這不是一個三角形");
        }
        
        input.close();
    }
    
    public static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
