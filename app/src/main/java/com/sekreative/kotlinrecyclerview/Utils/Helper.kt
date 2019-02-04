package com.sekreative.kotlinrecyclerview

/**
 * Created by Aayush on 02/05/2019
 */

class Helper{
    companion object {
        fun <ArrayList> getVersionsList(): ArrayList {
            var continent = ArrayList<Contenent>()
            continent.add(Contenent(R.drawable.asia, "Asia", "Taj Mahal"))
            continent.add(Contenent(R.drawable.america, "America", "Statue of Liberty"))
            continent.add(Contenent(R.drawable.africa, "Africa", "Table Mountain"))
            continent.add(Contenent(R.drawable.australia, "Australia", "Sydney Opera House"))
            continent.add(Contenent(R.drawable.antartica, "Antartica", "Well, find it out!"))
            continent.add(Contenent(R.drawable.europe, "Europe", "Eiffel Tower"))
            continent.add(Contenent(R.drawable.asia, "Asia", "Taj Mahal"))
            continent.add(Contenent(R.drawable.america, "America", "Statue of Liberty"))
            continent.add(Contenent(R.drawable.africa, "Africa", "Table Mountain"))
            continent.add(Contenent(R.drawable.australia, "Australia", "Sydney Opera House"))
            continent.add(Contenent(R.drawable.antartica, "Antartica", "Well, find it out!"))
            continent.add(Contenent(R.drawable.europe, "Europe", "Eiffel Tower"))

            return continent as ArrayList
        }
    }
}
