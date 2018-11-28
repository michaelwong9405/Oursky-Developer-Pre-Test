public class HelloWorld{
    private static boolean testTheCharacterInSet(char text, char[] array){
        for(int i=0;i<array.length;i++){
            if(text==array[i])return true;
        }
        return false;
    }

    private static boolean isSubSet(char[] array1,char[] array2){
        for(int i=0; i<array2.length; i++){
            boolean temp;
            temp = testTheCharacterInSet(array2[i],array1);
            if(temp==false)return false;
            
        }
        return true;
    }

     public static void main(String []args){
        char[] array1 = {'A','D','E'};
        char[] array2 = {'A','A','D','E'};
        boolean temp = isSubSet(array1,array2);
        if(temp == true){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
     }
}
