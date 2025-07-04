// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.onlineexperimentation.models;

import com.azure.analytics.onlineexperimentation.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * An event property value aggregated by a metric.
 */
@Fluent
public final class AggregatedValue implements JsonSerializable<AggregatedValue> {

    /*
     * The name of the event.
     */
    @Generated
    private String eventName;

    /*
     * [Optional] A condition to filter events.
     */
    @Generated
    private String filter;

    /*
     * The key of the event property to aggregate.
     */
    @Generated
    private String eventProperty;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setAggregatedValueAccessor(new JsonMergePatchHelper.AggregatedValueAccessor() {

            @Override
            public AggregatedValue prepareModelForJsonMergePatch(AggregatedValue model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(AggregatedValue model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of AggregatedValue class.
     */
    @Generated
    public AggregatedValue() {
    }

    /**
     * Get the eventName property: The name of the event.
     *
     * @return the eventName value.
     */
    @Generated
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: The name of the event.
     * <p>Required when create the resource.</p>
     *
     * @param eventName the eventName value to set.
     * @return the AggregatedValue object itself.
     */
    @Generated
    public AggregatedValue setEventName(String eventName) {
        this.eventName = eventName;
        this.updatedProperties.add("eventName");
        return this;
    }

    /**
     * Get the filter property: [Optional] A condition to filter events.
     *
     * @return the filter value.
     */
    @Generated
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: [Optional] A condition to filter events.
     *
     * @param filter the filter value to set.
     * @return the AggregatedValue object itself.
     */
    @Generated
    public AggregatedValue setFilter(String filter) {
        this.filter = filter;
        this.updatedProperties.add("filter");
        return this;
    }

    /**
     * Get the eventProperty property: The key of the event property to aggregate.
     *
     * @return the eventProperty value.
     */
    @Generated
    public String getEventProperty() {
        return this.eventProperty;
    }

    /**
     * Set the eventProperty property: The key of the event property to aggregate.
     * <p>Required when create the resource.</p>
     *
     * @param eventProperty the eventProperty value to set.
     * @return the AggregatedValue object itself.
     */
    @Generated
    public AggregatedValue setEventProperty(String eventProperty) {
        this.eventProperty = eventProperty;
        this.updatedProperties.add("eventProperty");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("eventName", this.eventName);
            jsonWriter.writeStringField("filter", this.filter);
            jsonWriter.writeStringField("eventProperty", this.eventProperty);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("eventName")) {
            if (this.eventName == null) {
                jsonWriter.writeNullField("eventName");
            } else {
                jsonWriter.writeStringField("eventName", this.eventName);
            }
        }
        if (updatedProperties.contains("filter")) {
            if (this.filter == null) {
                jsonWriter.writeNullField("filter");
            } else {
                jsonWriter.writeStringField("filter", this.filter);
            }
        }
        if (updatedProperties.contains("eventProperty")) {
            if (this.eventProperty == null) {
                jsonWriter.writeNullField("eventProperty");
            } else {
                jsonWriter.writeStringField("eventProperty", this.eventProperty);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AggregatedValue from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AggregatedValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AggregatedValue.
     */
    @Generated
    public static AggregatedValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AggregatedValue deserializedAggregatedValue = new AggregatedValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("eventName".equals(fieldName)) {
                    deserializedAggregatedValue.eventName = reader.getString();
                } else if ("filter".equals(fieldName)) {
                    deserializedAggregatedValue.filter = reader.getString();
                } else if ("eventProperty".equals(fieldName)) {
                    deserializedAggregatedValue.eventProperty = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAggregatedValue;
        });
    }
}
