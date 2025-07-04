// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetwork;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TrunkedNetworksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"etag\":\"zwjcaye\",\"extendedLocation\":{\"name\":\"zrransyb\",\"type\":\"lpolwzrghsrle\"},\"properties\":{\"associatedResourceIds\":[\"fscjfn\",\"jwvuag\",\"qwtltngvmreupt\"],\"clusterId\":\"lzmijajwolxfsv\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"pynwlslrcigtzjcv\",\"hybridAksClustersAssociatedIds\":[\"lapsnsso\",\"yxpavidnie\",\"wffcvvye\"],\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"uxgcbdsvalpnp\",\"isolationDomainIds\":[\"trkxgpazwu\",\"x\"],\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[\"obfelhldiuhz\"],\"vlans\":[8460107990489523248,8117328407318697573,1218353473266265232]},\"location\":\"z\",\"tags\":{\"qhnmhk\":\"djpxpqht\",\"gcruxspinym\":\"ezsdsuxheq\",\"zfbmjxuv\":\"qgwokmikp\"},\"id\":\"ipfdvhaxdvwzaehp\",\"name\":\"hthdklmvetatlakf\",\"type\":\"oixwgiksb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        TrunkedNetwork response = manager.trunkedNetworks()
            .define("lnlrxsmy")
            .withRegion("xudqyemebunaucmc")
            .withExistingResourceGroup("jtfrnquktrfn")
            .withExtendedLocation(new ExtendedLocation().withName("bgwjdxwnaz").withType("urrdreyzjwhsetww"))
            .withIsolationDomainIds(Arrays.asList("jbkn", "zcl"))
            .withVlans(Arrays.asList(3053417274792178114L))
            .withTags(mapOf("mjauwcgx", "nee", "zerwgudas", "fnohaitran", "ngfcocefhpriyl", "xubvf", "culregpqt",
                "mpztraudsvhlc"))
            .withHybridAksPluginType(HybridAksPluginType.SRIOV)
            .withInterfaceName("utmdpvozg")
            .withIfMatch("py")
            .withIfNoneMatch("cf")
            .create();

        Assertions.assertEquals("z", response.location());
        Assertions.assertEquals("djpxpqht", response.tags().get("qhnmhk"));
        Assertions.assertEquals("zrransyb", response.extendedLocation().name());
        Assertions.assertEquals("lpolwzrghsrle", response.extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, response.hybridAksPluginType());
        Assertions.assertEquals("uxgcbdsvalpnp", response.interfaceName());
        Assertions.assertEquals("trkxgpazwu", response.isolationDomainIds().get(0));
        Assertions.assertEquals(8460107990489523248L, response.vlans().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
