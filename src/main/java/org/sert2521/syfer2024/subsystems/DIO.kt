package org.sert2521.syfer2024.subsystems

import edu.wpi.first.wpilibj.DigitalInput
import edu.wpi.first.wpilibj2.command.Subsystem;
import org.sert2521.syfer2024.Constants

object DIO : Subsystem {
    private val limitSwitch = DigitalInput(Constants.ElectronicIDs.LIMIT_SWITCH)
    private val reedSwitch = DigitalInput(Constants.ElectronicIDs.REED_SWITCH)
    private val beamBreak = DigitalInput(Constants.ElectronicIDs.BEAM_BREAK)

    fun getLimitSwitch() :Boolean {
        return !limitSwitch.get()
    }

    fun getReedSwitch() :Boolean {
        return !reedSwitch.get()
    }

    fun getBeamBreak() :Boolean {
        return beamBreak.get()
    }
}