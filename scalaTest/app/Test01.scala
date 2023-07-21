import scala.io.StdIn._

object Test01 {
    def main(args: Array[String]): Unit = {
        print("数値１：")
        var n1 = readInt()
        print("数値２：")
        var n2 = readInt()

        println("足し算："+ (n1 + n2))
    }
}