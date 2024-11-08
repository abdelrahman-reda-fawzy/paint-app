package backend;

import java.awt.Graphics;

public class Circle extends AbstractShape implements Shape {

    private static int counter = 0;
    private String shapeName;

    public Circle() {
        super();
        counter++;
        this.shapeName = "circle" + String.format("%02d", counter);
        this.properties.put("Radius", 0.0);
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
        canvas.fillOval((int) position.getX(), (int) position.getY(), (properties.get("Radius")).intValue() * 2, (properties.get("Radius")).intValue() * 2);
        canvas.setColor(this.color);
        canvas.drawOval((int) position.getX(), (int) position.getY(), (properties.get("Radius")).intValue() * 2, (properties.get("Radius")).intValue() * 2);
    }

    void setShapeName(String string) {
        this.shapeName = string;
    }

}
