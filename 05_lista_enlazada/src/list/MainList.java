/*
 * No es posible crear directamente objetos tipo List ya que no se posee
 * un constructor y de hecho la definicion de un interface no permite
 * crear directamente objetos. Pero es posible utilizarla, por medio del
 * polimorfismo, para contener cualquier objeto de las que clases que 
 * implementen esta interface.
 */
package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("hola");
		linkedList.add("Mundo");		
		
		List<String> list = linkedList;				
		System.out.println(list.get(1));
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("primero");
		arrayList.add("segundo");
		arrayList.add("tercero");
		
		List<String> list2 = arrayList;
		
	}
}
