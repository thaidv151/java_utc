import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Bai 1: Nhap mang va tinh tong ");
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int tong1 = 0;
        for (int i = 0; i < n; i++) {
            tong1 = tong1 + a[i];
        }
        System.out.println("Tong = " + tong1);

        System.out.println();
        System.out.println(" Bai 2: Mang tong cua 2 mang ");
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {10, 20, 30};
        int dodai;
        if (m1.length > m2.length) {
            dodai = m1.length;
        } else {
            dodai = m2.length;
        }
        int[] mangTong = new int[dodai];
        for (int i = 0; i < dodai; i++) {
            int gt1 = 0;
            int gt2 = 0;
            if (i < m1.length) {
                gt1 = m1[i];
            }
            if (i < m2.length) {
                gt2 = m2[i];
            }
            mangTong[i] = gt1 + gt2;
        }
        System.out.print("Mang tong: ");
        for (int i = 0; i < dodai; i++) {
            System.out.print(mangTong[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println(" Bai 3: Nhap mang bang chuoi ");
        sc.nextLine();
        System.out.print("Nhap chuoi so: ");
        String chuoi = sc.nextLine();
        String[] phanTu = chuoi.split(" ");
        int soLuong = phanTu.length;
        int tong3 = 0;
        for (int i = 0; i < soLuong; i++) {
            tong3 = tong3 + Integer.parseInt(phanTu[i]);
        }
        System.out.println("So phan tu: " + soLuong + "; Tong: " + tong3);
    }
}
