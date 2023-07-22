package com.example.practicalexamead.controller;

import com.example.practicalexamead.entity.Product;
import com.example.practicalexamead.entity.Sales;
import com.example.practicalexamead.repository.ProductRepository;
import com.example.practicalexamead.repository.SalesRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productsales")
public class ProductSalesController {
    @GetMapping("/productsales")
    public String displayProductSales(Model model) {
        List<Product> products = getProductData();
        List<Sales> sales = getSalesData();

        model.addAttribute("products", products);
        model.addAttribute("sales", sales);

        return "productsales";
    }

    private List<Product> getProductData() {
        return new ArrayList<>();
    }

    private List<Sales> getSalesData() {
        return new ArrayList<>();
    }
}
