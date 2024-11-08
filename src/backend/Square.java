package backend;

import java.awt.Graphics;
import java.util.Iterator;
import java.util.Map;

public class Square extends AbstractShape implements Shape {

    private static int counter = 0;
    private String shapeName;

    public Square() {
        super();
        counter++;
        this.shapeName = "square" + String.format("%02d", counter);
        this.properties.put("Side", 0.0);
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
        canvas.setColor(this.fillColor);
        canvas.fillRect((int) position.getX(), (int) position.getY(), (int) properties.get("Side").doubleValue(), (int) properties.get("Side").doubleValue());
        canvas.setColor(this.color);
        canvas.drawRect((int) position.getX(), (int) position.getY(), (int) properties.get("Side").doubleValue(), (int) properties.get("Side").doubleValue());
    }

}
