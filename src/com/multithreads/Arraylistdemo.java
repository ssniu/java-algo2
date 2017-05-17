package com.multithreads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		/*
		ArrayList a1 = new ArrayList();
		
		Dog d1 = new Dog("aa", 25);
		Dog d2 = new Dog("bb", 35);
		Dog d3 = new Dog("cc", 15);
		
		a1.add(d1);
		a1.add(d2);
		a1.add(d3);
		
		System.out.println(a1.size());
		Dog d4 = (Dog)a1.get(0);
		System.out.println(d4.getName());
		a1.remove(2);
		for(int i = 0; i < a1.size(); i++){
			System.out.println(((Dog) a1.get(i)).getName() + " ");
		}
		*/
		HashMap hm = new HashMap();
		
		Dog d01 = new Dog( "nn", 15);
		Dog d02 = new Dog( "mm", 25);
		Dog d03 = new Dog("xx", 35);
		
		
		hm.put(01, d01);
		hm.put(02, d02);
		hm.put(02, d03);
		hm.put(null, d02);
		/*
		if(hm.containsKey(02)){
			System.out.println("Find it");
			Dog d = (Dog)hm.get(02);
			System.out.println(d.getName());
		}else{
			System.out.println("can not find it");
		}*/
		
		//find all object in hashmap
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()){
			int key = (int) it.next();
			//if key is string
			//String key = it.next().toString();
			Dog d001 = (Dog)hm.get(key);
			System.out.println(d001.getName());
		}
		
		Hashtable ht = new Hashtable();
		
		ht.put(03, d01);
		
		//ArrayList<Dog> a1 = new ArrayList<>();
		//generic -- compile -- 

	}
	
	
}

class Dog{
	
	private String name;
	private int weight;
	

	public Dog(String name, int weight) {
		
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
