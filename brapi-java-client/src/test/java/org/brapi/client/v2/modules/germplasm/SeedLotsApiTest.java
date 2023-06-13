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

import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.germplasm.SeedLotQueryParams;
import org.brapi.client.v2.model.queryParams.germplasm.SeedLotTransactionQueryParams;
import org.brapi.v2.model.germ.BrAPISeedLot;
import org.brapi.v2.model.germ.BrAPISeedLotTransaction;
import org.brapi.v2.model.germ.response.BrAPISeedLotListResponse;
import org.brapi.v2.model.germ.response.BrAPISeedLotSingleResponse;
import org.brapi.v2.model.germ.response.BrAPISeedLotTransactionListResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

/**
 * API tests for SeedLotsApi
 */
public class SeedLotsApiTest {

    private final SeedLotsApi api = new SeedLotsApi();

    /**
     * Get a filtered list of Seed Lot descriptions
     *
     * Get a filtered list of Seed Lot descriptions available in a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsGetTest() throws ApiException {
        String seedLotDbId = null;
        String germplasmDbId = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        
        SeedLotQueryParams queryParams = new SeedLotQueryParams();
        ApiResponse<BrAPISeedLotListResponse> response = api.seedlotsGet(queryParams);

        // TODO: test validations
    }
    /**
     * Add new Seed Lot descriptions to a server
     *
     * Add new Seed Lot descriptions to a server
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsPostTest() throws ApiException {
        List<BrAPISeedLot> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISeedLotListResponse> response = api.seedlotsPost(body);
		});

        // TODO: test validations
    }
    /**
     * Get a specific Seed Lot
     *
     * Get a specific Seed Lot by seedLotDbId
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsSeedLotDbIdGetTest() throws ApiException {
        String seedLotDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISeedLotSingleResponse> response = api.seedlotsSeedLotDbIdGet(seedLotDbId);
		});

        // TODO: test validations
    }
    /**
     * Update an existing Seed Lot
     *
     * Update an existing Seed Lot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsSeedLotDbIdPutTest() throws ApiException {
        String seedLotDbId = null;
        BrAPISeedLot body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISeedLotSingleResponse> response = api.seedlotsSeedLotDbIdPut(seedLotDbId, body);
		});

        // TODO: test validations
    }
    /**
     * Get all Transactions related to a specific Seed Lot
     *
     * Get all Transactions related to a specific Seed Lot
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsSeedLotDbIdTransactionsGetTest() throws ApiException {
        String seedLotDbId = null;
        String transactionDbId = null;
        String transactionDirection = null;
        Integer page = null;
        Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISeedLotTransactionListResponse> response = api.seedlotsSeedLotDbIdTransactionsGet(seedLotDbId, transactionDbId, transactionDirection, page, pageSize);
		});

        // TODO: test validations
    }
    /**
     * Get a filtered list of Seed Lot Transactions
     *
     * Get a filtered list of Seed Lot Transactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsTransactionsGetTest() throws ApiException {
        String transactionDbId = null;
        String seedLotDbId = null;
        String germplasmDbId = null;
        String externalReferenceID = null;
        String externalReferenceSource = null;
        Integer page = null;
        Integer pageSize = null;
        
        SeedLotTransactionQueryParams queryParams = new SeedLotTransactionQueryParams();
        ApiResponse<BrAPISeedLotTransactionListResponse> response = api.seedlotsTransactionsGet(queryParams);

        // TODO: test validations
    }
    /**
     * Add new Seed Lot Transaction to be recorded
     *
     * Add new Seed Lot Transaction to be recorded
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void seedlotsTransactionsPostTest() throws ApiException {
        List<BrAPISeedLotTransaction> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        ApiResponse<BrAPISeedLotTransactionListResponse> response = api.seedlotsTransactionsPost(body);
		});

        // TODO: test validations
    }
}
