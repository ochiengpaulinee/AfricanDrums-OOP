fun main() {
    var drum=Drum("leather","medium","bass")
    println(drum.makeSound("alto"))
    var drum2=Djembe("cotton","large","metallic")
    println(drum2.makeSound("metallic"))
    var drum3=TalkingDrum("wool","small","loose")
    println(drum3.makeSound("loose"))

    var drum4=Bougarabou("wool","small","loose")
    println(drum4.makeSound("loose"))
}

 open class Drum(var material:String,var size:String,var tone: String){
    open fun makeSound(tone:String):String{
        return "This drum is made of $material of  size $size of $tone tone"
    }
}

class Djembe(material: String,size: String,tone: String):Drum(material,size,tone){
    override fun makeSound(tone:String):String{
        return "The Djembe is of $material and is of $size and produces $tone tone"
    }
}

class TalkingDrum(material: String,size: String,tone: String):Drum(material,size,tone){
    override fun makeSound(tone: String):String{
        return "The Djembe is of $material and is of $size, it produces $tone tone"
    }
}
class Bougarabou(material: String,size: String,tone: String):Drum(material,size,tone){
    override fun makeSound(tone: String):String{
        return "The Bougarabou is of $material and is of $size, it produces $tone tone"
    }
}
