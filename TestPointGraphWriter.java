public class TestPointGraphWriter
{
   public static void main (String [] args)
   {  PointGraphWriter obj= new PointGraphWriter();
      obj.setAxes(105,310,220,"java","%");//axes start at position 105,310 which has length of 220 pixels.
     
      int f=5;//it's a certain factor assigned by us which multiplies points.
      obj.setPoint1(0*f);
      obj.setPoint2(12*f);
      obj.setPoint3(4*f);
      obj.setPoint4(26*f);      
      obj.setPoint5(32*f);
      obj.setPoint6(5*f);
      obj.setPoint7(15*f);    
   }
}