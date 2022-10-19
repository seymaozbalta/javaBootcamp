package dataAccess;

import entities.Categories;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Categories category) {
		System.out.println("Kategori jdbc ile eklendi");
	}
}
