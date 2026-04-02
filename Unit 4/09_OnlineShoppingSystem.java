// 19. Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for payment and order processing.
// Output: 'Processing payment...' and 'Order confirmed


class OnlineShoppingSystem {

    static class Payment extends Thread {
        public void run() {
            System.out.println("Processing payment...");
        }
    }

    static class Order extends Thread {
        public void run() {
            System.out.println("Order confirmed");
        }
    }

    public static void main(String[] args) {

        Payment p = new Payment();
        Order o = new Order();

        p.start();
        o.start();
    }
}