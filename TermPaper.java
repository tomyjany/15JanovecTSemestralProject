package termpapertomášjanovec;

/**
 * 15. program creates two dimensional array, with incrementing integers in spiral pattern
 * @author tomja
 */
public class TermPaper {
    public static void main(String[] args) {
        int choice;
        do{
        choice = UI.menu();
        switch(choice){
            case 1 : ChristmasJanovecTomas.makePresent();break;
            case 2 : SpiralMatrix.start();break;
        }
        }while(choice!=0);
    }
    
}
