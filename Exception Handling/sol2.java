import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.print(c);
        } catch(InputMismatchException ob) {
            System.out.print("java.util.InputMismatchException");
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}