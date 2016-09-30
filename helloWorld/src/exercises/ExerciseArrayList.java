package exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class ExerciseArrayList {

    public static String myList() {


        List<String> myFriends = new ArrayList<>();

        myFriends.add("Arniel");
        myFriends.add(1, "Bryan");
        myFriends.add(2, "Charlie");
        myFriends.add(3, "Dodong");
        myFriends.add(4, "Earl");

        Random random = new Random();

        int index = random.nextInt(myFriends.size());

        return myFriends.get(index);

    }

    public static String myX()
    {
        List<String> myXFriends = new ArrayList<>();

        myXFriends.add("Anthonnette");
        myXFriends.add(1, "Carmelyn");
        myXFriends.add(2, "Irene");
        myXFriends.add(3, "Joan");
        myXFriends.add(4, "Kathleen");

        Random random = new Random();

        int index = random.nextInt(myXFriends.size());

        return myXFriends.get(index);

    }

    public static String myStatus() {
        List<String> myStatus = new ArrayList<>();

        myStatus.add("Hates");
        myStatus.add(1, "Loves");
        myStatus.add(2, "Like");
        myStatus.add(3, "Hurt");

        Random random = new Random();

        int index = random.nextInt(myStatus.size());

        return myStatus.get(index);
    }
    public static void randomRandom()
    {
        String myRandomFriend = myList();
        String myRandomXfriend = myX();
        String myRandomRelationship = myStatus();

        System.out.println( myRandomFriend + " " + " " + myRandomRelationship + " " + myRandomXfriend);

    }
}