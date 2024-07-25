class MedicalStoreRunner{
	public static void main(String[] items){
 
		MedicalStore.addProductName("Ibuprofen");
    
		MedicalStore.addProductName("Paracetamol");
			
		MedicalStore.addProductName("Aspirin");
			
		MedicalStore.addProductName("Amoxicillin");
		   
		MedicalStore.addProductName("Ciprofloxacin");
			
		MedicalStore.addProductName("Metformin");
			
		MedicalStore.addProductName("Lisinopril");
			
		MedicalStore.addProductName("Atorvastatin");
			
		MedicalStore.addProductName("Omeprazole");
			
		MedicalStore.addProductName("Diphenhydramine");
			
		MedicalStore.addProductName("Diphenhydramine");
   
		MedicalStore.showProductNames();
		
		MedicalStore.updateProductName("telimed-H", "Omeprazole");
		
		MedicalStore.showProductNames();
		
		MedicalStore.deleteProductName("Diphenhydramine");
		
		MedicalStore.showProductNames();
 
	}
}