package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClientDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public List<UserModel> findAllActives() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT client_id, username, email, phone_number, cat_user_status FROM \"user\" WHERE status = 1";
        List<UserModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<UserModel>() {
                @Override
                public UserModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new UserModel(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
