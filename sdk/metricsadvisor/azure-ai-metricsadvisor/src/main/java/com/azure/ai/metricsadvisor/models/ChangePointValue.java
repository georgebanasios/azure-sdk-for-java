// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ChangePointValue.
 */
public final class ChangePointValue extends ExpandableStringEnum<ChangePointValue> {
    /**
     * Static value AutoDetect for ChangePointValue.
     */
    @Generated
    public static final ChangePointValue AUTO_DETECT = fromString("AutoDetect");

    /**
     * Static value ChangePoint for ChangePointValue.
     */
    @Generated
    public static final ChangePointValue CHANGE_POINT = fromString("ChangePoint");

    /**
     * Static value NotChangePoint for ChangePointValue.
     */
    @Generated
    public static final ChangePointValue NOT_CHANGE_POINT = fromString("NotChangePoint");

    /**
     * Creates a new instance of ChangePointValue value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ChangePointValue() {
    }

    /**
     * Creates or finds a ChangePointValue from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ChangePointValue.
     */
    @Generated
    public static ChangePointValue fromString(String name) {
        return fromString(name, ChangePointValue.class);
    }

    /**
     * Gets known ChangePointValue values.
     * 
     * @return known ChangePointValue values.
     */
    @Generated
    public static Collection<ChangePointValue> values() {
        return values(ChangePointValue.class);
    }
}
