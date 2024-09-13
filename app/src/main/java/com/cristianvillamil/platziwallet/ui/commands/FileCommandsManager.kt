package com.cristianvillamil.platziwallet.ui.commands

class FileCommandsManager {

    private val commands: HashMap<String, FileCommand> = HashMap()

    fun putCommand(commandName: String, fileCommand: FileCommand) {
        commands[commandName] = fileCommand
    }

    fun getCommand(commandName: String) : FileCommand {
        if(commands.containsKey(commandName)) {
            return commands[commandName]!!
        } else {
            throw RuntimeException("command $commandName no esta registrado")
        }
    }
}