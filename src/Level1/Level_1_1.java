package Level1;

public class Level_1_1 {
    public static void chek(int number) {
        if (number < 0) {
            System.out.println("Число " + number + " меньше нуля.");
        } else if (number == 0) {
            System.out.println("Число " + number + " равно нулю.");
        }
        else {
            System.out.println("Число " + number + " больше нуля.");
        }
    }

    public static void main(String[] args) {
        chek(15);
//        Level_1_1 level11 = new Level_1_1();
//        level11.chek(15);
    }
}