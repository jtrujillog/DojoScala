object WorksheetPruebas {
	//Julian Trujillo Gallego
	val lista = List(1,2,3,4)                 //> lista  : List[Int] = List(1, 2, 3, 4)
	val set = Set(1,2,3,4,5,1)                //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
	val mapa = Map(1 -> "Luis", 2 -> "Juan")  //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
  
  lista.map{x => x+3}                             //> res0: List[Int] = List(4, 5, 6, 7)
  //La forma reducida es lista.map{_+3}
 	lista                                     //> res1: List[Int] = List(1, 2, 3, 4)
 	lista.filter{x => x<3}                    //> res2: List[Int] = List(1, 2)
 	
 	val names = List("Juan","Carlos","Andres")//> names  : List[String] = List(Juan, Carlos, Andres)
 	names.map{_.length()}                     //> res3: List[Int] = List(4, 6, 6)
 	//Kata1 -> Encontrar los pares
 	val pares = List.range(1,20)              //> pares  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19)
 	pares.filter{_%2 ==0}                     //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18)
 	
 	//Kata 2 -> Encontrar los datos de una persona dado el nombre
 	val megaLista=List(List("Andres", "24 years", "male"),List("Luz","29 years","female"))
                                                  //> megaLista  : List[List[String]] = List(List(Andres, 24 years, male), List(Lu
                                                  //| z, 29 years, female))
  megaLista.filter{x => x(0)=="Andres"}.map{x => x(1)}
                                                  //> res5: List[String] = List(24 years)
  
	//Kata 3 -> Encontrar todos los numeros primos de una lista
	val list = List.range(1,20)               //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 
                                                  //| 16, 17, 18, 19)
	list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length==1 }
                                                  //> res6: List[Int] = List(1, 2, 3, 5, 7, 11, 13, 17, 19)
	
}