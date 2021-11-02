package exercise3;

public class NumberSearch {
    public static void main(String[] args) {
        
        int counter = 0;
        
        for (int i = 100; i <=1000; i++){
            if (counter<9){
                if (i % 5 == 0 && i % 6 ==00){
                    System.out.print(i + " ");
                    counter++;
                    
                }
            }else {
                if ( i % 5 == 0 && i % 6 == 0){
                    System.out.println(i);
                    counter=0;
                }
            }
        }
    }
}