package hiteshtestautomation;

public class Main {
    public static void main(String []args) {
        AStack aStack = new AStack(5);

        PerformanceAStack performanceAStack = new PerformanceAStack();
        /*
        Performance result:
        Time taken for AStack enqueue operation: 0
        MilliSeconds taken for AStack enqueue operation: 3
        Seconds taken for AStack dequeue operation: 0
        MilliSeconds taken for AStack dequeue operation: 3
         */
        performanceAStack.enqueuePerformance();
        performanceAStack.dequeuePerformance();
    }
}