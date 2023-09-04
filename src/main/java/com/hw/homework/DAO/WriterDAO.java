package com.hw.homework.DAO;
import com.hw.homework.DTO.WriterDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.hw.system.DB.DBClose;

import com.hw.system.DB.DBConnection;

public class WriterDAO {
    // JDBC 변수
    public Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    // SQL 명령어
    private static  String WRITER_INSERT  = "insert into WRITER(writer, content)" +
            " values (?, ?)";
    private static String WRITER_UPDATE = "update WRITER " +
            "set writerIndex=?, writer=?, content=?";
    private static  String WRITER_DELETE = "delete from WRITER where writerIndex=?";
    private static  String WRITER_GET = "select * from WRITER where writerIndex=?";
    private static  String WRITER_LIST = "select * from WRITER";

    // CURD 메소드
    // 글 등록
    public void insertWriter(WriterDTO writerDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(WRITER_INSERT);
            stmt.setString(1, writerDTO.getWriter());
            stmt.setString(2, writerDTO.getContent());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
    }
    // 글 수정
    public void updateWriter(WriterDTO writerDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(WRITER_UPDATE);
            stmt.setInt(1, writerDTO.getWriterIndex());
            stmt.setString(2, writerDTO.getWriter());
            stmt.setString(3, writerDTO.getContent());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
    }
    // 글 삭제
    public void deleteWriter(WriterDTO writerDTO) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(WRITER_DELETE);
            stmt.setInt(1, writerDTO.getWriterIndex());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBClose.close(stmt, conn);
        }
    }
    // 글 조회
    public WriterDTO selectWriter(WriterDTO writerDTO) {
        WriterDTO writerDTO1 = null;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(WRITER_GET);
            stmt.setInt(1, writerDTO.getWriterIndex());
            rs = stmt.executeQuery();
            if(rs.next()) {
                writerDTO1 = new WriterDTO();
                writerDTO1.setWriterIndex(rs.getInt("writerIndex"));
                writerDTO1.setWriter(rs.getString("writer"));
                writerDTO1.setContent(rs.getString("content"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBClose.close(stmt, conn);
        }
        return writerDTO1;


    }
    // 글 목록 검색
    public List<WriterDTO> getWriterList(WriterDTO writerDTO) {
        List<WriterDTO> writerDTOList = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(WRITER_LIST);
            rs = stmt.executeQuery();
            while(rs.next()) {
                WriterDTO writerDTO1 = new WriterDTO();
                writerDTO1.setWriterIndex(rs.getInt("writerIndex"));
                writerDTO1.setWriter(rs.getString("writer"));
                writerDTO1.setContent(rs.getString("content"));
                writerDTOList.add(writerDTO1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            DBClose.close(stmt, conn);
        }
        return writerDTOList;
    }

}
