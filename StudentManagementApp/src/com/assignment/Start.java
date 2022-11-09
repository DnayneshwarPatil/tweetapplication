package com.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.assignment.student.Student;
import com.assignment.student.StudentDao;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student ");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// add student detail
				System.out.println("Enter Student Full name");
				String name = br.readLine();

				System.out.println("Enter Student Phone number");
				String phone = br.readLine();

				System.out.println("Enter Student City");
				String city = br.readLine();

				Student st = new Student(name, phone, city);
				System.out.println(st);
				boolean answer = StudentDao.addStudentToDb(st);

				if (answer) {
					System.out.println("add data succesfully");
				} else {
					System.out.println("fail");
				}

			} else if (choice == 2) {
				// delete student
				System.out.println("Enter Student id to delete data");
				int studentId = Integer.parseInt(br.readLine());

				boolean answer = StudentDao.deleteStudentToDb(studentId);

				if (answer) {
					System.out.println("Delete data succesfully");
				} else {
					System.out.println("fail");
				}
			} else if (choice == 3) {
				// display student
				StudentDao.getAllStudentData();

			} else if (choice == 4) {
				// exit app
			} else {

			}
			System.out.println("thanks for using our management system");
		}
	}
}
