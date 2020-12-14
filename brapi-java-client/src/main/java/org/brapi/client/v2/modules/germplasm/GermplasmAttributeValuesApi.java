/*
 * BrAPI-Germplasm
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.germplasm;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.ApiClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.GermplasmAttributeValueQueryParams;
import org.brapi.v2.model.germ.GermplasmAttributeValueListResponse;
import org.brapi.v2.model.germ.GermplasmAttributeValueNewRequest;
import org.brapi.v2.model.germ.GermplasmAttributeValueSearchRequest;
import org.brapi.v2.model.germ.GermplasmAttributeValueSingleResponse;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;

public class GermplasmAttributeValuesApi {
    private ApiClient apiClient;

    public GermplasmAttributeValuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GermplasmAttributeValuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for attributevaluesAttributeValueDbIdGet
     * @param attributeValueDbId The unique id for an attribute value (required)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call attributevaluesAttributeValueDbIdGetCall(String attributeValueDbId) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/attributevalues/{attributeValueDbId}"
            .replaceAll("\\{" + "attributeValueDbId" + "\\}", apiClient.escapeString(attributeValueDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the details for a specific Germplasm Attribute
     * Get the details for a specific Germplasm Attribute
     * @param attributeValueDbId The unique id for an attribute value (required)

     * @return ApiResponse&lt;GermplasmAttributeValueSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueSingleResponse> attributevaluesAttributeValueDbIdGet(String attributeValueDbId) throws ApiException {
        Call call = attributevaluesAttributeValueDbIdGetCall(attributeValueDbId);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details for a specific Germplasm Attribute (asynchronously)
     * Get the details for a specific Germplasm Attribute
     * @param attributeValueDbId The unique id for an attribute value (required)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call attributevaluesAttributeValueDbIdGetAsync(String attributeValueDbId, final ApiCallback<GermplasmAttributeValueSingleResponse> callback) throws ApiException {
        Call call = attributevaluesAttributeValueDbIdGetCall(attributeValueDbId);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for attributevaluesAttributeValueDbIdPut
     * @param attributeValueDbId The unique id for an attribute value (required)
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call attributevaluesAttributeValueDbIdPutCall(String attributeValueDbId, GermplasmAttributeValueNewRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/attributevalues/{attributeValueDbId}"
            .replaceAll("\\{" + "attributeValueDbId" + "\\}", apiClient.escapeString(attributeValueDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Update an existing Germplasm Attribute Value
     * Update an existing Germplasm Attribute Value
     * @param attributeValueDbId The unique id for an attribute value (required)
     * @param body  (optional)

     * @return ApiResponse&lt;GermplasmAttributeValueSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueSingleResponse> attributevaluesAttributeValueDbIdPut(String attributeValueDbId, GermplasmAttributeValueNewRequest body) throws ApiException {
        Call call = attributevaluesAttributeValueDbIdPutCall(attributeValueDbId, body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing Germplasm Attribute Value (asynchronously)
     * Update an existing Germplasm Attribute Value
     * @param attributeValueDbId The unique id for an attribute value (required)
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call attributevaluesAttributeValueDbIdPutAsync(String attributeValueDbId, GermplasmAttributeValueNewRequest body, final ApiCallback<GermplasmAttributeValueSingleResponse> callback) throws ApiException {
        Call call = attributevaluesAttributeValueDbIdPutCall(attributeValueDbId, body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for attributevaluesGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call attributevaluesGetCall(GermplasmAttributeValueQueryParams queryParams) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/attributevalues";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.attributeValueDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "attributeValueDbId", queryParams.attributeValueDbId());
        if (queryParams.attributeDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "attributeDbId", queryParams.attributeDbId());
        if (queryParams.attributeName() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "attributeName", queryParams.attributeName());
        if (queryParams.germplasmDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "germplasmDbId", queryParams.germplasmDbId());
        if (queryParams.externalReferenceID() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceID", queryParams.externalReferenceID());
        if (queryParams.externalReferenceSource() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "externalReferenceSource", queryParams.externalReferenceSource());
        if (queryParams.page() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", queryParams.page());
        if (queryParams.pageSize() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", queryParams.pageSize());

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the Germplasm Attribute Values
     * Get the Germplasm Attribute Values
     * @param queryParams
     * @return ApiResponse&lt;GermplasmAttributeValueListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueListResponse> attributevaluesGet(GermplasmAttributeValueQueryParams queryParams) throws ApiException {
        Call call = attributevaluesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Germplasm Attribute Values (asynchronously)
     * Get the Germplasm Attribute Values
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call attributevaluesGetAsync(GermplasmAttributeValueQueryParams queryParams, final ApiCallback<GermplasmAttributeValueListResponse> callback) throws ApiException {
        Call call = attributevaluesGetCall(queryParams);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for attributevaluesPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call attributevaluesPostCall(List<GermplasmAttributeValueNewRequest> body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/attributevalues";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Create new Germplasm Attribute Values
     * Create new Germplasm Attribute Values
     * @param body  (optional)

     * @return ApiResponse&lt;GermplasmAttributeValueListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueListResponse> attributevaluesPost(List<GermplasmAttributeValueNewRequest> body) throws ApiException {
        Call call = attributevaluesPostCall(body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new Germplasm Attribute Values (asynchronously)
     * Create new Germplasm Attribute Values
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call attributevaluesPostAsync(List<GermplasmAttributeValueNewRequest> body, final ApiCallback<GermplasmAttributeValueListResponse> callback) throws ApiException {
        Call call = attributevaluesPostCall(body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAttributevaluesPost
     * @param body  (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchAttributevaluesPostCall(GermplasmAttributeValueSearchRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/attributevalues";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Submit a search request for Germplasm Attribute Values
     * Search for a set of Germplasm Attribute Values based on some criteria          See Search Services for additional implementation details.
     * @param body  (optional)

     * @return ApiResponse&lt;GermplasmAttributeValueListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueListResponse> searchAttributevaluesPost(GermplasmAttributeValueSearchRequest body) throws ApiException {
        Call call = searchAttributevaluesPostCall(body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a search request for Germplasm Attribute Values (asynchronously)
     * Search for a set of Germplasm Attribute Values based on some criteria          See Search Services for additional implementation details.
     * @param body  (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchAttributevaluesPostAsync(GermplasmAttributeValueSearchRequest body, final ApiCallback<GermplasmAttributeValueListResponse> callback) throws ApiException {
        Call call = searchAttributevaluesPostCall(body);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAttributevaluesSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchAttributevaluesSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/attributevalues/{searchResultsDbId}"
            .replaceAll("\\{" + "searchResultsDbId" + "\\}", apiClient.escapeString(searchResultsDbId.toString()));

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (page != null)
            apiClient.prepQueryParameter(localVarQueryParams, "page", page);
        if (pageSize != null)
            apiClient.prepQueryParameter(localVarQueryParams, "pageSize", pageSize);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        

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

        String[] localVarAuthNames = new String[] { "AuthorizationToken" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }

    /**
     * Get the results of a Germplasm Attribute Values search request
     * Get the results of a Germplasm Attribute Values search request  See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @return ApiResponse&lt;GermplasmAttributeValueListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GermplasmAttributeValueListResponse> searchAttributevaluesSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Call call = searchAttributevaluesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a Germplasm Attribute Values search request (asynchronously)
     * Get the results of a Germplasm Attribute Values search request  See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchAttributevaluesSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, final ApiCallback<GermplasmAttributeValueListResponse> callback) throws ApiException {
        Call call = searchAttributevaluesSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<GermplasmAttributeValueListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
