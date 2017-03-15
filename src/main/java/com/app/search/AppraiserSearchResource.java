package com.app.search;

public class AppraiserSearchResource  {
	
	
	public void getSearch(Object requestObj){
		
		AppraiserSearchService as = new AppraiserSearchService();
		
		as.searchAppraisers(requestObj);
		
		
	}

}
