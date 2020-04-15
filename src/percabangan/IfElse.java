package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 23000;
        double uangDiDompet = 100000;

        if (uangDiDompet<totalBelanja){
            System.out.println("uang kurang, kurangi belanjaan!");
        }else{
            System.out.println("uang cukup, terimakasih banyak!");
        }
    }
}
