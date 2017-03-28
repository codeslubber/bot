/**
 *
 *
 * User: robwilliams
 * Date: 3/27/17
 * Time: 8:51 PM
 *
 * (c) ontometrics 2017, All Rights Reserved
 */

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;


class BotTest {

    val calculator = Calculator()

    @Test
    fun testSimpleCalculator(){
        val four = calculator.add(2, 2)

        assertEquals(four, 4)

        val five = calculator.add(2, 3)

        assertEquals(five, 5)
        assert(five > 0)
    }

    @Test
    fun testSubtraction(){
        val one = calculator.subtract(3, 2)

        assertEquals(one, 1)
    }
}

class Calculator(){
    fun add(first:Int, second:Int) : Int {
        return first + second
    }

    fun subtract(first:Int, second:Int) : Int {
        return first - second
    }
}