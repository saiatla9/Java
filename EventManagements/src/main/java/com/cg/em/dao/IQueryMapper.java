package com.cg.em.dao;

public interface IQueryMapper {
	public static final String ADD_EVENT_QRY = 
			"INSERT INTO events(eventid, title, location, edate, cost) VALUES(?,?,?,?,?)";
	public static final String MODIFY_EVENT_QRY = 
			"UPDATE events SET title=?,edate=?,cost=?, location =? WHERE eventid=?";
	public static final String DEL_EVENT_QRY = 
			"DELETE FROM events WHERE eventid=?";
	public static final String GET_ALL_EVENTS_QRY = 
			"SELECT * FROM events";
	public static final String GET_EVENT_QRY = 
			"SELECT * FROM events WHERE eventid=?";

}
