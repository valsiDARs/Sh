package com.shpp.p2p.cs.vshishatskiy.assigment2;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part3 extends WindowProgram {

    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    /* Each toe is an oval with this width and height. */
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    /* The heel is an oval with this width and height. */
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    private void drawPawprint(double x, double y) {
        add(creatingOval(FIRST_TOE_OFFSET_X + x, FIRST_TOE_OFFSET_Y + y, TOE_WIDTH,TOE_HEIGHT));
        add(creatingOval(SECOND_TOE_OFFSET_X + x, SECOND_TOE_OFFSET_Y + y, TOE_WIDTH,TOE_HEIGHT));
        add(creatingOval(THIRD_TOE_OFFSET_X + x, THIRD_TOE_OFFSET_Y + y, TOE_WIDTH,TOE_HEIGHT));

        add(creatingOval(HEEL_OFFSET_X + x,HEEL_OFFSET_Y + y, HEEL_WIDTH, HEEL_HEIGHT));
    }

    private GOval creatingOval(double positionX, double positionY, double width, double height) {
        GOval gOval = new GOval(positionX, positionY, width, height);
        gOval.setColor(Color.BLACK);
        gOval.setFillColor(Color.BLACK);
        gOval.setFilled(true);
        return gOval;
    }
}
