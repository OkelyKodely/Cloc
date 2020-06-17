import java.util.Date;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Color;


public class Cloc {

    private ClocShape clocSha = new ClocShape();
    
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private Graphics graphics;
    
    private Hour hour = new Hour();
    private Minute minute = new Minute();
    private Second second = new Second();
    private int hours;
    private int minutes;
    private int seconds;


    public Cloc() {

        this. clocSha = new ClocShape();
        this. hour = new Hour();
        this. minute = new Minute();
        this. second = new Second();
        this. hours = new Date().getHours();
        this. minutes = new Date().getMinutes();
        this. seconds = new Date().getSeconds();

    }
    
    public class ClocShape {
        
        public int x = 500;
        
        public int y = 500;
        
        public void drawOval() {
            graphics.setColor(Color.WHITE);
            graphics.fillOval(0, 0, x, y);
        }
        
        public void drawCenterDot() {
            graphics. setColor  ( Color .GREEN );
            graphics.fillOval(245, 245, 10, 10);
        }
        
        public void drawTic(int secs) {
            
            graphics.setColor(Color.BLACK);
            graphics.drawString("12", 250, 20);
            graphics.setColor(Color.BLACK);
            graphics.drawString("3", 480, 250);
            graphics.setColor(Color.BLACK);
            graphics.drawString("6", 250, 480);
            graphics.setColor(Color.BLACK);
            graphics.drawString("9", 20, 250);

            graphics.setColor(Color.BLACK);
            graphics.drawString("1", 250 + (int)(300.0/2.5), 250 - 300 + (int)(300.0/2.5));
            graphics.setColor(Color.BLACK);
            graphics.drawString("2", 250 + (int)(300.0/1.5), 250 - 300 + (int)(300.0/1.5));

            graphics.setColor(Color.BLACK);
            graphics.drawString("4", 250 + (int)(300.0/1.5), 250 + (int)(300.0/2.5));
            graphics.setColor(Color.BLACK);
            graphics.drawString("5", 250 + (int)(300.0/2.6), 250 + 90 + (int)(300.0/2.5));

            graphics.setColor(Color.BLACK);
            graphics.drawString("7", 250 - (int)(300.0/2.5), 250 + (int)(300.0/1.5));
            graphics.setColor(Color.BLACK);
            graphics.drawString("8", 250 - (int)(300.0/1.5), 250 + (int)(300.0/2.5));

            graphics.setColor(Color.BLACK);
            graphics.drawString("10", 250 - (int)(300.0/1.5), 250 - (int)(300.0/3.0));
            graphics.setColor(Color.BLACK);
            graphics.drawString("11", 250 - (int)(300.0/2.5), 250 - (int)(300.0/1.5));
        }
    }
    
    public class Hour {
        
