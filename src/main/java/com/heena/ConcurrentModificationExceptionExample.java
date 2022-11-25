package com.heena;

import java.util.ArrayList;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Heena");
        list.add("Heena1");
        list.add("Heena2");
        list.add("Heena3");
        list.add("Heena4");
       /* for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("Heena")) {
            //This will not throw concurrent modification exception
                list.remove(i);
            }
        }*/

       /* for (String str :list) {
            if(str.equalsIgnoreCase("Heena")){
                //This will throw concurrent modification exception
                list.remove("Heena");
            }
        }*/


       /* extracted(list);

        list.forEach(value -> {
            //This will throw concurrent modification exception
            if (value.equalsIgnoreCase("Heena")) {
               // break;
                //return value;
                //list.remove("Heena");
            }
        });
*/
        list.stream().forEach(value -> {
            //This will throw concurrent modification exception
            if (value.equalsIgnoreCase("Heena")) {
                // break;
                //return value;
               // list.remove("Heena");
            }
        });

        print(list);
    }

    private static void extracted(ArrayList<String> list) {
        for (String str : list) {
            if (str.equalsIgnoreCase("Heena")) {
                break;
                //cannot return a vale from a method with void result type
                //return str;
            }
        }
    }

    private static void print(ArrayList<String> list) {
        list.forEach(System.out::println);
    }
}
