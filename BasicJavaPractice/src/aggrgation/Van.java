package aggrgation;

public class Van extends Vehicle {
     Speed speed;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public void print() {
        System.out.println("Vin: " +this.getVin() + ", Max Speed: " + speed.getMax() + "\n" );
    }
}