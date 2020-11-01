package composite;

public class ShapeRectangle extends Composite{

    int x, y, height, width;

    public ShapeRectangle(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    void addShapes() {
        shapeList.add(new ShapeLine(x,y, x+width, y));
        shapeList.add(new ShapeLine(x,y, x, y+height));
        shapeList.add(new ShapeLine(x+width,y, x+width, y+height));
        shapeList.add(new ShapeLine(x,y+height, x+width, y+height));
    }
}
