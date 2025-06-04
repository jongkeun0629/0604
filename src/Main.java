public class Main {
    public static void main(String[] args) {
        int num = 12321;

        String binaryString = Integer.toBinaryString(num);
        String hexString = Integer.toHexString(num);

        System.out.println("Decimal : " + num);
        System.out.println("Binary : " + binaryString);
        System.out.println("Hex : " + hexString);
    }
}