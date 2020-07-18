package xin.leiguang.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.leiguang.sell.dataobject.ProductInfo;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
