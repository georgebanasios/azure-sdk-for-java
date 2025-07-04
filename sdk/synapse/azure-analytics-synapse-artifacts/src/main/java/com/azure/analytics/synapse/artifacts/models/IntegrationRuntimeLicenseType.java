// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * License type for bringing your own license scenario.
 */
public final class IntegrationRuntimeLicenseType extends ExpandableStringEnum<IntegrationRuntimeLicenseType> {
    /**
     * Static value BasePrice for IntegrationRuntimeLicenseType.
     */
    @Generated
    public static final IntegrationRuntimeLicenseType BASE_PRICE = fromString("BasePrice");

    /**
     * Static value LicenseIncluded for IntegrationRuntimeLicenseType.
     */
    @Generated
    public static final IntegrationRuntimeLicenseType LICENSE_INCLUDED = fromString("LicenseIncluded");

    /**
     * Creates a new instance of IntegrationRuntimeLicenseType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public IntegrationRuntimeLicenseType() {
    }

    /**
     * Creates or finds a IntegrationRuntimeLicenseType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeLicenseType.
     */
    @Generated
    public static IntegrationRuntimeLicenseType fromString(String name) {
        return fromString(name, IntegrationRuntimeLicenseType.class);
    }

    /**
     * Gets known IntegrationRuntimeLicenseType values.
     * 
     * @return known IntegrationRuntimeLicenseType values.
     */
    @Generated
    public static Collection<IntegrationRuntimeLicenseType> values() {
        return values(IntegrationRuntimeLicenseType.class);
    }
}
