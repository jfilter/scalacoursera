package week01

object session {
	def abs(x: Double): Double =
		if (x < 0) -x
		else x                            //> abs: (x: Double)Double

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x) < 0.001                //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double): Double =
  	(guess + x / guess) / 2                   //> improve: (guess: Double, x: Double)Double
  	
  def sqrt(x: Double): Double =
  	sqrtIter(1.0, x)                          //> sqrt: (x: Double)Double
  	
  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(59)                                        //> res1: Double = 7.681146556937517
}