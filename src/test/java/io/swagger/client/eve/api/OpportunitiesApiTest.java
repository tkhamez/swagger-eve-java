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
import io.swagger.client.eve.model.GetCharactersCharacterIdOpportunities200Ok;
import io.swagger.client.eve.model.GetOpportunitiesGroupsGroupIdOk;
import io.swagger.client.eve.model.GetOpportunitiesTasksTaskIdOk;
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
 * API tests for OpportunitiesApi
 */
@Ignore
public class OpportunitiesApiTest {

    private final OpportunitiesApi api = new OpportunitiesApi();

    
    /**
     * Get a character&#39;s completed tasks
     *
     * Return a list of tasks finished by a character  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOpportunitiesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdOpportunities200Ok> response = api.getCharactersCharacterIdOpportunities(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get opportunities groups
     *
     * Return a list of opportunities groups  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<Integer> response = api.getOpportunitiesGroups(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get opportunities group
     *
     * Return information of an opportunities group  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesGroupsGroupIdTest() throws ApiException {
        Integer groupId = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        GetOpportunitiesGroupsGroupIdOk response = api.getOpportunitiesGroupsGroupId(groupId, acceptLanguage, datasource, ifNoneMatch, language);

        // TODO: test validations
    }
    
    /**
     * Get opportunities tasks
     *
     * Return a list of opportunities tasks  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<Integer> response = api.getOpportunitiesTasks(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get opportunities task
     *
     * Return information of an opportunities task  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTasksTaskIdTest() throws ApiException {
        Integer taskId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetOpportunitiesTasksTaskIdOk response = api.getOpportunitiesTasksTaskId(taskId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
