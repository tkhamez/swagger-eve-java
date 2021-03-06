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
import io.swagger.client.eve.model.GetCharactersCharacterIdFittings200Ok;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.PostCharactersCharacterIdFittingsCreated;
import io.swagger.client.eve.model.PostCharactersCharacterIdFittingsFitting;
import io.swagger.client.eve.model.ServiceUnavailable;
import io.swagger.client.eve.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FittingsApi
 */
@Ignore
public class FittingsApiTest {

    private final FittingsApi api = new FittingsApi();

    
    /**
     * Delete fitting
     *
     * Delete a fitting from a character  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdFittingsFittingIdTest() throws ApiException {
        Integer characterId = null;
        Integer fittingId = null;
        String datasource = null;
        String token = null;
        api.deleteCharactersCharacterIdFittingsFittingId(characterId, fittingId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Get fittings
     *
     * Return fittings of a character  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFittingsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdFittings200Ok> response = api.getCharactersCharacterIdFittings(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Create fitting
     *
     * Save a new fitting for a character  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdFittingsTest() throws ApiException {
        Integer characterId = null;
        PostCharactersCharacterIdFittingsFitting fitting = null;
        String datasource = null;
        String token = null;
        PostCharactersCharacterIdFittingsCreated response = api.postCharactersCharacterIdFittings(characterId, fitting, datasource, token);

        // TODO: test validations
    }
    
}
