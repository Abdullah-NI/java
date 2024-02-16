package _01_basics;

public class _03_TextAndValuePrint {
    public static void main(String[] args) {
        double r=6.9;
        double a=3.141592*r*r;
        int z=-1;

//        System.out.print("the Area of circle is : ");
//        System.out.print(a);

//        System.out.println("the area of circle is "+a);

        System.out.println("The area of circle with radius "+r+"  is "+64*2);
        System.out.println("The area of circle with radius "+(r+4)+"  is "+a*z);
        System.out.println("The area of circle with radius "+r+"  is "+a/z);
        System.out.println("The area of circle with radius "+r+"  is "+(a-z));
        System.out.println("The area of circle with radius "+r+"  is "+(a+z));
        System.out.println("The area of circle with radius "+r+ "  is "+a+z);

        System.out.println();
        System.out.println("The volume of sphere is with radiu "+r+" is "+4*3.14*r*r*r/3);
        System.out.println("The volume of sphere is with radiu "+r+" is "+4*3.14*r*r*r/3+" hai");
    }
}
