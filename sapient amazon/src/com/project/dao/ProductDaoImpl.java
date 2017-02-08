package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.bean.Product;
import com.project.helper.CreateConnection;

public class ProductDaoImpl implements ProductDao {
	CreateConnection cd = new CreateConnection();
	Connection con = null;
	PreparedStatement pstmt = null;
	Product product = new Product();
	// Statement stmt=con.createStatement();

	public boolean addProduct(Product product) throws SQLException, ClassNotFoundException {
		// con=cd.getCon();
		// Statement stmt=con.createStatement();
		//

		pstmt = con.prepareStatement("insert into product_info Emp values(?,?,?,?,?,?)");
		pstmt.setInt(1, product.getProductId());
		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getCategory());
		pstmt.setDouble(4, product.getPrice());
		pstmt.setInt(5, product.getQuantity());
		pstmt.setInt(6, product.getDiscount());

		int rows = pstmt.executeUpdate();
		con.close();
		if (rows > 0) {
			return true;
		}
		// con.close();
		return false;
	}

	<<<<<<<HEAD
	@Override
	public Boolean deleteProduct(int pid) throws SQLException {
		Statement stmt = con.createStatement();
		String sql = "DELETE FROM product_info " + "WHERE id =" + pid;
		int rows = stmt.executeUpdate(sql);
		if (rows > 0) {
			return true;
		}
		return false;
=======
@Override
public Boolean deleteProduct(int pid) throws SQLException {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	Statement stmt=con.createStatement();
	 String sql = "DELETE FROM product_info " +"WHERE id ="+pid;
int rows=stmt.executeUpdate(sql);
if(rows>0){
	return true;
}
	return false;
}

@Override
public boolean updateProduct(Product product)throws SQLException {
	// TODO Auto-generated method stub
	
	Statement stmt=con.createStatement();
		pstmt = con.prepareStatement("UPDATE PRODUCT_INFO SET  product_name=?, product_category=?,product_price=? , product_quantity=?,product_discount=? WHERE product_id=?");
		
		 pstmt.setString(1,product.getName());
		 pstmt.setString(2,product.getCategory());
		 pstmt.setDouble(3,product.getPrice());
		 pstmt.setInt(4,product.getQuantity());
		 pstmt.setInt(5,product.getDiscount());
		 pstmt.setInt(6,product.getProductId());
				int row = pstmt.executeUpdate();
				 con.close();
				 if( row>0)
					 return true;
				else
						 return false;
}

@Override
public List<Product> viewProduct(String pcategory)throws SQLException {
	// TODO Auto-generated method stubcon=cd.dbCon();
	List<Product> prodList=new ArrayList<Product>();
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from product_info where product_category= "+pcategory);
	while(rs.next()){
		int pid=rs.getInt("product_id");
		String productname=rs.getString("product_name");
		
	
		
	 String category = rs.getString("product_category");
	int productprice = rs.getInt("product_price");
	int productquantity=rs.getInt("product_quantity");

	product.setProductId(pid);
	product.setName(productname);
	product.setCategory(category);
	product.setPrice(productprice);
	product.setQuantity(productquantity);
	prodList.add(product);
	//System.out.println(product);
	
		
>>>>>>> branch 'master' of https://github.com/geeteshtripathi93/amazon.git
	}

	@Override
	public boolean updateProduct(Product product) throws SQLException {
		Statement stmt = con.createStatement();
		pstmt = con.prepareStatement(
				"UPDATE PRODUCT_INFO SET  product_name=?, product_category=?,product_price=? , product_quantity=?,product_discount=? WHERE product_id=?");

		pstmt.setString(2, product.getName());
		pstmt.setString(3, product.getCategory());
		pstmt.setDouble(4, product.getPrice());
		pstmt.setInt(5, product.getQuantity());
		pstmt.setInt(6, product.getDiscount());
		pstmt.setInt(1, product.getProductId());
		int row = pstmt.executeUpdate();
		con.close();
		if (row > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Product> viewProduct(String pcategory) throws SQLException {
		List<Product> prodList = new ArrayList<Product>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product_info where product_category= " + pcategory);
		while (rs.next()) {
			int pid = rs.getInt("product_id");
			String productname = rs.getString("product_name");

			String category = rs.getString("product_category");
			int productprice = rs.getInt("product_price");
			int productquantity = rs.getInt("product_quantity");

			product.setProductId(pid);
			product.setName(productname);
			product.setCategory(category);
			product.setPrice(productprice);
			product.setQuantity(productquantity);
			prodList.add(product);
			// System.out.println(product);

		}
		// return empList;
		con.close();
		// return null;
		return prodList;

	}

}
