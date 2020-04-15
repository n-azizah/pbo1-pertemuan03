package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 23000;
        double uangDiDompet = 10000;

        if (uangDiDompet<totalBelanja){
            System.out.println("uang kurang, kurangi belanjaan!");
        }else if (uangDiDompet>totalBelanja){
            double kembalian = uangDiDompet - totalBelanja;
            System.out.println("uang cukup, terimakasih banyak! silahkan kembaliannya :"+kembalian);
        }else {
            System.out.println("uang pas...ghamsahamnida hyung");
        }
    }
}
