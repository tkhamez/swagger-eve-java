# IndustryApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdIndustryJobs**](IndustryApi.md#getCharactersCharacterIdIndustryJobs) | **GET** /v1/characters/{character_id}/industry/jobs/ | List character industry jobs
[**getCharactersCharacterIdMining**](IndustryApi.md#getCharactersCharacterIdMining) | **GET** /v1/characters/{character_id}/mining/ | Character mining ledger
[**getCorporationCorporationIdMiningExtractions**](IndustryApi.md#getCorporationCorporationIdMiningExtractions) | **GET** /v1/corporation/{corporation_id}/mining/extractions/ | Moon extraction timers
[**getCorporationCorporationIdMiningObservers**](IndustryApi.md#getCorporationCorporationIdMiningObservers) | **GET** /v1/corporation/{corporation_id}/mining/observers/ | Corporation mining observers
[**getCorporationCorporationIdMiningObserversObserverId**](IndustryApi.md#getCorporationCorporationIdMiningObserversObserverId) | **GET** /v1/corporation/{corporation_id}/mining/observers/{observer_id}/ | Observed corporation mining
[**getCorporationsCorporationIdIndustryJobs**](IndustryApi.md#getCorporationsCorporationIdIndustryJobs) | **GET** /v1/corporations/{corporation_id}/industry/jobs/ | List corporation industry jobs
[**getIndustryFacilities**](IndustryApi.md#getIndustryFacilities) | **GET** /v1/industry/facilities/ | List industry facilities
[**getIndustrySystems**](IndustryApi.md#getIndustrySystems) | **GET** /v1/industry/systems/ | List solar system cost indices


<a name="getCharactersCharacterIdIndustryJobs"></a>
# **getCharactersCharacterIdIndustryJobs**
> List&lt;GetCharactersCharacterIdIndustryJobs200Ok&gt; getCharactersCharacterIdIndustryJobs(characterId, datasource, ifNoneMatch, includeCompleted, token)

List character industry jobs

List industry jobs placed by a character  ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Boolean includeCompleted = true; // Boolean | Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdIndustryJobs200Ok> result = apiInstance.getCharactersCharacterIdIndustryJobs(characterId, datasource, ifNoneMatch, includeCompleted, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCharactersCharacterIdIndustryJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **includeCompleted** | **Boolean**| Whether to retrieve completed character industry jobs. Only includes jobs from the past 90 days | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdIndustryJobs200Ok&gt;**](GetCharactersCharacterIdIndustryJobs200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdMining"></a>
# **getCharactersCharacterIdMining**
> List&lt;GetCharactersCharacterIdMining200Ok&gt; getCharactersCharacterIdMining(characterId, datasource, ifNoneMatch, page, token)

Character mining ledger

Paginated record of all mining done by a character for the past 30 days  ---  This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdMining200Ok> result = apiInstance.getCharactersCharacterIdMining(characterId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCharactersCharacterIdMining");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdMining200Ok&gt;**](GetCharactersCharacterIdMining200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationCorporationIdMiningExtractions"></a>
# **getCorporationCorporationIdMiningExtractions**
> List&lt;GetCorporationCorporationIdMiningExtractions200Ok&gt; getCorporationCorporationIdMiningExtractions(corporationId, datasource, ifNoneMatch, page, token)

Moon extraction timers

Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.  ---  This route is cached for up to 1800 seconds  --- Requires one of the following EVE corporation role(s): Station_Manager

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationCorporationIdMiningExtractions200Ok> result = apiInstance.getCorporationCorporationIdMiningExtractions(corporationId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCorporationCorporationIdMiningExtractions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCorporationCorporationIdMiningExtractions200Ok&gt;**](GetCorporationCorporationIdMiningExtractions200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationCorporationIdMiningObservers"></a>
# **getCorporationCorporationIdMiningObservers**
> List&lt;GetCorporationCorporationIdMiningObservers200Ok&gt; getCorporationCorporationIdMiningObservers(corporationId, datasource, ifNoneMatch, page, token)

Corporation mining observers

Paginated list of all entities capable of observing and recording mining for a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationCorporationIdMiningObservers200Ok> result = apiInstance.getCorporationCorporationIdMiningObservers(corporationId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCorporationCorporationIdMiningObservers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCorporationCorporationIdMiningObservers200Ok&gt;**](GetCorporationCorporationIdMiningObservers200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationCorporationIdMiningObserversObserverId"></a>
# **getCorporationCorporationIdMiningObserversObserverId**
> List&lt;GetCorporationCorporationIdMiningObserversObserverId200Ok&gt; getCorporationCorporationIdMiningObserversObserverId(corporationId, observerId, datasource, ifNoneMatch, page, token)

Observed corporation mining

Paginated record of all mining seen by an observer  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
Long observerId = 789L; // Long | A mining observer id
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationCorporationIdMiningObserversObserverId200Ok> result = apiInstance.getCorporationCorporationIdMiningObserversObserverId(corporationId, observerId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCorporationCorporationIdMiningObserversObserverId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **observerId** | **Long**| A mining observer id |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCorporationCorporationIdMiningObserversObserverId200Ok&gt;**](GetCorporationCorporationIdMiningObserversObserverId200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdIndustryJobs"></a>
# **getCorporationsCorporationIdIndustryJobs**
> List&lt;GetCorporationsCorporationIdIndustryJobs200Ok&gt; getCorporationsCorporationIdIndustryJobs(corporationId, datasource, ifNoneMatch, includeCompleted, page, token)

List corporation industry jobs

List industry jobs run by a corporation  ---  This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Factory_Manager

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.IndustryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

IndustryApi apiInstance = new IndustryApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Boolean includeCompleted = false; // Boolean | Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationsCorporationIdIndustryJobs200Ok> result = apiInstance.getCorporationsCorporationIdIndustryJobs(corporationId, datasource, ifNoneMatch, includeCompleted, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getCorporationsCorporationIdIndustryJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **includeCompleted** | **Boolean**| Whether to retrieve completed corporation industry jobs. Only includes jobs from the past 90 days | [optional] [default to false]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdIndustryJobs200Ok&gt;**](GetCorporationsCorporationIdIndustryJobs200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIndustryFacilities"></a>
# **getIndustryFacilities**
> List&lt;GetIndustryFacilities200Ok&gt; getIndustryFacilities(datasource, ifNoneMatch)

List industry facilities

Return a list of industry facilities  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    List<GetIndustryFacilities200Ok> result = apiInstance.getIndustryFacilities(datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustryFacilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**List&lt;GetIndustryFacilities200Ok&gt;**](GetIndustryFacilities200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIndustrySystems"></a>
# **getIndustrySystems**
> List&lt;GetIndustrySystems200Ok&gt; getIndustrySystems(datasource, ifNoneMatch)

List solar system cost indices

Return cost indices for solar systems  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    List<GetIndustrySystems200Ok> result = apiInstance.getIndustrySystems(datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustrySystems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**List&lt;GetIndustrySystems200Ok&gt;**](GetIndustrySystems200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

