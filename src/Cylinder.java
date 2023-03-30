public class Cylinder implements Shape{
    private String name = "Cylinder";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "name='" + name + '\'' +
                '}';
    }
}
