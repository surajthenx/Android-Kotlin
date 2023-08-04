class Robot(var name: String) {

    /*method to ring alarm*/
    fun ringAlarm(alarmTime: Float) {
        println("* It is ${alarmTime}am time to RISE AND SHINE")
    }

    /*method for yoga*/
    fun startYoga(type: String) {
        println("* Today we are doing $type type of yoga mat is kept ready you can start\n__ remember better health each day __")
    }

    /*method to make coffee*/
    fun makeCoffee(coffee: Coffee) {
        if(coffee.black) {
            println("* Your Black Coffee with ${coffee.sugarCubes} sugar cubes is ready...")
        }
        else {
            println("* Your Coffee with ${coffee.sugarCubes} sugar cubes is ready...")
        }
    }

    /*method to heat water*/
    fun heatWater(temp: Int) {
        println("* Water is heated to $temp degree celcius and towel is kept at the door\nyou can take bath now")
    }

    /*method to pack bags*/
    fun packBag(day: Int) {
        val messageTemp = "* Books need to be kept for today are: "
        val booksList = arrayListOf("SSC", "CGV", "WTA", "DMDW", "MECH", "SSC-Journal", "CGV-Journal", "Android-Journal")

        when(day) {
            2 -> println("$messageTemp ${booksList[0]}, ${booksList[1]}, ${booksList[2]}")
            3 -> println("$messageTemp ${booksList[1]}, ${booksList[3]}, ${booksList[3]}")
            4 -> println("$messageTemp ${booksList[2]}, ${booksList[4]}, ${booksList[4]}")
            5 -> println("$messageTemp ${booksList[3]}, ${booksList[0]}, ${booksList[5]}")
            6 -> println("$messageTemp ${booksList[4]}, ${booksList[7]}, ${booksList[6]}")
            7 -> println("$messageTemp ${booksList[5]}, ${booksList[5]}, ${booksList[7]}")
            else -> println("* Today is holiday No need to pack the bag")
        }
    }

    /*method to generate meals*/
    fun makeFood() {
        val breakFastOptions = arrayListOf("Scrambled eggs", "Dosa", "Idli Vada", "Upma")
        val lunchOptions = arrayListOf("Chapati Thali", "Roti Thali", "Chicken-Biryani", "Rice-Sambar")

        println("* In today's menu we have \n__ Breakfast: ${breakFastOptions.random()}\n__ Lunch: ${lunchOptions.random()}")
        println(message = "__ Happy meals sir!! __")
    }

    /* method to get clothes ready */
    fun getClothes(shirt: String, pants:String) {
        val availableShirts = arrayListOf("Green", "Blue", "White", "Red", "Yellow")
        val availablePants = arrayListOf("Blue-jeans", "White", "Black", "Khaki")

        if(availableShirts.contains(shirt)) {
            if(availablePants.contains(pants)) {
                println("* Clothes are IRONED and kept ready...")
            } else {
                println("!! This trousers are not available choose other or buy new one")
            }
        } else {
            println("!! This color shirt is not available consider updating the wardrobe")
        }
    }

}