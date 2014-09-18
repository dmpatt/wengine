package org.brandondave.worldengine.server.config;


import javax.validation.constraints.NotNull;

public class MessagesConfiguration 
{

    @NotNull
    private String hello;
    public String getHello()
    {
        return hello;
    }
    
    @NotNull
    private String practice;
    public String getPractice() 
    {
		return practice;
	}
    
    @NotNull
    private String logbackXmlLocation;
    public String getLogbackXmlLocation() {
    	return logbackXmlLocation;
    }
    
    @NotNull
    private String primaryPort;
    public String getPrimaryPort() {
    	return primaryPort;
    }
    
    @NotNull
    private String mongoURI;
    public String getMongoURI() {
    	return mongoURI;
    }
    
    @NotNull
    private String mongoPort;
    public String getMongoPort() {
    	return mongoPort;
    }

}