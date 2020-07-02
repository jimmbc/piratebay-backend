package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.ProductModel;
import bo.edu.ucb.sis.piratebay.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ProductDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<ProductModel> Product( Integer r) {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        System.out.println(r);
        String query = "SELECT c.product_name, b.quantity\n" +
                "FROM Requisition a, detail b, product c WHERE b.product_product_id=c.product_id and b.Requisition_requisition_id= 8 ";
        List<ProductModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<ProductModel>() {
                @Override
                public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new ProductModel(resultSet.getString(1),
                            resultSet.getInt(2));
                }
            });
        } catch (Exception ex) {
            System.out.println(query);
            System.out.println("7845");
            throw new RuntimeException();
        }
        return result;
    }

    public List<ProductModel> findAllActives() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT a.requisition_id as requisition, a.fecha_pagado as fecha, b.first_name || ' ' || b.first_surname as name, b.address as address " +
                "FROM Requisition a, Client b WHERE a.Client_client_id = b.client_id and a.status= 1";
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
            System.out.println(query);
            System.out.println("7845");
            throw new RuntimeException();
        }
        return result;
    }
    public List<ProductModel> findAllActives1() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT a.requisition_id as requisition, a.fecha_pagado as fecha, b.first_name || ' ' || b.first_surname as name, b.address as address " +
                "FROM Requisition a, Client b WHERE a.Client_client_id = b.client_id and a.status= 1";
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
            System.out.println(query);
            System.out.println("7845");
            throw new RuntimeException();
        }
        return result;
    }
    public List<ProductModel> findAllActives2() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT a.requisition_id as requisition, a.fecha_pagado as fecha, b.first_name || ' ' || b.first_surname as name, b.address as address " +
                "FROM Requisition a, Client b WHERE a.Client_client_id = b.client_id and a.status= 1";
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
            System.out.println(query);
            System.out.println("7845");
            throw new RuntimeException();
        }
        return result;
    }
    public List<ProductModel> findAllActives3() {
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "SELECT a.requisition_id, b.first_name || ' ' || b.first_surname as nombre, a.fecha_pagado, a.fecha_preparado, a.fecha_despachado, a.fecha_entregado \n" +
                "FROM Requisition a, Client b WHERE a.Client_client_id = b.client_id and a.status= 4";
        List<ProductModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<ProductModel>() {
                @Override
                public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new ProductModel(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getDate(3),
                            resultSet.getDate(4),
                            resultSet.getDate(5),
                            resultSet.getDate(6));
                }
            });
        } catch (Exception ex) {
            System.out.println(query);
            System.out.println("7845");
            throw new RuntimeException();
        }
        return result;
    }
    public List<ProductModel> findProductsByOrderId(int orderId) {
        // Implmentamos SQL varible binding para evitar SQL INJECTION

        String query = "SELECT c.product_name, b.quantity\n" +
                "FROM Requisition a, detail b, product c WHERE a.Requisition_id=b.Requisition_requisition_id and b.product_product_id=c.product_id and a.requisition_id= ? ";

        List<ProductModel> result = null;

        try {
            result = jdbcTemplate.query(query,
                    new Object [] {orderId},
                    new RowMapper<ProductModel>() {
                        @Override
                        public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
                            return new ProductModel(resultSet.getString(1),
                                    resultSet.getInt(2));
                        }
                    });
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException();
        }
        return result;
    }
  /*  public ProductModel updateOrder(Integer orderStatus, Integer orderId, Integer userId ) {
        String aux_date = "";
        if(orderStatus == 1){
            aux_date = "prepared_date";
        }else if(orderStatus == 2){
            aux_date = "shipped_date";
        }else if(orderStatus == 3){
            aux_date = "delivered_date";
        }else{
            return null;
        }
        // Implmentamos SQL varible binding para evitar SQL INJECTION
        String query = "UPDATE \"order\" ord\n" +
                "SET    order_status = ?,\n" +
                "       "+aux_date+" = now(),\n" +
                "       tx_id = usr.user_id,\n" +
                "       tx_username = usr.username,\n" +
                "       tx_host = 'local',\n" +
                "       tx_date = now()\n" +
                "FROM  \"user\" usr\n" +
                "WHERE order_id = ?\n" +
                "  AND usr.user_id = ?\n" +
                "  AND usr.status = 1\n" +
                "  AND ord.status = 1\n" +
                "RETURNING *";

      /*  OrderModel result = null;
        try {
            result = jdbcTemplate.queryForObject(query,
                    new Object [] {orderStatus, orderId, userId},
                    new RowMapper<OrderModel>() {
                        @Override
                        public OrderModel mapRow(ResultSet resultSet, int i) throws SQLException {
                            return new OrderModel(
                                    resultSet.getInt(1),
                                    resultSet.getString(5),
                                    resultSet.getInt(2),
                                    resultSet.getInt(3),
                                    resultSet.getInt(4),
                                    resultSet.getTimestamp(6),
                                    resultSet.getTimestamp(7),
                                    resultSet.getTimestamp(8),
                                    resultSet.getTimestamp(9),
                                    resultSet.getString(10)
                            );
                        }
                    });
        } catch (Exception ex) {
            System.out.println(ex);
            throw new RuntimeException();
        }
        return result;
    }*/
}
