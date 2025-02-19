/*
 * BrAPI-Phenotyping
 * The Breeding API (BrAPI) is a Standardized REST ful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding. <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">General Reference Documentation</h2> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a></div> <div class=\"gen-info-link\"><a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Core</h2> <div class=\"brapi-section-description\">The BrAPI Core module contains high level entities used for organization and management. This includes Programs, Trials, Studies, Locations, People, and Lists</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Core\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Core\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapicore.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"current-brapi-section brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Phenotyping</h2> <div class=\"brapi-section-description\">The BrAPI Phenotyping module contains entities related to phenotypic observations. This includes Observation Units, Observations, Observation Variables, Traits, Scales, Methods, and Images</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Phenotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Phenotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapiphenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Genotyping</h2> <div class=\"brapi-section-description\">The BrAPI Genotyping module contains entities related to genotyping analysis. This includes Samples, Markers, Variant Sets, Variants, Call Sets, Calls, References, Reads, and Vendor Orders</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Genotyping\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Genotyping\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigenotyping.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <div class=\"brapi-section\"> <h2 class=\"brapi-section-title\">BrAPI Germplasm</h2> <div class=\"brapi-section-description\">The BrAPI Germplasm module contains entities related to germplasm management. This includes Germplasm, Germplasm Attributes, Seed Lots, Crosses, Pedigree, and Progeny</div> <div class=\"version-number\">V2.0</div> <div class=\"link-btn\"><a href=\"https://github.com/plantbreeding/API/tree/master/Specification/BrAPI-Germplasm\">GitHub</a></div> <div class=\"link-btn\"><a href=\"https://app.swaggerhub.com/apis/PlantBreedingAPI/BrAPI-Germplasm\">SwaggerHub</a></div> <div class=\"link-btn\"><a href=\"https://brapigermplasm.docs.apiary.io\">Apiary</a></div> <div class=\"stop-float\"></div> </div>  <style> .link-btn{ float: left;  margin: 2px 10px 0 0;  padding: 0 5px;  border-radius: 5px;  background-color: #ddd; } .stop-float{   clear: both; } .version-number{   float: left;    margin: 5px 10px 0 5px; } .brapi-section-title{   margin: 0 10px 0 0;   font-size: 20px; } .current-brapi-section{   font-weight: bolder;   border-radius: 5px;    background-color: #ddd; } .brapi-section{   padding: 5px 5px;  } .brapi-section-description{   margin: 5px 0 0 5px; } </style>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.brapi.client.v2.modules.phenotype;

import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.exceptions.ApiException;
import org.brapi.client.v2.model.queryParams.phenotype.ImageQueryParams;
import org.brapi.v2.model.pheno.BrAPIImage;
import org.brapi.v2.model.pheno.response.BrAPIImageListResponse;
import org.brapi.v2.model.pheno.request.BrAPIImageSearchRequest;
import org.brapi.v2.model.pheno.response.BrAPIImageSingleResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

/**
 * API tests for ImagesApi
 */
public class ImagesApiTest {

	private static ImagesApi api;

	@BeforeAll
	public static void setup() throws ApiException {
		api = new ImagesApi();
		api.getApiClient().authenticate((v) -> {
			return "XXXX";
		});
	}

