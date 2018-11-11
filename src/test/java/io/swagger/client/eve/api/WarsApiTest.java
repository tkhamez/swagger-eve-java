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
import io.swagger.client.eve.model.GatewayTimeout;
import io.swagger.client.eve.model.GetWarsWarIdKillmails200Ok;
import io.swagger.client.eve.model.GetWarsWarIdKillmailsUnprocessableEntity;
import io.swagger.client.eve.model.GetWarsWarIdOk;
import io.swagger.client.eve.model.GetWarsWarIdUnprocessableEntity;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WarsApi
 */
@Ignore
public class WarsApiTest {

    private final WarsApi api = new WarsApi();

    
    /**
     * List wars
     *
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        Integer maxWarId = null;
        List<Integer> response = api.getWars(datasource, ifNoneMatch, maxWarId);

        // TODO: test validations
    }
    
    /**
     * Get war information
     *
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdTest() throws ApiException {
        Integer warId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetWarsWarIdOk response = api.getWarsWarId(warId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List kills for a war
     *
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdKillmailsTest() throws ApiException {
        Integer warId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        List<GetWarsWarIdKillmails200Ok> response = api.getWarsWarIdKillmails(warId, datasource, ifNoneMatch, page);

        // TODO: test validations
    }
    
}
