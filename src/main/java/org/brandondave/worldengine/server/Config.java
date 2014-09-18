package org.brandondave.worldengine.server;

import org.brandondave.worldengine.server.config.ServerConfiguration;
import org.brandondave.worldengine.server.config.MessagesConfiguration;

public enum Config {
    
	CONFIG;
	
	private ServerConfiguration conf;
	private boolean initialized = false;
	
	public void setup(ServerConfiguration conf)
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