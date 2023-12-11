package Array;

public class SumArray {

    public static int sum(int[] s){
        int sum=0;
        for (int i = 0; i < s.length; i++){
            sum+=s[i];
        }
        return sum;
    }
    public static int averege(int[] s){
        int sum=0;
        int i;
        for ( i = 0; i < s.length; i++){
            sum+=s[i];
        }
        return sum/i;
    }
    public static boolean contains(int e,int[] a){
        for ( int n : a){
            if (e==n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array= {2,4,6};
        int k=sum(array);
        int a=averege(array);
        boolean z=contains(4,array);

        System.out.println(k);
        System.out.println(a);
        System.out.println(z);

    }
}
