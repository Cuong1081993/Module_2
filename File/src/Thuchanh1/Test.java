package Thuchanh1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        readFileExample readFileEx = new readFileExample();
        readFileEx.readFileText(path);
    }
}
