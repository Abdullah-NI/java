package _13_OOPS;

import java.sql.Struct;

// user define data type passing to funtion  or class passing to function
public class _181_PassingFunction {
    public static class Students{   // yadi is class ko main method me banaye to uski aukat wahi tak rahegi so if we want to pass in another fun we should creat outside
        String name;                // if we creat in main method so ' public static' not reqquired
        int rollno;
        double percentage;
    }

     public static void print(Students x){  // array ki trah all dibbe pass
         System.out.println(x.name);
         System.out.println(x.rollno);
         x.name="kjh";
     }

    public static void main(String[] args) {
        Students s1 =new Students();
        s1.name="raghav";
        s1.rollno=78;
        s1.percentage=78.98;
        print(s1);   // arr ki trah pass

        System.out.println(s1.name);  //pass by refrence

    }
}
