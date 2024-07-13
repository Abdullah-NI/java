package _13_OOPS;

public class _186_b_addingtwoFraction {
    public static Fration mul(Fration f1,Fration f2){
        int  numirater=f1.num*f2.num;
        int denominator=f1.den*f2.den;
        Fration f4=new Fration(numirater,denominator);
        return f4;
    }
    public static Fration add(Fration f1,Fration f2){
       int  numirater=f1.num*f2.den+f2.num*f1.den;
       int denominator=f1.den*f2.den;
       Fration f3=new Fration(numirater,denominator);
       return f3;
    }
    public static int gcd(int a,int b){
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return min;
    }
    public static class Fration {
        int num;
        int den;

        public Fration(int num,int den){
            this.num=num;
            this.den=den;
            simplify();
        }

        public void simplify(){
            int hcf=gcd(num,den);
            num/=hcf;
            den/=hcf;
        }
    }
    public static void main(String[] args) {
        Fration f1=new Fration(35,21);
        System.out.println(f1.num+"/"+f1.den);
        Fration f2=new Fration(7,3);
        System.out.println(f2.num+"/"+f2.den);

        Fration f3= add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);

        Fration f4=mul(f1,f2);
        System.out.println(f4.num+"/"+f4.den);


    }
}
