package _13_OOPS;

public class _180_StudentClass {

    //creating data type
    public static class Student{
        String name;
        int rollNo;
        double percentage;

    }

    public static class Car{
        String name;
        int price;
    }
    public static void main(String[] args) {
        Student x=new Student();  // decleration
        x.name="Raghav";      //all are initialization
        x.rollNo=34;
        x.percentage=90;


        System.out.println(x.name);

        //storing the value  ad updation
        String s= x.name="abdullah";
        System.out.println(s);

        //second object
        Student s2=new Student();
        s2.rollNo=89;
        s2.name="abc";
        s2.percentage=88.7;



        Car c1=new Car();
        c1.name="maruti";
        c1.price=4000000;
        System.out.println(c1.price);
    }
}
