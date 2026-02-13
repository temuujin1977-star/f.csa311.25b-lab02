package edu.cmu.cs.cs214.lab02.shapes;

/*
 * Зассан зүйл:
 *  - radius-г public → private болгосон.
 *  - radius-д сөрөг утга өгдөг асуудлыг constructor-т зассан.
 *  - draw() болон getName() функцүүдийг нэмж өгсөн.
 * Яагаад зассан:
 *  - Мэдээлэл нууцлах (encapsulation) зөрчигдөж байсан.
 *  - Хэрэгжилт Renderer-т харагддаг байсан → information hiding алдагдсан.
 *  - Polymorphism ашиглахын тулд interface-ийн аргуудыг хэрэгжүүлэх хэрэгтэй.
 */
public class Circle implements Shape {
    private final double radius; // PUBLIC байснаас PRIVATE болгосон (encapsulation)

    public Circle(double radius) {
        if(radius < 0)
            throw new IllegalArgumentException("Radius must be >= 0"); // Validation нэмсэн
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Interface-ийн заавал дэмжих behavior
    }

    @Override
    public String getName() {
        return "Circle"; // Нэр Renderer-т харагдуулахгүй, эндээ удирдана
    }

    @Override
    public void draw() {
        // Renderer хэрэгжилт рүү хандах шаардлагагүй боллоо
        System.out.println("Drawing " + getName() + ", area = " + getArea());
    }
}