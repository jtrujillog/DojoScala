object WorksheetPruebas {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
	//Julian Trujillo Gallego
	val lista = List(1,2,3,4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(28); 
	val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(42); 
	val mapa = Map(1 -> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(25); val res$0 = 
  
  lista.map{x => x+3};System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(48); val res$1 = 
  //La forma reducida es lista.map{_+3}
 	lista;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(25); val res$2 = 
 	lista.filter{x => x<3};System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(48); 
 	
 	val names = List("Juan","Carlos","Andres");System.out.println("""names  : List[String] = """ + $show(names ));$skip(24); val res$3 = 
 	names.map{_.length()};System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(64); 
 	//Kata1 -> Encontrar los pares
 	val pares = List.range(1,20);System.out.println("""pares  : List[Int] = """ + $show(pares ));$skip(24); val res$4 = 
 	pares.filter{_%2 ==0};System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(156); 
 	
 	//Kata 2 -> Encontrar los datos de una persona dado el nombre
 	val megaLista=List(List("Andres", "24 years", "male"),List("Luz","29 years","female"));System.out.println("""megaLista  : List[List[String]] = """ + $show(megaLista ));$skip(55); val res$5 = 
  megaLista.filter{x => x(0)=="Andres"}.map{x => x(1)};System.out.println("""res5: List[String] = """ + $show(res$5));$skip(93); 
  
	//Kata 3 -> Encontrar todos los numeros primos de una lista
	val list = List.range(1,20);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(88); val res$6 = 
	list.filter{x => list.filter{y => y <= Math.sqrt(x)}.filter{z => x%z == 0}.length==1 };System.out.println("""res6: List[Int] = """ + $show(res$6))}
	
}
