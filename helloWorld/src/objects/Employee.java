package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Employee extends Person {

    public String introduceYourSelf () {
        String firstName = getFirstName();
        String lastName = getLastName();

        return "Hi I'm " + firstName + " " + lastName + ", " +"I work in Mountain of Rocks!";
    }

    public String introduceYourSelf (String knowThePosition) {
        String firstName = getFirstName();
        String lastName = getLastName();

        return "Hi I'm " + firstName + " " + lastName + ", " + "I am a" + " "+ knowThePosition;
    }
}

