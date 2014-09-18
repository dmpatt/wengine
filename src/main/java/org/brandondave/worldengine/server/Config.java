package org.brandondave.worldengine.server;

import org.brandondave.worldengine.server.config.ExampleServiceConfiguration;
import org.brandondave.worldengine.server.config.MessagesConfiguration;

public enum Config {
    
	CONFIG;
	
	private ExampleServiceConfiguration conf;
	private boolean initialized = false;
	
	public void setup(ExampleServiceConfiguration conf)
	{
		if (!initialized && conf != null)
		{
			this.conf = conf;
		}
	}
	
    public MessagesConfiguration getMessages() 
    {
        return conf.getMessages();
    }
}