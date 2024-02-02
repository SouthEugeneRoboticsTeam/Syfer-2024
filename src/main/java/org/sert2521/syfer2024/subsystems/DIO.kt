package org.sert2521.syfer2024.subsystems

import edu.wpi.first.wpilibj.DigitalInput
import edu.wpi.first.wpilibj2.command.Subsystem;
import org.sert2521.syfer2024.Constants

object DIO : Subsystem {
    private val limitSwitch = DigitalInput(Constants.ElectronicIDs.LIMIT_SWITCH)
    private val readSwitch = DigitalInput(Constants.ElectronicIDs.READ_SWITCH)
    private val beamBreak = DigitalInput(Constants.ElectronicIDs.BEAM_BREAK)

    fun getLimitSwitch() :Boolean {
        return limitSwitch.get()
    }

    fun getReadSwitch(){
        readSwitch.get()
    }

    fun getBeamBreak(){
        beamBreak.get()
    }
}