import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
       a.add(":)");
        a.add(":)");
        a.add(";~)");
        a.add(";~)");

        System.out.println( SmileFaces.countSmileys(a));
    }


    public class SmileFaces {

        public static int countSmileys(List<String> arr) {

            String[] key = new String[]{";~)",";-)",":-)", ":~)", ";)", ":)", ";~D",";-D",":-D", ":~D", ";D", ":D"};
            int count = 0;

            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < key.length; j++) {
                    if(arr.get(i).trim().equals(key[j])){

                        count++;
                    }
                }
            }
            return count;
        }
    }





}