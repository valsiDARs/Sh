package com.shpp.p2p.cs.vshishatskiy.assigment2;

import acm.graphics.GOval;
import acm.graphics.GPoint;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assigment2Part6 extends WindowProgram {

    private static final int NUMBER_SEGMENT = 8;
    private static final double OVAL_SIZE = 100;

    private static int OFFSET_X;
    private static int OFFSET_Y;

    private static final double START_POSITION_X = 50;
    private static final double START_POSITION_Y = 50;

    private static final  Color FILL_COLOR = Color.BLUE;
    private static final  Color CIRCUMFERENCE = Color.RED;

    private static GPoint FACE_POSITION;

    @Override
    public void run() {
        for (int i = 0; i < NUMBER_SEGMENT; i++){
            settingOffset(i);
            creatingOval();
        }
        creatingFace();
    }
    private void creatingOval(){
        GOval gOval = new GOval(START_POSITION_X + OFFSET_X,START_POSITION_Y + OFFSET_Y,OVAL_SIZE,OVAL_SIZE);
        gOval.setFillColor(FILL_COLOR);
        gOval.setFilled(true);
        gOval.setColor(CIRCUMFERENCE);
        add(gOval);
        FACE_POSITION = gOval.getLocation();
    }

    private void settingOffset(int count){
        if(count%2 == 0){
            OFFSET_Y = 35;
        }else {
            OFFSET_Y = 0;
        }
        OFFSET_X += 60;
    }

    private void creatingFace(){
        double positionFaceX = FACE_POSITION.getX();
        double positionFaceY = FACE_POSITION.getY();

        double positionMouthX = positionFaceX + OVAL_SIZE/2-10;
        double positionMouthY = positionFaceY + OVAL_SIZE/3 * 2;

        double positionLeftEyeX = FACE_POSITION.getX() + OVAL_SIZE/3;
        double positionRightEyeX = FACE_POSITION.getX() + OVAL_SIZE/3*2;
        double positionEyeY = FACE_POSITION.getY() + OVAL_SIZE/3;


        add(new GOval(positionMouthX, positionMouthY,30,20));
        add(new GOval(positionLeftEyeX, positionEyeY,10,10));
        add(new GOval(positionRightEyeX, positionEyeY,10,10));
    }
}
