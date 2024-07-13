package _13_OOPS;

public class _186_a_Fractions {
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

        }

        public void simplify(){
            int hcf=gcd(num,den);
            num/=hcf;
            den/=hcf;
        }
    }
    public static void main(String[] args) {
        Fration f1=new Fration(33,11);
        System.out.println(f1.num+"/"+f1.den);


        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
    }
}
