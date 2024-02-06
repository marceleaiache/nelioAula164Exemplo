package entities;

import entities.enums.Color;

public class Circle extends Shape{

    //INSTANCIAÇÃO DO ARGUMENTO
    Double radius;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Circle() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTO

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    //MÉTODOS GETTERS AND SETTERS

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    //SOBREPONDO O MÉTODO AREA()
    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

}
