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
 * The recycling property is canonicalized using the packaging_recycling taxonomy.
 *
 * @param id Canonical id of the entry in the taxonomy. If the value cannot be mapped to a taxonomy entry, the value will be the name of the entry in its original language prefixed by the language 2 letter code and a colon.
 * @param lcName Name of the entry in the language requested in the tags_lc field of the request. This field is returned only of tags_lc is specified. If the translation is not available, or if the entry does not exist in the taxonomy, the value will be the name of the entry in its original language prefixed by the language 2 letter code and a colon.
 */


data class PackagingComponentRecyclingInstruction (

    /* Canonical id of the entry in the taxonomy. If the value cannot be mapped to a taxonomy entry, the value will be the name of the entry in its original language prefixed by the language 2 letter code and a colon. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Name of the entry in the language requested in the tags_lc field of the request. This field is returned only of tags_lc is specified. If the translation is not available, or if the entry does not exist in the taxonomy, the value will be the name of the entry in its original language prefixed by the language 2 letter code and a colon. */
    @Json(name = "lc_name")
    val lcName: kotlin.String? = null

) {


}

