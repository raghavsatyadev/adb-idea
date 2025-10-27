package io.github.raghavsatyadev.adbidea.adb

object ShellCommandsFactory {

    @JvmStatic
    fun startActivity(packageName: String, activityName: String, attachDebugger: Boolean): String {
        val debugFlag = if (attachDebugger) "-D " else ""
        return "am start $debugFlag-n $packageName/$activityName"
    }
}
