public class bai2 {

    public static void main(String[] args) {
        Diem d1 = new Diem(0, 0);
        Diem d2 = new Diem(4, 0);
        Diem d3 = new Diem(0, 3);
        TamGiac tg1 = new TamGiac(d1, d2, d3);
        System.out.println("Tam giac 1:");
        System.out.println("Chu vi = " + tg1.tinhChuVi());
        System.out.println("Dien tich = " + tg1.tinhDienTich());

        Diem d4 = new Diem(1, 1);
        Diem d5 = new Diem(5, 1);
        Diem d6 = new Diem(3, 5);
        TamGiac tg2 = new TamGiac(d4, d5, d6);
        System.out.println("Tam giac 2:");
        System.out.println("Chu vi = " + tg2.tinhChuVi());
        System.out.println("Dien tich = " + tg2.tinhDienTich());

        ChuNhat cn1 = new ChuNhat(5, 3);
        System.out.println("Chu nhat 1:");
        System.out.println("Chu vi = " + cn1.tinhChuVi());
        System.out.println("Dien tich = " + cn1.tinhDienTich());

        ChuNhat cn2 = new ChuNhat(8, 4);
        System.out.println("Chu nhat 2:");
        System.out.println("Chu vi = " + cn2.tinhChuVi());
        System.out.println("Dien tich = " + cn2.tinhDienTich());

        Diem o1 = new Diem(0, 0);
        HinhTron ht1 = new HinhTron(o1, 5);
        System.out.println("Hinh tron 1:");
        System.out.println("Chu vi = " + ht1.tinhChuVi());
        System.out.println("Dien tich = " + ht1.tinhDienTich());

        Diem o2 = new Diem(1, 2);
        HinhTron ht2 = new HinhTron(o2, 3);
        System.out.println("Hinh tron 2:");
        System.out.println("Chu vi = " + ht2.tinhChuVi());
        System.out.println("Dien tich = " + ht2.tinhDienTich());
    }
}

class Diem {
    double x;
    double y;
    Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double tinhKhoangCach(Diem d) {
        double dx = x - d.x;
        double dy = y - d.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

class TamGiac {
    Diem A;
    Diem B;
    Diem C;
    TamGiac(Diem a, Diem b, Diem c) {
        A = a;
        B = b;
        C = c;
    }
    double tinhChuVi() {
        double ab = A.tinhKhoangCach(B);
        double bc = B.tinhKhoangCach(C);
        double ca = C.tinhKhoangCach(A);
        return ab + bc + ca;
    }
    double tinhDienTich() {
        double ab = A.tinhKhoangCach(B);
        double bc = B.tinhKhoangCach(C);
        double ca = C.tinhKhoangCach(A);
        double p = (ab + bc + ca) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }
}
class ChuNhat {
    double dai;
    double rong;
    ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    double tinhChuVi() {
        return 2 * (dai + rong);
    }
    double tinhDienTich() {
        return dai * rong;
    }
}

class HinhTron {
    Diem tamO;
    double r;
    HinhTron(Diem o, double r) {
        tamO = o;
        this.r = r;
    }
    double tinhChuVi() {
        return 2 * Math.PI * r;
    }
    double tinhDienTich() {
        return Math.PI * r * r;
    }
}
