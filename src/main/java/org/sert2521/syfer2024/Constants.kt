package org.sert2521.syfer2024

/*
 * The Constants file provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This file should not be used for any other purpose.
 * All String, Boolean, and numeric (Int, Long, Float, Double) constants should use
 * `const` definitions. Other constant types should use `val` definitions.
 */

enum class EnumColors{
    kTransBlue,
    kTransPink,
    kWhite,
    kBlack
}

object Constants
{
    object OperatorConstants {
        const val DRIVER_CONTROLLER_PORT = 0
    }

    object PhysicalConstants{
        val LED_LENGTH:Int = 37
    }

    object ElectronicIDs{
        const val LIMIT_SWITCH = 0
        const val BEAM_BREAK = 2
        const val READ_SWITCH = 9 //Magnet thingy
        const val LED_STRIP = 2
    }

    object Colors{
        val colors = mapOf(
            EnumColors.kTransBlue to arrayOf(96/2, 201/2, 250/2),
            EnumColors.kTransPink to arrayOf(245, 169/2, 184/2),
            EnumColors.kWhite to arrayOf(255/2, 255/2, 245/2), //B is a little lower because color theory
            EnumColors.kBlack to arrayOf(0, 0, 0)
        )
    }

}



