import java.util.Calendar

fun main() {
    println(message = "Assignment 1: Personal ROBOT(FRIDAY)")
    println("\n\n")

    val r = Robot("Friday")

    println("__ Good Morning sir! __\n__ This is  ${r.name} your personal assistant __")
    println()

    /* Alarm */
    r.ringAlarm(6.00f)
    println()

    /* Yoga */
    r.startYoga("Breathing")
    println()

    /*coffee */
    val c = Coffee(true, 2)
    r.makeCoffee(c)
    println()

    /*water heater */
    r.heatWater(40)
    println()

    /*preparing bag*/
    r.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    /*time to munch*/
    r.makeFood()
    println()

    /* time to get ready */
    r.getClothes("White", "Black")
    println()

}