package edu.cmu.cs.cs214.lab02.shapes;

/*
 * Анхны асуудлууд:
 *   - sideLen public → гаднаас хүссэнээр нь өөрчилж болдог байсан.
 *   - getArea() байсан ч draw(), getName() байхгүй → Renderer хэрэгжилт рүү ханддаг.
 * Яагаад зассан:
 *   - Square ч өөрийн мэдээллийг нууцлах ёстой.
 *   - Renderer зөв abstraction (Shape interface) ашиглах боломжтой болно.
 */
public class Square implements Shape {
    private final double sideLen; // PRIVATE болгосон

    public Square(double sideLen) {
        if(sideLen < 0)
            throw new IllegalArgumentException("Side length must be >= 0"); // Validation
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() {
        return sideLen * sideLen;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getName() + ", area = " + getArea());
    }
}
