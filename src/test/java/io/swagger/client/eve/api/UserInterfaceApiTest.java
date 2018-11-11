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
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.PostUiOpenwindowNewmailNewMail;
import io.swagger.client.eve.model.PostUiOpenwindowNewmailUnprocessableEntity;
import io.swagger.client.eve.model.ServiceUnavailable;
import io.swagger.client.eve.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserInterfaceApi
 */
@Ignore
public class UserInterfaceApiTest {

    private final UserInterfaceApi api = new UserInterfaceApi();

    
    /**
     * Set Autopilot Waypoint
     *
     * Set a solar system as autopilot waypoint  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiAutopilotWaypointTest() throws ApiException {
        Boolean addToBeginning = null;
        Boolean clearOtherWaypoints = null;
        Long destinationId = null;
        String datasource = null;
        String token = null;
        api.postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Contract Window
     *
     * Open the contract window inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowContractTest() throws ApiException {
        Integer contractId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowContract(contractId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Information Window
     *
     * Open the information window for a character, corporation or alliance inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowInformationTest() throws ApiException {
        Integer targetId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowInformation(targetId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Market Details
     *
     * Open the market details window for a specific typeID inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowMarketdetailsTest() throws ApiException {
        Integer typeId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowMarketdetails(typeId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open New Mail Window
     *
     * Open the New Mail window, according to settings from the request if applicable  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowNewmailTest() throws ApiException {
        PostUiOpenwindowNewmailNewMail newMail = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowNewmail(newMail, datasource, token);

        // TODO: test validations
    }
    
}
