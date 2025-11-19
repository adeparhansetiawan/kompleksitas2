public class PangkatDuaIterasi {

    public static long pangkatDua(int n) {
        long hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil = hasil * 2;
        }

        return hasil;
    }

    public static void main(String[] args) {
        int n = 10; // bisa diubah sesuai kebutuhan
        long hasil = pangkatDua(n);

        System.out.println("Hasil 2^" + n + " = " + hasil);
    }
}
