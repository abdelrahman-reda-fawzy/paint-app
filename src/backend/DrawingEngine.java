package backend;

import java.awt.Graphics;

public interface DrawingEngine {

    public void addShape(Shape shape);

    public void removeShape(Shape shape);

    public Shape[] getShapes();

    public void refresh(Graphics canvas);
}
