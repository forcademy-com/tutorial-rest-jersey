package com.forcademy.tutorial.restapi;

import javax.xml.bind.annotation.XmlRootElement;

/**
* A simple class describing a Cat. 
*
* @author  forcademy
* @version 1.0
* @since   2020-03-24
*/
@XmlRootElement
public class Cat {

	/**
	 * The name, age and weight of the Cat.
	 */
	private String name;
	private int age;
	private double weight;
	
	/**
	 * Creates an empty Cat.
	 * IMPORTANT: Jersey forces classes to have an empty constructor.
	 */
	public Cat() {}
	
	/**
	 * Creates a new Cat with the given id, name, age and weight.
	 */
	public Cat(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
