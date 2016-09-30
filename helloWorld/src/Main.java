import exercises.ExerciseArrayList;
import objects.Customer;
import objects.Employee;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* this is a comment block */

        /**
         *
         *  This is a documentation comment block
         *
         *
         */

        /* TODO this is to do comment block*/

        // This is a single line commented out

/*
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpto= 2114422131;
        long largeDEcimalVariableFrom = -21312313L;
        long largeDEcimalVariableUpTo = 23423423L;
        float numberWithDecimalPlaces =8.222f;
        double veryLargeNumberWithDecimalPlaces = 123131.123123;
        boolean isTrueOrFalse = true ;
        char singleCharacter = '\u0042';
        double itIsDouble = numberWithDecimalPlaces+byteVariable ;

        System.out.println(byteVariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpto);
        System.out.println(largeDEcimalVariableFrom);
        System.out.println(largeDEcimalVariableUpTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(itIsDouble);
  */
//
//        Person info = new Person  ("Mario", "Quijada");
////        info.setFirstName("Mario Jose ");
////        info.setLastName("Quijada");
//         String newPerson = info.introduceYourself();
//                 System.out.println(newPerson) ;

        Employee details = new Employee();
        details.setFirstName("Rocky");
        details.setLastName("Road");
        String knowingPosition = details.introduceYourSelf("Manager");


        Customer about = new Customer();
        about.setFirstName("Sandy");
        about.setLastName("Man");
        String customerBuying = about.introduceYourSelf("Nails");


//        String introduceYourSelf = info.introduceYourself();

        String introduceEmployee = details.introduceYourSelf();
        String introduceCustomer = about.introduceYourSelf();
//        System.out.println( introduceYourSelf);
        System.out.println(introduceEmployee);
        System.out.println(knowingPosition);
        System.out.println(introduceCustomer);
        System.out.println(customerBuying);


        /*int a = 1;

        while (a <= 6)

        {

            System.out.println("[" + a + "]");
            a++;
        }

        int num = 1;
        int sum = 0;

        while (num <= 6) {

            sum = sum + num;
            num++;
        }
        System.out.print(sum);
    }*/


        //int num = 1;
        int sum = 0;

        /*do {
            System.out.println("[" + sum + "]");
            num++;
        } while (num < 6);*/
//
//        for (String teachers = 1; teachers <= 6; teachers++) {
//            sum += teachers;


        String[] myInstructors = {
                "Neil", "Bert", "Amille"
        };

        for (int l = 0; l <= 2; l++) {
            if (myInstructors[l] == "Bert") {
                myInstructors[1] = "Amante";
                System.out.print(myInstructors[1]);
            }

            int y = 0;
            int u = 2;

            while (u <= 5) {
                y = u + y;
                u++;
            }
            System.out.println(y);

            ExerciseArrayList.myList();
            ExerciseArrayList.myX();
            ExerciseArrayList.myStatus();
            ExerciseArrayList.randomRandom();
        }

    }

}




/*
---------Primitive Variables------------------------

byte byteVariable = 127;
short mediumRangeDecimalVariable = 32767;
int decimalVariableUpto= 2114422131;
long largeDEcimalVariableFrom = -21312313L;
long LargeDEcimalVariableUpTo = 23423423L;
float numberWithDecimalPlaces =8.2f;
double veryLargeNumberWithDecimalPlaces = 123131.123123;
boolean isTrueOrFalse = true ;
char singleCharacter = '\u0041';

        String someText = "this is a string variable"

---------------Objects----------------------------------


*/

