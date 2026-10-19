class Diem {
    double x;
    double y;

    Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double layX() {
        return x;
    }
    void datX(double x) {
        this.x = x;
    }
    double layY() {
        return y;
    }
    void datY(double y) {
        this.y = y;
    }
}

class DuongThang {
    Diem diemA;
    Diem diemB;

    DuongThang(Diem a, Diem b) {
        diemA = a;
        diemB = b;
    }

    Diem layA() {
        return diemA;
    }

    Diem layB() {
        return diemB;
    }

    double tinhDoDai() {
        double dx = diemB.layX() - diemA.layX();
        double dy = diemB.layY() - diemA.layY();
        double ketQua = Math.sqrt(dx * dx + dy * dy);
        return ketQua;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Diem a = new Diem(0, 0);
        Diem b = new Diem(3, 4);

        DuongThang dt = new DuongThang(a, b);

        System.out.println("Diem A: (" + dt.layA().layX() + ", " + dt.layA().layY() + ")");
        System.out.println("Diem B: (" + dt.layB().layX() + ", " + dt.layB().layY() + ")");
        System.out.println("Do dai duong thang: " + dt.tinhDoDai());
    }
}
