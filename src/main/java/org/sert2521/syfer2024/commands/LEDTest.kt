package org.sert2521.syfer2024.commands

import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.chargedup2023.subsystems.LEDs
import org.sert2521.syfer2024.Robot
import org.sert2521.syfer2024.RobotContainer
import java.lang.System.Logger

private var red = 0
private var green = 0
private var blue = 0
private var totalBright = 0

private var redUp = true
private var blueUp = true
private var greenUp = true
class LEDTest : Command() { //Sets all the LEDs to white as a test to see if they work
    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(LEDs)
    }

    override fun initialize() {
    }

    override fun execute() {
        println("$totalBright")
        LEDs.setAllLEDRGB(red, green, blue)

        totalBright = red + green + blue


        if(red >= 250){redUp = false}
        if(green >= 250){greenUp = false}
        if(blue >= 250){blueUp = false}

        if(red <= 5){redUp = true}
        if(green <= 5){greenUp = true}
        if(blue <= 5){blueUp = true}

        if(redUp){red += 5} else {red -= 5}
        if(greenUp){green += 3} else {green -= 3}
        if(blueUp){blue += 2} else {blue -= 2}
    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {
        LEDs.setAllLEDRGB(0, 0, 0)
    }
}
