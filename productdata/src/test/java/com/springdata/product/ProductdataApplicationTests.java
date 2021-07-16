package com.springdata.product;

import com.springdata.product.Model.product;
import com.springdata.product.Repositories.ProductRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductdataApplicationTests {

	@Autowired
  ProductRepo repo;



	@Test
	void contextLoads() {
	}
	public void testCreate(){

	product pro = new product();
		pro.setId(1);
		pro.setName("iphone");
		pro.setPrice(20000d);
		pro.setDecs("awesome phone");

		repo.save(pro);

	}
 @Test
  public void testRead(){
	 product prod = repo.findById(1).get();
	 assertNotNull(prod);
	 assertEquals("iphone",prod.getName());
  }

}
