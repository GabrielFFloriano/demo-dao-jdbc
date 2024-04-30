package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===Teste 1: findById do seller===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n===Teste 2: findByDepartment do seller===");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findDepartmentById(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n===Teste 3: findByAll do seller===");
		list = sellerDao.findAll();
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n===Teste 4: seller insert===");
		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0 , dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());

		System.out.println("\n===Teste 5: seller update===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}

}
