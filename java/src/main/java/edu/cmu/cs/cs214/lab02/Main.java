package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

/*
 * Анхны асуудал:
 *  - Renderer зөвхөн Rectangle авч чаддаг байсан.
 *  - Main зөвхөн Rectangle туршиж байсан → муу өргөтдөх чадвар.
 * Яагаад зассан:
 *  - Шинэ дизайн ашигласнаар ямар ч Shape төрлийн объект дамжуулж ажиллаж чадна.
 */
public class Main {
    public static void main(String[] args) {
        Renderer renderer = new Renderer();

        // Энд polymorphism бүрэн ажиллана
        renderer.addShape(new Rectangle(2, 3));
        renderer.addShape(new Circle(5));
        renderer.addShape(new Square(4));

        renderer.draw(); // Бүх дүрс өөрсдөө draw() хийнэ
    }
}