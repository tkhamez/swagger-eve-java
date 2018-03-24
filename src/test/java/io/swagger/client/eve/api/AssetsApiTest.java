/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.eve.api;

import io.swagger.client.eve.ApiException;
import io.swagger.client.eve.model.Forbidden;
import io.swagger.client.eve.model.GetCharactersCharacterIdAssets200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdAssets200Ok;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.PostCharactersCharacterIdAssetsLocations200Ok;
import io.swagger.client.eve.model.PostCharactersCharacterIdAssetsNames200Ok;
import io.swagger.client.eve.model.PostCorporationsCorporationIdAssetsLocations200Ok;
import io.swagger.client.eve.model.PostCorporationsCorporationIdAssetsNames200Ok;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsApi
 */
@Ignore
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    
    /**
     * Get character assets
     *
     * Return a list of the characters assets  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdAssetsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdAssets200Ok> response = api.getCharactersCharacterIdAssets(characterId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation assets
     *
     * Return a list of the corporation assets  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director  --- [This route has an available update](https://esi.tech.ccp.is/diff/latest/dev/#GET-/corporations/{corporation_id}/assets/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdAssetsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdAssets200Ok> response = api.getCorporationsCorporationIdAssets(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get character asset locations
     *
     * Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdAssetsLocationsTest() throws ApiException {
        Integer characterId = null;
        List<Long> itemIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<PostCharactersCharacterIdAssetsLocations200Ok> response = api.postCharactersCharacterIdAssetsLocations(characterId, itemIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get character asset names
     *
     * Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdAssetsNamesTest() throws ApiException {
        Integer characterId = null;
        List<Long> itemIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<PostCharactersCharacterIdAssetsNames200Ok> response = api.postCharactersCharacterIdAssetsNames(characterId, itemIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation asset locations
     *
     * Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)  ---  Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCorporationsCorporationIdAssetsLocationsTest() throws ApiException {
        Integer corporationId = null;
        List<Long> itemIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<PostCorporationsCorporationIdAssetsLocations200Ok> response = api.postCorporationsCorporationIdAssetsLocations(corporationId, itemIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get coporation asset names
     *
     * Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships.  ---  Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCorporationsCorporationIdAssetsNamesTest() throws ApiException {
        Integer corporationId = null;
        List<Long> itemIds = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<PostCorporationsCorporationIdAssetsNames200Ok> response = api.postCorporationsCorporationIdAssetsNames(corporationId, itemIds, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
