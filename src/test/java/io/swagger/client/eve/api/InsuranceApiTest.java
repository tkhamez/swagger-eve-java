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
import io.swagger.client.eve.model.GetInsurancePrices200Ok;
import io.swagger.client.eve.model.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InsuranceApi
 */
@Ignore
public class InsuranceApiTest {

    private final InsuranceApi api = new InsuranceApi();

    
    /**
     * List insurance levels
     *
     * Return available insurance levels for all ship types  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInsurancePricesTest() throws ApiException {
        String datasource = null;
        String language = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetInsurancePrices200Ok> response = api.getInsurancePrices(datasource, language, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
