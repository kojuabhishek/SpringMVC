package springMVC.model;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springMVC.entity.Product;

public class ProductDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template)
	{
		this.template = template;
	}
	public void saveProduct(Product p) {
		template.save(p);
		
	}
	public void updateProduct(Product p) {
		template.update(p);
		
	}

	public void deleteProduct(Product p) {
		template.delete(p);
		
	}


}
