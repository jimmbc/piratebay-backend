package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public List<ProductModel> findAllActives() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT user_id, username, email, phone_number, cat_user_status FROM \"user\" WHERE status = 1";
        List<ProductModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<ProductModel>() {
                @Override
                public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new ProductModel(resultSet.getInt(1),
                            resultSet.getDate(2),
                            resultSet.getString(3),
                            resultSet.getString(4));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
