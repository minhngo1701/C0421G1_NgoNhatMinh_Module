package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    }

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public void time() {
        System.out.println(System.currentTimeMillis());
    }
    public long start(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    public long getElapsedTime() {
        long elapseTime = this.endTime - this.startTime;
        return elapseTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start " + stopWatch.start());
        for (int i =0; i < 100000; i++) {
            System.out.println(i);
        }
        System.out.println("End "+ stopWatch.stop());
        System.out.println("Count" + stopWatch.getElapsedTime());
    }
}
