/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.eve.api;

import io.swagger.client.eve.ApiException;
import io.swagger.client.eve.model.Forbidden;
import io.swagger.client.eve.model.GetCharactersCharacterIdCalendar200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdCalendarEventIdAttendees200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdCalendarEventIdOk;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.PutCharactersCharacterIdCalendarEventIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CalendarApi
 */
@Ignore
public class CalendarApiTest {

    private final CalendarApi api = new CalendarApi();

    
    /**
     * List calendar event summaries
     *
     * Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event.  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Integer fromEvent = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdCalendar200Ok> response = api.getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get an event
     *
     * Get all the information for a specific event  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarEventIdTest() throws ApiException {
        Integer characterId = null;
        Integer eventId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCharactersCharacterIdCalendarEventIdOk response = api.getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get attendees
     *
     * Get all invited attendees for a given event  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarEventIdAttendeesTest() throws ApiException {
        Integer characterId = null;
        Integer eventId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdCalendarEventIdAttendees200Ok> response = api.getCharactersCharacterIdCalendarEventIdAttendees(characterId, eventId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Respond to an event
     *
     * Set your response status to an event  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdCalendarEventIdTest() throws ApiException {
        Integer characterId = null;
        Integer eventId = null;
        PutCharactersCharacterIdCalendarEventIdResponse response = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        api.putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
