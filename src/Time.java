public class Time {
    public static void main(String[] args) {
        StopWatch watch= new StopWatch();
        double beginTime= watch.start();
        for (int i=0;i<100000;i++){
            System.out.println(i);
        }
        double stopTime= watch.stop();
        System.out.println(watch.getElapseTime(beginTime,stopTime));
    }
}
