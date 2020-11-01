package composite;

import javafx.scene.shape.Line;

public class ShapeLine implements IShape{
    int x1, x2, y1, y2;

    public ShapeLine(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public Line draw() {

        Line line = new Line();
        line.setStartX(x1);
        line.setStartY(y1);
        line.setEndX(x2);
        line.setEndY(y2);

        return line;
    }
}
