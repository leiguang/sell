package xin.leiguang.sell.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.leiguang.sell.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(3);
        assertEquals(3, productCategory.getCategoryId());
    }

    @Test
    void findAll() throws Exception {
        List<ProductCategory> productCategoryList = categoryService.findAll();
        assertNotEquals(0, productCategoryList.size());
    }

    @Test
    void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(Arrays.asList(3, 5));
        assertNotEquals(0, productCategoryList.size());
    }

    @Test
    void save() {
        ProductCategory productCategory = new ProductCategory("男生专享", 12);
        ProductCategory result = categoryService.save(productCategory);
        assertNotNull(result);
    }
}