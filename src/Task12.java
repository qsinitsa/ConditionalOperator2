public class Task12 {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0){
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }

        }else if (clientOS == 1){
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию для Android по ссылке");
            }else {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
        }
    }
}
