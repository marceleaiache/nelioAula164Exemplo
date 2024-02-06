package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    //INTANCIAÇÃO DOS ARGUMENTOS
    Double width;
    Double height;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Rectangle() {
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //MÉTODOS GETTERS AND SETTERS
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //SOBREESCREVENDO O MÉTODO AREA
    @Override
    public double area() {
        return width * height;
    }
}
