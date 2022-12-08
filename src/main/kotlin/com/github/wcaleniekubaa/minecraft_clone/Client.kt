package com.github.wcaleniekubaa.minecraft_clone

import com.github.wcaleniekubaa.minecraft_clone.window.Window
import org.lwjgl.glfw.GLFW.*

object Client {
    lateinit var window: Window
    @JvmStatic
    fun initializeClient() {
        window = Window(854, 480, "Minecraft-Clone")

        while(!glfwWindowShouldClose(window.handle)) {
            runLoop()

            glfwSwapBuffers(window.handle)
            glfwPollEvents()
        }

        glfwTerminate()
    }

    @JvmStatic
    private fun runLoop() {


    }
}