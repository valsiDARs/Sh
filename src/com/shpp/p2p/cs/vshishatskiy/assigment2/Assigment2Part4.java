package com.shpp.p2p.cs.vshishatskiy.assigment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part4 extends WindowProgram {
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    public static final double WIDTH_FLAG = 200;
    public static final double HEIGHT_FLAG = 250;

    public static final Color FIRST_COLOR = Color.BLACK;
    public static final Color SECOND_COLOR = Color.YELLOW;
    public static final Color THIRD_COLOR = Color.RED;


    public static final String TEXT_FONT = Font.MONOSPACED;
    public static final String COUNTRY_NAME = "Belgium";

    @Override
    public void run() {
        add(creatingRectangle(0, FIRST_COLOR));
        add(creatingRectangle(WIDTH_FLAG / 3, SECOND_COLOR));
        add(creatingRectangle(WIDTH_FLAG / 3 * 2, THIRD_COLOR));

        add(creatingText());
    }

    private GRect creatingRectangle(double offsetX, Color color) {
        GRect gRect = new GRect((getWidth() - WIDTH_FLAG) / 2 + offsetX, (getHeight() - HEIGHT_FLAG) / 2, WIDTH_FLAG / 3, HEIGHT_FLAG);
        gRect.setColor(color);
        gRect.setFillColor(color);
        gRect.setFilled(true);
        return gRect;
    }

    private GLabel creatingText() {
        GLabel gLabel = new GLabel("Flag of " + COUNTRY_NAME);
        gLabel.setFont(TEXT_FONT);
        gLabel.setLocation(getWidth() - gLabel.getWidth(), getHeight() - gLabel.getHeight() / 2);
        return gLabel;
    }
}