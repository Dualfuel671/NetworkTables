package frc.robot;

import edu.wpi.first.networktables.DoublePublisher;
import edu.wpi.first.networktables.DoubleTopic;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableValue;

public class NetworkTables {
     NetworkTableInstance inst = NetworkTableInstance.getDefault();
     final NetworkTable table = inst.getTable("datatable");

     DoublePublisher xCord;
     DoublePublisher volt;
    double voltDouble;
     double xCordDouble;

     DoublePublisher yCord;
     double yCordDouble;
   
     public NetworkTables(){
        xCord = table.getDoubleTopic("xCord").publish();
        yCord = table.getDoubleTopic("yCord").publish();
        volt = table.getDoubleTopic("volt").publish();
        xCordDouble = 0;
        yCordDouble = 0;
        voltDouble = 0;
    }
  
    public void setCords(double xCord, double yCord){
        xCordDouble = xCord;
        yCordDouble = yCord;
    }

    public void setVolt(double volt){
        voltDouble = volt;
    }

    public void periodic() {
        xCord.set(xCordDouble);
        yCord.set(yCordDouble);
        volt.set(voltDouble);


    }

}

