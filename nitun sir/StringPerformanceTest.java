public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 100000;
        
        // Testing String concatenation (inefficient)
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken with String: " + (endTime - startTime) + " ns");
        long k = (endTime - startTime);

        // Testing StringBuffer concatenation (efficient)
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ns");

        long l = (endTime - startTime);
        System.out.println(k/l);
    }
}
