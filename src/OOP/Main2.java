package OOP;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);




/*
     String a = "avnaadvjhhhdfkddlvj";


     Map<Character, Integer> mapOfLetters = new HashMap<>();

     for (int i =0; i < a.length(); i++) {
         if(!mapOfLetters.containsKey(a.charAt(i))){
             mapOfLetters.put(a.charAt(i), 1 );
         } else if (mapOfLetters.containsKey(a.charAt(i))) {

             int b = mapOfLetters.get(a.charAt(i))+1;
             mapOfLetters.replace(a.charAt(i), b);


         }


     }


        for (Map.Entry<Character, Integer> b  : mapOfLetters.entrySet()) {
            System.out.println(b);
        }
*/

         //  TASK 1
        //find length of a string without using .length()


        //String str = "abcbjkflks";


       // int length = str.lastIndexOf('k');

        /*
        char[] strCharArr = str.toCharArray();

        int countOfChar = 0;

        for (char a : strCharArr) {
            countOfChar++;
        }

        System.out.println("The lenght of your word is " + countOfChar );


        int countOfLetters = 0;

        try{
            for (int i = 0; ; i++) {
                str.charAt(i);
                countOfLetters++;
            }
        } catch (Exception e) {
            System.out.println("The lenght of your word is " + countOfLetters );
            //e.printStackTrace();
        }

*/










        //TASK 2
        // Find the number occurring odd number of times in an array

//
//        int[] array = {10, 10, 11, 10};
//
//        Set<Integer> listA = new HashSet<>();
//
//        for (int i =0; i < array.length; i++) {
//            int a = array[i];
//            int countOfoccurence = 0;
//            for (int j = 0; j < array.length; j++) {
//                if(a == array[j]) {
//                    countOfoccurence++;
//                }
//            }
//            if(countOfoccurence%2 != 0) {
//               listA.add(array[i]);
//            }
//
//        }
//
//
//        for (int a: listA) {
//            System.out.println(a);
//        }


        int num = 12345;
        int b;


        System.out.println("Hello");

        int reversed = 0;

        while(num != 0) {
            int digit = num%10;
            reversed = (reversed * 10) + digit;
            System.out.println(reversed);
            num/=10;
        }





    }







}
