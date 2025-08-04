package Level1;

//Дано число. Проверьте, четное оно или нет.
public class Level_1_4 {
    public static void checkNumber(int numder){
        if (numder == 0){
            System.out.println(STR."Число \{numder} равно нулю.");
        } else if (numder % 2 == 0) {
            System.out.println(STR."Число \{numder} четное.");
        } else {
            System.out.println(STR."Число \{numder} не четное.");
        }
    }

    public static void main(String[] args) {
        checkNumber(11);
    }

}
