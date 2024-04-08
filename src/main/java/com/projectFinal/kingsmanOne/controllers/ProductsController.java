package com.projectFinal.kingsmanOne.controllers;

import com.projectFinal.kingsmanOne.domain.Product;
import com.projectFinal.kingsmanOne.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
/*@RequestMapping("/products")*/
public class ProductsController {

    @Autowired
    private ProductsRepository repo;

    @GetMapping("/products")
    public String showProductList(Model model) {
        List<Product> products = repo.findAll();   /*To have the list arranged in descending order, use (Sort.by(Sort.Direction.Desc, "id")) in findAll parameter;  */
        model.addAttribute("products", products);
        return "index";                                     /*Returns name of html file*/

    }
}