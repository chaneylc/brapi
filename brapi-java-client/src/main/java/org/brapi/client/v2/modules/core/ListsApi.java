/*
 * BrAPI-Core
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.core;

import com.google.gson.reflect.TypeToken;

import okhttp3.Call;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.ApiClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.ListQueryParams;
import org.brapi.v2.model.core.ListNewRequest;
import org.brapi.v2.model.core.ListResponse;
import org.brapi.v2.model.core.ListSearchRequest;
import org.brapi.v2.model.core.ListsListResponse;
import org.brapi.v2.model.core.ListsSingleResponse;

public class ListsApi {
    private ApiClient apiClient;

    public ListsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call listsGetCall(ListQueryParams queryParams) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/lists";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.listType() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "listType", queryParams.listType());
        if (queryParams.listName() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "listName", queryParams.listName());
        if (queryParams.listDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "listDbId", queryParams.listDbId());
        if (queryParams.listSource() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "listSource", queryParams.listSource());
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
     * Get filtered set of generic lists
     * @param queryParams
     * @return ApiResponse&lt;ListsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsListResponse> listsGet(ListQueryParams queryParams) throws ApiException {
        Call call = listsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get filtered set of generic lists (asynchronously)
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listsGetAsync(ListQueryParams queryParams, final ApiCallback<ListsListResponse> callback) throws ApiException {
        Call call = listsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listsListDbIdGet
     * @param listDbId The unique ID of this generic list (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call listsListDbIdGetCall(String listDbId) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/lists/{listDbId}"
            .replaceAll("\\{" + "listDbId" + "\\}", apiClient.escapeString(listDbId.toString()));

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
     * Get the details of a specific List
     * Get a specific generic lists
     * @param listDbId The unique ID of this generic list (required)
     * @return ApiResponse&lt;ListsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsSingleResponse> listsListDbIdGet(String listDbId) throws ApiException {
        Call call = listsListDbIdGetCall(listDbId);
        Type localVarReturnType = new TypeToken<ListsSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details of a specific List (asynchronously)
     * Get a specific generic lists
     * @param listDbId The unique ID of this generic list (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listsListDbIdGetAsync(String listDbId, final ApiCallback<ListsSingleResponse> callback) throws ApiException {
        Call call = listsListDbIdGetCall(listDbId);
        Type localVarReturnType = new TypeToken<ListsSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listsListDbIdItemsPost
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call listsListDbIdItemsPostCall(String listDbId, List<String> body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/lists/{listDbId}/items"
            .replaceAll("\\{" + "listDbId" + "\\}", apiClient.escapeString(listDbId.toString()));

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
     * Add Items to a specific List
     * Add new data to a specific generic lists
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListResponse> listsListDbIdItemsPost(String listDbId, List<String> body) throws ApiException {
        Call call = listsListDbIdItemsPostCall(listDbId, body);
        Type localVarReturnType = new TypeToken<ListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add Items to a specific List (asynchronously)
     * Add new data to a specific generic lists
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listsListDbIdItemsPostAsync(String listDbId, List<String> body, final ApiCallback<ListResponse> callback) throws ApiException {
        Call call = listsListDbIdItemsPostCall(listDbId, body);
        Type localVarReturnType = new TypeToken<ListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listsListDbIdPut
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call listsListDbIdPutCall(String listDbId, ListNewRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/lists/{listDbId}"
            .replaceAll("\\{" + "listDbId" + "\\}", apiClient.escapeString(listDbId.toString()));

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
     * Update an existing generic list
     * Update an existing generic list
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @return ApiResponse&lt;ListsSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsSingleResponse> listsListDbIdPut(String listDbId, ListNewRequest body) throws ApiException {
        Call call = listsListDbIdPutCall(listDbId, body);
        Type localVarReturnType = new TypeToken<ListsSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an existing generic list (asynchronously)
     * @param listDbId The unique ID of this generic list (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listsListDbIdPutAsync(String listDbId, ListNewRequest body, final ApiCallback<ListsSingleResponse> callback) throws ApiException {
        Call call = listsListDbIdPutCall(listDbId, body);
        Type localVarReturnType = new TypeToken<ListsSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listsPost
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call listsPostCall(List<ListNewRequest> body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/lists";

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
     * Create New List Objects
     * Create new list objects in the database
     * @param body  (optional)
     * @return ApiResponse&lt;ListsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsListResponse> listsPost(List<ListNewRequest> body) throws ApiException {
        Call call = listsPostCall(body);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create New List Objects (asynchronously)
     * Create new list objects in the database
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listsPostAsync(List<ListNewRequest> body, final ApiCallback<ListsListResponse> callback) throws ApiException {
        Call call = listsPostCall(body);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchListsPost
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchListsPostCall(ListSearchRequest body) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/lists";

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
     * Submit a search request for Lists
     * Advanced searching for the list resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @return ApiResponse&lt;ListsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsListResponse> searchListsPost(ListSearchRequest body) throws ApiException {
        Call call = searchListsPostCall(body);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Submit a search request for Lists (asynchronously)
     * Advanced searching for the list resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchListsPostAsync(ListSearchRequest body, final ApiCallback<ListsListResponse> callback) throws ApiException {
        Call call = searchListsPostCall(body);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchListsSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchListsSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/lists/{searchResultsDbId}"
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
     * Get the results of a List search request
     * Advanced searching for the list resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @return ApiResponse&lt;ListsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListsListResponse> searchListsSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Call call = searchListsSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a List search request (asynchronously)
     * Advanced searching for the list resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchListsSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, final ApiCallback<ListsListResponse> callback) throws ApiException {
        Call call = searchListsSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<ListsListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
