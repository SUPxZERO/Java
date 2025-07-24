public class IfElseTest {
    public static void main(String[] args) {
        int grade = 88;
        if ( grade >= 95 && grade <= 100){
            System.out.println("You got grade A");
        }
        else if ( grade >= 83){
            System.out.println("You got grade B");
        }
        else if ( grade >= 70 ){
            System.out.println("You got grade C");
        }
        else if ( grade >= 60){
            System.out.println("You got grade D");
        }
        else {
            System.out.println("You got grade F");
        }

    }
    
}
