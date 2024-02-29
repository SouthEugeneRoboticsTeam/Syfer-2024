package org.sert2521.syfer2024.commands

import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.chargedup2023.subsystems.LEDs
import org.sert2521.syfer2024.Constants
import org.sert2521.syfer2024.EnumColors

class PatternLEDs : Command() {
var currentLED:Int = 0

    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(LEDs)
    }

    fun setIncrimentColor(color:EnumColors){
        LEDs.setLEDRGB(currentLED, Constants.Colors.colors[color]!![0], Constants.Colors.colors[color]!![1], Constants.Colors.colors[color]!![2])
        currentLED += 1
    }

    fun transLights(){
        for(i in 1..(Constants.PhysicalConstants.LED_LENGTH/6)){
            setIncrimentColor(EnumColors.kTransBlue)
            setIncrimentColor(EnumColors.kTransPink)
            setIncrimentColor(EnumColors.kWhite)
            setIncrimentColor(EnumColors.kTransPink)
            setIncrimentColor(EnumColors.kTransBlue)
            setIncrimentColor(EnumColors.kBlack)
        }
    }

    fun rainbow(){
        for(i in 1..Constants.PhysicalConstants.LED_LENGTH/6) {
            setIncrimentColor(EnumColors.kRed)
            setIncrimentColor(EnumColors.kOrange)
            setIncrimentColor(EnumColors.kYellow)
            setIncrimentColor(EnumColors.kGreen)
            setIncrimentColor(EnumColors.kBlue)
            setIncrimentColor(EnumColors.kPurple)
        }
    }

    override fun initialize() {
        transLights()
    }

    override fun execute() {

    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
