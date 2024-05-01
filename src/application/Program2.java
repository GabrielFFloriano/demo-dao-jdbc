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
		System.out.println("===Teste 1: findById do Department===");
		Department department = depDao.findById(3);
		System.out.println(department);


		System.out.println("\n===Teste 3: findAll do Department===");
		List<Department> list = depDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n===Teste 4: department insert===");
		Department newDep = new Department(null,"Greg");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = "+newDep.getId());

		System.out.println("\n===Teste 5: Department update===");
		department = depDao.findById(1);
		department.setName("Música");
		depDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n===Teste 6: Department delete===");
		System.out.println("Digite um Id: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Deleted");
		sc.close();
	}

}
