

object CIPHER{


	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val E=(c:Char,key:Int,a:String)=>
            a((a.indexOf(c.toUpper)+key)%a.size);

    val D=(c:Char,key:Int,a:String)=>
            a((a.indexOf(c.toUpper)-key)%a.size);


    val cipher=(algo:(Char,Int,String)=>
                Char,s:String,key:Int,a:String)=>
                s.map(algo(_,key,a));


	
	def main(args:Array[String]){
		
        

        println("ENTER 1 FOR ENCRYPTION, ENTER 0 FOR DECRYPTION : ")
        val i = scala.io.StdIn.readInt();

        println("ENTER THE TEXT : ")
        val s = scala.io.StdIn.readLine();

        if(i==1)
        {
            val ct=cipher(E,s,5,alphabet);

            print("ENTERED TEXT IS : ")
            print(s);

            println("\nENCRYPTED TEXT IS : ")
            println(ct);
            

            
        }

        else
        {
            val pt=cipher(D,s,5,alphabet);

            println("ENTERED TEXT IS : ")
            print(s);

            print("\n\nDECRYPTED TEXT IS : ")
            print(pt);
        }

	}
}