package edu.cmu.cs.cs214.lab02;

import java.util.ArrayList;
import java.util.List;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/*
 * Анхны кодын гол асуудал:
 *   - Renderer зөвхөн Rectangle-г хүлээн авдаг → маш муу design (tight coupling).
 *   - Бусад бүх Shape хэрэгжиж чадахгүй → Polymorphism алдагдсан.
 *   - Renderer хэрэгжилтийн деталь рүү хэт хамааралтай.
 * Засвар:
 *   - Renderer зөвхөн Shape interface-тэй харилцана.
 *   - instanceof устаж, draw() polymorphism ашиглана.
 *   - Шинэ Shape төрлүүд нэмэгдэхэд Renderer өөрчлөгдөхгүй → Open/Closed principle.
 */
public class Renderer {
    private final List<Shape> shapes = new ArrayList<>();

    // Rectangle байсан → Shape болгосон (abstraction)
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void draw() {
        /*
         * Анхны кодод:
         *   - renderer.draw() → зөвхөн Rectangle.getArea() дуудах боломжтой
         *   - Шинэ дүрс бүр дээр instanceof бичих шаардлагатай байсан (алдаатай design)
         *
         * Одоо:
         *   - Shape.draw() polymorphic байдлаар ажиллана
         *   - Renderer нь хэрэгжилтүүдийг мэдэхгүй → зөв design
         */
        for (Shape s : shapes) {
            s.draw();  // Polymorphism-оор зөв abstraction дуудна
        }
    }
}