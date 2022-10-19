package business;



import java.util.List;

import dataAccess.CategoryDao;
import entities.Categories;
import javaNlayeredHomework.core.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Categories> categories;


	public CategoryManager(CategoryDao categoryDao,Logger[] loggers, List<Categories> categories) {

		this.categoryDao = categoryDao;
		this.loggers=loggers;
		this.categories=categories;
	}


	public void add(Categories category) throws Exception {
		//kategori ismi tekrar edemez kodu
		for(Categories newCategoryName:categories) {
			if(categories.getCategoryName()==newCategoryName.getCategoryName()) {
				throw new Exception("Kategori adı tekrar edemez");
			}
		}
		
		//newlenecek
		//add ekle
	}
}
