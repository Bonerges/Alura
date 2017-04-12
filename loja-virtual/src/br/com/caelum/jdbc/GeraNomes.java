package br.com.caelum.jdbc;



import java.util.Random;

public class GeraNomes {

	String string;

	public String  geraNomes(){
	     Random gerador = new Random();
	     
	     while(this.string == null){
	        int x = gerador.nextInt();       
	        
	        
	        switch (x%50){
	        case 0:
	            this.string = "null, Joao, 2400.00, 0, 2010-04-08";
	            break;
	        case 1:
	        	this.string = "null, Maria, 1500.00, 1, 2011-01-02";
	            break;
	        case 2:
	        	this.string = "null, Rafael, 1400.00, 0, 2017-04-08";
	            break;
	        }
	        
	     }
		return this.string;

	}
	

	
	
}




