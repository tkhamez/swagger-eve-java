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

import io.swagger.client.eve.ApiCallback;
import io.swagger.client.eve.ApiClient;
import io.swagger.client.eve.ApiException;
import io.swagger.client.eve.ApiResponse;
import io.swagger.client.eve.Configuration;
import io.swagger.client.eve.Pair;
import io.swagger.client.eve.ProgressRequestBody;
import io.swagger.client.eve.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetaryInteractionApi {
    private ApiClient apiClient;

    public PlanetaryInteractionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlanetaryInteractionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdPlanets
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsCall(Integer characterId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/planets/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdPlanetsValidateBeforeCall(Integer characterId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdPlanets(Async)");
        }
        

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsCall(characterId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get colonies
     * Returns a list of all planetary colonies owned by a character.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return List&lt;GetCharactersCharacterIdPlanets200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdPlanets200Ok> getCharactersCharacterIdPlanets(Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdPlanets200Ok>> resp = getCharactersCharacterIdPlanetsWithHttpInfo(characterId, datasource, ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get colonies
     * Returns a list of all planetary colonies owned by a character.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdPlanets200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdPlanets200Ok>> getCharactersCharacterIdPlanetsWithHttpInfo(Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsValidateBeforeCall(characterId, datasource, ifNoneMatch, token, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdPlanets200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get colonies (asynchronously)
     * Returns a list of all planetary colonies owned by a character.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsAsync(Integer characterId, String datasource, String ifNoneMatch, String token, final ApiCallback<List<GetCharactersCharacterIdPlanets200Ok>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsValidateBeforeCall(characterId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdPlanets200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCharactersCharacterIdPlanetsPlanetId
     * @param characterId An EVE character ID (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsPlanetIdCall(Integer characterId, Integer planetId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/planets/{planet_id}/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()))
            .replaceAll("\\{" + "planet_id" + "\\}", apiClient.escapeString(planetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdPlanetsPlanetIdValidateBeforeCall(Integer characterId, Integer planetId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdPlanetsPlanetId(Async)");
        }
        
        // verify the required parameter 'planetId' is set
        if (planetId == null) {
            throw new ApiException("Missing the required parameter 'planetId' when calling getCharactersCharacterIdPlanetsPlanetId(Async)");
        }
        

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsPlanetIdCall(characterId, planetId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get colony layout
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return GetCharactersCharacterIdPlanetsPlanetIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetId(Integer characterId, Integer planetId, String datasource, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<GetCharactersCharacterIdPlanetsPlanetIdOk> resp = getCharactersCharacterIdPlanetsPlanetIdWithHttpInfo(characterId, planetId, datasource, ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get colony layout
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdPlanetsPlanetIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdPlanetsPlanetIdOk> getCharactersCharacterIdPlanetsPlanetIdWithHttpInfo(Integer characterId, Integer planetId, String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsPlanetIdValidateBeforeCall(characterId, planetId, datasource, ifNoneMatch, token, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPlanetsPlanetIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get colony layout (asynchronously)
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  ---  This route is cached for up to 600 seconds
     * @param characterId An EVE character ID (required)
     * @param planetId Planet id of the target planet (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdPlanetsPlanetIdAsync(Integer characterId, Integer planetId, String datasource, String ifNoneMatch, String token, final ApiCallback<GetCharactersCharacterIdPlanetsPlanetIdOk> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdPlanetsPlanetIdValidateBeforeCall(characterId, planetId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdPlanetsPlanetIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCorporationsCorporationIdCustomsOffices
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param page Which page of results to return (optional, default to 1)
     * @param token Access token to use if unable to set a header (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdCustomsOfficesCall(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/corporations/{corporation_id}/customs_offices/"
            .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCorporationsCorporationIdCustomsOfficesValidateBeforeCall(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdCustomsOffices(Async)");
        }
        

        com.squareup.okhttp.Call call = getCorporationsCorporationIdCustomsOfficesCall(corporationId, datasource, ifNoneMatch, page, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List corporation customs offices
     * List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param page Which page of results to return (optional, default to 1)
     * @param token Access token to use if unable to set a header (optional)
     * @return List&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCorporationsCorporationIdCustomsOffices200Ok> getCorporationsCorporationIdCustomsOffices(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws ApiException {
        ApiResponse<List<GetCorporationsCorporationIdCustomsOffices200Ok>> resp = getCorporationsCorporationIdCustomsOfficesWithHttpInfo(corporationId, datasource, ifNoneMatch, page, token);
        return resp.getData();
    }

    /**
     * List corporation customs offices
     * List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param page Which page of results to return (optional, default to 1)
     * @param token Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCorporationsCorporationIdCustomsOffices200Ok>> getCorporationsCorporationIdCustomsOfficesWithHttpInfo(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdCustomsOfficesValidateBeforeCall(corporationId, datasource, ifNoneMatch, page, token, null, null);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdCustomsOffices200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List corporation customs offices (asynchronously)
     * List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param page Which page of results to return (optional, default to 1)
     * @param token Access token to use if unable to set a header (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdCustomsOfficesAsync(Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token, final ApiCallback<List<GetCorporationsCorporationIdCustomsOffices200Ok>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCorporationsCorporationIdCustomsOfficesValidateBeforeCall(corporationId, datasource, ifNoneMatch, page, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCorporationsCorporationIdCustomsOffices200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUniverseSchematicsSchematicId
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUniverseSchematicsSchematicIdCall(Integer schematicId, String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/universe/schematics/{schematic_id}/"
            .replaceAll("\\{" + "schematic_id" + "\\}", apiClient.escapeString(schematicId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUniverseSchematicsSchematicIdValidateBeforeCall(Integer schematicId, String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'schematicId' is set
        if (schematicId == null) {
            throw new ApiException("Missing the required parameter 'schematicId' when calling getUniverseSchematicsSchematicId(Async)");
        }
        

        com.squareup.okhttp.Call call = getUniverseSchematicsSchematicIdCall(schematicId, datasource, ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get schematic information
     * Get information on a planetary factory schematic  ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return GetUniverseSchematicsSchematicIdOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicId(Integer schematicId, String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<GetUniverseSchematicsSchematicIdOk> resp = getUniverseSchematicsSchematicIdWithHttpInfo(schematicId, datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get schematic information
     * Get information on a planetary factory schematic  ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return ApiResponse&lt;GetUniverseSchematicsSchematicIdOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetUniverseSchematicsSchematicIdOk> getUniverseSchematicsSchematicIdWithHttpInfo(Integer schematicId, String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getUniverseSchematicsSchematicIdValidateBeforeCall(schematicId, datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<GetUniverseSchematicsSchematicIdOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get schematic information (asynchronously)
     * Get information on a planetary factory schematic  ---  This route is cached for up to 3600 seconds
     * @param schematicId A PI schematic ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUniverseSchematicsSchematicIdAsync(Integer schematicId, String datasource, String ifNoneMatch, final ApiCallback<GetUniverseSchematicsSchematicIdOk> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUniverseSchematicsSchematicIdValidateBeforeCall(schematicId, datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetUniverseSchematicsSchematicIdOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
