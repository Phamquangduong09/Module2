package Day6_4;

public class
MainFan {
    public static void main(String[] args) {
       Fan fan1 = new Fan();
       Fan fan2 = new Fan();
       fan1.setSpeed(fan1.fast);
       fan1.setRadius(10);
       fan1.setColor("yelow");
       fan1.setOn(true);
        fan2.setSpeed(fan1.fast);
        fan2.setRadius(5);
        fan2.setColor("red");
        fan2.setOn(false);
        System.out.println(display(fan1));
        System.out.println(display(fan2));
    }
    public static String display(Fan fan){
        if(fan.isOn()){
            return "Fan{" +
                    ", speed=" + fan.getSpeed() +
                    ", radius=" + fan.getRadius() +
                    ", color='" + fan.getColor()
                    + '\'' +
                    '}';
        }else{
            return "Fan{" +
                    ", radius=" + fan.getRadius() +
                    ", color='" + fan.getColor()
                    + '\'' +
                    '}';
        }

    }
}
