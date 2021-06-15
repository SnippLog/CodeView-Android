package io.github.kbiakov.codeviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.kbiakov.codeview.CodeView

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listings)

        findViewById<CodeView>(R.id.code_view).setCode(kotlinCode, "kt")
    }

    private val kotlinCode =
            """
                package org.kotlinlang.play         // 1
                
                fun main() {
                    cases("Hello")
                    cases(1)
                    cases(0L)
                    cases(MyClass())
                    cases("hello")
                }

                fun main() {                        // 2
                    println("Hello, World!")        // 3
                }
                
                infix fun Int.times(str: String) = str.repeat(this)        // 1
                println(2 times "Bye ")
                
                val sophia = Person("Sophia")
                
                class Person(val name: String) {
                  val likedPeople = mutableListOf<Person>()
                  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
                }
                
                operator fun Int.times(str: String) = str.repeat(this)       // 1
                
                operator fun String.get(range: IntRange) = substring(range)  // 3
                
                fun printAll(vararg messages: String) {                            // 1
                    for (m in messages) println(m)
                }
                
                var e: Int  // 1
                
                if (someCondition()) {
                    d = 1   // 2
                } else {
                    d = 2   // 2
                }
                
                override fun toString() = 'MutableStack()'
                
                open class Dog {                // 1
                    open fun sayHello() {       // 2
                        println("wow wow!")
                    }
                }
                
                fun cases(obj: Any) {                                
                    when (obj) {                                     // 1   
                        1 -> println("One")                          // 2
                        "Hello" -> println("Greeting")               // 3
                        is Long -> println("Long")                   // 4
                        !is String -> println("Not a string")        // 5
                        else -> println("Unknown")                   // 6
                    }   
                }
                
                enum class State {
                    IDLE, RUNNING, FINISHED                           // 1
                }
                
                sealed class Mammal(val name: String)                                                   // 1

                fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2  
                
                val empty = "test".let {               // 1
                    customPrint(it)                    // 2
                    it.isEmpty()                       // 3
                }
                
                ns?.run {                                                  // 1
                    println("\tis empty? " + isEmpty())                    // 2
                    println("\tlength = length")                           
                    length                                                 // 3
                }
                
                with(configuration) {
                    println("")
                }
                
                val stringDescription = jake.apply {                    // 2
                    name = "Jake"                                       // 3
                    age = 30
                    about = "Android developer"
                }.toString()
                
                val jake = Person("Jake", 30, "Android developer")   // 1
                    .also {                                          // 2 
                        writeCreationLog(it)                         // 3
                    }
                
                class TomAraya(n:String): SoundBehavior by ScreamBehavior(n) // 3
                
                val a: dynamic = "abc"   
                
                external fun alert(msg: String)   // 1
                
            """.trimIndent()
}