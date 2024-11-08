package backend;

import java.awt.Color;

public interface Shape {

    public void setPosition(java.awt.Point position);

    public java.awt.Point getPosition();

    public void setProperties(java.util.Map<String, Double> properties);

    public java.util.Map<String, Double> getProperties();

    public void setColor(java.awt.Color color);

    public Color getColor();

    public void setFillColor(java.awt.Color color);

    public Color getFillColor();

    public void draw(java.awt.Graphics canvas);

    public String getShapeName();
}
