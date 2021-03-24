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
import java.util.Optional;

import org.apache.commons.lang3.tuple.Pair;
import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.BrAPIClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.LocationQueryParams;
import org.brapi.v2.model.BrAPIAcceptedSearchResponseResult;
import org.brapi.v2.model.core.BrAPILocation;
import org.brapi.v2.model.core.response.BrAPILocationListResponse;
import org.brapi.v2.model.core.request.BrAPILocationSearchRequest;
import org.brapi.v2.model.core.response.BrAPILocationSingleResponse;
import org.brapi.v2.model.pheno.response.BrAPIObservationUnitListResponse;

public class LocationsApi {
    private BrAPIClient apiClient;

    public LocationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationsApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for locationsGet
     * @param queryParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call locationsGetCall(LocationQueryParams queryParams) throws ApiException {
        if(queryParams == null) {
            throw new IllegalArgumentException("queryParams cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/locations";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (queryParams.locationType() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "locationType", queryParams.locationType());
        if (queryParams.locationDbId() != null)
            apiClient.prepQueryParameter(localVarQueryParams, "locationDbId", queryParams.locationDbId());
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
     * Get a filtered list of Locations
     * Get a list of locations. * The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. * &#x60;altitude&#x60; is in meters.
     * @param queryParams
     * @return ApiResponse&lt;LocationListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPILocationListResponse> locationsGet(LocationQueryParams queryParams) throws ApiException {
        Call call = locationsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a filtered list of Locations (asynchronously)
     * Get a list of locations. * The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. * &#x60;altitude&#x60; is in meters.
     * @param queryParams
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call locationsGetAsync(LocationQueryParams queryParams, final ApiCallback<BrAPILocationListResponse> callback) throws ApiException {
        Call call = locationsGetCall(queryParams);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for locationsLocationDbIdGet
     * @param locationDbId The internal DB id for a location (required)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call locationsLocationDbIdGetCall(String locationDbId) throws ApiException {
        if(locationDbId == null) {
            throw new IllegalArgumentException("locationDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/locations/{locationDbId}"
            .replaceAll("\\{" + "locationDbId" + "\\}", apiClient.escapeString(locationDbId.toString()));

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
     * Get the details of a specific Location
     * Get details for a location. - The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. - &#x60;altitude&#x60; is in meters.&#x27;
     * @param locationDbId The internal DB id for a location (required)
     * @return ApiResponse&lt;LocationSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPILocationSingleResponse> locationsLocationDbIdGet(String locationDbId) throws ApiException {
        Call call = locationsLocationDbIdGetCall(locationDbId);
        Type localVarReturnType = new TypeToken<BrAPILocationSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details of a specific Location (asynchronously)
     * Get details for a location. - The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. - &#x60;altitude&#x60; is in meters.&#x27;
     * @param locationDbId The internal DB id for a location (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call locationsLocationDbIdGetAsync(String locationDbId, final ApiCallback<BrAPILocationSingleResponse> callback) throws ApiException {
        Call call = locationsLocationDbIdGetCall(locationDbId);
        Type localVarReturnType = new TypeToken<BrAPILocationSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for locationsLocationDbIdPut
     * @param locationDbId The internal DB id for a location (required)
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call locationsLocationDbIdPutCall(String locationDbId, BrAPILocation body) throws ApiException {
        if(locationDbId == null) {
            throw new IllegalArgumentException("locationDbId cannot be null"); 
        }
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/locations/{locationDbId}"
            .replaceAll("\\{" + "locationDbId" + "\\}", apiClient.escapeString(locationDbId.toString()));

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
     * Update the details for an existing Location
     * Update the details for an existing location. - The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. - &#x60;altitude&#x60; is in meters.&#x27;
     * @param locationDbId The internal DB id for a location (required)
     * @param body  (optional)
     * @return ApiResponse&lt;LocationSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPILocationSingleResponse> locationsLocationDbIdPut(String locationDbId, BrAPILocation body) throws ApiException {
        Call call = locationsLocationDbIdPutCall(locationDbId, body);
        Type localVarReturnType = new TypeToken<BrAPILocationSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the details for an existing Location (asynchronously)
     * Update the details for an existing location. - The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. - &#x60;altitude&#x60; is in meters.&#x27;
     * @param locationDbId The internal DB id for a location (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call locationsLocationDbIdPutAsync(String locationDbId, BrAPILocation body, final ApiCallback<BrAPILocationSingleResponse> callback) throws ApiException {
        Call call = locationsLocationDbIdPutCall(locationDbId, body);
        Type localVarReturnType = new TypeToken<BrAPILocationSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for locationsPost
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call locationsPostCall(List<BrAPILocation> body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/locations";

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
     * Create new Locations
     * Add new locations to database * The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. * &#x60;altitude&#x60; is in meters.
     * @param body  (optional)
     * @return ApiResponse&lt;LocationListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPILocationListResponse> locationsPost(List<BrAPILocation> body) throws ApiException {
        Call call = locationsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create new Locations (asynchronously)
     * Add new locations to database * The &#x60;countryCode&#x60; is as per [ISO_3166-1_alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) spec. * &#x60;altitude&#x60; is in meters.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call locationsPostAsync(List<BrAPILocation> body, final ApiCallback<BrAPILocationListResponse> callback) throws ApiException {
        Call call = locationsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchLocationsPost
     * @param body  (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchLocationsPostCall(BrAPILocationSearchRequest body) throws ApiException {
        if(body == null) {
            throw new IllegalArgumentException("body cannot be null"); 
        }
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/search/locations";

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
     * Submit a search request for Locations
     * Advanced searching for the locations resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @return ApiResponse&lt;LocationListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Pair<Optional<BrAPILocationListResponse>, Optional<BrAPIAcceptedSearchResponseResult>>> searchLocationsPost(BrAPILocationSearchRequest body) throws ApiException {
        Call call = searchLocationsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        return apiClient.executeSearch(call, localVarReturnType);
    }

    /**
     * Submit a search request for Locations (asynchronously)
     * Advanced searching for the locations resource. See Search Services for additional implementation details.
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchLocationsPostAsync(BrAPILocationSearchRequest body, final ApiCallback<BrAPILocationListResponse> callback) throws ApiException {
        Call call = searchLocationsPostCall(body);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchLocationsSearchResultsDbIdGet
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchLocationsSearchResultsDbIdGetCall(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        if(searchResultsDbId == null) {
            throw new IllegalArgumentException("searchResultsDbId cannot be null"); 
        }
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/search/locations/{searchResultsDbId}"
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
     * Get the results of a Locations search request
     * Advanced searching for the locations resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @return ApiResponse&lt;LocationListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPILocationListResponse> searchLocationsSearchResultsDbIdGet(String searchResultsDbId, Integer page, Integer pageSize) throws ApiException {
        Call call = searchLocationsSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the results of a Locations search request (asynchronously)
     * Advanced searching for the locations resource. See Search Services for additional implementation details.
     * @param searchResultsDbId Unique identifier which references the search results (required)
     * @param page Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is &#x27;page&#x27;&#x3D; 0). Default is &#x60;0&#x60;. (optional)
     * @param pageSize The size of the pages to be returned. Default is &#x60;1000&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchLocationsSearchResultsDbIdGetAsync(String searchResultsDbId, Integer page, Integer pageSize, final ApiCallback<BrAPILocationListResponse> callback) throws ApiException {
        Call call = searchLocationsSearchResultsDbIdGetCall(searchResultsDbId, page, pageSize);
        Type localVarReturnType = new TypeToken<BrAPILocationListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
