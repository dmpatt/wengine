package org.brandondave.worldengine.server.config;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class ServerConfiguration  extends Configuration 
{
    
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";
	
    @Valid
    private MessagesConfiguration messages;

    @JsonProperty
    public MessagesConfiguration getMessages() 
    {
        return messages;
    }

    @JsonProperty
    public void setMessages(MessagesConfiguration messages)
    {
        this.messages = messages;
    }

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }
}
