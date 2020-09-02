fun main() {

    val size = Point(4, 2)
    val position = Point(1, 6)

    val r1 = Rectangle(size, position)
    val r2 = Rectangle(Point(3,2), Point(3,4))

    val answer = r1.checkCollision(r2)
    println("Kollision : $answer")

    println("bredd: ${r1.size.x}, höjd: ${r1.size.y} ")

    val perimeterR1 = r1.perimeter()

    println("Omkrets: ${perimeterR1}")


}