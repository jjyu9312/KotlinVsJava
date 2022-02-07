import java.util.Random;

public class Java_Function {
    
    public static void main(String[] args) {

        /* apply 함수 */
        Person_Java person = new Person_Java();

        person.firstName = "KIM";
        person.lastName = "KYUNGWOOK";

        /* also 함수 */
        int value = new Random().nextInt(100);
        System.out.println(value);

        /* let 함수 */
        Integer number = null;
        String sumNumberStr = null;

        if (number != null) {
            sumNumberStr = "" + sum(10, number);
        }
    }
}

class Person_Java {
    String firstName;
    String lastName;
}
