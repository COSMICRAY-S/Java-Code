public class StringBufferVsStringBuilderTest {
    public static void main(String[] args) {
        int iterations = 100000;

        // Test with StringBuffer (thread-safe)
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ns");
        long k = (endTime - startTime);

        // Test with StringBuilder (non-thread-safe)
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ns");
        long l = (endTime - startTime);
        System.out.println(k/l);
    }
}
