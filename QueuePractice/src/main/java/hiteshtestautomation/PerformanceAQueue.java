package hiteshtestautomation;

public class PerformanceAQueue {
    private long startTime;
    private long endTime;

    AQueue aQueue = new AQueue(1000000);

//    public long getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//    }

    public void enqueuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            aQueue.enqueue(i);
        }
        endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time taken for Aqueue enqueue opertion: " + timeElapsed);
    }

    public void dequeuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            aQueue.dequeue();
        }
        endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time taken for Aqueue dequeue opertion: " + timeElapsed);
    }
}
