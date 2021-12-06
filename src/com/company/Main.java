package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Circle circle = new Circle("Circle",4);
Triangle triangle = new Triangle("Tringle",3,4,5);
Square square = new Square("Square",5);
Rectangle rectangle = new Rectangle("Rectangle",3,4);
Cat cat = new Cat("Gora");
cat.draw();
        Figure[]figures = {circle,square,triangle,rectangle};
        for (int i = 0; i < figures.length; i++) {

            System.out.println("Периметр : "+ figures[i].getName() +" "+ figures[i].calculatePerimeter());
        }
    }
}
