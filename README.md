# Paint Vector Drawing Application | Java

Java + Swing desktop app for drawing, colorizing, moving, and deleting shapes.

## Features

- Create basic vector shapes (Circle, Rectangle, Square, Line Segment)
- Colorize shapes with fill and border settings
- Move and delete shapes
- Intuitive interface designed with Java Swing

## How It Works

Users can:

- Draw shapes on a canvas
- Select shapes to change their color (fill and border)
- Move shapes around the canvas
- Delete unwanted shapes

## Getting Started

1. **Requirements:**

   - Java 8 or higher
   - Any Java IDE (IntelliJ IDEA recommended)

2. **Run the Application:**
   - Open the project in your IDE
   - Run `Main.java` in the `src` directory

## Project Structure

```
src/
  backend/
    AbstractShape.java
    Circle.java
    DrawingEngine.java
    Engine.java
    LineSegment.java
    Rectangle.java
    Shape.java
    Square.java
  frontend/
    CircleWindow.form
    CircleWindow.java
    LineSegmentWindow.form
    LineSegmentWindow.java
    MainWindow.form
    MainWindow.java
    RectangleWindow.form
    RectangleWindow.java
    SquareWindow.form
    SquareWindow.java
Main.java
```

## License

This project is licensed under the MIT License. See `LICENSE` for details.
