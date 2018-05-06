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
import io.swagger.client.eve.model.Forbidden;
import io.swagger.client.eve.model.GetUniverseAncestries200Ok;
import io.swagger.client.eve.model.GetUniverseAsteroidBeltsAsteroidBeltIdNotFound;
import io.swagger.client.eve.model.GetUniverseAsteroidBeltsAsteroidBeltIdOk;
import io.swagger.client.eve.model.GetUniverseBloodlines200Ok;
import io.swagger.client.eve.model.GetUniverseCategoriesCategoryIdNotFound;
import io.swagger.client.eve.model.GetUniverseCategoriesCategoryIdOk;
import io.swagger.client.eve.model.GetUniverseConstellationsConstellationIdNotFound;
import io.swagger.client.eve.model.GetUniverseConstellationsConstellationIdOk;
import io.swagger.client.eve.model.GetUniverseFactions200Ok;
import io.swagger.client.eve.model.GetUniverseGraphicsGraphicIdNotFound;
import io.swagger.client.eve.model.GetUniverseGraphicsGraphicIdOk;
import io.swagger.client.eve.model.GetUniverseGroupsGroupIdNotFound;
import io.swagger.client.eve.model.GetUniverseGroupsGroupIdOk;
import io.swagger.client.eve.model.GetUniverseMoonsMoonIdNotFound;
import io.swagger.client.eve.model.GetUniverseMoonsMoonIdOk;
import io.swagger.client.eve.model.GetUniversePlanetsPlanetIdNotFound;
import io.swagger.client.eve.model.GetUniversePlanetsPlanetIdOk;
import io.swagger.client.eve.model.GetUniverseRaces200Ok;
import io.swagger.client.eve.model.GetUniverseRegionsRegionIdNotFound;
import io.swagger.client.eve.model.GetUniverseRegionsRegionIdOk;
import io.swagger.client.eve.model.GetUniverseStargatesStargateIdNotFound;
import io.swagger.client.eve.model.GetUniverseStargatesStargateIdOk;
import io.swagger.client.eve.model.GetUniverseStarsStarIdOk;
import io.swagger.client.eve.model.GetUniverseStationsStationIdNotFound;
import io.swagger.client.eve.model.GetUniverseStationsStationIdOk;
import io.swagger.client.eve.model.GetUniverseStructuresStructureIdNotFound;
import io.swagger.client.eve.model.GetUniverseStructuresStructureIdOk;
import io.swagger.client.eve.model.GetUniverseSystemJumps200Ok;
import io.swagger.client.eve.model.GetUniverseSystemKills200Ok;
import io.swagger.client.eve.model.GetUniverseSystemsSystemIdNotFound;
import io.swagger.client.eve.model.GetUniverseSystemsSystemIdOk;
import io.swagger.client.eve.model.GetUniverseTypesTypeIdNotFound;
import io.swagger.client.eve.model.GetUniverseTypesTypeIdOk;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.PostUniverseIdsOk;
import io.swagger.client.eve.model.PostUniverseNames200Ok;
import io.swagger.client.eve.model.PostUniverseNamesNotFound;
import io.swagger.client.eve.model.ServiceUnavailable;
import io.swagger.client.eve.model.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UniverseApi
 */
@Ignore
public class UniverseApiTest {

