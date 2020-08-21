class Foo {
    Semaphore r1, r2, r3;

    public Foo() {
        r1 = new Semaphore(1);
        r2 = new Semaphore(0);
        r3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        r1.acquire();
        printFirst.run();
        r2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        r2.acquire();
        printSecond.run();
        r3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        r3.acquire();
        printThird.run();
    }
    
}