package org.sert2521.syfer2024.commands

import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.chargedup2023.subsystems.LEDs
import org.sert2521.syfer2024.Constants

class TransLEDs : Command() {
var currentLED:Int = 0

    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(LEDs)
    }

    override fun initialize() {
        for(i in 1..(Constants.PhysicalConstants.LED_LENGTH/6)){
            LEDs.setLEDRGB(currentLED, Constants.Colors.Blue.R, Constants.Colors.Blue.G, Constants.Colors.Blue.B)
            currentLED += 1
            LEDs.setLEDRGB(currentLED, Constants.Colors.Pink.R, Constants.Colors.Pink.G, Constants.Colors.Pink.B)
            currentLED += 1
            LEDs.setLEDRGB(currentLED, Constants.Colors.White.R, Constants.Colors.White.G, Constants.Colors.White.B)
            currentLED += 1
            LEDs.setLEDRGB(currentLED, Constants.Colors.Pink.R, Constants.Colors.Pink.G, Constants.Colors.Pink.B)
            currentLED += 1
            LEDs.setLEDRGB(currentLED, Constants.Colors.Blue.R, Constants.Colors.Blue.G, Constants.Colors.Blue.B)
            currentLED += 1
            LEDs.setLEDRGB(currentLED, Constants.Colors.Black.R, Constants.Colors.Black.G, Constants.Colors.Black.B)
            currentLED += 1
        }
    }

    override fun execute() {

    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
