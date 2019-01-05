//As we did in the previous exam also here we create a Test class.
public class TestPointGraphDistance{
   public static void main (String[] args){
      PointGraphDistance obj = new PointGraphDistance();
      obj.setAxes(105,310,220,"distance","time");
      int f=3;
      obj.setPoint1((int)(Formula.formula1(1,1)*f));
      obj.setPoint2((int)(Formula.formula2(1,1)*f));
      obj.setPoint3((int)(Formula.formula3(1,1)*f));
      obj.setPoint4((int)(Formula.formula4(1,1)*f));
      obj.setPoint5((int)(Formula.formula5(1,1)*f));
      obj.setPoint6((int)(Formula.formula6(1,1)*f));
   }
}
