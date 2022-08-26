package datastructures;


import java.util.LinkedList;
import java.util.List;

public class Name {


        public static void main(String[] args) {

            List<String> strList = new LinkedList<>();//line 1

            //Adding elements to the strList

            strList.add("Java");

            strList.add("Programmer");

            strList.add("Mock");

            strList.add("Certification");



            String value = new String("Mock");

            testString(strList, "Java", value);//line 2

            System.out.println(strList);





        }

        public static <String> void testString(List<String> strList, String value1,String value2)//line 3

        {

            for (String string : strList) {//line 4



                if(value1.equals(string)) {

                    strList.remove(value2);

                }

            }

        }




}
