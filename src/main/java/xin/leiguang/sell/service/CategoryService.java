package xin.leiguang.sell.service;

import xin.leiguang.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    public ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> catetoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
