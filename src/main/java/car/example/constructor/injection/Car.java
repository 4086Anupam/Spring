package car.example.constructor.injection;

public class Car {

    private Specification specification;

    // <!-- Constructor Injection -->
//    Car(Specification specification) {
//        this.specification = specification;
//    }

//    Setter Injection
    public void setSpecification(Specification specification) {
        this.specification = specification;

    }


    public void displayDetails() {
        System.out.println("Car Details:" +specification.toString());
    }
}
