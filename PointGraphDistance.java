//In this exercise we will calculate the distance d, that an automobile travells starting from initial velocity V, and acceleration a.
import javax.swing.*;
import java.awt.*;
public class PointGraphDistance extends JPanel
{
   private int x_pos;//x position
   private int y_pos;//y position
   private int axis_length;//axis's length
   private String x_label;//x label
   private String y_label;//y label
   private int x1,y1;//point 1
   private int x2,y2;//point 2
   private int x3,y3;//point 3
   private int x4,y4;//point 4
   private int x5,y5;//point 5
   private int x6,y6;//point 6
   private int width = 600;//frame's width
   private int x_length;

   public PointGraphDistance()
   { /*now we are just creating a frame that has a size, and if we want
    to see it we should set the visible in true because if we don't,
     the frame will be created but will not be displayed to us.*/
      JFrame obj = new JFrame();
      obj.setSize(width,width);
      obj.getContentPane().add(this);
      obj.setVisible(true);
   }
   public void paintComponent(Graphics g){
      g.setColor(Color.white);//color of frame.
      g.fillRect(0,0,width,width);
   
      g.setColor(Color.black);//color of strings and lines
   
      g.drawLine(x_pos,y_pos,x_pos+axis_length,y_pos);//axis x.
      g.drawLine(x_pos,y_pos,x_pos,y_pos-axis_length+93);//axis y.
      
      g.drawString("Distanca e automobilit për kohën(t) e caktuar në varësi me shpejtësinë (v) dhe me nxitimin (a)",x_pos-100,y_pos-260);//string on the top of frame.
   //And now we write number of distance in bottom of x axis.
      g.drawString("0",x_pos-15,y_pos);
      g.drawString("0",x_pos,y_pos+15);
      g.drawString("1km",x_pos+32,y_pos+15);
      g.drawString("2km",x_pos+64,y_pos+15);
      g.drawString("3km",x_pos+100,y_pos+15);
      g.drawString("4km",x_pos+140,y_pos+15);
      g.drawString("5km",x_pos+180,y_pos+15);
      g.drawString("6km",x_pos+220,y_pos+15);
      g.drawString("d",x_pos+230,y_pos);
   //Here we write number of  in front of y axis.
      g.drawString("2",x_pos-15,y_pos-20);
      g.drawString("4",x_pos-15,y_pos-40);
      g.drawString("6",x_pos-15,y_pos-60);
      g.drawString("8",x_pos-15,y_pos-80);
      g.drawString("10",x_pos-20,y_pos-100);
      g.drawString("t",x_pos-15,y_pos-120);
    
   //we fill the points with black color.
      g.fillOval(x1-2,y1-2,4,4);
      g.fillOval(x2-2,y2-2,4,4);
      g.fillOval(x3-2,y3-2,4,4);
      g.fillOval(x4-2,y4-2,4,4);
      g.fillOval(x5-2,y5-2,4,4);
      g.fillOval(x6-2,y6-2,4,4);
   //and now we create lines that will be connected to the points.
      g.setColor(Color.red);
      g.drawLine(x1,y1,x2,y2);
      g.drawLine(x2,y2,x3,y3);
      g.drawLine(x3,y3,x4,y4);
      g.drawLine(x4,y4,x5,y5);
      g.drawLine(x5,y5,x6,y6);
   
   }
   public void setAxes(int x_pos,int y_pos,int axis_length,String x_label,String y_label)
   {/*draws the vertical and horizontal axes of the graph, 
   such that the intersection point of the axes lies at positon x_pos, y_pos.*/
      this.x_pos = x_pos;
      this.y_pos=y_pos;
      this.axis_length=axis_length;
      this.x_label=x_label;
      this.y_label=y_label;
      x_length=axis_length/6;
   }
   public void setPoint1(int height)
   {//plot the first point of the graph.
      y1=y_pos-height;
      x1=x_pos;
      repaint();
   }
   public void setPoint2(int height)
   {//plot the second point of the graph.
      y2=y_pos-height;
      x2=x_pos + x_length;
      repaint();
   }
   public void setPoint3(int height)
   {//plot the third point of the graph.
      y3=y_pos-height;
      x3=x_pos+x_length*2;
      repaint();
   }
   public void setPoint4(int height)
   {//plot the fourth point of the graph.
      y4=y_pos-height;
      x4=x_pos+x_length*3;
      repaint();
   }
   public void setPoint5(int height)
   {//plot the fifth point of the graph.
      y5=y_pos-height;
      x5=x_pos+x_length*4;;
      repaint();
   }
   public void setPoint6(int height)
   {//plot the sixth point of the graph.
      y6=y_pos-height;
      x6=x_pos+x_length*5;
      repaint();
   }

}