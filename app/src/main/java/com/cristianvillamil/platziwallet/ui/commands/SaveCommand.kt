package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter

class SaveCommand : FileCommand {
    override fun execute(context: Context, finaName: String, vararg arguments: String) {
        try {
            var argumentsString = ""
            arguments.forEach { argumentsString = argumentsString + "\n"+it }
            val outputStreamWrite =
                OutputStreamWriter(context.openFileOutput(finaName, Context.MODE_PRIVATE))
            outputStreamWrite.write(argumentsString)
            outputStreamWrite.close()
        } catch (exception: IOException) {
            Log.e("SaveCommand", "File write failed: $exception")
        }
    }
}