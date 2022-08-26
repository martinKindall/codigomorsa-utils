package org.codigomorsa.utils

import java.io.BufferedReader
import java.io.InputStreamReader


object Utils {
//    @JvmStatic
//    fun main(args: Array<String>) {
//        print("holiwi")
//        print(2)
//        print(2.0)
//        val nombre = input("hola cual es tu nombre?: ")
//        print("Mucho gusto $nombre")
//    }

    private val teclado = BufferedReader(InputStreamReader(System.`in`))

    fun input(x: String): String {
        print(x)
        return try {
            teclado.readLine()
        } catch (e: Exception) {
            throw Error("Error reading keyboard input")
        }
    }

    fun inputInt(x: String = ""): Int {
        return input(x).toInt()
    }

    fun readDouble(x: String): Double {
        return input(x).toDouble()
    }

    fun inputDouble(): Double {
        return readDouble("")
    }

    fun print(x: String) {
        System.out.print(x)
    }

    fun print(x: Int) {
        System.out.print(x)
    }

    fun print(x: Double) {
        System.out.print(x)
    }

    fun println(x: String) {
        System.out.println(x)
    }

    fun println(x: Int) {
        System.out.println(x)
    }

    fun println(x: Double) {
        System.out.println(x)
    }
}
