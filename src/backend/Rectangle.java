package backend;

import java.awt.Graphics;

public class Rectangle extends AbstractShape implements Shape {

    private static int counter = 0;
    private String shapeName;

    public Rectangle() {
        super();
        counter++;
        this.shapeName = "rectangle" + String.format("%02d", counter);
        this.properties.put("Height", 0.0);
        this.properties.put("Width", 0.0);
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
        canvas.fillRect((int) position.getX(), (int) position.getY(), (int) properties.get("Width").doubleValue(), (int) properties.get("Height").doubleValue());
        canvas.setColor(this.color);
        canvas.drawRect((int) position.getX(), (int) position.getY(), (int) properties.get("Width").doubleValue(), (int) properties.get("Height").doubleValue());
    }

}
