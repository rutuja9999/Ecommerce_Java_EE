package com.productservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query(value = "SELECT * FROM ecom_product WHERE product_inventory>0",nativeQuery = true)
	List<Product> getProductsInventoryGreaterThanZero();
	
	@Query(value = "SELECT * FROM ecom_product WHERE product_inventory=0",nativeQuery = true)
	List<Product> getProductsInventoryEqualToZero();
	
	List<Product> findByProductMerchant(String productMerchant);
	
}
