
fun main(){
place()
   pime(arrayOf())
}
fun place(){
  var friends = arrayOf("Ben","Paul","Daniel","Denis","Josephat" ,"Ashley")
    friends.set(2,"Kishoyian")
    println(friends.contentToString())
   friends = friends.plus(arrayOf("Faith","Yiamat","Nakola"))
    println(friends.contentToString())
    friends = friends.sortedArray()
    println(friends.contentToString())
    friends.forEach { x ->
        println(x)
    }
    for(f in friends){
        println(f)
    }
    friends.forEachIndexed { idx, f ->
        if (idx == 1 || idx == 2){
            println(f)
        }

    }
}
fun pime(args :Array<String>, ){
    var num = 68
    var i = 2
    var flag = false
    while(i <= num /2) {
        if (num % i == 0) {
            flag = true
            break
        }
        ++i
    }
    if(!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")




}
