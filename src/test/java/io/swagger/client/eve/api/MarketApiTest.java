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
import io.swagger.client.eve.model.GetCharactersCharacterIdOrders200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdOrdersHistory200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdOrders200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdOrdersHistory200Ok;
import io.swagger.client.eve.model.GetMarketsGroupsMarketGroupIdNotFound;
import io.swagger.client.eve.model.GetMarketsGroupsMarketGroupIdOk;
import io.swagger.client.eve.model.GetMarketsPrices200Ok;
import io.swagger.client.eve.model.GetMarketsRegionIdHistory200Ok;
import io.swagger.client.eve.model.GetMarketsRegionIdHistoryError520;
import io.swagger.client.eve.model.GetMarketsRegionIdHistoryNotFound;
import io.swagger.client.eve.model.GetMarketsRegionIdHistoryUnprocessableEntity;
import io.swagger.client.eve.model.GetMarketsRegionIdOrders200Ok;
import io.swagger.client.eve.model.GetMarketsRegionIdOrdersNotFound;
import io.swagger.client.eve.model.GetMarketsRegionIdOrdersUnprocessableEntity;
import io.swagger.client.eve.model.GetMarketsStructuresStructureId200Ok;
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
 * API tests for MarketApi
 */
@Ignore
public class MarketApiTest {

    private final MarketApi api = new MarketApi();

    
    /**
     * List open orders from a character
     *
     * List open market orders placed by a character  ---  This route is cached for up to 1200 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOrdersTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdOrders200Ok> response = api.getCharactersCharacterIdOrders(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * List historical orders by a character
     *
     * List cancelled and expired market orders placed by a character up to 90 days in the past.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOrdersHistoryTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCharactersCharacterIdOrdersHistory200Ok> response = api.getCharactersCharacterIdOrdersHistory(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List open orders from a corporation
     *
     * List open market orders placed on behalf of a corporation  ---  This route is cached for up to 1200 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdOrdersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdOrders200Ok> response = api.getCorporationsCorporationIdOrders(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List historical orders from a corporation
     *
     * List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdOrdersHistoryTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdOrdersHistory200Ok> response = api.getCorporationsCorporationIdOrdersHistory(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get item groups
     *
     * Get a list of item groups  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsGroupsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<Integer> response = api.getMarketsGroups(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get item group information
     *
     * Get information on an item group  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsGroupsMarketGroupIdTest() throws ApiException {
        Integer marketGroupId = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        GetMarketsGroupsMarketGroupIdOk response = api.getMarketsGroupsMarketGroupId(marketGroupId, acceptLanguage, datasource, ifNoneMatch, language);

        // TODO: test validations
    }
    
    /**
     * List market prices
     *
     * Return a list of prices  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsPricesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<GetMarketsPrices200Ok> response = api.getMarketsPrices(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List historical market statistics in a region
     *
     * Return a list of historical market statistics for the specified type in a region  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsRegionIdHistoryTest() throws ApiException {
        Integer regionId = null;
        Integer typeId = null;
        String datasource = null;
        String ifNoneMatch = null;
        List<GetMarketsRegionIdHistory200Ok> response = api.getMarketsRegionIdHistory(regionId, typeId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List orders in a region
     *
     * Return a list of orders in a region  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsRegionIdOrdersTest() throws ApiException {
        String orderType = null;
        Integer regionId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        Integer typeId = null;
        List<GetMarketsRegionIdOrders200Ok> response = api.getMarketsRegionIdOrders(orderType, regionId, datasource, ifNoneMatch, page, typeId);

        // TODO: test validations
    }
    
    /**
     * List type IDs relevant to a market
     *
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsRegionIdTypesTest() throws ApiException {
        Integer regionId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        List<Integer> response = api.getMarketsRegionIdTypes(regionId, datasource, ifNoneMatch, page);

        // TODO: test validations
    }
    
    /**
     * List orders in a structure
     *
     * Return all orders in a structure  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketsStructuresStructureIdTest() throws ApiException {
        Long structureId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetMarketsStructuresStructureId200Ok> response = api.getMarketsStructuresStructureId(structureId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
}
