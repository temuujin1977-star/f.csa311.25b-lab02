package edu.cmu.cs.cs214.lab02.shapes;

/*
 * Анхны асуудлууд:
 *   - height, width public байсан → encapsulation алдагдсан.
 *   - Хэмжээсүүдэд шалгалт байхгүй → геометр утга эвдрэх боломжтой.
 *   - draw() болон getName() байхгүй → Renderer instanceof ашиглахад хүргэнэ.
 * Засварын зорилго:
 *   - Хэрэгжилтийн мэдээллийг нуух.
 *   - Shape интерфэйсийг зөв дэмжиж polymorphism-ийг идэвхжүүлэх.
 */
public class Rectangle implements Shape {
    private final double height; // PRIVATE болгосон
    private final double width;  // PRIVATE болгосон

    public Rectangle(double height, double width){
        if(height < 0 || width < 0)
            throw new IllegalArgumentException("Dimensions must be >= 0"); // Validation
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getName() + ", area = " + getArea());
    }
}