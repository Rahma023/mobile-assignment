fun main() {
string()
introduction("rahma", 21)
none()
    myself("rahma")

}
fun string(){
    val text="akirachix"
    println(text[0])
    println(text[2])
    println(text[3])
}
fun introduction(name:String, age:Int){
    val sentence=("Hi, my name is $name and i am $age years old.")
    println(sentence)
}
fun none(){
    var a="tree"
    println(a.length)
}
fun myself(name:String){
    if(name=="rahma"){
    println("That's me!")
}
else{
    println("i don't know who that is")

    }}