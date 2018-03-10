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
import io.swagger.client.eve.model.GetCorporationsCorporationIdAlliancehistory200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdBlueprints200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdContainersLogs200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdDivisionsOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdFacilities200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdIconsNotFound;
import io.swagger.client.eve.model.GetCorporationsCorporationIdIconsOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdMedals200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdMedalsIssued200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdMembersTitles200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdMembertracking200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdNotFound;
import io.swagger.client.eve.model.GetCorporationsCorporationIdOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdOutpostsOutpostIdOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdRoles200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdRolesHistory200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdShareholders200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdStandings200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdStarbases200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdStarbasesStarbaseIdOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdStructures200Ok;
import io.swagger.client.eve.model.GetCorporationsCorporationIdTitles200Ok;
import io.swagger.client.eve.model.GetCorporationsNames200Ok;
import io.swagger.client.eve.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CorporationApi
 */
@Ignore
public class CorporationApiTest {

    private final CorporationApi api = new CorporationApi();

    
    /**
     * Get corporation information
     *
     * Public information about a corporation  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdOk response = api.getCorporationsCorporationId(corporationId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance history
     *
     * Get a list of all the alliances a corporation has been a member of  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdAlliancehistoryTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdAlliancehistory200Ok> response = api.getCorporationsCorporationIdAlliancehistory(corporationId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation blueprints
     *
     * Returns a list of blueprints the corporation owns  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director  --- [This route has an available update](https://esi.tech.ccp.is/diff/latest/dev/#GET-/corporations/{corporation_id}/blueprints/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdBlueprintsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdBlueprints200Ok> response = api.getCorporationsCorporationIdBlueprints(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get all corporation ALSC logs
     *
     * Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation  ---  This route is cached for up to 600 seconds  --- Requires one of the following EVE corporation role(s): Director  --- [This route has an available update](https://esi.tech.ccp.is/diff/latest/dev/#GET-/corporations/{corporation_id}/containers/logs/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdContainersLogsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdContainersLogs200Ok> response = api.getCorporationsCorporationIdContainersLogs(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation divisions
     *
     * Return corporation hangar and wallet division names, only show if a division is not using the default name  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdDivisionsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdDivisionsOk response = api.getCorporationsCorporationIdDivisions(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation facilities
     *
     * Return a corporation&#39;s facilities  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdFacilitiesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdFacilities200Ok> response = api.getCorporationsCorporationIdFacilities(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation icon
     *
     * Get the icon urls for a corporation  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdIconsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdIconsOk response = api.getCorporationsCorporationIdIcons(corporationId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation medals
     *
     * Returns a corporation&#39;s medals  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMedalsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdMedals200Ok> response = api.getCorporationsCorporationIdMedals(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation issued medals
     *
     * Returns medals issued by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMedalsIssuedTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdMedalsIssued200Ok> response = api.getCorporationsCorporationIdMedalsIssued(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation members
     *
     * Return the current member list of a corporation, the token&#39;s character need to be a member of the corporation.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMembersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getCorporationsCorporationIdMembers(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation member limit
     *
     * Return a corporation&#39;s member limit, not including CEO himself  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMembersLimitTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        Integer response = api.getCorporationsCorporationIdMembersLimit(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation&#39;s members&#39; titles
     *
     * Returns a corporation&#39;s members&#39; titles  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMembersTitlesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdMembersTitles200Ok> response = api.getCorporationsCorporationIdMembersTitles(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Track corporation members
     *
     * Returns additional information about a corporation&#39;s members which helps tracking their activities  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdMembertrackingTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdMembertracking200Ok> response = api.getCorporationsCorporationIdMembertracking(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation outposts
     *
     * Get a list of corporation outpost IDs Note: This endpoint will be removed once outposts are migrated to Citadels as talked about in this blog: https://community.eveonline.com/news/dev-blogs/the-next-steps-in-structure-transition/  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdOutpostsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getCorporationsCorporationIdOutposts(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation outpost details
     *
     * Get details about a given outpost. Note: This endpoint will be removed once outposts are migrated to Citadels as talked about in this blog: https://community.eveonline.com/news/dev-blogs/the-next-steps-in-structure-transition/  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdOutpostsOutpostIdTest() throws ApiException {
        Integer corporationId = null;
        Integer outpostId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdOutpostsOutpostIdOk response = api.getCorporationsCorporationIdOutpostsOutpostId(corporationId, outpostId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation member roles
     *
     * Return the roles of all members if the character has the personnel manager role or any grantable role.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdRolesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdRoles200Ok> response = api.getCorporationsCorporationIdRoles(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation member roles history
     *
     * Return how roles have changed for a coporation&#39;s members, up to a month  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdRolesHistoryTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdRolesHistory200Ok> response = api.getCorporationsCorporationIdRolesHistory(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation shareholders
     *
     * Return the current shareholders of a corporation.  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdShareholdersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdShareholders200Ok> response = api.getCorporationsCorporationIdShareholders(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation standings
     *
     * Return corporation standings from agents, NPC corporations, and factions  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdStandingsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdStandings200Ok> response = api.getCorporationsCorporationIdStandings(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation starbases (POSes)
     *
     * Returns list of corporation starbases (POSes)  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdStarbasesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdStarbases200Ok> response = api.getCorporationsCorporationIdStarbases(corporationId, datasource, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get starbase (POS) detail
     *
     * Returns various settings and fuels of a starbase (POS)  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdStarbasesStarbaseIdTest() throws ApiException {
        Integer corporationId = null;
        Long starbaseId = null;
        Integer systemId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCorporationsCorporationIdStarbasesStarbaseIdOk response = api.getCorporationsCorporationIdStarbasesStarbaseId(corporationId, starbaseId, systemId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation structures
     *
     * Get a list of corporation structures. This route&#39;s version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): StationManager
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdStructuresTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String language = null;
        Integer page = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdStructures200Ok> response = api.getCorporationsCorporationIdStructures(corporationId, datasource, language, page, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation titles
     *
     * Returns a corporation&#39;s titles  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdTitlesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsCorporationIdTitles200Ok> response = api.getCorporationsCorporationIdTitles(corporationId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get corporation names
     *
     * Resolve a set of corporation IDs to corporation names  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsNamesTest() throws ApiException {
        List<Integer> corporationIds = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetCorporationsNames200Ok> response = api.getCorporationsNames(corporationIds, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get npc corporations
     *
     * Get a list of npc corporations  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsNpccorpsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getCorporationsNpccorps(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
