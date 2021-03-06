/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.eve.api;

import io.swagger.client.eve.ApiException;
import io.swagger.client.eve.model.BadRequest;
import io.swagger.client.eve.model.ErrorLimited;
import io.swagger.client.eve.model.Forbidden;
import io.swagger.client.eve.model.GatewayTimeout;
import io.swagger.client.eve.model.GetCharactersCharacterIdLocationOk;
import io.swagger.client.eve.model.GetCharactersCharacterIdOnlineOk;
import io.swagger.client.eve.model.GetCharactersCharacterIdShipOk;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.ServiceUnavailable;
import io.swagger.client.eve.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationApi
 */
@Ignore
public class LocationApiTest {

    private final LocationApi api = new LocationApi();

    
    /**
     * Get character location
     *
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdLocationTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdLocationOk response = api.getCharactersCharacterIdLocation(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character online
     *
     * Checks if the character is currently online  ---  This route is cached for up to 60 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOnlineTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdOnlineOk response = api.getCharactersCharacterIdOnline(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get current ship
     *
     * Get the current ship type, name and id  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdShipTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdShipOk response = api.getCharactersCharacterIdShip(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
}
