// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/**
 * Samples for L3Networks GetByResourceGroup.
 */
public final class L3NetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2025-02-01/examples/L3Networks_Get.json
     */
    /**
     * Sample code: Get L3network.
     * 
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void getL3network(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.l3Networks()
            .getByResourceGroupWithResponse("resourceGroupName", "l3NetworkName", com.azure.core.util.Context.NONE);
    }
}
