# PlanetaryInteractionApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdPlanets**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanets) | **GET** /v1/characters/{character_id}/planets/ | Get colonies
[**getCharactersCharacterIdPlanetsPlanetId**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanetsPlanetId) | **GET** /v3/characters/{character_id}/planets/{planet_id}/ | Get colony layout
[**getCorporationsCorporationIdCustomsOffices**](PlanetaryInteractionApi.md#getCorporationsCorporationIdCustomsOffices) | **GET** /v1/corporations/{corporation_id}/customs_offices/ | List corporation customs offices
[**getUniverseSchematicsSchematicId**](PlanetaryInteractionApi.md#getUniverseSchematicsSchematicId) | **GET** /v1/universe/schematics/{schematic_id}/ | Get schematic information


<a name="getCharactersCharacterIdPlanets"></a>
# **getCharactersCharacterIdPlanets**
> List&lt;GetCharactersCharacterIdPlanets200Ok&gt; getCharactersCharacterIdPlanets(characterId, datasource, ifNoneMatch, token)

Get colonies

Returns a list of all planetary colonies owned by a character.  ---  This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.PlanetaryInteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdPlanets200Ok> result = apiInstance.getCharactersCharacterIdPlanets(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getCharactersCharacterIdPlanets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdPlanets200Ok&gt;**](GetCharactersCharacterIdPlanets200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdPlanetsPlanetId"></a>
# **getCharactersCharacterIdPlanetsPlanetId**
> GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource, ifNoneMatch, token)

Get colony layout

Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  ---  This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.PlanetaryInteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer planetId = 56; // Integer | Planet id of the target planet
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdPlanetsPlanetIdOk result = apiInstance.getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getCharactersCharacterIdPlanetsPlanetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **planetId** | **Integer**| Planet id of the target planet |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdPlanetsPlanetIdOk**](GetCharactersCharacterIdPlanetsPlanetIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdCustomsOffices"></a>
# **getCorporationsCorporationIdCustomsOffices**
> List&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt; getCorporationsCorporationIdCustomsOffices(corporationId, datasource, ifNoneMatch, page, token)

List corporation customs offices

List customs offices owned by a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Director

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiClient;
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.Configuration;
//import io.swagger.client.eve.auth.*;
//import io.swagger.client.eve.api.PlanetaryInteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationsCorporationIdCustomsOffices200Ok> result = apiInstance.getCorporationsCorporationIdCustomsOffices(corporationId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getCorporationsCorporationIdCustomsOffices");
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

[**List&lt;GetCorporationsCorporationIdCustomsOffices200Ok&gt;**](GetCorporationsCorporationIdCustomsOffices200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUniverseSchematicsSchematicId"></a>
# **getUniverseSchematicsSchematicId**
> GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicId(schematicId, datasource, ifNoneMatch)

Get schematic information

Get information on a planetary factory schematic  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import io.swagger.client.eve.ApiException;
//import io.swagger.client.eve.api.PlanetaryInteractionApi;


PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer schematicId = 56; // Integer | A PI schematic ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    GetUniverseSchematicsSchematicIdOk result = apiInstance.getUniverseSchematicsSchematicId(schematicId, datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getUniverseSchematicsSchematicId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schematicId** | **Integer**| A PI schematic ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetUniverseSchematicsSchematicIdOk**](GetUniverseSchematicsSchematicIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

