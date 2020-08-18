package com.acoria.dagger2.test

fun main() {

    val withSomeValue = WithSomeValue()
    println(withSomeValue.someValue)
    println(withSomeValue.someValue)
    println(withSomeValue.someValue)

}

interface IWithSomeValue{
    val someValue: Int
}

class WithSomeValue() : IWithSomeValue {
    override val someValue: Int
            get() = kotlin.random.Random.Default.nextInt()
}