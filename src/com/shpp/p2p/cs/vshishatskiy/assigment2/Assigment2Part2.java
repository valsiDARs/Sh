package com.shpp.p2p.cs.vshishatskiy.assigment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part2 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 700;

    private static double RADIUS = 100;
    private static double DIAMETER = RADIUS * 2;

    private static Color COLOR_OVAL = Color.BLACK;
    private static Color COLOR_RECTANGLE = Color.WHITE;



    @Override
    public void run() {
        add(creatingOval(0,0));
        add(creatingOval(getWidth() - DIAMETER,0));
        add(creatingOval(0,getHeight() - DIAMETER));
        add(creatingOval(getWidth() - DIAMETER,getHeight() - DIAMETER));

        add(creatingRectangle());
    }

    private GOval creatingOval( double positionX, double positionY){
        GOval gOval = new GOval(positionX,positionY, DIAMETER,DIAMETER);
        gOval.setColor(COLOR_OVAL);
        gOval.setFillColor(COLOR_OVAL);
        gOval.setFilled(true);
        return  gOval;
    }
    private GRect creatingRectangle(){
        GRect gRect = new GRect(RADIUS,RADIUS,getWidth()-DIAMETER,getHeight()-DIAMETER);
        gRect.setColor(COLOR_RECTANGLE);
        gRect.setFillColor(COLOR_RECTANGLE);
        gRect.setFilled(true);
        return gRect;
    }
}
