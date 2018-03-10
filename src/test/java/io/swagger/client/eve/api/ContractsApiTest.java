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
import io.swagger.client.eve.model.GetCharactersCharacterIdContracts200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdContractsContractIdBids200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdContractsContractIdItems200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdContracts200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdContractsContractIdBids200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdContractsContractIdItems200Ok;
import io.swagger.client.eve.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractsApi
 */
@Ignore
public class ContractsApiTest {

    private final ContractsApi api = new ContractsApi();

    
    /**
     * Get contracts
     *
     * Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContracts200Ok> response = api.getCharactersCharacterIdContracts(characterId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contract bids
     *
     * Lists bids on a particular auction contract  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsContractIdBidsTest() throws ApiException {
        Integer characterId = null;
        Integer contractId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContractsContractIdBids200Ok> response = api.getCharactersCharacterIdContractsContractIdBids(characterId, contractId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get contract items
     *
     * Lists items of a particular contract  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdContractsContractIdItemsTest() throws ApiException {
        Integer characterId = null;
        Integer contractId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCharactersCharacterIdContractsContractIdItems200Ok> response = api.getCharactersCharacterIdContractsContractIdItems(characterId, contractId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get coporation contracts
     *
     * Returns contracts available to a coporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContractsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContracts200Ok> response = api.getCorporationsCorporationIdContracts(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation contract bids
     *
     * Lists bids on a particular auction contract  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContractsContractIdBidsTest() throws ApiException {
        Integer contractId = null;
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContractsContractIdBids200Ok> response = api.getCorporationsCorporationIdContractsContractIdBids(contractId, corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation contract items
     *
     * Lists items of a particular contract  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContractsContractIdItemsTest() throws ApiException {
        Integer contractId = null;
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContractsContractIdItems200Ok> response = api.getCorporationsCorporationIdContractsContractIdItems(contractId, corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
