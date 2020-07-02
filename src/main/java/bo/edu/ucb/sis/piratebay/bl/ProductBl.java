package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.ProductDao;
import bo.edu.ucb.sis.piratebay.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBl {

    private ProductDao productDao;

    @Autowired
    public ProductBl(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<ProductModel> findAllActives() { return this.productDao.findAllActives();
    }
    public List<ProductModel> findAllActives1() { return this.productDao.findAllActives1();
    }
    public List<ProductModel> findAllActives2() { return this.productDao.findAllActives2();
    }
    public List<ProductModel> findAllActives3() { return this.productDao.findAllActives3();
    }

    public List<ProductModel> Product(Integer r) {
        return this.productDao.Product(r);
    }
    public List<ProductModel> findProductsByOrderId(int orderId) {
        return this.productDao.findProductsByOrderId(orderId);
    }
    /*public ProductModel updateOrder(Integer orderStatus, Integer orderId, Integer userId ) {
        return this.productDao.updateOrder(orderStatus, orderId, userId);
    }*/
}
