package xin.leiguang.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xin.leiguang.sell.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询在在架的所有商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */


    /**
     * 减库存
     */

}
