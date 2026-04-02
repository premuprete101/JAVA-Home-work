// 23. Chat Application
// Create a class ChatApplication. Create threads for sending and receiving messages. Demonstrate thread lifecycle.
// Output: Sending and receiving messages.

class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            System.out.println("Sending message...");
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Message sent");
        }
    }

    static class Receiver extends Thread {
        public void run() {
            System.out.println("Receiving message...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Message received");
        }
    }

    public static void main(String[] args) {

        Sender s = new Sender();
        Receiver r = new Receiver();

        // Thread lifecycle states demonstration
        System.out.println("Sender State: " + s.getState()); // NEW

        s.start();
        r.start();

        System.out.println("Sender State after start: " + s.getState()); // RUNNABLE

        try {
            s.join();
            r.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Sender State after execution: " + s.getState()); // TERMINATED
    }
}