package _13_OOPS;

public class _184_Baalak {
    String name;
    int rollNo;
    double percentage;

    final String schoolname="IIc";    // ye ab kabhi chage nhi ho sakta sab object ka same rahega

   private static int numberOfStudent;    // ye dibba object ke liye nhi banea ye class ka allag se hai  i.e. it is class dependent property not object dependent

    public _184_Baalak(){  //default constructruter

    }

    public _184_Baalak(String name,int rollNo,double percentage){
        this.name=name;
        this.rollNo=rollNo;
        this.percentage=percentage;

        numberOfStudent++;  //for question no 185
    }

    public static int getnumberOfStudent(){
        return numberOfStudent;
    }   ///Q no 185



}
