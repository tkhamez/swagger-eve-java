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
import io.swagger.client.eve.model.GetCharactersCharacterIdLoyaltyPoints200Ok;
import io.swagger.client.eve.model.GetLoyaltyStoresCorporationIdOffers200Ok;
import io.swagger.client.eve.model.GetLoyaltyStoresCorporationIdOffersNotFound;
import io.swagger.client.eve.model.InternalServerError;
import io.swagger.client.eve.model.ServiceUnavailable;
import io.swagger.client.eve.model.Unauthorized;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoyaltyApi {
    private ApiClient apiClient;

    public LoyaltyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LoyaltyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdLoyaltyPoints
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdLoyaltyPointsCall(Integer characterId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/loyalty/points/"
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
    private com.squareup.okhttp.Call getCharactersCharacterIdLoyaltyPointsValidateBeforeCall(Integer characterId, String datasource, String ifNoneMatch, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException("Missing the required parameter 'characterId' when calling getCharactersCharacterIdLoyaltyPoints(Async)");
        }
        

        com.squareup.okhttp.Call call = getCharactersCharacterIdLoyaltyPointsCall(characterId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get loyalty points
     * Return a list of loyalty points for all corporations the character has worked for  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return List&lt;GetCharactersCharacterIdLoyaltyPoints200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetCharactersCharacterIdLoyaltyPoints200Ok> getCharactersCharacterIdLoyaltyPoints(Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> resp = getCharactersCharacterIdLoyaltyPointsWithHttpInfo(characterId, datasource, ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get loyalty points
     * Return a list of loyalty points for all corporations the character has worked for  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;GetCharactersCharacterIdLoyaltyPoints200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> getCharactersCharacterIdLoyaltyPointsWithHttpInfo(Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdLoyaltyPointsValidateBeforeCall(characterId, datasource, ifNoneMatch, token, null, null);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdLoyaltyPoints200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get loyalty points (asynchronously)
     * Return a list of loyalty points for all corporations the character has worked for  ---  This route is cached for up to 3600 seconds
     * @param characterId An EVE character ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param token Access token to use if unable to set a header (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdLoyaltyPointsAsync(Integer characterId, String datasource, String ifNoneMatch, String token, final ApiCallback<List<GetCharactersCharacterIdLoyaltyPoints200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCharactersCharacterIdLoyaltyPointsValidateBeforeCall(characterId, datasource, ifNoneMatch, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetCharactersCharacterIdLoyaltyPoints200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLoyaltyStoresCorporationIdOffers
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLoyaltyStoresCorporationIdOffersCall(Integer corporationId, String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/loyalty/stores/{corporation_id}/offers/"
            .replaceAll("\\{" + "corporation_id" + "\\}", apiClient.escapeString(corporationId.toString()));

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
    private com.squareup.okhttp.Call getLoyaltyStoresCorporationIdOffersValidateBeforeCall(Integer corporationId, String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException("Missing the required parameter 'corporationId' when calling getLoyaltyStoresCorporationIdOffers(Async)");
        }
        

        com.squareup.okhttp.Call call = getLoyaltyStoresCorporationIdOffersCall(corporationId, datasource, ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List loyalty store offers
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  This route expires daily at 11:05
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return List&lt;GetLoyaltyStoresCorporationIdOffers200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetLoyaltyStoresCorporationIdOffers200Ok> getLoyaltyStoresCorporationIdOffers(Integer corporationId, String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<GetLoyaltyStoresCorporationIdOffers200Ok>> resp = getLoyaltyStoresCorporationIdOffersWithHttpInfo(corporationId, datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * List loyalty store offers
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  This route expires daily at 11:05
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;GetLoyaltyStoresCorporationIdOffers200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetLoyaltyStoresCorporationIdOffers200Ok>> getLoyaltyStoresCorporationIdOffersWithHttpInfo(Integer corporationId, String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getLoyaltyStoresCorporationIdOffersValidateBeforeCall(corporationId, datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<GetLoyaltyStoresCorporationIdOffers200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List loyalty store offers (asynchronously)
     * Return a list of offers from a specific corporation&#39;s loyalty store  ---  This route expires daily at 11:05
     * @param corporationId An EVE corporation ID (required)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLoyaltyStoresCorporationIdOffersAsync(Integer corporationId, String datasource, String ifNoneMatch, final ApiCallback<List<GetLoyaltyStoresCorporationIdOffers200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLoyaltyStoresCorporationIdOffersValidateBeforeCall(corporationId, datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetLoyaltyStoresCorporationIdOffers200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
