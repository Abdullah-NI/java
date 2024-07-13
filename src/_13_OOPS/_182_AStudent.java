package _13_OOPS;

public class _182_AStudent {
    public String name;        // ise public karege yadi ham ise diffrent pakage me use karna chahege
   private int rollNo;               // yadi private hai to only ise class me use kar sakte hai  if kuch nhi hai to default hai ise same package me install kar sakte hai
    double percentage;

    // here we can acess roolno in another class by creating these mrthod
    public int getRollNo(){ //getter
        return rollNo;
    }

    public void setRollNo(int roll){   //setter
        rollNo=roll;
    }

//    public void setRollNo(int rollNo){   //setter
//        this.rollNo=rollNo;     // this means is class ka aatribute ,yadi ham this na lagaye to dono same ho rahe hai
//    }

}
