package org.sert2521.syfer2024.commands

import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.chargedup2023.subsystems.LEDs

class LEDTest : Command() { //Sets all the LEDs to white as a test to see if they work

    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(LEDs)
    }

    override fun initialize() {
        LEDs.setAllLEDRGB(255, 255, 255)
    }

    override fun execute() {}

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
