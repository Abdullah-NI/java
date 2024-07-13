package _13_OOPS;

public class _185_StaticKeyword {
    public static void main(String[] args) {
//
//        _184_Baalak.numberOfStudent=100;
//        System.out.println(_184_Baalak.numberOfStudent);  // we use this variale directly from class or without creating object  arthat ham is varible ko object and without object ke use kar sakte hai
//
//        _184_Baalak b1=new _184_Baalak("raghav",76,88.7);
//        System.out.println(b1.numberOfStudent);
//        _184_Baalak b2=new _184_Baalak("rahul",86,67.7);
//        System.out.println(b2.numberOfStudent);
//        _184_Baalak b3=new _184_Baalak("rohan",56,98.7);
//        System.out.println(b3.numberOfStudent);

        //yaha ye  noofstudent variable change bhi ho raha hai(in line 6) to ise privatlly use karte hai



        System.out.println(_184_Baalak.getnumberOfStudent());  // we use this variale directly from class or without creating object  arthat ham is varible ko object and without object ke use kar sakte hai

        _184_Baalak b1=new _184_Baalak("raghav",76,88.7);
        System.out.println(b1.getnumberOfStudent());                             // here we use by object
        _184_Baalak b2=new _184_Baalak("rahul",86,67.7);
        System.out.println(b2.getnumberOfStudent());
        _184_Baalak b3=new _184_Baalak("rohan",56,98.7);
        System.out.println(b3.getnumberOfStudent());

    }
}
