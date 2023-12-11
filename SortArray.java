package Array;

public class SortArray {

    public  void sort(int [] s){
        int temp = 0;
        for (int i=0;i<s.length-1;i++){
            for (int j=0;j<s.length-1;j++)
                if (s[j]>s[j+1]){
                     temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;

            }
        }

    }
    public  void sort(String [] s){
        String temp ;
        for (int i=0;i<s.length-1;i++){
            for (int j=0;j<s.length-1;j++)
                //Sortiert durch die AlphabetReinfolge
                // if (s[j].compareTo(s[j + 1]) > 0){
                if (s[j].length() > s[j + 1].length())//Sortiert durch die Länge des Wortes
                {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;

                }
        }

    }

    public static void main(String[] args) {
        int [] array={2,3,1,3,5,9,7,4,1,2,0,9,4};
        String [] St={"Khashman","Asaad","Samer","Mohammad","Ahmmad","aa"};
        SortArray s=new SortArray();
        s.sort(array);
        s.sort(St);
        System.out.print("{ ");
        for (int i=0;i<St.length;i++){
            System.out.print(St[i]+" ");
        }
        System.out.print("}");
    }
}
