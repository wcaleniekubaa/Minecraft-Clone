package com.github.wcaleniekubaa.minecraft_clone.window

import org.lwjgl.glfw.GLFW.*
import org.lwjgl.opengl.GL11.glViewport

data class Window(
    var width: Int, var height: Int,
    val title: String
) {
    val handle: Long

    init {
        glfwInit()

        handle = glfwCreateWindow(width, height, title, 0, 0)

        glViewport(0, 0, width, height)
        glfwSetFramebufferSizeCallback(handle) { _: Long, width: Int, height: Int -> glViewport(0, 0, width, height) }

    }
}
