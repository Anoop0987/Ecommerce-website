package com.example.demo.model;

import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	private Long id;
	private String name;	private String description;
	private String brand;	private Double price;
	private String category;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date releaseDate;
	private boolean productAvailable;
	private int stockQuantity;
	
	private String imageName;
	private String imageType;
	
	@Lob
	private byte[] imageData;	public Product() {	}	public Product(Long id, String name, String description, Double price, String category, String brand, Date releaseDate, boolean productAvailable, int stockQuantity, String imageName, String imageType, byte[] imageData) {		this.id = id;		this.name = name;		this.description = description;		this.price = price;
		this.category = category;
		this.brand = brand;
		this.releaseDate = releaseDate;
		this.productAvailable = productAvailable;
		this.stockQuantity = stockQuantity;
		this.imageData = imageData;
		this.imageName = imageName;
		this.imageType = imageType;	}	public Long getId() {		return id;	}	public void setId(Long id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getDescription() {		return description;	}	public void setDescription(String description) {		this.description = description;	}	public Double getPrice() {		return price;	}	public void setPrice(Double price) {		this.price = price;	}

	public String getBrand() {
	    return brand;
	}

	public void setBrand(String brand) {
	    this.brand = brand;
	}

	public String getCategory() {
	    return category;
	}

	public void setCategory(String category) {
	    this.category = category;
	}

	public Date getReleaseDate() {
	    return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
	    this.releaseDate = releaseDate;
	}

	public boolean isProductAvailable() {
	    return productAvailable;
	}

	public void setProductAvailable(boolean productAvailable) {
	    this.productAvailable = productAvailable;
	}

	public int getStockQuantity() {
	    return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
	    this.stockQuantity = stockQuantity;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", releaseDate=" + releaseDate + ", productAvailable="
				+ productAvailable + ", stockQuantity=" + stockQuantity + ", imageName=" + imageName + ", imageType="
				+ imageType + ", imageData=" + Arrays.toString(imageData) + "]";
	}
	}