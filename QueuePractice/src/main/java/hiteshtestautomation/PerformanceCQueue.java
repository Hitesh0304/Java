package hiteshtestautomation;

public class PerformanceCQueue {
    private long startTime;
    private long endTime;

    CircularQueue circularQueue = new CircularQueue(1000000);

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
            circularQueue.enqueue(i);
        }
        endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time taken for Circular queue enqueue operation: " + timeElapsed);
    }

    public void dequeuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            circularQueue.dequeue();
        }
        endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Time taken for Circular queue dequeue operation: " + timeElapsed);
    }
}
