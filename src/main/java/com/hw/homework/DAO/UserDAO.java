package com.hw.homework.DAO;
import com.hw.homework.DTO.UserDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hw.system.DB.DBConnection;
import com.hw.system.DB.DBClose;

public class UserDAO {
    // JDBC 변수
    public Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    // SQL 명령어
    private static String USER_INSERT ="insert into users values (?, ?, ?, ?)";
    private static String USER_UPDATE ="update users set name=?, role=? where id=?";
    private static String USER_DELETE ="delete from users where id=?";
    private static String USER_GET ="select * from users where id=?";
    private static String USER_lIST ="select * from users";

    public void insertUser(UserDTO userDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(USER_INSERT);
            stmt.setString(1, userDTO.getId());
            stmt.setString(2, userDTO.getPassword());
            stmt.setString(3, userDTO.getName());
            stmt.setString(4, userDTO.getRole());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
    }
    public UserDTO updateUser(UserDTO userDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(USER_UPDATE);
            stmt.setString(1, userDTO.getName());
            stmt.setString(2, userDTO.getRole());
            stmt.setString(3, userDTO.getId());

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
        return userDTO;
    }
    public void deleteUser(UserDTO userDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(USER_DELETE);
            stmt.setString(1, userDTO.getId());

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
    }
    public UserDTO selectUser(UserDTO userDTO) {
        try {
            UserDTO userDTO1 = null;
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(USER_GET);
            stmt.setString(1, UserDTO.getId());
            rs = stmt.executeQuery();
            while(rs.next()) {
                userDTO = new UserDTO();
                userDTO.setId(rs.getString("id"));
                userDTO.setId(rs.getString("password"));
                userDTO.setId(rs.getString("name"));
                userDTO.setId(rs.getString("role"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
        return userDTO;
    }
    public List<UserDTO> getUserList(UserDTO userDTO) {
        List<UserDTO> userDTOList = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(USER_lIST);
            rs = stmt.executeQuery();
            while(rs.next()) {
                UserDTO userDTO1 = new UserDTO();
                userDTO1.setId(rs.getString("id"));
                userDTO1.setId(rs.getString("password"));
                userDTO1.setId(rs.getString("name"));
                userDTO1.setId(rs.getString("role"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
        return userDTOList;
    }
}
