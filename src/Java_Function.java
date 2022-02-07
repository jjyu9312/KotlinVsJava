import java.util.Random;

public class Java_Function {
    
    public static void main(String[] args) {

        /* Apply 함수 */
        Person_Java person = new Person_Java();

        person.firstName = "KIM";
        person.lastName = "KYUNGWOOK";

        /* Also 함수 */
        int value = new Random().nextInt(100);
        System.out.println(value);
    }
}

class Person_Java {
    String firstName;
    String lastName;
}