	/**
	 * Get the image meta data summaries
	 *
	 * Get filtered set of image meta data Implementation Notes -
	 * &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the
	 * location of the image. There is no BrAPI call for retrieving the image
	 * content, so it could be on a different path, or a different host. -
	 * &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for
	 * the image. These could be simple descriptive words, or ontology references,
	 * or full ontology URI&#x27;&#x27;s.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void imagesGetTest() throws ApiException {
		String imageDbId = null;
		String imageName = null;
		String observationUnitDbId = null;
		String observationDbId = null;
		String descriptiveOntologyTerm = null;
		String externalReferenceID = null;
		String externalReferenceSource = null;
		Integer page = null;
		Integer pageSize = null;

		ImageQueryParams queryParams = new ImageQueryParams();
		ApiResponse<BrAPIImageListResponse> response = api.imagesGet(queryParams);

		// TODO: test validations
	}

	/**
	 * Get the an image meta data summary
	 *
	 * Get one image meta data object Implementation Notes -
	 * &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the
	 * location of the image. There is no BrAPI call for retrieving the image
	 * content, so it could be on a different path, or a different host. -
	 * &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for
	 * the image. These could be simple descriptive words, or ontology references,
	 * or full ontology URI&#x27;&#x27;s.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void imagesImageDbIdGetTest() throws ApiException {
		String imageDbId = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageSingleResponse> response = api.imagesImageDbIdGet(imageDbId);
		});

		// TODO: test validations
	}

	/**
	 * Update an image with the image file content
	 *
	 * Update an image with the image file content Implementation Notes - This call
	 * should be paired with &#x27;PUT /images/{imageDbId}&#x27; for full capability
	 * - A server may choose to modify the image meta data object based on the
	 * actually image which has been uploaded. - Image data may be stored in a
	 * database or file system. Servers should generate and provide the
	 * \&quot;imageURL\&quot; for retrieving the image, wherever it happens to live.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void imagesImageDbIdImagecontentPutTest() throws ApiException {
		String imageDbId = null;
		Object body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageSingleResponse> response = api.imagesImageDbIdImagecontentPut(imageDbId, body);
		});

		// TODO: test validations
	}

	/**
	 * Update an image meta data
	 *
	 * Update an image meta data object Implementation Notes - This call should be
	 * paired with &#x27;PUT /images/{imageDbId}/imagecontent&#x27; for full
	 * capability - A server may choose to modify the image meta data object based
	 * on the actually image which has been uploaded. - Image data may be stored in
	 * a database or file system. Servers should generate and provide the
	 * \&quot;imageURL\&quot; as an absolute path for retrieving the image, wherever
	 * it happens to live. - &#x27;descriptiveOntologyTerm&#x27; can be thought of
	 * as Tags for the image. These could be simple descriptive words, or ontology
	 * references, or full ontology URI&#x27;s. - The &#x27;/images&#x27; calls
	 * support a GeoJSON object structure for describing their location. The BrAPI
	 * spec for GeoJSON only supports two of the possible geometries: Points and
	 * Polygons. - With most images, the Point geometry should be used, and it
	 * should indicate the longitude and latitude of the camera. - For top down
	 * images (ie from drones, cranes, etc), the Point geometry may be used to
	 * indicate the longitude and latitude of the centroid of the image content, and
	 * the Polygon geometry may be used to indicate the border of the image content.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void imagesImageDbIdPutTest() throws ApiException {
		String imageDbId = null;
		BrAPIImage body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageSingleResponse> response = api.imagesImageDbIdPut(imageDbId, body);
		});

		// TODO: test validations
	}

	/**
	 * Create new image meta data objects
	 *
	 * Create new image meta data objects Implementation Notes -
	 * &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the
	 * location of the image. There is no BrAPI call for retrieving the image
	 * content, so it could be on a different path, or a different host. -
	 * &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for
	 * the image. These could be simple descriptive words, or ontology references,
	 * or full ontology URI&#x27;&#x27;s. - The &#x27;/images&#x27; calls support a
	 * GeoJSON object structure for describing their location. The BrAPI spec for
	 * GeoJSON only supports two of the possible geometries: Points and Polygons. -
	 * With most images, the Point geometry should be used, and it should indicate
	 * the longitude and latitude of the camera. - For top down images (ie from
	 * drones, cranes, etc), the Point geometry may be used to indicate the
	 * longitude and latitude of the centroid of the image content, and the Polygon
	 * geometry may be used to indicate the border of the image content. &#x27;
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void imagesPostTest() throws ApiException {
		List<BrAPIImage> body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageListResponse> response = api.imagesPost(body);
		});

		// TODO: test validations
	}

	/**
	 * Submit a search request for Images
	 *
	 * Get filtered set of image meta data Implementation Notes -
	 * &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the
	 * location of the image. There is no BrAPI call for retrieving the image
	 * content, so it could be on a different path, or a different host. -
	 * &#x27;descriptiveOntologyTerm&#x27; can be thought of as Tags for the image.
	 * These could be simple descriptive words, or ontology references, or full
	 * ontology URI&#x27;s. See Search Services for additional implementation
	 * details.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void searchImagesPostTest() throws ApiException {
		BrAPIImageSearchRequest body = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageListResponse> response = api.searchImagesPost(body);
		});

		// TODO: test validations
	}

	/**
	 * Get the results of an Images search request
	 *
	 * Get filtered set of image meta data Implementation Notes -
	 * &#x27;&#x27;imageURL&#x27;&#x27; should be a complete URL describing the
	 * location of the image. There is no BrAPI call for retrieving the image
	 * content, so it could be on a different path, or a different host. -
	 * &#x27;&#x27;descriptiveOntologyTerm&#x27;&#x27; can be thought of as Tags for
	 * the image. These could be simple descriptive words, or ontology references,
	 * or full ontology URI&#x27;&#x27;s.
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void searchImagesSearchResultsDbIdGetTest() throws ApiException {
		String searchResultsDbId = null;
		Integer page = null;
		Integer pageSize = null;

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			ApiResponse<BrAPIImageListResponse> response = api.searchImagesSearchResultsDbIdGet(searchResultsDbId, page,
					pageSize);
		});

		// TODO: test validations
	}
}
