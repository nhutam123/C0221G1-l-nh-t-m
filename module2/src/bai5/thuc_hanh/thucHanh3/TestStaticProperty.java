package bai5.thuc_hanh.thucHanh3;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1=new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2=new Car("mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
