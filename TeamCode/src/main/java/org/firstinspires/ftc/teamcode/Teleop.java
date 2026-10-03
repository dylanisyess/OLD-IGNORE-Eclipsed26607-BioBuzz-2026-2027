package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Teleop", group="Linear OpMode")

public class Teleop extends LinearOpMode {
    private final Robot Robot = new Robot();

    double vx, vy, omega;

    public void runOpMode() {
        Robot.init(hardwareMap);
//        telemetry.addData("FL lamprey", Robot.frontLeftLamprey == null ? "NULL" : "OK");
        telemetry.update();

        telemetry.addData("Status", "Initialized");
        telemetry.update();
        waitForStart();

        Robot.runtime.reset();

        while (opModeIsActive()) {
            vx = gamepad1.left_stick_x;
            vy = -gamepad1.left_stick_y;
            omega = gamepad1.right_stick_x;

            Robot.frontLeft.setPower(vy);

//            telemetry.addData("FL angle", fl.getCurrentAngleDeg());
            telemetry.update();
        }
    }
}