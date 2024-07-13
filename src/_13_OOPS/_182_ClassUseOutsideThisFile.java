package _13_OOPS;

public class _182_ClassUseOutsideThisFile {
    //here we use _182_Astudent class which created in the same package
    public static void main(String[] args) {
        _182_AStudent s1= new _182_AStudent();

        s1.name="Raghav";
        //s1.rollNo=67;  here we cannot use this because rollno is private
        System.out.println(s1.getRollNo());   // 0 chuki not initialize

        s1.setRollNo(67);
        System.out.println(s1.getRollNo());


    }
}
