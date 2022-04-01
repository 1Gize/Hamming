import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Hamming._
class HammingSpec extends AnyFlatSpec with should.Matchers {
//  def countHam(s1: String,s2: String) ={
//  7
//}
  it should "return " in {
    count("GAGCCTACTAACGGGAT","CATCGTAATGACGGCCT") shouldBe 7
  }
}
