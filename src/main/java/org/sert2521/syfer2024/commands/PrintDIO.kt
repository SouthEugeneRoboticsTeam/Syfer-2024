package org.sert2521.syfer2024.commands

import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.syfer2024.subsystems.DIO

class PrintDIO : Command() {


    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements()
    }

    override fun initialize() {}

    override fun execute() {
        //val limitSwitchState = DIO.getLimitSwitch()
        val readSwitchState = DIO.getReadSwitch()
        val beamBreakState = DIO.getBeamBreak()
        println("$readSwitchState $beamBreakState")
    }

    override fun isFinished(): Boolean {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false
    }

    override fun end(interrupted: Boolean) {}
}
