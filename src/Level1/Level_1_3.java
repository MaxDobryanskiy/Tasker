package Level1;

//Дана строка. Выведите в консоль последний символ строки.
public class Level_1_3 {
    public static void lastLetter(String string) {
        char lastLetter = string.charAt(string.length() - 1);
        System.out.println(lastLetter);
    }

    public static void main(String[] args) {
        lastLetter("afdasfasdfafafasfasdfee");

    }
}
