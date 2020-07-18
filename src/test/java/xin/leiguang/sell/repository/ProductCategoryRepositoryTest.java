package xin.leiguang.sell.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.leiguang.sell.dataobject.ProductCategory;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        Optional<ProductCategory> optionalProductCategory = repository.findById(3);
        if (optionalProductCategory.isPresent()) {
            ProductCategory productCategory = optionalProductCategory.get();
            System.out.println(productCategory.toString());
        } else {
            System.out.println("null");
        }
    }

    @Test
    @Transactional // 测试完不修改数据库，不造成脏数据
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 6);
        ProductCategory result = repository.save(productCategory);
        assertNotNull(result);
        assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 5, 10);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        assertNotEquals(0, result.size());
    }
}