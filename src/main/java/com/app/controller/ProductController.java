package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	@ResponseBody
	public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO product) {

		ProductDTO createProduct = productService.createProduct(product);

		return new ResponseEntity<ProductDTO>(createProduct,HttpStatus.CREATED);

	}

	// viewProduct
	@RequestMapping("/viewAll")
	public ResponseEntity<List<ProductDTO>> viewAllProduct() {
	    List<ProductDTO> viewAll = productService.viewAll();

	    return new ResponseEntity<>(viewAll, HttpStatus.OK); 
	}


	// view productById
	@GetMapping("view/{productId}")
	public ResponseEntity<ProductDTO> viewProductById(@PathVariable int productId) {
		ProductDTO viewProductById = productService.viewProductById(productId);
		return new ResponseEntity<ProductDTO>(viewProductById,HttpStatus.OK);
	}

	// delete productById
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Successfully Deleted",HttpStatus.OK);
	}

	// updateProductById
	@PutMapping("/update/{productId}")
	public ResponseEntity<ProductDTO> updateProduct(@PathVariable int productId, @RequestBody ProductDTO updatedProduct) {
		ProductDTO updated = productService.updateProduct(productId, updatedProduct);
		return new ResponseEntity<ProductDTO>(updated,HttpStatus.ACCEPTED);
	}

}
