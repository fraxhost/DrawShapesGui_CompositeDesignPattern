package composite;

public class ShapeFlag extends Composite{
    int x,y, height, width;

    public ShapeFlag(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    void addShapes() {
        shapeList.add(new ShapeRectangle(x, y, height, width));
        shapeList.add(new ShapeCircle(x+(width/2), y+(height/2), height/3));
    }
}
