package backend;

import java.awt.Graphics;

public class LineSegment extends AbstractShape implements Shape {

    private static int counter = 0;
    private String shapeName;

    public LineSegment() {
        super();
        counter++;
        this.shapeName = "linesegment" + String.format("%02d", counter);
        this.properties.put("x2", 0.0);
        this.properties.put("y2", 0.0);
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return shapeName;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.color);
        canvas.drawLine((int) position.getX(), (int) position.getY(), (int) (properties.get("x2").doubleValue()), (int) (properties.get("y2").doubleValue()));
    }

}
