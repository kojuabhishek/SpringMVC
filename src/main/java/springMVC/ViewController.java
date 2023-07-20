package springMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springMVC.model.ProductDao;
import springMVC.entity.Product;

@Controller
public class ViewController {
	@Autowired
	ProductDao dao;
	
	@RequestMapping("/products")
	public String products(Model model) {
		model.addAttribute("msg","Hello from Spring web MVC!");
		return "products.jsp";
	}
	
	@RequestMapping("/addProduct")
	public String addproduct() {
		Product pd = new Product(1,"1231sf","dsgf",23123f);
		dao.saveProduct(pd);
		return "done";
	}

}
