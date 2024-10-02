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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The panel group element is used to display an optional title followed by a number of sub-panels.
 *
 * @param title 
 * @param panelIds The ids of the panels to include. The ids are the keys of the panels in the panels object returned in the knowledge_panels field.
 */


data class PanelGroupElement (

    @Json(name = "title")
    val title: kotlin.String? = null,

    /* The ids of the panels to include. The ids are the keys of the panels in the panels object returned in the knowledge_panels field. */
    @Json(name = "panel_ids")
    val panelIds: kotlin.collections.List<kotlin.String>? = null

) {


}

