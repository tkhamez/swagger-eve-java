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
import io.swagger.client.eve.model.GetCharactersCharacterIdPlanets200Ok;
import io.swagger.client.eve.model.GetCharactersCharacterIdPlanetsPlanetIdNotFound;
import io.swagger.client.eve.model.GetCharactersCharacterIdPlanetsPlanetIdOk;
import io.swagger.client.eve.model.GetCorporationsCorporationIdCustomsOffices200Ok;
import io.swagger.client.eve.model.GetUniverseSchematicsSchematicIdNotFound;
import io.swagger.client.eve.model.GetUniverseSchematicsSchematicIdOk;
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
 * API tests for PlanetaryInteractionApi
 */
@Ignore
public class PlanetaryInteractionApiTest {

    private final PlanetaryInteractionApi api = new PlanetaryInteractionApi();

    
    /**
     * Get colonies
     *
     * Returns a list of all planetary colonies owned by a character.  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdPlanets200Ok> response = api.getCharactersCharacterIdPlanets(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get colony layout
     *
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPlanetsPlanetIdTest() throws ApiException {
        Integer characterId = null;
        Integer planetId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdPlanetsPlanetIdOk response = api.getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * List corporation customs offices
     *
     * List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdCustomsOfficesTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdCustomsOffices200Ok> response = api.getCorporationsCorporationIdCustomsOffices(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get schematic information
     *
     * Get information on a planetary factory schematic  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUniverseSchematicsSchematicIdTest() throws ApiException {
        Integer schematicId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetUniverseSchematicsSchematicIdOk response = api.getUniverseSchematicsSchematicId(schematicId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
