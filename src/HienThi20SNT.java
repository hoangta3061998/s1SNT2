public class HienThi20SNT {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("20 so nguyen to dau tien la : \n");
        for (int i = 0;count < 20; i++){
            if (isPrimeNum(i)){
                System.out.println(i + " ");
                count++;
            }
        }
    }

    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
