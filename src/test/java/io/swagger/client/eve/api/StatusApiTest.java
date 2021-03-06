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
import io.swagger.client.eve.model.GetStatusOk;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Ignore
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    
    /**
     * Retrieve the uptime and player counts
     *
     * EVE Server status  ---  This route is cached for up to 30 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        GetStatusOk response = api.getStatus(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
