
package termpapertomášjanovec;
/**
 * 15. program creates two dimensional array, with incrementing integers in spiral pattern
 * @author tomja
 */
public class SpiralMatrix {
    private SpiralMatrix(){}
    /**
     * Method goRight- Fills all the holes in row (coordinate of the row is taken from coord[0]) of array with incrementing integers starting from coord[3];
     * method fills only "holes" in array, etc. all values that equal to 0
     * All methods starting with go, work the similar way, only changing direction of inserted numbers from the position
     * @param array
     * @param coord [x,y,currentNumber]
     * It does not need to return any variable, since the arrays of method are written in the same memory as arrays from makeArray method.
     */
    public static void goRight(int array[][], int coord[]){

        while (array[coord[0]].length>coord[1]+1 && array[coord[0]][coord[1]+1]==0){
            coord[1]+=1;
            array[coord[0]][coord[1]]= coord[2];
            coord[2]+=1;
        }
    }
    public static void goDown(int array[][], int coord[]){
        while (array.length>coord[0]+1 && array[coord[0]+1][coord[1]]==0){
            coord[0]+=1;
            array[coord[0]][coord[1]] = coord[2];
            coord[2]+=1;
        }        
    }
    public static void goLeft(int array[][], int coord[]){
        while (coord[1]-1>=0 && array[coord[0]][coord[1]-1]==0){
            coord[1]=coord[1]-1;
            array[coord[0]][coord[1]] = coord[2];
            coord[2]+=1;
        }        
    }
    public static void goUp(int array[][],int coord[]){
        while (coord[0]-1>=0 && array[coord[0]-1][coord[1]]==0){
            coord[0]=coord[0]-1;
            array[coord[0]][coord[1]] = coord[2];
            coord[2]+=1;
        }        
    }
    /**
     * Method generates array of 0 and then it applies go methods to fill the array
     * @param n number of rows
     * @param m number of columns
     * @return completed array
     */
    public static int[][] makeArray(int n, int m){           
        int[][] array = new int[n][m];
        int numberC = n*m; //total number of elements in matrix
        int[] coord = {0,0,2};
        array[0][0] = 1;
        
        while(coord[2] <= numberC){
            goRight(array,coord);
            goDown(array,coord);
            goLeft(array,coord);
            goUp(array,coord);
        }
        return array;
     }
    /**
     * Method start asks the user for input and then prints out the finished array
     * method also handles extreme cases, where the input for variable m is negative, method sets its value to 0 
     * method is designed so after entering negative value for the rows (not columns, as it says in the Assignment), it ends
     * 
     */
    public static void start(){
        int n, m;
        do{
            System.out.println("Zadejte pocet radku: ");
            m=UI.sc.nextInt();
            if(m>0){
                System.out.println("Zadejte pocet sloupcu: ");
                n=UI.sc.nextInt();
                while(n<=0){
                    System.out.println("Neplatny vstup");
                    System.out.println("Zadejte pocet sloupcu: ");
                    n=UI.sc.nextInt();
                    System.out.println("");
                }
                UI.printA(makeArray(m,n));
            }
        } while(m>0);
    }
    public static void main(String[] args) {
        start();
//        int[][] array = new int[5][5];
//        //Testing for the moving methods (manually inputed values)
//        int[] coord = {0,0,1};
//        goRight(array,coord);
//        printA(array);
//        
//        goDown(array,coord);
//        System.out.println("");
//        printA(array);
//        goLeft(array,coord);
//        System.out.println("");
//        printA(array);
//        goUp(array,coord);
//        printA(array);
//        System.out.println("`");
//        printA(makeArray(5,3));
//        System.out.println("");
//        
    }
}
