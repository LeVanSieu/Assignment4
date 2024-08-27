package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Slide37 {

    public static void main(String[] args) {
        Random random = new Random();
        int diem = 0;
        for (int j = 1; j <= 3;) {
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            int c = random.nextInt(10);
            int d = random.nextInt(10);
            int e = random.nextInt(10);
            int f = random.nextInt(3);
            switch (f) {
                case 0:
                    for (int i = 1; i <= 3; i++) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(a + "+" + b + "+" + c + "=");
                        int answer = scanner.nextInt();
                        int tong3 = a + b + c;
                        if (answer == a + b + c) {
                            diem++;
                            break;
                        } else {
                            j++;
                            System.out.println("Sai!!!Dap an DUNG la " + tong3);
                            break;
                        }
                    }
                    break;
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(a + "+" + b + "+" + c + "+" + d + "=");
                        int answer = scanner.nextInt();
                        int tong4 = a + b + c + d;
                        if (answer == a + b + c + d) {
                            diem++;
                            break;
                        } else {
                            j++;
                            System.out.println("Sai!!!Dap an DUNG la " + tong4);
                            break;
                        }
                    }

                    break;
                case 2:
                    for (int i = 1; i <= 3; i++) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(a + "+" + b + "+" + c + "+" + d + "+" + e + "=");
                        int answer = scanner.nextInt();
                        int tong5 = a + b + c + d + e;
                        if (answer == tong5) {
                            diem++;
                            break;
                        } else {
                            j++;
                            System.out.println("Sai!!!Dap an DUNG la: " + tong5);
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

        }
        System.out.println("Diem cua ban: " + diem);
    }
}
