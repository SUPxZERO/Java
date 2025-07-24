import java.util.ArrayList;

public class oddEven {
    public static void main(String[] args) { //short-cut psvm
        
        int num[] = {23, 30, 45, 17, 50};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println(); //short-cut sout
        for (int i=0; i<num.length; i++){
            float remainder = num[i] % 2;
            if (remainder == 0){
                even.add(num[i]);

            }
            else{
                odd.add(num[i]);

            }
        }
        System.out.println("Even number: " + even);
        System.out.println("Odd number: " + odd);
    }
}
    
