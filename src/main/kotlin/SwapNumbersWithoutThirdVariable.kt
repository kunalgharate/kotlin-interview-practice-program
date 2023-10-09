
object SwapNumbersWithoutThirdVariable {

    var a = 10;
    var b = 300;
    var c = -100;

    // b = 10 , a = 300,  s2 = b = -100 , c = 10

    fun swapping() {
        a = a * b
        b = a / b
        a = a / b


        b = b * c
        c = b / c
        b = b / c


        print(" a = $a \n b = $b  \n c = $c")
    }


}