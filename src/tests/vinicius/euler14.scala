package tests.vinicius

object main{
  
  def seqLen(number:Long):Long = {
	 number match{
	    case 1 => {
	      1
	    }
	    case _ =>{
	      number%2 match{
	        case 0 =>{
	          seqLen(number/2)+1
	          
	        }
	        case 1 =>{
	          seqLen(3*number+1)+1
	        }
	      }
	    }
	  }
	}
	
  def main(args: Array[String]) {
    var maxLen = 0:Long
    var index = -1
    for(i<- 1 until 1000000){
      var len = seqLen(i)
      if(len >maxLen){
        maxLen = len
        index = i
      }
    }
    print(" "+maxLen + " index: " + index)
  }
}