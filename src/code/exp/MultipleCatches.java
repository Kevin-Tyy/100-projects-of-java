package code.exp;

public class MultipleCatches {
    //Demonstrate multiple catch statements. class Multiple Catches {
    public static void main(String[] args) {
       int[] array = new int[10];
       int i = 0;
       while (i < array.length){
           array[i] = i * 2;
           i++;
       }
       array[array.length - 1] = (int) 38293L;
       for (int item : array){
           System.out.println(item);
       }
    }

}

