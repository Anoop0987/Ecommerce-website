package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Product;
import com.example.demo.repository.ProdRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProdRepository repo;

	public List<Product> getAllProducts(){
		 return repo.findAll();
	}

	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}

	public Product addProduct(Product product, MultipartFile imageFile) throws Exception {
	    product.setImageName(imageFile.getOriginalFilename());
	    product.setImageType(imageFile.getContentType());
	    product.setImageData(imageFile.getBytes());
	    return repo.save(product);
	}}