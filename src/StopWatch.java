public class StopWatch {
        private double startTime;
        private double endTime;
        public double getStartTime(){
            return this.startTime;
        }
        public double getEndTime(){
            return this.endTime;
        }
        public double startTime(){
            return startTime= System.currentTimeMillis();
        }
        public double start(){
            return startTime=System.currentTimeMillis();
        }
        public double stop(){
            return endTime= System.currentTimeMillis();
        }
        public double getElapseTime(double startTime, double endTime){
            this.startTime=startTime;
            this.endTime= endTime;
            return (this.endTime-this.startTime);
        }

}
