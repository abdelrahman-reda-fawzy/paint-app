package frontend;

import backend.Shape;
import backend.Circle;
import backend.Engine;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Position;

public class MainWindow extends javax.swing.JPanel {

    private Engine engine;

    public MainWindow() {
        JFrame frame = new JFrame("Vector Drawing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(880, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setLayout(null);

        initComponents();

        engine = new Engine();

        engine.setBounds(280, 90, 550, 350);
        frame.add(engine);

        this.setBounds(0, 0, 880, 500);
        frame.add(this);

        frame.setVisible(true);
    }

    public void addShapeToComboBox(Shape shape) {
        chooseShapeComboBox.addItem(shape.getShapeName());
    }

    public Shape findShapeByName(String name) {
        for (Shape shape : engine.getShapes()) {
            if (shape.getShapeName().equals(name)) {
                return shape;
            }
        }
        return null;
    }

    private void openColorChooserDialog() {

        JDialog colorDialog = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Choose Colors", true);

        JPanel panel = new JPanel(new BorderLayout());

        JColorChooser fillColorChooser = new JColorChooser();
        JColorChooser outlineColorChooser = new JColorChooser();

        JPanel checkBoxPanel = new JPanel();

        JButton confirmButton = new JButton("Apply Colors");
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Color fillColor = fillColorChooser.getColor();
                Color outlineColor = outlineColorChooser.getColor();

                String selectedShapeName = (String) chooseShapeComboBox.getSelectedItem();
                if (selectedShapeName != null) {
                    Shape shape = findShapeByName(selectedShapeName);
                    if (shape != null) {

                        shape.setFillColor(fillColor);

                        shape.setColor(outlineColor);

                        engine.repaint();
                    }
                }
                colorDialog.dispose();
            }
        });

        panel.add(fillColorChooser, BorderLayout.NORTH);
        panel.add(outlineColorChooser, BorderLayout.CENTER);
        panel.add(checkBoxPanel, BorderLayout.SOUTH);
        panel.add(confirmButton, BorderLayout.PAGE_END);

        colorDialog.add(panel);
        colorDialog.setSize(600, 800);
        colorDialog.setLocationRelativeTo(this);
        colorDialog.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        circleButton = new javax.swing.JButton();
        lineSegmentButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectangleButton = new javax.swing.JButton();
        selectShapeLabel = new javax.swing.JLabel();
        chooseShapeComboBox = new javax.swing.JComboBox<>();
        colorizeButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        circleButton.setText("Circle");
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        lineSegmentButton.setText("Line Segment");
        lineSegmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineSegmentButtonActionPerformed(evt);
            }
        });

        squareButton.setText("Square");
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        rectangleButton.setText("Rectangle");
        rectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleButtonActionPerformed(evt);
            }
        });

        selectShapeLabel.setBackground(new java.awt.Color(0, 0, 0));
        selectShapeLabel.setText("Select Shape");

        chooseShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        chooseShapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseShapeComboBoxActionPerformed(evt);
            }
        });

        colorizeButton.setText("Colorize");
        colorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(chooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(colorizeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(selectShapeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(circleButton)
                .addGap(35, 35, 35)
                .addComponent(lineSegmentButton)
                .addGap(35, 35, 35)
                .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {colorizeButton, deleteButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {circleButton, lineSegmentButton, rectangleButton, squareButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circleButton)
                    .addComponent(lineSegmentButton)
                    .addComponent(squareButton)
                    .addComponent(rectangleButton))
                .addGap(125, 125, 125)
                .addComponent(selectShapeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorizeButton)
                    .addComponent(deleteButton))
                .addGap(177, 177, 177))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseShapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseShapeComboBoxActionPerformed

    }//GEN-LAST:event_chooseShapeComboBoxActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        CircleWindow circleWindow = new CircleWindow(engine, this);
        circleWindow.setVisible(true);
    }//GEN-LAST:event_circleButtonActionPerformed

    private void lineSegmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineSegmentButtonActionPerformed
        LineSegmentWindow lineSegmentWindow = new LineSegmentWindow(engine, this);
        lineSegmentWindow.setVisible(true);

    }//GEN-LAST:event_lineSegmentButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        SquareWindow squareWindow = new SquareWindow(engine, this);
        squareWindow.setVisible(true);

    }//GEN-LAST:event_squareButtonActionPerformed

    private void rectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleButtonActionPerformed
        RectangleWindow rectangleWindow = new RectangleWindow(engine, this);
        rectangleWindow.setVisible(true);

    }//GEN-LAST:event_rectangleButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String selectedShapeName = (String) chooseShapeComboBox.getSelectedItem();
        if (selectedShapeName == "Choose Shape") {
            JOptionPane.showMessageDialog(null, "Select a Shape", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String selectedItem = (String) chooseShapeComboBox.getSelectedItem();
            if (selectedItem != null) {

                Shape shapeToDelete = findShapeByName(selectedItem);
                if (shapeToDelete != null) {
                    engine.removeShape(shapeToDelete);
                    chooseShapeComboBox.removeItem(selectedItem);
                    engine.repaint();
                }
            }
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void colorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeButtonActionPerformed
        String selectedShapeName = (String) chooseShapeComboBox.getSelectedItem();
        if (selectedShapeName == "Choose Shape") {
            JOptionPane.showMessageDialog(null, "Select a Shape", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            openColorChooserDialog();
        }

    }//GEN-LAST:event_colorizeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseShapeComboBox;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton colorizeButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton lineSegmentButton;
    private javax.swing.JButton rectangleButton;
    private javax.swing.JLabel selectShapeLabel;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
