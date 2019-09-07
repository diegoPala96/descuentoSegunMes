import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class test {

	@Test
	public void test()  {
		
		Control control= new Control();
		
		/*
		assertTrue( control.calcularRecargo("abc") == "error");
		assertTrue( control.calcularRecargo("") == "error");
		assertTrue( control.calcularRecargo("-4") == "error");
		assertTrue( control.calcularRecargo("3.48") == "error");
		assertTrue( control.calcularRecargo("1,039") == "error");
		assertTrue( control.calcularRecargo("0") == "error");
		assertTrue( control.calcularRecargo("1") == "0%");
		assertTrue( control.calcularRecargo("10") == "0%");
		assertTrue( control.calcularRecargo("11") == "2%");
		assertTrue( control.calcularRecargo("20") == "2%");
		assertTrue( control.calcularRecargo("21") == "4%");
		assertTrue( control.calcularRecargo("31") == "4%");
		assertTrue( control.calcularRecargo("32") == "error");
		*/
		
		assertTrue( control.calcularPromedio(1, -1, -4) == 0);
		assertTrue( control.calcularPromedio(0, 1, 0) == 0);
		assertTrue( control.calcularPromedio(-1, 0, 5) == 0);
		assertTrue( control.calcularPromedio(-10, -8, -5) == 0);
		assertTrue( control.calcularPromedio(1, 1, 0) == 0);
		assertTrue( control.calcularPromedio(1, 1, 1) == 0);
		assertTrue( control.calcularPromedio(1, 1, 2) == 0);
		assertTrue( control.calcularPromedio(1, 1, 499) == 121771);
		assertTrue( control.calcularPromedio(1, 1, 500) == 122265);
		assertTrue( control.calcularPromedio(1, 1, 501) == 122760);
		assertTrue( control.calcularPromedio(1, 0, 20) == 0);
		assertTrue( control.calcularPromedio(1, 1, 20) == 105);
		assertTrue( control.calcularPromedio(1, 499, 20) == 105);
		assertTrue( control.calcularPromedio(1, 500, 20) == 105);
		assertTrue( control.calcularPromedio(1, 501, 20) == 105);
		assertTrue( control.calcularPromedio(0, 20, 20) == 0);
		assertTrue( control.calcularPromedio(1, 20, 20) == 105);
		assertTrue( control.calcularPromedio(2, 20, 20) == 105);
		assertTrue( control.calcularPromedio(499, 20, 20) == 0);
		assertTrue( control.calcularPromedio(499, 20, 20) == 0);
		assertTrue( control.calcularPromedio(500, 20, 20) == 0);
		assertTrue( control.calcularPromedio(501, 20, 20) == 0);
		
	
	}
	
	
	
	

}
