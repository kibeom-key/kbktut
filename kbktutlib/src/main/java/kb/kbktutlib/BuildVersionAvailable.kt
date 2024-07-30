package kb.kbktutlib

import android.os.Build

class BuildVersionAvailable {

    companion object {
        private fun sdk() = Build.VERSION.SDK_INT

        fun m() = sdk() >= Build.VERSION_CODES.M
        fun n() = sdk() >= Build.VERSION_CODES.N
        fun o() = sdk() >= Build.VERSION_CODES.O
        fun p() = sdk() >= Build.VERSION_CODES.P
        fun q() = sdk() >= Build.VERSION_CODES.Q
        fun r() = sdk() >= Build.VERSION_CODES.R
        fun s() = sdk() >= Build.VERSION_CODES.S
        fun t() = sdk() >= Build.VERSION_CODES.TIRAMISU
        fun u() = sdk() >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE

        fun o1() = sdk() >= Build.VERSION_CODES.O_MR1
        fun s2() = sdk() >= Build.VERSION_CODES.S_V2
    }
}