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
import java.util.Map;

import org.brapi.client.v2.ApiCallback;
import org.brapi.client.v2.Configuration;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.v2.model.BrAPIWSMIMEDataTypes;
import org.brapi.v2.model.core.response.BrAPIServerInfoResponse;

public class ServerInfoApi {
    private BrAPIClient apiClient;

    public ServerInfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServerInfoApi(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public BrAPIClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(BrAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for serverinfoGet
     * @param dataType The data format supported by the call. (optional)



     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call serverinfoGetCall(BrAPIWSMIMEDataTypes dataType) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/serverinfo";

        Map<String, String> localVarQueryParams = new HashMap<>();
        Map<String, String> localVarCollectionQueryParams = new HashMap<>();
        if (dataType != null)
            apiClient.prepQueryParameter(localVarQueryParams, "dataType", dataType);

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
     * Get the list of implemented Calls
     * Implementation Notes  Having a consistent structure for the path string of each call is very  important for teams to be able to connect and find errors. Read more on Github.  Here are the rules for the path of each call that should be returned  Every word in the call path should match the documentation exactly, both in  spelling and capitalization. Note that path strings are all lower case, but  path parameters are camel case.  Each path should start relative to \\\&quot;/\\\&quot; and therefore should not include \\\&quot;/\\\&quot;  No leading or trailing slashes (\\\&quot;/\\\&quot;)   Path parameters are wrapped in curly braces (\\\&quot;{}\\\&quot;). The name of the path parameter  should be spelled exactly as it is specified in the documentation.  Examples   GOOD   \&quot;call\&quot;: \&quot;germplasm/{germplasmDbId}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;germplasm/{id}/pedigree\&quot;  BAD    \&quot;call\&quot;: \&quot;germplasm/{germplasmDBid}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;brapi/v2/germplasm/{germplasmDbId}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;/germplasm/{germplasmDbId}/pedigree/\&quot;   BAD    \&quot;call\&quot;: \&quot;germplasm/&lt;germplasmDbId&gt;/pedigree\&quot;
     * @param dataType The data format supported by the call. (optional)

     * @return ApiResponse&lt;ServerInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BrAPIServerInfoResponse> serverinfoGet(BrAPIWSMIMEDataTypes dataType) throws ApiException {
        Call call = serverinfoGetCall(dataType);
        Type localVarReturnType = new TypeToken<BrAPIServerInfoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the list of implemented Calls (asynchronously)
     * Implementation Notes  Having a consistent structure for the path string of each call is very  important for teams to be able to connect and find errors. Read more on Github.  Here are the rules for the path of each call that should be returned  Every word in the call path should match the documentation exactly, both in  spelling and capitalization. Note that path strings are all lower case, but  path parameters are camel case.  Each path should start relative to \\\&quot;/\\\&quot; and therefore should not include \\\&quot;/\\\&quot;  No leading or trailing slashes (\\\&quot;/\\\&quot;)   Path parameters are wrapped in curly braces (\\\&quot;{}\\\&quot;). The name of the path parameter  should be spelled exactly as it is specified in the documentation.  Examples   GOOD   \&quot;call\&quot;: \&quot;germplasm/{germplasmDbId}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;germplasm/{id}/pedigree\&quot;  BAD    \&quot;call\&quot;: \&quot;germplasm/{germplasmDBid}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;brapi/v2/germplasm/{germplasmDbId}/pedigree\&quot;   BAD    \&quot;call\&quot;: \&quot;/germplasm/{germplasmDbId}/pedigree/\&quot;   BAD    \&quot;call\&quot;: \&quot;germplasm/&lt;germplasmDbId&gt;/pedigree\&quot;
     * @param dataType The data format supported by the call. (optional)

     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call serverinfoGetAsync(BrAPIWSMIMEDataTypes dataType, final ApiCallback<BrAPIServerInfoResponse> callback) throws ApiException {
        Call call = serverinfoGetCall(dataType);
        Type localVarReturnType = new TypeToken<BrAPIServerInfoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
