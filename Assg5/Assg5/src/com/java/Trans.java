package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;


public class Trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 trad s=new trad("shreya","kolkata");
		 trad s1=new  trad("shibani","pune");
		 trad s2=new  trad("sak","mysuru");
		List< trad>l=new ArrayList<>();
		l.add(s);
		l.add(s1);
		l.add(s2);
//		                   l.stream()
//		                  .filter(i->i.city=="Pune")
//		                  .sorted((i,j)->i.name.compareTo(j.name))
//		                  .forEach(System.out::println);
	
	}
}
class trad 
{


String name;
String city;

public  trad(String name,String city) {
	this.name= name;
	this.city=city;
	
}
public String toString(){
	return "name:"+name+ " "+"city:" +city ;
}
	
}