        public void draw(int hours) {
        
            if(hours == 12) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250, 250 - 140);
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/12.0), 250 - (int)(140.0*(3.0/3.0)) + (int)(140.0/12.0));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/8.0), 250 + 140);
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/3.0), 250 - (int)(140.0*(3.0/3.0)) + (int)(140.0/3.0));
            }
            else if(hours == 1) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/3.0), 250 - 140 + (int)(140.0/3.0));
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/3.0) + (int)(140.0/12.0), 250 - 140 + (int)(140.0/3.0) + (int)(140.0/12.0));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/3.0) + (int)(140.0/6.0), 250 - 140 + (int)(140.0/3.0) + (int)(140.0/6.0));
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/3.0) + (int)(140.0/3.0*3/4), 250 - 140 + (int)(140.0/3.0) + (int)(140.0/3.0*3/4));
            }
            else if(hours == 2) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/1.5), 250 - 140 + (int)(140.0/1.5));
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/1.5) + (int)(140.0/12.0), 250 - 140 + (int)(140.0/1.5) + (int)(140.0/12.0));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/1.5) + (int)(140.0/6.0), 250 - 140 + (int)(140.0/1.5) + (int)(140.0/6.0));
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 + (int)(140.0/1.5) + (int)(140.0/3.0*3/4), 250 - 140 + (int)(140.0/1.5) + (int)(140.0/3.0*3/4));
            }
            else if(hours == 3) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + 140, 250);
            }
            else if(hours == 4) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(140.0*(2.0/3.0)) - (int)(140.0*(1.0/15.0)), 250 + (int)(140.0*(1.0/3.0)) + (int)(140.0*(1.0/15.0)));
            }
            else if(hours == 5) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + 0 + 50, 250 + 120);
            }
            else if(hours == 6) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + 0, 250 + 140);
            }
            else if(hours == 7) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(140.0*(1.0/3.0)), 250 + (int)(140.0*(2.0/3.0)));
            }
            else if(hours == 8) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(140.0*(2.0/3.0)), 250 + (int)(140.0*(1.0/3.0)));
            }
            else if(hours == 9) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250 - 140, 250 - 0);
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/12.0), 250 - (int)(140.0/12.0));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/6.0), 250 - (int)(140.0/6.0));
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/3.0*3/4), 250 - (int)(140.0/3.0*3/4));
            }
            else if(hours == 10) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/3.0), 250 - 0 - (int)(140.0/3.0));
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/3.0) + (int)(140.0/12.0), 250 - (int)(140.0/12.0) - (int)(140.0/3.0));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/3.0) + (int)(140.0/6.0), 250 - (int)(140.0/6.0) - (int)(140.0/3.0));
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/3.0) + (int)(140.0/3.0*3/4), 250 - (int)(140.0/3.0*3/4) - (int)(140.0/3.0));
            }
            else if(hours == 11) {
                graphics.setColor(Color.RED);
                if(minutes >= 0 && minutes <= 14)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/1.5), 250 - 0 - (int)(140.0/1.5));
                else if(minutes >= 15 && minutes <= 29)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/1.5) + (int)(140.0/12.0), 250 - (int)(140.0/12.0) - (int)(140.0/1.5));
                else if(minutes >= 30 && minutes <= 44)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/1.5) + (int)(140.0/6.0), 250 - (int)(140.0/6.0) - (int)(140.0/1.5));
                else if(minutes >= 45 && minutes <= 59)
                    graphics.drawLine(250, 250, 250 - 140 + (int)(140.0/1.5) + (int)(140.0/3.0*3/4), 250 - (int)(140.0/3.0*3/4) - (int)(140.0/1.5));
            }
        }
    }
    
    public class Minute {
        public void draw(int minutes) {
            if(minutes == 0) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + 0, 250 - 230);
            }
            else if(minutes == 1) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0/15.0), 250 - (int)(230.0*(14.0/15.0)));
            }
            else if(minutes == 2) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(2.0/15.0)), 250 - (int)(230.0*(13.0/15.0)));
            }
            else if(minutes == 3) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(3.0/15.0)), 250 - (int)(230.0*(12.0/15.0)));
            }
            else if(minutes == 4) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(4.0/15.0)), 250 - (int)(230.0*(11.0/15.0)));
            }
            else if(minutes == 5) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(5.0/15.0)), 250 - (int)(230.0*(10.0/15.0)));
            }
            else if(minutes == 6) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(6.0/15.0)), 250 - (int)(230.0*(9.0/15.0)));
            }
            else if(minutes == 7) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(7.0/15.0)), 250 - (int)(230.0*(8.0/15.0)));
            }
            else if(minutes == 8) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(8.0/15.0)), 250 - (int)(230.0*(7.0/15.0)));
            }
            else if(minutes == 9) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(9.0/15.0)), 250 - (int)(230.0*(6.0/15.0)));
            }
            else if(minutes == 10) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(10.0/15.0)), 250 - (int)(230.0*(5.0/15.0)));
            }
            else if(minutes == 11) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(11.0/15.0)), 250 - (int)(230.0*(4.0/15.0)));
            }
            else if(minutes == 12) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(12.0/15.0)), 250 - (int)(230.0*(3.0/15.0)));
            }
            else if(minutes == 13) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(13.0/15.0)), 250 - (int)(230.0*(2.0/15.0)));
            }
            else if(minutes == 14) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(14.0/15.0)), 250 - (int)(230.0*(1.0/15.0)));
            }
            else if(minutes == 15) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(15.0/15.0)), 250 - (int)(230.0*(0.0/15.0)));
            }
            else if(minutes == 16) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(14.0/15.0)), 250 + (int)(230.0*(1.0/15.0)));
            }
            else if(minutes == 17) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(13.0/15.0)), 250 + (int)(230.0*(2.0/15.0)));
            }
            else if(minutes == 18) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(12.0/15.0)), 250 + (int)(230.0*(3.0/15.0)));
            }
            else if(minutes == 19) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(11.0/15.0)), 250 + (int)(230.0*(4.0/15.0)));
            }
            else if(minutes == 20) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(10.0/15.0)), 250 + (int)(230.0*(5.0/15.0)));
            }
            else if(minutes == 21) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(9.0/15.0)), 250 + (int)(230.0*(6.0/15.0)));
            }
            else if(minutes == 22) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(8.0/15.0)), 250 + (int)(230.0*(7.0/15.0)));
            }
            else if(minutes == 23) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(7.0/15.0)), 250 + (int)(230.0*(8.0/15.0)));
            }
            else if(minutes == 24) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(6.0/15.0)), 250 + (int)(230.0*(9.0/15.0)));
            }
            else if(minutes == 25) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(5.0/15.0)), 250 + (int)(230.0*(10.0/15.0)));
            }
            else if(minutes == 26) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(4.0/15.0)), 250 + (int)(230.0*(11.0/15.0)));
            }
            else if(minutes == 27) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(3.0/15.0)), 250 + (int)(230.0*(12.0/15.0)));
            }
            else if(minutes == 28) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(2.0/15.0)), 250 + (int)(230.0*(13.0/15.0)));
            }
            else if(minutes == 29) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(1.0/15.0)), 250 + (int)(230.0*(14.0/15.0)));
            }
            else if(minutes == 30) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(0.0/15.0)), 250 + (int)(230.0*(15.0/15.0)));
            }
            else if(minutes == 31) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0/15.0), 250 + (int)(230.0*(14.0/15.0)));
            }
            else if(minutes == 32) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(2.0/15.0)), 250 + (int)(230.0*(13.0/15.0)));
            }
            else if(minutes == 33) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(3.0/15.0)), 250 + (int)(230.0*(12.0/15.0)));
            }
            else if(minutes == 34) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(4.0/15.0)), 250 + (int)(230.0*(11.0/15.0)));
            }
            else if(minutes == 35) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(5.0/15.0)), 250 + (int)(230.0*(10.0/15.0)));
            }
            else if(minutes == 36) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(6.0/15.0)), 250 + (int)(230.0*(9.0/15.0)));
            }
            else if(minutes == 37) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(7.0/15.0)), 250 + (int)(230.0*(8.0/15.0)));
            }
            else if(minutes == 38) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(8.0/15.0)), 250 + (int)(230.0*(7.0/15.0)));
            }
            else if(minutes == 39) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(9.0/15.0)), 250 + (int)(230.0*(6.0/15.0)));
            }
            else if(minutes == 40) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(10.0/15.0)), 250 + (int)(230.0*(5.0/15.0)));
            }
            else if(minutes == 41) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(11.0/15.0)), 250 + (int)(230.0*(4.0/15.0)));
            }
            else if(minutes == 42) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(12.0/15.0)), 250 + (int)(230.0*(3.0/15.0)));
            }
            else if(minutes == 43) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(13.0/15.0)), 250 + (int)(230.0*(2.0/15.0)));
            }
            else if(minutes == 44) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(14.0/15.0)), 250 + (int)(230.0*(1.0/15.0)));
            }
            else if(minutes == 45) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(15.0/15.0)), 250 - (int)(230.0*(0.0/15.0)));
            }
            else if(minutes == 46) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(14.0/15.0)), 250 - (int)(230.0*(1.0/15.0)));
            }
            else if(minutes == 47) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(13.0/15.0)), 250 - (int)(230.0*(2.0/15.0)));
            }
            else if(minutes == 48) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(12.0/15.0)), 250 - (int)(230.0*(3.0/15.0)));
            }
            else if(minutes == 49) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(11.0/15.0)), 250 - (int)(230.0*(4.0/15.0)));
            }
            else if(minutes == 50) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(10.0/15.0)), 250 - (int)(230.0*(5.0/15.0)));
            }
            else if(minutes == 51) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(9.0/15.0)), 250 - (int)(230.0*(6.0/15.0)));
            }
            else if(minutes == 52) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(8.0/15.0)), 250 - (int)(230.0*(7.0/15.0)));
            }
            else if(minutes == 53) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(7.0/15.0)), 250 - (int)(230.0*(8.0/15.0)));
            }
            else if(minutes == 54) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(6.0/15.0)), 250 - (int)(230.0*(9.0/15.0)));
            }
            else if(minutes == 55) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(5.0/15.0)), 250 - (int)(230.0*(10.0/15.0)));
            }
            else if(minutes == 56) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(4.0/15.0)), 250 - (int)(230.0*(11.0/15.0)));
            }
            else if(minutes == 57) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(3.0/15.0)), 250 - (int)(230.0*(12.0/15.0)));
            }
            else if(minutes == 58) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(2.0/15.0)), 250 - (int)(230.0*(13.0/15.0)));
            }
            else if(minutes == 59) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(1.0/15.0)), 250 - (int)(230.0*(14.0/15.0)));
            }
        }
    }

    public class Second {
        public void draw(int seconds) {
            if(seconds == 0) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + 0, 250 - 230);
            }
            else if(seconds == 1) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0/15.0), 250 - (int)(230.0*(14.0/15.0)));
            }
            else if(seconds == 2) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(2.0/15.0)), 250 - (int)(230.0*(13.0/15.0)));
            }
            else if(seconds == 3) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(3.0/15.0)), 250 - (int)(230.0*(12.0/15.0)));
            }
            else if(seconds == 4) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(4.0/15.0)), 250 - (int)(230.0*(11.0/15.0)));
            }
            else if(seconds == 5) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(5.0/15.0)), 250 - (int)(230.0*(10.0/15.0)));
            }
            else if(seconds == 6) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(6.0/15.0)), 250 - (int)(230.0*(9.0/15.0)));
            }
            else if(seconds == 7) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(7.0/15.0)), 250 - (int)(230.0*(8.0/15.0)));
            }
            else if(seconds == 8) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(8.0/15.0)), 250 - (int)(230.0*(7.0/15.0)));
            }
            else if(seconds == 9) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(9.0/15.0)), 250 - (int)(230.0*(6.0/15.0)));
            }
            else if(seconds == 10) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(10.0/15.0)), 250 - (int)(230.0*(5.0/15.0)));
            }
            else if(seconds == 11) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(11.0/15.0)), 250 - (int)(230.0*(4.0/15.0)));
            }
            else if(seconds == 12) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(12.0/15.0)), 250 - (int)(230.0*(3.0/15.0)));
            }
            else if(seconds == 13) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(13.0/15.0)), 250 - (int)(230.0*(2.0/15.0)));
            }
            else if(seconds == 14) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(14.0/15.0)), 250 - (int)(230.0*(1.0/15.0)));
            }
            else if(seconds == 15) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(15.0/15.0)), 250 - (int)(230.0*(0.0/15.0)));
            }
            else if(seconds == 16) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(14.0/15.0)), 250 + (int)(230.0*(1.0/15.0)));
            }
            else if(seconds == 17) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(13.0/15.0)), 250 + (int)(230.0*(2.0/15.0)));
            }
            else if(seconds == 18) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(12.0/15.0)), 250 + (int)(230.0*(3.0/15.0)));
            }
            else if(seconds == 19) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(11.0/15.0)), 250 + (int)(230.0*(4.0/15.0)));
            }
            else if(seconds == 20) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(10.0/15.0)), 250 + (int)(230.0*(5.0/15.0)));
            }
            else if(seconds == 21) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(9.0/15.0)), 250 + (int)(230.0*(6.0/15.0)));
            }
            else if(seconds == 22) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(8.0/15.0)), 250 + (int)(230.0*(7.0/15.0)));
            }
            else if(seconds == 23) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(7.0/15.0)), 250 + (int)(230.0*(8.0/15.0)));
            }
            else if(seconds == 24) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(6.0/15.0)), 250 + (int)(230.0*(9.0/15.0)));
            }
            else if(seconds == 25) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(5.0/15.0)), 250 + (int)(230.0*(10.0/15.0)));
            }
            else if(seconds == 26) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(4.0/15.0)), 250 + (int)(230.0*(11.0/15.0)));
            }
            else if(seconds == 27) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(3.0/15.0)), 250 + (int)(230.0*(12.0/15.0)));
            }
            else if(seconds == 28) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(2.0/15.0)), 250 + (int)(230.0*(13.0/15.0)));
            }
            else if(seconds == 29) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(1.0/15.0)), 250 + (int)(230.0*(14.0/15.0)));
            }
            else if(seconds == 30) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 + (int)(230.0*(0.0/15.0)), 250 + (int)(230.0*(15.0/15.0)));
            }
            else if(seconds == 31) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0/15.0), 250 + (int)(230.0*(14.0/15.0)));
            }
            else if(seconds == 32) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(2.0/15.0)), 250 + (int)(230.0*(13.0/15.0)));
            }
            else if(seconds == 33) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(3.0/15.0)), 250 + (int)(230.0*(12.0/15.0)));
            }
            else if(seconds == 34) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(4.0/15.0)), 250 + (int)(230.0*(11.0/15.0)));
            }
            else if(seconds == 35) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(5.0/15.0)), 250 + (int)(230.0*(10.0/15.0)));
            }
            else if(seconds == 36) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(6.0/15.0)), 250 + (int)(230.0*(9.0/15.0)));
            }
            else if(seconds == 37) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(7.0/15.0)), 250 + (int)(230.0*(8.0/15.0)));
            }
            else if(seconds == 38) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(8.0/15.0)), 250 + (int)(230.0*(7.0/15.0)));
            }
            else if(seconds == 39) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(9.0/15.0)), 250 + (int)(230.0*(6.0/15.0)));
            }
            else if(seconds == 40) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(10.0/15.0)), 250 + (int)(230.0*(5.0/15.0)));
            }
            else if(seconds == 41) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(11.0/15.0)), 250 + (int)(230.0*(4.0/15.0)));
            }
            else if(seconds == 42) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(12.0/15.0)), 250 + (int)(230.0*(3.0/15.0)));
            }
            else if(seconds == 43) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(13.0/15.0)), 250 + (int)(230.0*(2.0/15.0)));
            }
            else if(seconds == 44) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(14.0/15.0)), 250 + (int)(230.0*(1.0/15.0)));
            }
            else if(seconds == 45) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(15.0/15.0)), 250 - (int)(230.0*(0.0/15.0)));
            }
            else if(seconds == 46) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(14.0/15.0)), 250 - (int)(230.0*(1.0/15.0)));
            }
            else if(seconds == 47) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(13.0/15.0)), 250 - (int)(230.0*(2.0/15.0)));
            }
            else if(seconds == 48) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(12.0/15.0)), 250 - (int)(230.0*(3.0/15.0)));
            }
            else if(seconds == 49) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(11.0/15.0)), 250 - (int)(230.0*(4.0/15.0)));
            }
            else if(seconds == 50) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(10.0/15.0)), 250 - (int)(230.0*(5.0/15.0)));
            }
            else if(seconds == 51) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(9.0/15.0)), 250 - (int)(230.0*(6.0/15.0)));
            }
            else if(seconds == 52) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(8.0/15.0)), 250 - (int)(230.0*(7.0/15.0)));
            }
            else if(seconds == 53) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(7.0/15.0)), 250 - (int)(230.0*(8.0/15.0)));
            }
            else if(seconds == 54) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(6.0/15.0)), 250 - (int)(230.0*(9.0/15.0)));
            }
            else if(seconds == 55) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(5.0/15.0)), 250 - (int)(230.0*(10.0/15.0)));
            }
            else if(seconds == 56) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(4.0/15.0)), 250 - (int)(230.0*(11.0/15.0)));
            }
            else if(seconds == 57) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(3.0/15.0)), 250 - (int)(230.0*(12.0/15.0)));
            }
            else if(seconds == 58) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(2.0/15.0)), 250 - (int)(230.0*(13.0/15.0)));
            }
            else if(seconds == 59) {
                graphics.setColor(Color.RED);
                graphics.drawLine(250, 250, 250 - (int)(230.0*(1.0/15.0)), 250 - (int)(230.0*(14.0/15.0)));
            }
        }
    }

    public void setFrame() {
        frame.setTitle("Clock");
 
        panel.setBackground(Color.red );
        frame.setLayout(null);
        frame.setBounds(0,0,520,540);
        panel.setBounds(frame.getBounds());
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        graphics = panel.getGraphics();
    }
        
    public void show() {
        
        setFrame();
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                    seconds++;
                    if (seconds > 59) {
                        minutes++;
                        seconds = 0;
                    }
                    if (minutes > 59) {
                        hours++;
                        minutes = 0;
                    }
                    
                    String aMpMStr = "";
                    if (hours > 11) {
                        aMpMStr = "P.M.";
                        hours = hours - 12;
                    } else {
                        aMpMStr = "A.M.";
                    }
                    
                    clocSha = new ClocShape();
                    clocSha.drawOval(); clocSha.drawCenterDot(); clocSha.drawTic(seconds = seconds);
                    
                    graphics. setColor(Color.BLUE);
                    graphics . drawString(hours + ":" + minutes + ":" + seconds + " " + aMpMStr, 200, 100);
                    
                    Hour hour = new Hour(); Minute minute = new Minute(); Second second = new Second();
                    hour.draw(hours);
                    minute.draw(minutes);
                    second.draw(seconds);
                }
            }
        });
        
        thread.start();

    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Cloc().show();
            }
        });
    }
}