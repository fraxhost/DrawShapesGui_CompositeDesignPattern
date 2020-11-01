package composite;

public class ShapeTriangle extends Composite {
    int x, y, base, height;

    public ShapeTriangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    void addShapes() {
        shapeList.add(new ShapeLine(x, y, x, x+height));
        shapeList.add(new ShapeLine(x, y, x+base, height));
        shapeList.add(new ShapeLine(x, y+height, x+base, height));
    }
}
