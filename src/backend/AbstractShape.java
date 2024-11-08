package backend;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractShape implements Shape {

    public Point position;
    public Map<String, Double> properties;
    public Color color;
    public Color fillColor;

    public AbstractShape() {
        this.position = new Point();
        this.properties = new HashMap<>();
        this.color = new Color(Color.BLACK.getRGB());
        this.fillColor = new Color(Color.BLACK.getRGB());
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;

    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

}
