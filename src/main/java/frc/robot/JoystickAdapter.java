package frc.robot;

import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickAdapter {
    
    private final Joystick m_controller;
    private boolean squareInputs;

    public JoystickAdapter(Joystick controller, boolean squareInputs) {
        m_controller = controller;
        this.squareInputs = squareInputs;
    }

    public double getForwardSpeed(){
        double forwardSpeed = -m_controller.getRawAxis(1);
        boolean negative = forwardSpeed < 0;

        if (squareInputs) {
            forwardSpeed = forwardSpeed  * forwardSpeed;

            if (negative) {
                forwardSpeed = forwardSpeed * -1;
            }
        }
      
        return forwardSpeed;
    }
 
    public double getRotationalSpeed(){
        double leftTrigger = m_controller.getRawAxis(2);
        double rightTrigger = m_controller.getRawAxis(3);
        double rotationalSpeed = rightTrigger - leftTrigger;
        boolean negative = rotationalSpeed < 0;
        if (squareInputs) {
            rotationalSpeed = rotationalSpeed * rotationalSpeed;

            if (negative) {
                rotationalSpeed = rotationalSpeed * -1;
            }
        }
        return rotationalSpeed;
    }
    
}
