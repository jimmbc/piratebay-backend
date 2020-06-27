package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.ProductDao;
import bo.edu.ucb.sis.piratebay.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductBl {
    private ProductDao productDao;

    @Autowired
    public ProductBl(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<ProductModel> findAllActives() {
        return this.productDao.findAllActives();
    }
}
