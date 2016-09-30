package objects;

/**
 * Created by nxtlvl on 9/29/2016.
 */
 /* TODO extend this to Person*/
public class Customer extends Person {


    public String introduceYourSelf() {
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi I'm " + firstName + " " + lastName + ", " + "I am a carpenter!";

    }

    public String introduceYourSelf (String buySomething){
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi I'm " + firstName + " " + lastName + ", " + "I wanna buy  " + buySomething ;



    }
}
