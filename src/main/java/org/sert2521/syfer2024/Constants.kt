package org.sert2521.syfer2024

/*
 * The Constants file provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This file should not be used for any other purpose.
 * All String, Boolean, and numeric (Int, Long, Float, Double) constants should use
 * `const` definitions. Other constant types should use `val` definitions.
 */

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
        const val READ_SWITCH = 9
        //const val SHAFT_ENCODER = 8
        const val LED_STRIP = 2

    }

    object Colors{
        object Blue{
            const val R = 96/2
            const val G = 201/2
            const val B = 250/2
        }
        object Pink{
            const val R = 245
            const val G = 169/2
            const val B = 184/2
        }
        object White{
            const val R = 255/2
            const val G = 250/2
            const val B = 254/2
        }
        object Black{
            const val R = 0
            const val G = 0
            const val B = 0
        }
    }

}



