package week7.code;

import java.io.IOException;

public class ExceptionsPractice {

	public static void main(String[] args) {
		try {
			a();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b1();
		try {
			c1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Y1();
		 
		
		testMethodD();
		
	 

	}
	
	public static void a () throws IOException {
	}
	public static void b1() {
		try {
			b2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d1();
		
	}
	public static void b2() throws IOException {
	}
	public static void c1() throws IOException {
		c2();
	}
	public static void c2() {
	}
	public static void d1() {
		try {
			d2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void d2() throws ClassNotFoundException {
		
	}
	
	
	public static String testMethodD(){
		 try {
			 int a = 0;
			 if(a<0) {
			 throw new IOException();}
			 else if (a >0) {
			 throw new NoSuchMethodException();}
			 else
			 throw new ClassNotFoundException();
			 
		 }catch(IOException e) {
			 System.out.println("IO caught");
		 }catch(NoSuchMethodException  e) {
			 System.out.println("IO caught");
		 }catch(ClassNotFoundException e) {
			 System.out.println("IO caught");
		 }catch(RuntimeException e) {
			 System.out.println("IO caught");
		 }
		 return "ok";

		}
	public static void Y1(){
		Y2();
	}
	public static void Y2(){
		Y3();
	}
	public static void Y3(){
		Y4();
	}
	public static void Y4() throws RuntimeException{
		
		
	}
}
