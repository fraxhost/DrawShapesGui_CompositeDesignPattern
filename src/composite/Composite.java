package composite;

import javafx.scene.Group;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements IShape{

    Group group;
    List<IShape> shapeList = new ArrayList<>();
    abstract void addShapes();

    public Group draw() {
        group = new Group();
        addShapes();
        for (IShape shapes: shapeList) {
            group.getChildren().add( (Node) shapes.draw() );
        }
        return group;
    }
}
