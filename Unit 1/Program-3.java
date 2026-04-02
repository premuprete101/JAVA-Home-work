import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        Rent = GetRent();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car"))
            return 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            return 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            return 2500;
        else
            return 0;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CARRENTAL c = new CARRENTAL();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type (Small Car/Van/SUV): ");
        String type = sc.nextLine();

        c.GetCar(id, type);
        c.ShowCar();
    }
}