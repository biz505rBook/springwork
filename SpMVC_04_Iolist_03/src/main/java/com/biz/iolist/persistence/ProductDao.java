package com.biz.iolist.persistence;

import java.util.List;

import com.biz.iolist.domain.ProductDTO;

public interface ProductDao {

	public List<ProductDTO> selectAll();
	public List<ProductDTO> findAll();
	
	public String getPCode();
	public int insert(ProductDTO proDTO);
	public ProductDTO findByPCode(String p_code);
	public int delete(String p_code);
	public int update(ProductDTO proDTO);

}
