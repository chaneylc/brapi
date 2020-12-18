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

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.core.ListQueryParams;

import org.brapi.v2.model.core.request.BrAPIListNewRequest;
import org.brapi.v2.model.core.response.BrAPIListResponse;
import org.brapi.v2.model.core.request.BrAPIListSearchRequest;
import org.brapi.v2.model.core.response.BrAPIListsListResponse;
import org.brapi.v2.model.core.response.BrAPIListsSingleResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for ListsApi
 */
public class ListsApiTest {

    private final ListsApi api = new ListsApi();
    private String listDbId = "list1";

    @Test
    public void listsGetTest() throws ApiException {        
        ListQueryParams queryParams = new ListQueryParams();
        ApiResponse<BrAPIListsListResponse> response = api.listsGet(queryParams);

        // TODO: test validations
    }

    @Test
    public void listsPostTest() throws ApiException {
        List<BrAPIListNewRequest> body = Arrays.asList(new BrAPIListNewRequest());
        
        ApiResponse<BrAPIListsListResponse> response = api.listsPost(body);

        this.listDbId = response.getBody().getResult().getData().get(0).getListDbId();
        // TODO: test validations
    }

    @Test
    public void listsListDbIdGetTest() throws ApiException {
        String listDbId = this.listDbId;
        
        ApiResponse<BrAPIListsSingleResponse> response = api.listsListDbIdGet(listDbId);

        // TODO: test validations
    }

    @Test
    public void listsListDbIdItemsPostTest() throws ApiException {
        String listDbId = this.listDbId;
        List<String> body = Arrays.asList("one", "two", "three");
        
        ApiResponse<BrAPIListResponse> response = api.listsListDbIdItemsPost(listDbId, body);

        // TODO: test validations
    }

    @Test
    public void listsListDbIdPutTest() throws ApiException {
        String listDbId = this.listDbId;
        BrAPIListNewRequest body = new BrAPIListNewRequest();
        body.setListName("JUnit test");
        
        ApiResponse<BrAPIListsSingleResponse> response = api.listsListDbIdPut(listDbId, body);

        // TODO: test validations
    }

    @Test
    public void searchListsPostTest() throws ApiException {
        BrAPIListSearchRequest body = new BrAPIListSearchRequest();
        
        ApiResponse<BrAPIListsListResponse> response = api.searchListsPost(body);

        // TODO: test validations
    }

    //@Test
    //This test is currently unsupported by the BrAPI Test Server
    public void searchListsSearchResultsDbIdGetTest() throws ApiException {
        String searchResultsDbId = "test";
        Integer page = null;
        Integer pageSize = null;
        
        ApiResponse<BrAPIListsListResponse> response = api.searchListsSearchResultsDbIdGet(searchResultsDbId, page, pageSize);

        // TODO: test validations
    }
}
