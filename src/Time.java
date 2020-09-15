import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        StopWatch watch= new StopWatch();
        Scanner input  = new Scanner(System.in);

        int[] array= new int[10000];
        int min;
        int i,j;
        for(int k=1;k<array.length;k++){
            array[k]=(int) (Math.random()*10000+1);
        }

        double beginTime= watch.start();
        for ( i=0;i<array.length-1;i++){
            min=i;
            for ( j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            swap(array[min],array[i]);
        }
        double stopTime= watch.stop();
        System.out.println(watch.getElapseTime(beginTime,stopTime));
    }
     static void swap(int a, int b){
        int temp;
        temp= a;
        a=b;
        b=temp;
    }
}
