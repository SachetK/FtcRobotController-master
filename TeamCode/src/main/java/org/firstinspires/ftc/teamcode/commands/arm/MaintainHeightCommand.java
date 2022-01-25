package org.firstinspires.ftc.teamcode.commands.arm;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.ArmPIDSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.LiftPIDSubsystem;

public class MaintainHeightCommand extends CommandBase {
    private final ArmPIDSubsystem subsystem;
    private final Telemetry telemetry;

    public MaintainHeightCommand(ArmPIDSubsystem subsystem, Telemetry telemetry) {
        this.subsystem = subsystem;
        this.telemetry = telemetry;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        subsystem.setMotorPosition(subsystem.getTargetPosition());
        while (!(subsystem.getCurrentPosition() == subsystem.getTargetPosition())) {
            subsystem.moveToPosition();
        }
        subsystem.stopMotor();
    }
}
