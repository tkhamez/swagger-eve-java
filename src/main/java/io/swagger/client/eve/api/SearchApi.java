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


import io.swagger.client.eve.model.Forbidden;
import io.swagger.client.eve.model.GetCharactersCharacterIdSearchOk;
import io.swagger.client.eve.model.GetSearchOk;
import io.swagger.client.eve.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient apiClient;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdSearch
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdSearchCall(List<String> categories, Integer characterId, String search, String datasource, String language, Boolean strict, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/search/"
            .replaceAll("\\{" + "character_id" + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (categories != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
        if (strict != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strict", strict));
        if (token != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call getCharactersCharacterIdSearchValidateBeforeCall(List<String> categories, Integer characterId, String search, String datasource, String language, Boolean strict, String token, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'categories' is set
        if (categories == null) {
            throw new ApiException("Missing the required parameter 'categories' when calling getCharactersCharacterIdSearch(Async)");
        }
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdSearch(Async)");
        }
        
        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException("Missing the required parameter 'search' when calling getCharactersCharacterIdSearch(Async)");
        }
        

        com.squareup.okhttp.Call call = getCharactersCharacterIdSearchCall(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetCharactersCharacterIdSearchOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(List<String> categories, Integer characterId, String search, String datasource, String language, Boolean strict, String token, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetCharactersCharacterIdSearchOk> resp = getCharactersCharacterIdSearchWithHttpInfo(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetCharactersCharacterIdSearchOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCharactersCharacterIdSearchOk> getCharactersCharacterIdSearchWithHttpInfo(List<String> categories, Integer characterId, String search, String datasource, String language, Boolean strict, String token, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdSearchValidateBeforeCall(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdSearchOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search on a string (asynchronously)
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param characterId An EVE character ID (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param token Access token to use if unable to set a header (optional)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdSearchAsync(List<String> categories, Integer characterId, String search, String datasource, String language, Boolean strict, String token, String userAgent, String xUserAgent, final ApiCallback<GetCharactersCharacterIdSearchOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdSearchValidateBeforeCall(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCharactersCharacterIdSearchOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSearch
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSearchCall(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/search/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (categories != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (language != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search", search));
        if (strict != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("strict", strict));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
    private com.squareup.okhttp.Call getSearchValidateBeforeCall(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'categories' is set
        if (categories == null) {
            throw new ApiException("Missing the required parameter 'categories' when calling getSearch(Async)");
        }
        
        // verify the required parameter 'search' is set
        if (search == null) {
            throw new ApiException("Missing the required parameter 'search' when calling getSearch(Async)");
        }
        

        com.squareup.okhttp.Call call = getSearchCall(categories, search, datasource, language, strict, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return GetSearchOk
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetSearchOk getSearch(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<GetSearchOk> resp = getSearchWithHttpInfo(categories, search, datasource, language, strict, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Search on a string
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;GetSearchOk&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetSearchOk> getSearchWithHttpInfo(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getSearchValidateBeforeCall(categories, search, datasource, language, strict, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<GetSearchOk>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search on a string (asynchronously)
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     * @param categories Type of entities to search for (required)
     * @param search The string to search on (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param language Language to use in the response (optional, default to en-us)
     * @param strict Whether the search should be a strict match (optional, default to false)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSearchAsync(List<String> categories, String search, String datasource, String language, Boolean strict, String userAgent, String xUserAgent, final ApiCallback<GetSearchOk> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSearchValidateBeforeCall(categories, search, datasource, language, strict, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetSearchOk>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
