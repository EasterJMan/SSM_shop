package com.shop.service;

import java.util.List;

import com.shop.Utils.PageBean;
import com.shop.po.Product;


public interface ProductService {
//查询热门商品
	public List<Product> findHotProduct() throws Exception;
//查询最新商品
	public List<Product> findNewProduct() throws Exception;
//根据关键词搜索商品
	public List<Product> searchProduct(String condition) throws Exception;
//	根据id查找商品
	public Product productFindByPid(int pid) throws Exception;
//	根据cid查找商品
	public PageBean<Product> findProductyBycid(int cid,int page) throws Exception;
//	根据csid来查询商品
	public PageBean<Product> finbProductByCsid(int csid, int page);
//	根据id查商品
	public Product finbProductByPid(int pid);
//	分页查找所有的商品
	public PageBean<Product> findAllProduct(int page) throws Exception;
//	添加新增的商品
	public void adminProduct_save(Product product)throws Exception;
//	删除商品
	public void adminProduct_deletecs(int pid)throws Exception;
//	修改商品
	public void adminProduct_update(Product product)throws Exception;
}
