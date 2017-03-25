package cput.ac.za;

import java.util.*;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Question1 {

    public String listNames(){

        List<String> name = new ArrayList<String>();

        name.add("Adeeb");
        name.add("Nacerodien");

        System.out.println(name.get(1));
        return name.get(1);
    }

    public String mapNames(){

        HashMap<Integer, String> maps = new HashMap<Integer, String>();

        maps.put(1,"Europe");
        maps.put(2,"Africa");
        maps.put(3,"Asia");

        System.out.println(maps.get(3));
        return maps.get(3);
    }

    public String setNames(){

        Set set = new HashSet();

        set.add("Hollywood");
        set.add("Bollywood");

        System.out.println(set.toString());
        return set.toString();
    }

    public static void main (String [] args){

        Question1 answers = new Question1();

        answers.listNames();
        answers.mapNames();
        answers.setNames();
    }
}
