import scala.io.Source

var col:Int = 0
var row:Int = 0

var fname = "/Users/alex/Library/Mobile Documents/com~apple~CloudDocs/UiA/DAT233 P.Konsepter/slantJuice/src/main/scala/puzzle_unsolved.txt"
for(line <- Source.fromFile(fname).getLines) {
  row = line.length
  col+=1
  println(line)
}

abstract class SuperNum{
  var value:Char = 0
  var x:Int = 0
  var y:Int = 0
  var check:String = ""
  var OH:SuperNum = null
}

class Slant extends SuperNum{
  this.value
  this.x
  this.y
  this.check = "Slant"
  this.OH

}

class Number extends SuperNum{
  this.value
  this.x
  this.y
  this.check = "Number"
  var UpRight = false
  var UpLeft = false
  var DownRight = false
  var DownLeft = false
}

print("Cols: " +col+"\nRows: "+row)

var str:Array[String] = Source.fromFile(fname).getLines().toArray
var mapArr = Array.ofDim[SuperNum](row, col)

def createObj(k: SuperNum, i:Int,j:Int, stri:String): SuperNum ={
  k.x = j
  k.y = i
  if (j < stri.length)
    k.value = stri(j)
  else
    k.value = ' '
  return k
}

for(i <- 0 until row) {
  val stri = str(i)
  for (j <- 0 until col)
    if (stri(i) != ' ')
      if(stri(i) == 'x'){
        val k = new Slant
        mapArr(i)(j) = createObj(k,i,j, stri)
      } else {
        val k = new Number
        mapArr(i)(j) = createObj(k,i,j, stri)
      }
}

println(mapArr(0)(0).check)
println(mapArr(1)(0).x)
println(mapArr(1)(0).y)

println(mapArr(1)(1).check)
println(mapArr(2)(2).x)
println(mapArr(2)(2).y)

//if(mapArr(i)(j).)