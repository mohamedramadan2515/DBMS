package eg.edu.alexu.csd.oop.db;

import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		DBM eng = new DBM();
		System.out.println(eng.createDatabase("sample",true));
		System.out.println(eng.executeStructureQuery("create database sample"));
		System.out.println(eng.executeStructureQuery("CREATE TABLE table_name13(column_name1 varchar, column_name2 int, column_name3 varchar)"));
		System.out.println(eng.executeUpdateQuery("INSERT INTO table_name13(column_NAME1, COLUMN_name3, column_name2) VALUES ('value1', 'value3', 4)"));
		System.out.println(eng.executeUpdateQuery("INSERT INTO table_name13(column_NAME1, column_name2, COLUMN_name3) VALUES ('value1', 4, 'value3')"));
		System.out.println(eng.executeUpdateQuery("INSERT INTO table_name13(column_name1, COLUMN_NAME3, column_NAME2) VALUES ('value2', 'value4', 5)"));
		System.out.println(eng.executeUpdateQuery("INSERT INTO table_name13(column_name1, COLUMN_NAME3, column_NAME2) VALUES ('value5', 'value6', 6)"));
		Object [][] ans = eng.executeQuery("SELECT column_name1 FROM table_name13 WHERE coluMN_NAME2 < 5");
		System.out.println(ans.length);
	}

}