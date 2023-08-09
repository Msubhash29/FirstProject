package javatask5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*
;public class Optional_Exception {
	
		   
	private static String name;
	

   public void setName(String name) {
	   this.name=name;
   }

	public String getName() {
		return name;
	}

	

	public double getMark() {
		return mark;
	}

	

	private double mark;

	public  Optional_Exception(String name, double mark) {
		this.name=name;
		this.mark=mark;
	}
	
	public static void main(String[] args) {
   		
		
		
  
	 /*Optional<Optional_Exception> getResult()
			{ 
		  
		 
				List<Optional_Exception> result = new ArrayList<>();
				result.add(new Optional_Exception("Subhash", 80));
				result.add(new Optional_Exception("Chandra", 75));
				result.add(new Optional_Exception("Bose",50));
				result.add(new Optional_Exception("Seeni", 100));
				result.add(new Optional_Exception("Parsanth",80));
				
				return;
			}*/
	
		List<Optional_Exception> result = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String name="Subhash";
       Optional<String> oe=setName(name);
       System.out.println(oe);
      
       
	}		
}


