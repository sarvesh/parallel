package com.app.search;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SearchServiceManager {

	ExecutorService executorService = null;
	Set<Future> futureObjHolder = null;
	List<AppraiserInvoker> appraiserServices  = null;
	
	
	
	public SearchServiceManager(List<AppraiserInvoker> appraiserServices) {
		
		
		executorService = Executors.newFixedThreadPool(appraiserServices.size());
		futureObjHolder = new HashSet<Future>();
		appraiserServices = appraiserServices;
		
	}



	
	
	

	/**
	 * Invoke the executor framework
	 * 
	 * @param appraiserServices
	 * @return List<ServiceResponse>
	 * @throws Exception
	 */
	private void invokeServices() throws Exception {

		
		for(AppraiserInvoker service :  appraiserServices){
			
			service.isValidRequest();
			service.init();
			
		    Future f = executorService.submit(service);
		    
		    futureObjHolder.add(f);
			
		}
		

	}
	
	
	public Set<Object>  collectResponses() throws InterruptedException, ExecutionException{
		
		
		Set<Object> responseObjHolder = new HashSet<Object>();
		for(Future fObj : futureObjHolder){
			
			Object object = fObj.get();
			if( object != null   ){
				
				responseObjHolder.add(object);
				
			}
		}
		
		
		
		return responseObjHolder;
	}
	
	
	

	public Set<Object> process() throws Exception {

	
		invokeServices();
		Set<Object> respHolder = 	collectResponses();
		return respHolder;

	}

}
