class AirtelAndJioPlans{

		public static int prepaidPlans(String planName ){
		
		if(planName == "Jio  1GB/day 28 Days"){
		
		       return 249 ;
		}
		if(planName == "Airtel  1GB/day 28 Days" ){
		
		    return 299 ;
		}
		
		if(planName == "Jio  1.5 GB/day 28 Days"){
		
		     return 299 ;
		}
		
		if(planName == "Airtel  1.5 GB/day  28 Days"){
			
			return 349;
		}
		
		if(planName == "Jio 2GB/day  28 Days"){
			  
			  return 349;
		}
		
		if(planName == "Airtel  2GB/day  28 Days"){
			
                  return 399;
				 
		}
		
		if(planName == "Jio  2.5 GB/day 28 Days"){
			
                  return 399;
		}
		
		if(planName == "Airtel  2.5 GB/day 28 Days"){
			
                  return 409;
		
		}
		
		if(planName == "Jio   3GB/day 28 Days"){
			
                  return 449;
		}
		
		if(planName == "Airtel 3GB/day 28 Days"){
			
                  return 449;
				  
		}
		
		if(planName == "Jio 1.5GB/day 56 Days"){
			
                  return 579;
				  
		}
		if(planName == "Airtel 1.5GB/day 56 Days"){
			
                  return 579;
				  
		}
		
		if(planName == "Jio 2GB/day 56 Days"){
			
                  return 629;
				  
		}
		if(planName == "Airtel 2GB/day 28 Days"){
			
                  return 649;
				  
		}
		
		if(planName == "Jio 1.5GB/day 84 Days"){
			
                  return 799;
				  
		}
		
		if(planName == "Airtel 1.5GB/day 84 Days"){
			
                  return 859;
		}
		
		if(planName == "Jio 2GB/day 84 Days"){
			
                  return 859;
		}
		if(planName == "Airtel 2GB/day 84 Days"){
			
                  return 979;
		}
		
		if(planName == "Jio 3GB/day 84 Days"){
			
                  return 1199;
		}
		
		if(planName == "Airtel 3GB/day 84 Days"){
			
                  return 1299;
		}
		
		if(planName == "Jio 6GB total 84 Days"){
			
                  return 479;
		}
		
		if(planName == "Airtel 6GB total 84 Days"){
			
                  return 509;
		}
			
		else{
		System.out.println(planName+ "not found");
		
		}
		
		return 0;
		

		}



}