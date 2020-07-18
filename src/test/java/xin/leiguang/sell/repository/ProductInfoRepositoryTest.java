package xin.leiguang.sell.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.leiguang.sell.dataobject.ProductInfo;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = repository.save(productInfo);
        assertNotNull(result);
    }

    @Test
    void findByProductStatus() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        assertNotEquals(0, productInfoList.size());

    }
}