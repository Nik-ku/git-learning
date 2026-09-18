public class Stopwatch {
    private Stopwatch stopwatch;
    private boolean isRunning;

    public Stopwatch() {
        stopwatch = new Stopwatch();
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            stopwatch.start();
            isRunning = true;
        }

    }

    public void stop() {
        stopwatch.stop();
        isRunning = false;
    }

    public void reset() {
        stopwatch.reset();
        isRunning = false;
    }
}
