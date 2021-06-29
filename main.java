import java.util.*;

class main{
    public static void main(String[] args){
     Scanner keyboard = new Scanner(System.in);
    int numberOne, numberTwo;
    numberOne = keyboard.nextInt();
    numberTwo = keyboard.nextInt();

     if(numberOne < 100 && numberTwo < 100) //idk how to not use spaghetti code 
     {
         System.out.println(numberOne+numberTwo);
     }

    }
}
