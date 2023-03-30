public class StartShape {
    public static void main(String[] args) {
        statrProgram();
    }

    public static void statrProgram(){
        Shape[] shapes = createShapes();
        printShapes(shapes, new ShapePrintConsole());
    }

    public static Shape[] createShapes() {
        Triangle t1  = new Triangle(2,5,10,12,15);
        Rectangle r1 = new Rectangle(1, 2, 15, 20);
        Circle c1 =  new Circle(5,7,8);
        Quad q1 = new Quad(8,9,45);
        Cylinder cy1 = new Cylinder();
        Shape[] sa = {t1 ,r1 ,c1 ,q1,cy1};
        return sa;
    }

    public static void printShapes(Shape[] sa, ShapePrint shapePrint){
        new ShapePrinterArray().printShapesUsingShapePrint(sa,shapePrint);
    }

}
