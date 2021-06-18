package graphicsdemoo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDemo1 extends Panel 
                           implements KeyListener, ActionListener{

    static String userName = "";

    static String showOkDialogOption2;
    
    static String chooseHairOption2;
    static int hairColorRed, hairColorGreen, hairColorBlue;
    
    static String chooseEyesOption2;
    static int eyeColorRed, eyeColorGreen, eyeColorBlue;
    
    static String chooseSkinOption2;
    static int skinColorRed, skinColorGreen, skinColorBlue;     

    @Override
    public void paint(Graphics g) {
        //Head
        int headX[] = {161, 152, 119, 107, 106, 126, 149, 178, 191, 214, 215, 232, 236, 267, 287, 291, 275, 274, 258, 223, 186}; //head X coordinates
        int headY[] = {45, 42, 61, 93, 124, 164, 181, 187, 210, 216, 208, 205, 195, 192, 172, 147, 121, 75, 52, 34, 33}; //head Y coordinates
        g.setColor(Color.black); //set outline color head black
        g.drawPolygon(headX, headY, headX.length); //draw head black
        g.setColor(new Color(skinColorRed, skinColorGreen, skinColorBlue)); //fill color head #F9D7AC
        g.fillPolygon(headX, headY, headX.length); //fill color head #F9D7AC

        //Right Eyes
        g.setColor(Color.black); //set outline color right eye  black
        g.drawOval(231, 94, 44, 47); //draw right eye black
        g.setColor(Color.white); //set fill color right eye  white
        g.fillOval(231, 94, 44, 47); //fill color right eye white

        //Right Eye Ball
        g.setColor(Color.black); //set outline color right eye ball black
        g.drawOval(250, 101, 20, 33); //draw right eye ball black
        g.setColor(new Color(eyeColorRed, eyeColorGreen, eyeColorBlue)); //set fill color right eye ball black
        g.fillOval(250, 101, 20, 33); //fill right eye ball black

        //Left Eyes
        g.setColor(Color.black); //set outline color left eye  black
        g.drawOval(147, 103, 48, 45); //draw left eye black
        g.setColor(Color.white); //set fill color left eye  red
        g.fillOval(147, 103, 48, 45); //fill color left eye white

        //Left Eye Ball
        g.setColor(Color.black); //set outline color left eye ball black
        g.drawOval(167, 110, 20, 33); //draw left eye ball black
        g.setColor(new Color(eyeColorRed, eyeColorGreen, eyeColorBlue)); //set fill color left eye ball black
        g.fillOval(167, 110, 20, 33); //fill left eye ball black        

        //Mouth
        int mouthX[] = {193, 189, 197, 220, 243, 254, 252, 238, 222, 210, 193}; //mouth X coordinates
        int mouthY[] = {161, 174, 195, 200, 189, 170, 157, 162, 156, 163, 161}; //mouth Y coordinates
        g.setColor(Color.black); //set outline color mouth  black
        g.drawPolygon(mouthX, mouthY, 10); //draw mouth black
        g.setColor(new Color(255, 200, 217)); //set fill color mouth red
        g.fillPolygon(mouthX, mouthY, 10); //fill color mouth red
        g.setColor(Color.black);
        g.drawArc(194, 170, 50, 30, 0, 180);
        
        //Left ear
        int earOneX[] = {274, 297, 289, 276}; //left ear X coordinates
        int earOneY[] = {97, 89, 104, 115}; //left ear Y coordinares
        g.setColor(Color.black); //set outline color left ear black
        g.drawPolygon(earOneX, earOneY, 4); //draw left ear black
        g.setColor(new Color(skinColorRed, skinColorGreen, skinColorBlue)); //set fill color left ear white
        g.fillPolygon(earOneX, earOneY, 4); //fill color left ear white

        //Hair
        g.setColor(Color.black); //set outline color hair black
        g.drawPolygon(hairX, hairY, hairX.length); //draw hair black
        g.setColor(new Color(hairColorRed, hairColorGreen, hairColorBlue)); //fill color hair yellow
        g.fillPolygon(hairX, hairY, hairX.length); //fill color hair yellow

        //Right Eye Brows
        g.setColor(Color.black); //set outline color right eye brow black
        g.drawLine(257, 73, 226, 98); //right eye brow

        //Left Eye Brows
        g.setColor(Color.black); //set outline color left eye brow black
        g.drawLine(140, 96, 192, 101); //left eye brow
        
        //Right ear
        int earTwoX[] = {121, 83, 88, 120}; //right ear X coordinates
        int earTwoY[] = {102, 84, 103, 137}; //right ear Y coordinates
        g.setColor(Color.black); //set outline color right ear black
        g.drawPolygon(earTwoX, earTwoY, 4); //draw right ear black
        g.setColor(new Color(skinColorRed, skinColorGreen, skinColorBlue)); //set fill color right ear white
        g.fillPolygon(earTwoX, earTwoY, 4); //fill color right ear white 

        //Robe
        int rightRobeX[] = {287, 307, 312, 295, 276, 261, 273, 287, 290};
        int rightRobeY[] = {141, 110, 154, 184, 235, 235, 187, 172, 154};
        g.setColor(Color.black);
        g.drawPolygon(rightRobeX, rightRobeY, rightRobeX.length);
        g.setColor(Color.orange);
        g.fillPolygon(rightRobeX, rightRobeY, rightRobeX.length);
        int rightRobeMagentaX[] = {287, 302, 304, 283, 285, 268, 273, 287, 290};
        int rightRobeMagentaY[] = {141, 118, 147, 186, 190, 208, 186, 172, 154};
        g.setColor(Color.magenta);
        g.fillPolygon(rightRobeMagentaX, rightRobeMagentaY, rightRobeMagentaX.length);
        int nearRightRobeX[] = {225, 237, 271, 261};
        int nearRightRobeY[] = {235, 196, 190, 235};
        g.setColor(Color.black);
        g.drawPolygon(nearRightRobeX, nearRightRobeY, nearRightRobeX.length);
        g.setColor(Color.orange);
        g.fillPolygon(nearRightRobeX, nearRightRobeY, nearRightRobeX.length);
        int nearRightRobeWhiteX[] = {225, 243, 269, 261};
        int nearRightRobeWhiteY[] = {235, 201, 199, 235};
        g.setColor(Color.white);
        g.fillPolygon(nearRightRobeWhiteX, nearRightRobeWhiteY, nearRightRobeX.length);
        int middleRobeX[] = {190, 189, 198, 213, 223, 232, 224};
        int middleRobeY[] = {235, 210, 215, 216, 206, 204, 235};
        g.setColor(Color.magenta);
        g.fillPolygon(middleRobeX, middleRobeY, middleRobeX.length);
        int nearLeftRobeX[] = {161, 145, 147, 177, 189, 191};
        int nearLeftRobeY[] = {235, 210, 180, 185, 209, 235};
        g.setColor(Color.black);
        g.drawPolygon(nearLeftRobeX, nearLeftRobeY, nearLeftRobeX.length);
        g.setColor(Color.orange);
        g.fillPolygon(nearLeftRobeX, nearLeftRobeY, nearLeftRobeX.length);
        int nearLeftRobeWhiteX[] = {161, 145, 146, 175, 179, 180};
        int nearLeftRobeWhiteY[] = {235, 210, 187, 196, 214, 235};
        g.setColor(Color.white);
        g.fillPolygon(nearLeftRobeWhiteX, nearLeftRobeWhiteY, nearLeftRobeWhiteX.length);
        int leftRobeX[] = {110,  88,  68,  52,  52,  59, 104, 146, 163};
        int leftRobeY[] = {235, 217, 195, 164, 149, 152, 189, 210, 235};
        g.setColor(Color.black);
        g.drawPolygon(leftRobeX, leftRobeY, leftRobeX.length);
        g.setColor(Color.orange);
        g.fillPolygon(leftRobeX, leftRobeY, leftRobeX.length);
        int leftRobeWhiteX[] = {110,  88,  68,  52,  52,  79,  98, 114, 138, 155};
        int leftRobeWhiteY[] = {235, 217, 195, 164, 158, 178, 194, 205, 216, 236};
        g.setColor(Color.white);
        g.fillPolygon(leftRobeWhiteX, leftRobeWhiteY, leftRobeWhiteX.length);
        int upperLeftRobeX[] = { 52,  64,  46,  85, 107, 116, 124, 135, 108,  72};
        int upperLeftRobeY[] = {149, 146, 102, 132, 144, 157, 165, 204, 190, 161};
        g.setColor(Color.black);
        g.drawPolygon(upperLeftRobeX, upperLeftRobeY, upperLeftRobeX.length);
        g.setColor(Color.magenta);
        g.fillPolygon(upperLeftRobeX, upperLeftRobeY, upperLeftRobeX.length);
        int upperLeftRobeOrangeX[] = { 64,  46,  58,  73};
        int upperLeftRobeOrangeY[] = {146, 102, 110, 148};
        g.setColor(Color.orange);
        g.fillPolygon(upperLeftRobeOrangeX, upperLeftRobeOrangeY, upperLeftRobeOrangeX.length);
        int upperupperLeftRobeX[] = { 86, 77, 38, 81, 85, 114, 110, 107, 82, 86, 105, 115};
        int upperupperLeftRobeY[] = {132, 90, 40, 52, 60,  74,  82,  94, 83, 97, 123, 150};
        g.setColor(Color.black);
        g.drawPolygon(upperupperLeftRobeX, upperupperLeftRobeY, upperupperLeftRobeX.length);
        g.setColor(Color.magenta);
        g.fillPolygon(upperupperLeftRobeX, upperupperLeftRobeY, upperupperLeftRobeX.length);
        int upperupperLeftRobeOrangeX[] = {79, 38, 51, 84};
        int upperupperLeftRobeOrangeY[] = {92, 40, 43, 90};
        g.setColor(Color.orange);
        g.fillPolygon(upperupperLeftRobeOrangeX, upperupperLeftRobeOrangeY, upperupperLeftRobeOrangeX.length);
        g.setColor(Color.magenta);
        g.drawRect(155, 200, 15, 15);
        g.drawRect(244, 205, 15, 15);

        //Quas
        g.setColor(new Color(quasColorRed, quasColorGreen, quasColorBlue));
        g.fillArc(quasX, quasY, 50, 50, quasSA, quasExtent);
        
        //Wex
        g.setColor(new Color(wexColorRed, wexColorGreen, wexColorBlue));
        g.fillArc(wexX, wexY, 50, 50, wexSA, wexExtent);

        //Exort
        g.setColor(new Color(exortColorRed, exortColorGreen, exortColorBlue));
        g.fillArc(exortX, exortY, 50, 50, exortSA, exortExtent);

        g.setColor(new Color(0, 0, 0));
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString(userName,170,270);
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("Press Q for Quas", 10, 310);
        g.drawString("Press W for Wex", 10, 330);
        g.drawString("Press E for Exort", 10, 350);
        g.drawString("Press R for Invoke", 10, 370);
        g.drawString("Press S to Stop Invoke", 10 , 390);
    }
        
    //Quas orb
    static int quasX = 57, quasY = 178;
    static int quasSA = 0, quasExtent = -360;
    static int quasColorRed, quasColorGreen, quasColorBlue;
    
    //Wex orb
    static int wexX = 329, wexY = 176;
    static int wexSA = 0, wexExtent = -360;
    static int wexColorRed, wexColorGreen, wexColorBlue;    

    //Exort orb
    static int exortX = 269, exortY = 15;
    static int exortSA = 0, exortExtent = -360;
    static int exortColorRed, exortColorGreen, exortColorBlue;
        
    //Hair
    static int hairX[] = {145, 134, 125, 105, 106, 119, 152, 161, 183, 215, 250, 275, 275, 269, 268, 262, 189, 147, 143};
    static int hairY[] = {206, 202, 165, 125,  94,  61,  40,  43,  32,  32,  44,  73, 117,  90, 107,  83,  61,  99, 130};

    //When Invoke is pressed, change hair to invoke hair
    static int invokeHairX[] = {141, 110, 122,  90,  96, 115, 118, 139, 157, 191, 204, 212, 240, 242, 280, 283, 287, 279, 253, 253, 210, 215, 183, 186, 145, 166, 143, 147, 150};
    static int invokeHairY[] = {204, 174, 179, 107, 114,  31,  37,   2,  20,   1,   5,   0,   26,  11,  57,  49,  99, 117,  74,  80,  58,  66,  59,  66,  89,  87, 144, 142, 186};
    
    //Stop invoke
    static int returnHairX[] = {145, 134, 125, 105, 106, 119, 152, 161, 183, 215, 250, 275, 275, 269, 268, 262, 189, 147, 143};
    static int returnHairY[] = {206, 202, 165, 125,  94,  61,  40,  43,  32,  32,  44,  73, 117,  90, 107,  83,  61,  99, 130};

    public static void main(String args[]) {
        userName = JOptionPane.showInputDialog("Input Character Username:");
        for(int i = 0; ;i++) {
            int option2 = JOptionPane.showConfirmDialog(null, 
                                                        "Input Character Color.", 
                                                        "Color Character", 
                                                        JOptionPane.YES_NO_OPTION);
                if(option2 == JOptionPane.YES_OPTION) {
                    showOkDialogOption2 = JOptionPane.showInputDialog("What part of your Character to be colored?"
                                                                    + "\n[Hair]: Hair Tone"
                                                                    + "\n[Eye]: Eyes Tone"
                                                                    + "\n[Skin]: Skin Tone");
                    if(showOkDialogOption2.equalsIgnoreCase("Hair")) {
                        hairColorRed = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Red [0-255]"));
                        hairColorGreen = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Green [0-255]"));
                        hairColorBlue = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Blue [0-255]"));
                    }
                    if(showOkDialogOption2.equalsIgnoreCase("Eye")) {
                        eyeColorRed = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Red [0-255]"));
                        eyeColorGreen = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Green [0-255]"));
                        eyeColorBlue = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Blue [0-255]"));                    
                    }
                    if(showOkDialogOption2.equalsIgnoreCase("Skin")) {
                        skinColorRed = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Red [0-255]"));
                        skinColorGreen = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Green [0-255]"));
                        skinColorBlue = Integer.parseInt(JOptionPane.showInputDialog("Input Hex Value for Blue [0-255]"));                    
                    }
                } else if (option2 == JOptionPane.NO_OPTION) {
                    break;
                }
        }

        JFrame f = new JFrame();
        GraphicsDemo1 p = new GraphicsDemo1();
        
        f.add(p);
        
        p.setBackground(Color.PINK);
        p.addKeyListener(p);

        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_Q:  //Cold Snap
                quasX = 188;
                quasY = 180;
                quasColorRed = 0;
                quasColorGreen = 102;
                quasColorBlue = 255;
                
                wexX = 319;
                wexY = 90;
                wexColorRed = 0;
                wexColorGreen = 102;
                wexColorBlue = 255;
                
                exortX = 130;
                exortY = 30;
                exortColorRed = 0;
                exortColorGreen = 102;
                exortColorBlue = 255;
                break;
            case KeyEvent.VK_W: //EMP
                quasX = 268;
                quasY = 168;
                quasColorRed = 204;
                quasColorGreen = 51;
                quasColorBlue = 255;

                wexX = 228;
                wexY = 15;                
                wexColorRed = 204;
                wexColorGreen = 51;
                wexColorBlue = 255;

                exortX = 82;
                exortY = 116;                
                exortColorRed = 204;
                exortColorGreen = 51;
                exortColorBlue = 255;
                break;
            case KeyEvent.VK_E: //Sun Strike
                quasX = 115;
                quasY = 184;
                quasColorRed = 255;
                quasColorGreen = 102;
                quasColorBlue = 00;
                
                wexX = 316;
                wexY = 110;
                wexColorRed = 255;
                wexColorGreen = 102;
                wexColorBlue = 00;
                
                exortX = 172;
                exortY = 27;
                exortColorRed = 255;
                exortColorGreen = 102;
                exortColorBlue = 00;
                break;
            case KeyEvent.VK_R: //Invoke
                quasColorRed = 0;
                quasColorGreen = 102;
                quasColorBlue = 255;                

                wexColorRed = 204;
                wexColorGreen = 51;
                wexColorBlue = 255;

                exortColorRed = 255;
                exortColorGreen = 102;
                exortColorBlue = 00;
                
                hairColorRed = 255;
                hairColorGreen = 255;
                hairColorBlue = 0;
                hairX = invokeHairX;
                hairY = invokeHairY;
                
                eyeColorRed = 255;
                eyeColorGreen = 255;
                eyeColorBlue = 0;
                break;
            case KeyEvent.VK_S: //stop invoke
                hairX = returnHairX;
                hairY = returnHairY;
                break;
        }
       repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
   public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == up) {
//            if(wexY <= 0)
//                wexY = getHeight();
//            else
//                wexY -= 5;
//                
//            wexSA = 0;
//            
//            if( wexY % 2 == 0)
//                wexExtent = 360;
//        }
//        if(e.getSource() == down) {
//            if(quasY + 70 >= getHeight())
//                quasY = -50;
//            else
//                quasY += 5;
//            
//            quasSA = 0;
//            
//            if( quasY % 2 == 0)
//                quasExtent = 360;
//        }
//        if(e.getSource() == left) {
//            if(quasX <= 0)
//                quasX = 0;
//            else
//                quasX -= 5;
//            
//            quasSA = 135;
//            
//            if( quasX % 2 == 0)
//                quasExtent = 360;
//        }
//        if(e.getSource() == right) {
//            if(exortX+50 >= getWidth())
//                exortX = getWidth() - 50;
//            else
//                exortX+=5;
//            
//            exortSA = 0;
//            if( exortX % 2 == 0)
//                exortExtent = 360;
//        }
//        repaint();
    }
}