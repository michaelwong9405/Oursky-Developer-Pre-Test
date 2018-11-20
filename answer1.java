import java.util.Arrays;
public class answer1{

     public static void main(String []args){
    String Array1[] = {"A", "C", "D", "E"};
    String Array2[] = {"A", "C", "D", "E"};
    Object [] arrl1 = {Array1};
    Object [] arrl2 = {Array2};
    if(Arrays.equals(arrl1, arrl2)){
            System.out.println("ture"); 
        }else{
            System.out.println("false");
        }

     }
}
