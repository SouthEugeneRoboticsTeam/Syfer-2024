package org.sert2521.chargedup2023.subsystems

import edu.wpi.first.wpilibj.AddressableLED
import edu.wpi.first.wpilibj.AddressableLEDBuffer
import edu.wpi.first.wpilibj.PWM
import edu.wpi.first.wpilibj.RobotController
import edu.wpi.first.wpilibj2.command.SubsystemBase
import org.sert2521.syfer2024.Constants
object LEDs : SubsystemBase() {
    private val ledStrip = AddressableLED(Constants.ElectronicIDs.LED_STRIP)
    private var ledBuffer = AddressableLEDBuffer(Constants.PhysicalConstants.LED_LENGTH)

    init {
        ledStrip.setLength(Constants.PhysicalConstants.LED_LENGTH)
        ledStrip.start()
    }

    fun setLEDRGB(i: Int, r: Int, g: Int, b: Int) {
        ledBuffer.setRGB(i, r, g, b)
    }

    fun setLEDHSV(i: Int, h: Int, s: Int, v: Int) {
        ledBuffer.setHSV(i, h, s, v)
    }

    fun setAllLEDRGB(r: Int, g: Int, b: Int) {
        for (i in 1..Constants.PhysicalConstants.LED_LENGTH) {
            setLEDRGB(i, r, g, b)
        }
    }

    fun setAllLEDHSV(h: Int, s: Int, v: Int) {
        for (i in 0..Constants.PhysicalConstants.LED_LENGTH - 1) {
            setLEDHSV(i, h, s, v)
        }
    }

    override fun periodic() {
        ledStrip.setData(ledBuffer)
    }

        /*    fun update() {
        if (RobotController.getBatteryVoltage() <= ConfigConstants.preLEDBrownOutVoltage) {
            setAllLEDRGB(0, 0, 0)
        }
        ledStrip.setData(ledBuffer)
    }


    override fun periodic(){
        update()
    }

    fun reset() {
        ledBuffer = AddressableLEDBuffer(Constants.PhysicalConstants.LED_LENGTH)
        update()
    } */

}