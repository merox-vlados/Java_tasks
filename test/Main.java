package test;

import Inheritance.Rectangle;
import Inheritance.Triangle;

public class Main {

    public static void main(String[] args) {

//        WeightBox weightBox = new WeightBox(4,5,6,7);
//        weightBox.showInfo();

        Rectangle rectangle = new Rectangle(10,20);
        Triangle triangle = new Triangle(10,10,10);

        rectangle.showPerimeter();
        triangle.showPerimeter();


    }
}
