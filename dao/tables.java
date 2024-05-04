
package dao;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), mobileNumber varchar(11), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1785812345','Mirpur, Bangladesh','admin','What is your favourite color?','Black','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            String billTable = "create table bill(id int AUTO_INCREMENT primary key, name varchar(200), mobileNumber varchar(200), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            DbOperations.setDataorDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataorDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataorDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataorDelete(productTable, "Product Table Created Successfully");
            DbOperations.setDataorDelete(billTable, "Bill Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
