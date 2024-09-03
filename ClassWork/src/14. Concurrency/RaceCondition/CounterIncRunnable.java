
class CounterIncRunnable implements Runnable {
    private MyCounter counter;

    public CounterIncRunnable(MyCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for ( int i=0; i<1000000; i++ ) {
            counter.increment();
        }
    }
}

