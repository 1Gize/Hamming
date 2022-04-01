object Hamming {
  def count(s1: String,s2: String) ={
    var difChar = 0
    var x = 0
    while(x < s1.length){
      if(s1(x) != s2(x)){
        difChar = difChar + 1
      }
      x = x + 1
    }
    difChar
  }
}
