package assignment3_2;

import assignment3_2.Person;

public class Person {

			int id;  
			String name;  
			Person(int id,String name){  
			this.id=id;  
			this.name=name;  
			}  
			}  
			class Emp extends Person{  
			float salary;  
			Emp(int id,String name,float salary){  
			super(id,name);//reusing parent constructor  
			this.salary=salary;  
			}  
			void display(){System.out.println(id+" "+name+" "+salary);}  
			  
		 

			}
			
		
		
		
	
