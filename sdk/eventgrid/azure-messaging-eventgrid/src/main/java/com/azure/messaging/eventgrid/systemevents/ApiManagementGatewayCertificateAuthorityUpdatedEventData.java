// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.ApiManagement.GatewayCertificateAuthorityUpdated
 * event.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class ApiManagementGatewayCertificateAuthorityUpdatedEventData
    implements JsonSerializable<ApiManagementGatewayCertificateAuthorityUpdatedEventData> {

    /*
     * The fully qualified ID of the resource that the compliance state change is for, including the resource name and
     * resource type. Uses the format,
     * `/subscriptions/<SubscriptionID>/resourceGroups/<ResourceGroup>/Microsoft.ApiManagement/service/<ServiceName>/
     * gateways/<GatewayName>/certificateAuthorities/<ResourceName>`
     */
    @Generated
    private String resourceUri;

    /**
     * Creates an instance of ApiManagementGatewayCertificateAuthorityUpdatedEventData class.
     */
    @Generated
    public ApiManagementGatewayCertificateAuthorityUpdatedEventData() {
    }

    /**
     * Get the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/certificateAuthorities/&lt;ResourceName&gt;`.
     *
     * @return the resourceUri value.
     */
    @Generated
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The fully qualified ID of the resource that the compliance state change is for,
     * including the resource name and resource type. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateways/&lt;GatewayName&gt;/certificateAuthorities/&lt;ResourceName&gt;`.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the ApiManagementGatewayCertificateAuthorityUpdatedEventData object itself.
     */
    @Generated
    public ApiManagementGatewayCertificateAuthorityUpdatedEventData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementGatewayCertificateAuthorityUpdatedEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementGatewayCertificateAuthorityUpdatedEventData if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * ApiManagementGatewayCertificateAuthorityUpdatedEventData.
     */
    @Generated
    public static ApiManagementGatewayCertificateAuthorityUpdatedEventData fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ApiManagementGatewayCertificateAuthorityUpdatedEventData deserializedApiManagementGatewayCertificateAuthorityUpdatedEventData
                = new ApiManagementGatewayCertificateAuthorityUpdatedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("resourceUri".equals(fieldName)) {
                    deserializedApiManagementGatewayCertificateAuthorityUpdatedEventData.resourceUri
                        = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedApiManagementGatewayCertificateAuthorityUpdatedEventData;
        });
    }
}
