package com.projectFinal.kingsmanOne.controllers;

import com.projectFinal.kingsmanOne.domain.Product;
import com.projectFinal.kingsmanOne.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
@Controller
public class DeleteProductController {

    @Autowired
    private ProductsRepository repo;


    @GetMapping("/delete")
    public String deleteProduct(
            @RequestParam int id
    ){
        try{
            Product product = repo.findById(id).get();
            //Delete Product image
            Path imagePath = Paths.get("public/images/" + product.getImageFileName());

            try {
                Files.delete(imagePath);
            }
            catch (Exception ex){
                System.out.println("Exception: " + ex.getMessage());
            }

            //delete product
            repo.delete(product);

        }
        catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        return "redirect:/products";
    }
}
