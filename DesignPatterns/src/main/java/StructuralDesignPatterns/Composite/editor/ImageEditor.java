package StructuralDesignPatterns.Composite.editor;


import StructuralDesignPatterns.Composite.shapes.CompoundShape;
import StructuralDesignPatterns.Composite.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * The type Image editor.
 */
public class ImageEditor {
    /**
     * The Canvas.
     */
    private EditorCanvas canvas;
    /**
     * The All shapes.
     */
    private CompoundShape allShapes = new CompoundShape();

    /**
     * Instantiates a new Image editor.
     */
    public ImageEditor() {
        canvas = new EditorCanvas();
    }

    /**
     * Load shapes.
     *
     * @param shapes the shapes
     */
    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    /**
     * The type Editor canvas.
     */
    private class EditorCanvas extends Canvas {
        /**
         * The Frame.
         */
        JFrame frame;

        /**
         * The constant PADDING.
         */
        private static final int PADDING = 10;

        /**
         * Instantiates a new Editor canvas.
         */
        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        /**
         * Create frame.
         */
        void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        /**
         * Gets width.
         *
         * @return the width
         */
        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        /**
         * Gets height.
         *
         * @return the height
         */
        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        /**
         * Refresh.
         */
        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        /**
         * Paint.
         *
         * @param graphics the graphics
         */
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }
}
