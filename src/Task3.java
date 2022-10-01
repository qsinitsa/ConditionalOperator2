public class Task3 {
    public static void main(String[] args) {
        int year = 200;
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0 ){
                System.out.println("Год не является високосным");
            }else {
                System.out.println("Год является високосным");
            }
        }else System.out.println("Год не является високосным");
    }
}
