/*
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brapi.client.v2.modules.core;

import lombok.SneakyThrows;
import okhttp3.Call;

import org.brapi.client.v2.ApiClient;
import org.brapi.client.v2.ApiResponse;
import org.brapi.client.v2.model.BrAPIRequest;
import org.brapi.v2.model.core.Location;
import org.brapi.v2.model.core.LocationListResponse;
import org.brapi.v2.model.core.LocationNewRequest;
import org.brapi.v2.model.core.LocationSingleResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LocationsAPIUnitTests {

    LocationsApi locationsAPI;
    @Mock
    ApiClient brAPIClient;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        locationsAPI = new LocationsApi(brAPIClient);
    }

    @Test
    @SneakyThrows
    void createLocationsEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<LocationListResponse> brApiLocation = locationsAPI.locationsPost(Arrays.asList(new Location()));
        assertNotNull(brApiLocation, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void updateLocationsEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));

        LocationNewRequest location = new Location().locationName("test");

        ApiResponse<LocationSingleResponse> brApiLocation = locationsAPI.locationsLocationDbIdPut("test", location);

        assertNotNull(brApiLocation, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getLocationsEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<LocationListResponse> brApiLocations = locationsAPI.locationsGet(null);

        assertNotNull(brApiLocations, "Empty optional was not returned.");
    }

    @Test
    @SneakyThrows
    void getLocationsByIdEmptyBody() {
        when(brAPIClient.execute(any(Call.class), any(Type.class))).thenReturn(new ApiResponse<>(200, null));
        ApiResponse<LocationSingleResponse> brApiLocation = locationsAPI.locationsLocationDbIdGet("test");

        assertNotNull(brApiLocation, "Empty optional was not returned.");
    }
}
