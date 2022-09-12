public class soal4 {
    public static void main(String[] args) {
        int bilangan = 6;
        int s = 0;
        int[] Array;
        Array=new int[s];

        for(int i = 6; i<=bilangan; i--){
            if(bilangan%i == 0){
                System.out.println(i);
            }
        }
        for(int i=0;i<s;i++) {
            System.out.print(" "+ Array[i]);
        }

    }
}
