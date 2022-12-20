package termpapertomášjanovec;

/**
 * 15. program creates two dimensional array, with incrementing integers in spiral pattern
 * @author tomja
 */
import java.util.Scanner;
public class UI {
    public static Scanner sc = new Scanner(System.in);
    public static void printA(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println("");
            
        }       
    }
    
    public static int menu(){
        System.out.println("************************");
        System.out.println("Jaky chcete spustit program? ");
        System.out.println("1. Vanocni uloha ");
        System.out.println("2. Semestralni prace ");
        System.out.println("0. Ukonceni programu");
        System.out.println("************************");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(menu());
    }
}
