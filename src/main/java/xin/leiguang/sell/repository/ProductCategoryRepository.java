package xin.leiguang.sell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.leiguang.sell.dataobject.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
