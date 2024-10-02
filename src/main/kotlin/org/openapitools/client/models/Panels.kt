/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import dev.upvote.api.models.Panel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The panels object is a dictionary of individual panel objects. Each key of the dictionary is the id of the panel, and the value is the panel object.  Apps typically display a number of root panels with known panel ids (e.g. health_card and environment_card). Panels can reference other panels and display them as sub-panels.
 *
 * @param additionalProperties 
 */

@Serializable
data class Panels (

    @SerialName("additionalProperties")
    val additionalProperties: Panel? = null

) {


}

