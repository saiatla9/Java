package com.cg.em.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.cg.em.exception.EventManagementException;
import com.cg.em.model.Event;

public interface IEventDAO {
	
	String add_event(Event event) throws EventManagementException;
	boolean remove_event(String serialNumber) throws EventManagementException;
	Set <Event> list_events() throws EventManagementException;
	List <Event> list_events_location() throws EventManagementException;
	List <Event> list_location(String location) throws EventManagementException;
	List <Event> list_events_date(LocalDate startDate) throws EventManagementException;
	void persist()throws EventManagementException;

}