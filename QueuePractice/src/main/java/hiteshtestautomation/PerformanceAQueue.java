package hiteshtestautomation;

public class PerformanceAQueue {
    private long startTime;
    private long endTime;
    private long timeElapsedSeconds;

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
        timeElapsedSeconds = getTimeElapsedSeconds(startTime, endTime);
        System.out.println("Time taken for Aqueue enqueue operation: " + timeElapsedSeconds);
    }

    public void dequeuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            aQueue.dequeue();
        }
        endTime = System.currentTimeMillis();
        timeElapsedSeconds = getTimeElapsedSeconds(startTime, endTime);
        System.out.println("Time taken for Aqueue dequeue operation: " + timeElapsedSeconds);
    }

    private long getTimeElapsedSeconds(long startTime, long endTime) {
        return (endTime - startTime)/1000;
    }
}
