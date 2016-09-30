package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public abstract class Person {


 public String firstName ;
 public String lastName ;


    public void setFirstName (String inputFirstName){
        firstName = inputFirstName;

    }

     public String getFirstName () {
         // return this.firstName;
         return firstName;


     }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String introduceYourself () {

        return "Hi I'm " + firstName + " " + lastName;
    }

    public Person (String fname, String lname) {
        this.firstName = fname;
      //  setFirstName(fname);
        this.lastName = lname;
      //  setLastName(lname);
    }
    public Person () {

    }
}
