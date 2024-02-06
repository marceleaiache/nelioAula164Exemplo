package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //INSTANCIANDO UMA LISTA DO OBJETO SHAPE
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=numberOfShapes; i++){
            System.out.printf("Shape #%d data:%n", i);
            System.out.println("Rectangle or Circle (r/c)? ");
            char typeOfShape = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf((sc.next()));
            sc.nextLine();

            if (typeOfShape == 'c'  || typeOfShape == 'C') {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                list.add(new Circle(color, radius));
            }
            else if (typeOfShape == 'r' || typeOfShape == 'R') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                sc.nextLine();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                list.add(new Rectangle(color, width, height));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shapes : list) {
            System.out.printf(String.format("%.2f%n", shapes.area()));
        }
        sc.close();
    }
}
