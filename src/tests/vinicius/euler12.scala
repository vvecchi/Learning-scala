package tests.vinicius

object euler12 {
  
  
	 
def numberOfDivisors(number:Int):Int = {
  var divisors = 1//starting with 1 so I can skip self on the for loop
  for (i<- 1 until number){
   if(number%i == 0){
     divisors = divisors + 1
   }
  }
  divisors
}

def triangleDivisors(number:Int, position:Int):Int = {
  if(numberOfDivisors(number) >= 500){
    number
  }
  else{
    triangleDivisors(number + position + 1,position +1)
  }
}
  
  def main(args: Array[String]): Unit = {  
    print("number with over 50 divisors: " + triangleDivisors(1,1))
  }

}