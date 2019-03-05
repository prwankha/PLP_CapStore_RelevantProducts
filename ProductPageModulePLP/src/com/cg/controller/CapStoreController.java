package com.cg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.Product;
import com.cg.service.CapStoreService;

@Controller
public class CapStoreController {
	ArrayList<String>category=null;
	@Autowired
	CapStoreService capStoreService=null;

	public CapStoreService getCapStoreService() {
		return capStoreService;
	}

	public void setCapStoreService(CapStoreService capStoreService) {
		this.capStoreService = capStoreService;
	}

	@RequestMapping(value="Search", method=RequestMethod.GET)
	public String Display(Model model) {
		model.addAttribute("product",new Product());
		category=new ArrayList<>();
		category.add("Electronics");
		category.add("Garments");
		category.add("Watches");
		category.add("Fitness");
		category.add("Eatables");
		model.addAttribute("category",category);
		return "Showsearch";
	}
	@RequestMapping(value="/displayProduct1",method=RequestMethod.POST)
	public String displayUser(Model model,@RequestParam(value="namesearch") String namesearch,@ModelAttribute(value="product") Product product) {
		Product productDummy=new Product();
		if(product.getCategory()!=null) {
			String nameCatg=product.getCategory();
			List<Product> products1=capStoreService.findProductByCategory(nameCatg);
			List<String> types=capStoreService.findTypes(nameCatg);
			productDummy.setCategory(nameCatg);
			model.addAttribute("productsCategory", products1);
			model.addAttribute("productDummy", productDummy);
			model.addAttribute("types", types);
			return  "displayProduct1";
		}
		else {
			if(!capStoreService.namesearch(namesearch)&&namesearch!=null) {
				model.addAttribute("message", "Product Not found");
				return "displayProduct1";}
			else {
				List<Product> products=capStoreService.findProductByName(namesearch);
				model.addAttribute("products", products);
				return "displayProduct1";
			}
		}
	}
	@RequestMapping(value="/displaySimilarProduct",method=RequestMethod.POST)
	public String displayUser(Model model,@ModelAttribute(value="product")Product product) {
		String type=product.getType();
		String category=product.getCategory();
		List<Product> products1=capStoreService.similarProducts(type, category);
		model.addAttribute("similar", products1);
		return  "SimilarProducts";

	}

}
