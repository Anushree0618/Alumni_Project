package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository("deptRepo")
public class DepartmentRepository {

	
	List<Department> list;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean isAddNewDepartment(Department department) {
        int value = jdbcTemplate.update("INSERT INTO department VALUES ('0',?)",
            new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1, department.getDeptname());
                }
            });

        // Return true if at least one row is affected
        return value > 0?true:false;
    }
        
        
        public List<Department> getAllDepartment(){
        	list=jdbcTemplate.query("select * from department", new RowMapper<Department>()
        			{
        		@Override
        		public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        			  Department dept=new Department();
        			  dept.setDeptId(rs.getInt(1));
        			  
        			return null;
        		}
        	});
        			return null;
        }  
}
