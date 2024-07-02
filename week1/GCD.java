package week1;
public class GCD{
// brute force approch
// approch 1

static void optimal2optimal1(int n,int m){
    int gcd=0;
    for(int i=1;i<Math.min(m, n);i++){
        if(m%i==0&&n%i==0){
  gcd =i;
        }
    }
    System.out.println(gcd);

}

// euclidian algo 

static void optimal2(int n,int m){

    while(n>0&&m>0){
        if(n>m){
            n=n%m;
        }else{
            m=m%n;
        }
    }

    if(m==0){
    System.out.println(n);
    return;
    }
    System.out.println(m);
}

public static void main(String[] args) {
    optimal2(9, 12);
}
}