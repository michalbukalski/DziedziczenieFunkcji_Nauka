public class Dog extends Animal {


    private String earShape;
    private String tailShape;


    public Dog(){
        super("Mutt", "Big", 50);
    }

//    public Dog(String type, String size, double weight) {
//        super(type, size, weight);
//    }

    public Dog(String type, double weight) {
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise(){
        // nadpisałem metodę makeNoise

        if (type == "Wolf"){
            System.out.println("Ow Woooooooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog walk, run and wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.print("Woof! ");
    }
    private void run() {
        System.out.print("Dog is running! ");
    }
    private void walk() {
        System.out.print("Dog is walking! ");
    }
    private void wagTail() {
        System.out.print("Tail is Wagging! ");
    }
}
