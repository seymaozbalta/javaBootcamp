package dataAccess;

import entities.Categories;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Categories category) {
		System.out.println("Kategori hibernate ile eklendi");
		
	}

}
