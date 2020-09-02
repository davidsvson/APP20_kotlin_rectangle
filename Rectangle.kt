class Rectangle(var size: Point,
                var position: Point) {

    fun perimeter() : Int {
        val perimeter = (size.x * 2) + (size.y * 2)
        return perimeter
    }

    fun checkCollision(rect: Rectangle) : Boolean {
        val topLeft1 = position
        val topLeft2 = rect.position

        val bottomRight1 = Point(position.x + size.x,
                                position.y - size.y)
        val bottomRight2 = Point(rect.position.x + rect.size.x,
                                rect.position.y - rect.size.y)

        // är en rektangel till vänster om den andra
        if(bottomRight1.x < topLeft2.x)
            return false
        if(bottomRight2.x < topLeft1.x)
            return false

        // är en rektangel över den andra
        if ( bottomRight1.y > topLeft2.y)
            return false
        if( bottomRight2.y > topLeft1.y)
            return false

        return true
    }


}

class Point(var x : Int, var y: Int)