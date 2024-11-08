package backend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Engine extends JPanel implements DrawingEngine {

    private ArrayList<Shape> shapes;

    public Engine() {
        shapes = new ArrayList<>();
        this.setBackground(Color.WHITE);

        setVisible(true);
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        this.repaint();
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);

        this.repaint();
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[shapes.size()]);
    }

    @Override
    public void refresh(Graphics canvas) {
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for (Shape shape : shapes) {
            shape.draw(g2d);
        }
    }

}
