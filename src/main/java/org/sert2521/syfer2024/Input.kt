package org.sert2521.syfer2024

import edu.wpi.first.wpilibj2.command.button.Trigger
import org.sert2521.syfer2024.commands.LEDTest
import org.sert2521.syfer2024.commands.PatternLEDs
import org.sert2521.syfer2024.commands.PrintDIO
import org.sert2521.syfer2024.subsystems.DIO


object Input {
    private var limitSwitch = Trigger{
        DIO.getLimitSwitch()
    }
    init{
        limitSwitch.whileTrue(LEDTest())
    }
}