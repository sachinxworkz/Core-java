class TeaPointRunner{
	
	public static void main(String[] chai){
		System.out.println("Main started");
	
		boolean teaAdded = TeaPoint.addTeaNames("Green tea");
		System.out.println("Tea name added");

         teaAdded = TeaPoint.addTeaNames("Amruth Tea");
		System.out.println("Tea name added");

        teaAdded = TeaPoint.addTeaNames("Irani Tea");
		System.out.println("Tea name added");

        teaAdded = TeaPoint.addTeaNames("Ginger Tea");
		System.out.println("Tea name added");

        teaAdded = TeaPoint.addTeaNames("Elachi Tea");
		System.out.println("Tea name added");

        teaAdded = TeaPoint.addTeaNames("Sachin Tea");
		System.out.println("Tea name added");

		
		TeaPoint.readTeaNames();
		
		System.out.println("Main ended");
	}
}