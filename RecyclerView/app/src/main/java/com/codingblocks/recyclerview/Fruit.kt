package com.codingblocks.recyclerview

import kotlin.random.Random

data class Fruit (
    val name : String,
    val origin: String,
    val quantity: Int
        ){
    companion object{
        @JvmField
        val FRUIT_NAMES = arrayOf("Apple","Mango","Pineapple","Strawberry",
        "Guava","Banana","Kiwi","Grapes"
        )
        @JvmField
        val ORIGINS = arrayOf(
            "Lucknow","Nagpur","Srinagar","Patna","Mysore"
        )
        @JvmStatic
        fun genRandomFruits(n: Int):ArrayList<Fruit>{
            val fruitArray =ArrayList<Fruit>(n)
            for(i in 1..n){
                fruitArray.add(
                    Fruit(
                FRUIT_NAMES[Random.nextInt(8)],
                    ORIGINS[Random.nextInt(5)],
                    Random.nextInt(10)*100
                )
                )
            }
            return fruitArray
        }
    }
}