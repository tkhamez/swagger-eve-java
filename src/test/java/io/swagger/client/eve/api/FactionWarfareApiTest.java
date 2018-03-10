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
import io.swagger.client.eve.model.GetCharactersCharacterIdFwStatsOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdFwStatsOk;
import io.swagger.client.eve.model.GetFwLeaderboardsCharactersOk;
import io.swagger.client.eve.model.GetFwLeaderboardsCorporationsOk;
import io.swagger.client.eve.model.GetFwLeaderboardsOk;
import io.swagger.client.eve.model.GetFwStats200Ok;
import io.swagger.client.eve.model.GetFwSystems200Ok;
import io.swagger.client.eve.model.GetFwWars200Ok;
import io.swagger.client.eve.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FactionWarfareApi
 */
@Ignore
public class FactionWarfareApiTest {

    private final FactionWarfareApi api = new FactionWarfareApi();

    
    /**
     * Overview of a character involved in faction warfare
     *
     * Statistical overview of a character involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFwStatsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCharactersCharacterIdFwStatsOk response = api.getCharactersCharacterIdFwStats(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Overview of a corporation involved in faction warfare
     *
     * Statistics about a corporation involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdFwStatsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdFwStatsOk response = api.getCorporationsCorporationIdFwStats(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List of the top factions in faction warfare
     *
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsOk response = api.getFwLeaderboards(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List of the top pilots in faction warfare
     *
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCharactersTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsCharactersOk response = api.getFwLeaderboardsCharacters(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List of the top corporations in faction warfare
     *
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCorporationsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetFwLeaderboardsCorporationsOk response = api.getFwLeaderboardsCorporations(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * An overview of statistics about factions involved in faction warfare
     *
     * Statistical overviews of factions involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwStatsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwStats200Ok> response = api.getFwStats(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Ownership of faction warfare systems
     *
     * An overview of the current ownership of faction warfare solar systems  ---  This route is cached for up to 1800 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwSystemsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwSystems200Ok> response = api.getFwSystems(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Data about which NPC factions are at war
     *
     * Data about which NPC factions are at war  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwWarsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetFwWars200Ok> response = api.getFwWars(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
