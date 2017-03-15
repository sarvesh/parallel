package com.app.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AppraiserSearchService {
	
	
	public void searchAppraisers(Object searchRequestObject){
		
		//use invokers instead of services
		
		//Additional Checks
		
		//SearchResponseAggregator
		
		//AppraiserInvokerFactory
		
		List<AppraiserInvoker> appraiserServices = buildAppraiserInvokers(searchRequestObject);
		SearchServiceManager sm = new SearchServiceManager(appraiserServices);
		
		Set<Object> responseHolder = null;
		
		try {
			 responseHolder =	sm.process();
			
			 SearchResponseAggregator sr = new SearchResponseAggregator();
			 
			 for(Object o : responseHolder){
				 
				 if(o instanceof StaffInvokerResponse ){
					 
					 sr.setStaffInvokerResponse((StaffInvokerResponse) o);
				 }
				 
			 }
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private List<AppraiserInvoker> buildAppraiserInvokers(Object searchRequestObject) {

		// Use the factory to create instances of the objects instead of
		// directly creating it.
		
		//AppraiserFactory af = 

		List<AppraiserInvoker> appraiserServices = new ArrayList<AppraiserInvoker>();
		
		//Data Massaging
		
		
		AppraiserInvoker as1 = new StaffInvoker(null);

		AppraiserInvoker as2 = new RFInvoker(null);
		

		appraiserServices.add(as1);

		appraiserServices.add(as2);

		return appraiserServices;

	}

}