    private final UniverseApi api = new UniverseApi();

    
    /**
     * Get ancestries
     *
     * Get all character ancestries  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseAncestriesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseAncestries200Ok> response = api.getUniverseAncestries(datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get asteroid belt information
     *
     * Get information on an asteroid belt  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseAsteroidBeltsAsteroidBeltIdTest() throws ApiException {
        Integer asteroidBeltId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseAsteroidBeltsAsteroidBeltIdOk response = api.getUniverseAsteroidBeltsAsteroidBeltId(asteroidBeltId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get bloodlines
     *
     * Get a list of bloodlines  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseBloodlinesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseBloodlines200Ok> response = api.getUniverseBloodlines(datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get item categories
     *
     * Get a list of item categories  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseCategoriesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseCategories(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get item category information
     *
     * Get information of an item category  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseCategoriesCategoryIdTest() throws ApiException {
        Integer categoryId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseCategoriesCategoryIdOk response = api.getUniverseCategoriesCategoryId(categoryId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get constellations
     *
     * Get a list of constellations  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseConstellationsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseConstellations(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get constellation information
     *
     * Get information on a constellation  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseConstellationsConstellationIdTest() throws ApiException {
        Integer constellationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseConstellationsConstellationIdOk response = api.getUniverseConstellationsConstellationId(constellationId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get factions
     *
     * Get a list of factions  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseFactionsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseFactions200Ok> response = api.getUniverseFactions(datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get graphics
     *
     * Get a list of graphics  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseGraphicsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseGraphics(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get graphic information
     *
     * Get information on a graphic  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseGraphicsGraphicIdTest() throws ApiException {
        Integer graphicId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseGraphicsGraphicIdOk response = api.getUniverseGraphicsGraphicId(graphicId, datasource, ifNoneMatch, userAgent, xUserAgent);

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
    public void getUniverseGroupsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseGroups(datasource, ifNoneMatch, page, userAgent, xUserAgent);

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
    public void getUniverseGroupsGroupIdTest() throws ApiException {
        Integer groupId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseGroupsGroupIdOk response = api.getUniverseGroupsGroupId(groupId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get moon information
     *
     * Get information on a moon  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseMoonsMoonIdTest() throws ApiException {
        Integer moonId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseMoonsMoonIdOk response = api.getUniverseMoonsMoonId(moonId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get planet information
     *
     * Get information on a planet  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniversePlanetsPlanetIdTest() throws ApiException {
        Integer planetId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniversePlanetsPlanetIdOk response = api.getUniversePlanetsPlanetId(planetId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get character races
     *
     * Get a list of character races  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseRacesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseRaces200Ok> response = api.getUniverseRaces(datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get regions
     *
     * Get a list of regions  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseRegionsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseRegions(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get region information
     *
     * Get information on a region  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseRegionsRegionIdTest() throws ApiException {
        Integer regionId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseRegionsRegionIdOk response = api.getUniverseRegionsRegionId(regionId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get stargate information
     *
     * Get information on a stargate  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStargatesStargateIdTest() throws ApiException {
        Integer stargateId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseStargatesStargateIdOk response = api.getUniverseStargatesStargateId(stargateId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get star information
     *
     * Get information on a star  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStarsStarIdTest() throws ApiException {
        Integer starId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseStarsStarIdOk response = api.getUniverseStarsStarId(starId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get station information
     *
     * Get information on a station  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStationsStationIdTest() throws ApiException {
        Integer stationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseStationsStationIdOk response = api.getUniverseStationsStationId(stationId, datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List all public structures
     *
     * List all public structures  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStructuresTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Long> response = api.getUniverseStructures(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get structure information
     *
     * Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseStructuresStructureIdTest() throws ApiException {
        Long structureId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseStructuresStructureIdOk response = api.getUniverseStructuresStructureId(structureId, datasource, ifNoneMatch, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get system jumps
     *
     * Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSystemJumpsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseSystemJumps200Ok> response = api.getUniverseSystemJumps(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get system kills
     *
     * Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSystemKillsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetUniverseSystemKills200Ok> response = api.getUniverseSystemKills(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get solar systems
     *
     * Get a list of solar systems  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSystemsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseSystems(datasource, ifNoneMatch, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get solar system information
     *
     * Get information on a solar system  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSystemsSystemIdTest() throws ApiException {
        Integer systemId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseSystemsSystemIdOk response = api.getUniverseSystemsSystemId(systemId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get types
     *
     * Get a list of type ids  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseTypesTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getUniverseTypes(datasource, ifNoneMatch, page, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get type information
     *
     * Get information on a type  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseTypesTypeIdTest() throws ApiException {
        Integer typeId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        GetUniverseTypesTypeIdOk response = api.getUniverseTypesTypeId(typeId, datasource, ifNoneMatch, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Bulk names to IDs
     *
     * Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours.  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUniverseIdsTest() throws ApiException {
        List<String> names = null;
        String datasource = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        PostUniverseIdsOk response = api.postUniverseIds(names, datasource, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get names and categories for a set of ID&#39;s
     *
     * Resolve a set of IDs to names and categories. Supported ID&#39;s for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types.  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUniverseNamesTest() throws ApiException {
        List<Integer> ids = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<PostUniverseNames200Ok> response = api.postUniverseNames(ids, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
