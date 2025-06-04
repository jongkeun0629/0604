public class Main {
    public static void main(String[] args) {
        int input = 1;

        do {
            System.out.println("안녕하세요 자판기 입니다.");

            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름ㅋ");
            }

            input = 0;
        } while(input != 0);
    }
}