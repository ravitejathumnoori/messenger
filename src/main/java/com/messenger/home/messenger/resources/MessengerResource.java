package com.messenger.home.messenger.resources;

import java.util.List;

import com.messenger.home.messenger.model.Message;
import com.messenger.home.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessengerResource {
	
	
	MessageService messageService = new MessageService();
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

}
