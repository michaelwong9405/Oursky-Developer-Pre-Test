public class answer3{
    
     static int f(int n){
       if(n == 0){
        return 0;
    } else if (n == 1){
        return 1;
    }else {return f(n-1) + f(n-2);}

    }
    
     public static void main(String []args){

    int number[] ={1,22,9};
    
    
    int a=0;
    int arrLength = number.length;
    
    while (a<arrLength){
        int n=0;
        while (f(n)<=number[a]){
            n++;
         }
        System.out.println(f(n));

    a++;
    }
    } 
}
