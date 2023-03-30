import static java.lang.Math.sqrt;

public class Triangle extends Figure implements Shape{
    private String name = "Triangle";

    public float sideA;
    public float sideB;
    public float sideC;
    public float p = (sideA +sideB +sideC)/2;

    public Triangle(float x, float y, float sideA, float sideB, float sideC) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public float getArea() {
        return (float) sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public float getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
