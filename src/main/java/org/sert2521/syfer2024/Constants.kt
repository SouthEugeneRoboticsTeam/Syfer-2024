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

    kGrey,
    kWhite,
    kBlack,

    kRed,
    kOrange,
    kYellow,
    kGreen,
    kTeal,
    kBlue,
    kPurple,
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
        const val REED_SWITCH = 9 //Magnet thingy
        const val LED_STRIP = 2
    }

    object Colors{
        val colors = mapOf( //EXAMPLE:  EnumColors.k[color] to arrayOf(R, G, B),
            EnumColors.kTransBlue to arrayOf(96/2, 201/2, 250/2),
            EnumColors.kTransPink to arrayOf(255/2, 169/4, 184/4),

            EnumColors.kWhite to arrayOf(255/2, 255/2, 245/2), //B is a little lower because color theory
            //EnumColors.kGrey to arrayOf(123, 123, 120),
            EnumColors.kBlack to arrayOf(0, 0, 0),

            EnumColors.kRed to arrayOf(255/20, 0, 0),
            EnumColors.kOrange to arrayOf(255/20, 128/20, 0),
            EnumColors.kYellow to arrayOf(255/20, 255/20, 0),
            EnumColors.kGreen to arrayOf(0, 255/20, 0),
            EnumColors.kTeal to arrayOf(0, 128/20, 128/20),
            EnumColors.kBlue to arrayOf(0, 0, 255/20),
            EnumColors.kPurple to arrayOf(148/20, 0, 211/20),


        )
    }

}



