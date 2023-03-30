public class Quad extends Figure implements Shape{
    private String name = "Quad";
    public float side;

    public Quad(float x, float y, float side) {
        super(x, y);
        this.side = side;
    }

    @Override
    float getArea() {
        return side*side;
    }

    @Override
    float getPerimeter() {
        return side*4;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Quad{" +
                "name='" + name + '\'' +
                ", side=" + side +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
