public class Task4 {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int day = 1;
        int intervals = (deliveryDistance -20)/40;
        int remains = 0;
        if ((deliveryDistance-20) % 40 != 0){
            remains = 1;
        }
        int days = intervals + day + remains;
        System.out.println("Потребуется дней для доставки " + days);
    }
}
