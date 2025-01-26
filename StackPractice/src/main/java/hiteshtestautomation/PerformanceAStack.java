package hiteshtestautomation;

public class PerformanceAStack {
    private long startTime;
    private long endTime;
    private long timeElapsedSeconds;
    private long timeElapsedMilliSeconds;

    AStack aStack = new AStack(1000000);

    public void enqueuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            aStack.enqueue(i);
        }
        endTime = System.currentTimeMillis();
        timeElapsedSeconds = getTimeElapsedSeconds(startTime, endTime);
        timeElapsedMilliSeconds = getTimeElapsedMilliSeconds(startTime, endTime);
        System.out.println("Time taken for AStack enqueue operation: " + timeElapsedSeconds);
        System.out.println("MilliSeconds taken for AStack enqueue operation: " + timeElapsedMilliSeconds);
    }

    public void dequeuePerformance() {
        startTime = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            aStack.dequeue();
        }
        endTime = System.currentTimeMillis();
        timeElapsedSeconds = getTimeElapsedSeconds(startTime, endTime);
        timeElapsedMilliSeconds = getTimeElapsedMilliSeconds(startTime, endTime);
        System.out.println("Seconds taken for AStack dequeue operation: " + timeElapsedSeconds);
        System.out.println("MilliSeconds taken for AStack dequeue operation: " + timeElapsedMilliSeconds);
    }

    private long getTimeElapsedSeconds(long startTime, long endTime) {
        return (endTime - startTime)/1000;
    }

    private long getTimeElapsedMilliSeconds(long startTime, long endTime) {
        return (endTime - startTime);
    }
}
