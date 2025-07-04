// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationTypeResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApplicationTypesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"imlnwiaaomylw\"},\"tags\":{\"l\":\"ulcsethwwnpj\"},\"location\":\"swpchwahfbousn\",\"id\":\"pgfewetwlyx\",\"name\":\"ncxykxhdjhlimm\",\"type\":\"cxfhbcporxv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        ApplicationTypeResource response = manager.applicationTypes()
            .getWithResponse("wpfaj", "jwltlwtjjgu", "talhsnvkcdmxzr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ulcsethwwnpj", response.tags().get("l"));
        Assertions.assertEquals("swpchwahfbousn", response.location());
    }
}
