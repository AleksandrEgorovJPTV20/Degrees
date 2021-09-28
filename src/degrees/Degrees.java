/*
Дано значение температуры T в градусах Цельсия. 
Определить значение этои же температуры по 
Фаренгейту.
Aleksandr Egorov JPTV20
*/
package degrees;
import java.util.Scanner;


public class Degrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Класс который позволяет считывать данные из разных источников. И из консоли тоже.
        System.out.print("Введите температуру по цельсию: ");
        float tc = scanner.nextFloat(); // ввод пользователя
        float tf = (tc * 9 / 5) + 32; // формула фаренгейта
        System.out.print("Цельсии преобразованы в Фаренгейт: ");
        System.out.println(tf);
    }
    
}
