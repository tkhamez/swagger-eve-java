/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.eve.api;

import io.swagger.client.eve.ApiException;
import io.swagger.client.eve.model.BadGateway;
import io.swagger.client.eve.model.BadRequest;
import io.swagger.client.eve.model.GetDogmaAttributesAttributeIdNotFound;
import io.swagger.client.eve.model.GetDogmaAttributesAttributeIdOk;
import io.swagger.client.eve.model.GetDogmaEffectsEffectIdNotFound;
import io.swagger.client.eve.model.GetDogmaEffectsEffectIdOk;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DogmaApi
 */
@Ignore
public class DogmaApiTest {

    private final DogmaApi api = new DogmaApi();

    
    /**
     * Get attributes
     *
     * Get a list of dogma attribute ids  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaAttributesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getDogmaAttributes(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get attribute information
     *
     * Get information on a dogma attribute  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaAttributesAttributeIdTest() throws ApiException {
        Integer attributeId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetDogmaAttributesAttributeIdOk response = api.getDogmaAttributesAttributeId(attributeId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get effects
     *
     * Get a list of dogma effect ids  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaEffectsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getDogmaEffects(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get effect information
     *
     * Get information on a dogma effect  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogmaEffectsEffectIdTest() throws ApiException {
        Integer effectId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetDogmaEffectsEffectIdOk response = api.getDogmaEffectsEffectId(effectId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
