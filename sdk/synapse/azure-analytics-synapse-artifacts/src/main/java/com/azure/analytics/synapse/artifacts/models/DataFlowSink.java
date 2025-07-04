// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Transformation for data flow sink.
 */
@Fluent
public final class DataFlowSink extends Transformation {
    /*
     * Schema linked service reference.
     */
    @Generated
    private LinkedServiceReference schemaLinkedService;

    /*
     * Rejected data linked service reference.
     */
    @Generated
    private LinkedServiceReference rejectedDataLinkedService;

    /**
     * Creates an instance of DataFlowSink class.
     */
    @Generated
    public DataFlowSink() {
    }

    /**
     * Get the schemaLinkedService property: Schema linked service reference.
     * 
     * @return the schemaLinkedService value.
     */
    @Generated
    public LinkedServiceReference getSchemaLinkedService() {
        return this.schemaLinkedService;
    }

    /**
     * Set the schemaLinkedService property: Schema linked service reference.
     * 
     * @param schemaLinkedService the schemaLinkedService value to set.
     * @return the DataFlowSink object itself.
     */
    @Generated
    public DataFlowSink setSchemaLinkedService(LinkedServiceReference schemaLinkedService) {
        this.schemaLinkedService = schemaLinkedService;
        return this;
    }

    /**
     * Get the rejectedDataLinkedService property: Rejected data linked service reference.
     * 
     * @return the rejectedDataLinkedService value.
     */
    @Generated
    public LinkedServiceReference getRejectedDataLinkedService() {
        return this.rejectedDataLinkedService;
    }

    /**
     * Set the rejectedDataLinkedService property: Rejected data linked service reference.
     * 
     * @param rejectedDataLinkedService the rejectedDataLinkedService value to set.
     * @return the DataFlowSink object itself.
     */
    @Generated
    public DataFlowSink setRejectedDataLinkedService(LinkedServiceReference rejectedDataLinkedService) {
        this.rejectedDataLinkedService = rejectedDataLinkedService;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DataFlowSink setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DataFlowSink setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DataFlowSink setDataset(DatasetReference dataset) {
        super.setDataset(dataset);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DataFlowSink setLinkedService(LinkedServiceReference linkedService) {
        super.setLinkedService(linkedService);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public DataFlowSink setFlowlet(DataFlowReference flowlet) {
        super.setFlowlet(flowlet);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeJsonField("dataset", getDataset());
        jsonWriter.writeJsonField("linkedService", getLinkedService());
        jsonWriter.writeJsonField("flowlet", getFlowlet());
        jsonWriter.writeJsonField("schemaLinkedService", this.schemaLinkedService);
        jsonWriter.writeJsonField("rejectedDataLinkedService", this.rejectedDataLinkedService);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFlowSink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFlowSink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DataFlowSink.
     */
    @Generated
    public static DataFlowSink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataFlowSink deserializedDataFlowSink = new DataFlowSink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDataFlowSink.setName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedDataFlowSink.setDescription(reader.getString());
                } else if ("dataset".equals(fieldName)) {
                    deserializedDataFlowSink.setDataset(DatasetReference.fromJson(reader));
                } else if ("linkedService".equals(fieldName)) {
                    deserializedDataFlowSink.setLinkedService(LinkedServiceReference.fromJson(reader));
                } else if ("flowlet".equals(fieldName)) {
                    deserializedDataFlowSink.setFlowlet(DataFlowReference.fromJson(reader));
                } else if ("schemaLinkedService".equals(fieldName)) {
                    deserializedDataFlowSink.schemaLinkedService = LinkedServiceReference.fromJson(reader);
                } else if ("rejectedDataLinkedService".equals(fieldName)) {
                    deserializedDataFlowSink.rejectedDataLinkedService = LinkedServiceReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataFlowSink;
        });
    }
}
