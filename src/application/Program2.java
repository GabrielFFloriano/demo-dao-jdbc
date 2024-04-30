package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
//		System.out.println("===Teste 1: findById do seller===");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
//
//		System.out.println("\n===Teste 2: findByDepartment do seller===");
//		Department dep = new Department(2,null);
//		List<Seller> list = sellerDao.findDepartmentById(dep);
//		for(Seller s : list) {
//			System.out.println(s);
//		}
//		
//		System.out.println("\n===Teste 3: findByAll do seller===");
//		list = sellerDao.findAll();
//		for(Seller s : list) {
//			System.out.println(s);
//		}
		
		System.out.println("\n===Teste 4: department insert===");
		Department newDep = new Department(null,"Greg");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = "+newDep.getId());

//		System.out.println("\n===Teste 5: seller update===");
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Wayne");
//		sellerDao.update(seller);
//		System.out.println("Update completed!");
//		
//		System.out.println("\n===Teste 6: seller delete===");
//		System.out.println("Digite um Id: ");
//		int id = sc.nextInt();
//		sellerDao.deleteById(id);
//		System.out.println("Deleted");
		sc.close();
	}

}
