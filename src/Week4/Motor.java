package Week4;

public class Motor {
    public void drive(int speed) throws DriverOverSpeedException {

        try {
            if (speed <= 500) System.out.println("Enjoy your journey");
            else if (speed <= 550) throw new DriverOverSpeedException("You are Over-speeding, be careful!");
            else throw new DriverOverSpeedException("You are extremely Over-speeding, death ahead!!!");
        } catch (DriverOverSpeedException error) {
            System.out.println(error.getMessage());
        }
    }


    public static void main(String[] args) throws DriverOverSpeedException {
        Motor sensibleDriver = new Motor();
        Motor recklessDriver = new Motor();
        recklessDriver.drive(600);
        sensibleDriver.drive(350);
        recklessDriver.drive(540);


    }
}
