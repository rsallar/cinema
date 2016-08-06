/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.github.rsallar.cinema.client.gin;

import java.util.logging.Logger;

import com.github.rsallar.cinema.client.application.main.MainModule;
import com.github.rsallar.cinema.client.place.NameTokens;
import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.dispatch.rest.client.gin.RestDispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter;


public class ClientModule extends AbstractPresenterModule {
	Logger logger = Logger.getLogger("ClientModule");
	
    private static final String ANALYTICS_ACCOUNT = "UA-8319339-6";

    @Override
    protected void configure() {
    	 RestDispatchAsyncModule.Builder dispatchBuilder =  new RestDispatchAsyncModule.Builder();
    	

    	install(dispatchBuilder.build());
    	
    	bindConstant().annotatedWith(RestApplicationPath.class).to("https://cinemaapi.herokuapp.com/cinemas");
    	
    	install(new DefaultModule.Builder()
                .tokenFormatter(RouteTokenFormatter.class)
                .defaultPlace(NameTokens.home)
                .errorPlace(NameTokens.error)
                .unauthorizedPlace(NameTokens.error)
                .build());
    	   	
    	
    	install(new MainModule());
    	
  
    }
}
