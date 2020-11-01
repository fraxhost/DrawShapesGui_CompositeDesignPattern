package composite;

public class ShapeStar extends Composite{
    int x, y, base, height;

    public ShapeStar(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    void addShapes() {
        shapeList.add(new ShapeLine(x, y, x+base/2, y+height));
        shapeList.add(new ShapeLine(x, y, x+base, y));
        shapeList.add(new ShapeLine(x+base/2, y+height, x+base, y));

        shapeList.add(new ShapeLine(x+base/2, y-height/2, x+base, y+height/2));
        shapeList.add(new ShapeLine(x+base/2, y-height/2, x, y+height/2));
        shapeList.add(new ShapeLine(x, y+height/2, x+base, y+height/2));
    }

}
