package org.firstinspires.ftc.teamcode.commands.floor;

import com.arcrobotics.ftclib.command.CommandBase;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.subsystems.FloorSubsystem;

public class FloorActivateCommand extends CommandBase {
    private FloorSubsystem subsystem;

    public FloorActivateCommand(FloorSubsystem floorSubsystem) {
        subsystem = floorSubsystem;
    }

    @Override
    public void execute(){
        subsystem.activate();
    }

    @Override
    public void end(boolean interrupted){
        subsystem.stop();
    }
}