package com.cristianvillamil.platziwallet

class UserSingleton {
    val userName = "Jackson"
    companion object {
        private var instance: UserSingleton? = null
        fun getInstace(): UserSingleton {
            if (instance == null) {
                instance = UserSingleton()
            }
            return instance as UserSingleton
        }
    }
}