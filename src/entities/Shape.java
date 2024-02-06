package entities;

import entities.enums.Color;

public abstract class Shape {

    //INSTANCIAÇÃO DO ARGUMENTO
    private Color color;

    //MÉTODO CONSTRUTOR SEM ARGUMENTO
    public Shape(){
    }

    //MÉTODO CONSTRUTOR COM ARGUMENTO
    public Shape(Color color) {
        this.color = color;
    }

    //MÉTODOS GETTER AND SETTER
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //MÉTODO FUNÇÃO
    public abstract double area();
}
