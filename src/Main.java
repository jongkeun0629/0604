public class Main {
    public static void main(String[] args) {
        int age = 26;
        boolean hasID = true;

        if(age >= 18 && hasID) {
            System.out.println("접속가능.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if(isWeekend || isHoliday){
            System.out.println("휴식");
        }

        boolean isRaining = true;
        if (!isRaining){
            System.out.println("나가");
        } else {
            System.out.println("우산");
        }
    }
}