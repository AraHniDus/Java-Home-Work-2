// 1. Напишите метод, который принимает на вход строку (String) и
//    определяет является ли строка палиндромом (возвращает boolean значение).
//    шалаш
//    abcdedcba
public class HomeWork2 {

    private static boolean isPolindrom(String targetStr){
        if (targetStr.length() == 1)
            return true;
        for (int i = 0; i < targetStr.length()/2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        String [] arrStr = {"шалаш","фывсй","abcdedcba","ыфвйцу","9123k3219"};
        for (String s: arrStr)
            if (isPolindrom(s))
                System.out.printf("%s - полиндром \n", s);
    }
}    