package example.myapp

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}

class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):  FishAction by PrintingFishAction("eat algae"), FishColor by fishColor {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
}

