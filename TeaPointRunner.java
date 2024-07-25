class TeaPointRunner{
	
	public static void main(String[] chai){
		System.out.println("Main started");
	
		TeaPoint.addTeaNames("Green tea");
		 
		TeaPoint.addTeaNames("Ginger tea");
		 
		TeaPoint.addTeaNames("Amurut tea");
		 
		TeaPoint.addTeaNames("Elachi tea");
		 
		TeaPoint.addTeaNames("Normal tea");
		 
		TeaPoint.addTeaNames("Lemon tea");
		 
		TeaPoint.addTeaNames("tea");
		 
		TeaPoint.readTeaNames();
		
		TeaPoint.updateTeaName("Masala Tea", "Normal tea");
		
		TeaPoint.readTeaNames();
		
		TeaPoint.deleteTeaName("Normal tea");
		
		TeaPoint.readTeaNames();
		
		System.out.println("Main ended");
	}
}