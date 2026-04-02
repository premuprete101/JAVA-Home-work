// 21. Producer Consumer System
// Create a class Restaurant. Chef prepares food and waiter serves it using wait() and notify().
// Output: 'Chef prepared food' and 'Waiter served food'


class Restaurant {

    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify(); // notify waiter
    }

    synchronized void serveFood() {
        while (!foodReady) {
            try {
                wait(); // wait until food is ready
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Waiter served food");
    }
}

class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

class RestaurantDemo {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Chef c = new Chef(r);
        Waiter w = new Waiter(r);

        w.start(); // waiter waits
        c.start(); // chef prepares
    }
}