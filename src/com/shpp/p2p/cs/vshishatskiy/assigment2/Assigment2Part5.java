package com.shpp.p2p.cs.vshishatskiy.assigment2;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part5 extends WindowProgram {

    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    private static final int NUM_ROWS = 10;
    private static final int NUM_COLS = 12;

    private static final double BOX_SIZE = 30;
    private static final double BOX_SPACING = 3;

    private static final double STEP = BOX_SIZE + BOX_SPACING;

    @Override
    public void run() {
        //add(new GRect(51,getHeight()/2,40,40));
        //add(new GRect(301,getHeight()/2,40,40));
        GLine gLine = new GLine(0,getHeight()/2,50,getHeight()/2);
        GLine gLine2 = new GLine(getWidth()/2,0,getWidth()/2,50);
        GLine gLine3 = new GLine(getWidth()/2,getHeight()-50,getWidth()/2,getHeight());
        GLine gLine1 = new GLine(360,getHeight()/2,410,getHeight()/2);
        gLine.setColor(Color.RED);
        gLine1.setColor(Color.RED);
        gLine2.setColor(Color.RED);
        gLine3.setColor(Color.RED);


        for(int j = 0; j < NUM_ROWS; j++) {
            for (int i = 0; i < NUM_COLS; i++) {
                creatingRect(i ,j );
            }
        }

        add(gLine);
        add(gLine1);
        add(gLine2);
        add(gLine3);
    }

    private void creatingRect(int indexX, int indexY){
        GRect gRect = new GRect((getWidth()-(NUM_COLS*STEP-BOX_SPACING))/2+(STEP*indexX), (getHeight()-(NUM_ROWS*STEP-BOX_SPACING))/2+(STEP*indexY),BOX_SIZE,BOX_SIZE);
        gRect.setFillColor(Color.BLACK);
        gRect.setFilled(true);
        add(gRect);

        System.out.printf("Main width: %d, cashe: %f, polofina: %f \n",getWidth(),getWidth()-(NUM_COLS*STEP-10), (getWidth()-(NUM_COLS*STEP-10))/2);
        System.out.printf("Main height: %d, cashe: %f, polofina: %f \n",getHeight(),getHeight()-(NUM_ROWS*STEP-10), (getHeight()-(NUM_ROWS*STEP-10))/2);
    }

}
