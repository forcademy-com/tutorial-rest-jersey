package com.forcademy.tutorial.restapi;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

/**
* A repository of Cats, acts as a database containing Cats. 
*
* @author  forcademy
* @version 1.0
* @since   2020-03-24
*/
public class CatRepository {
	
	/**
	 * Currently available id for each Cat. 
	 * All Cats have an unique id.
	 */
	private int id = 1;
	
	/**
	 * A list that keeps Cats.
	 */
	private Map<Integer, Cat> cats = new HashMap<Integer, Cat>();
	
	/**
	 * Creates a repository with two example Cats.
	 */
	public CatRepository() {
		Cat cat1 = new Cat("John", 2, 2);
		Cat cat2 = new Cat("Miles", 5, 3);
		cats.put(id++, cat1);
		cats.put(id++, cat2);
	}
	
	/**
	 * @param index of the cat
	 * @return a cat for the given index
	 */
	public Cat getCat(int index) {
		return cats.get(index);
	}
	
	/**
	 * @param the cat to add
	 */
	public void addCat(Cat cat) {
		this.cats.put(id++, cat);
	}
	
	/**
	 * @param index of the cat
	 * @param the cat to add
	 */
	public void setCat(int index, Cat cat) {
		this.cats.put(index, cat);
	}
	
	/**
	 * @param index of the cat to delete
	 */
	public void deleteCat(int index) {
		this.cats.remove(index);
	}
	
	/**
	 * @return the cats
	 */
	public Collection<Cat> getCats() {
		return cats.values();
	}
	
}
