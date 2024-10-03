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

import org.openapitools.client.models.ProductUpdateAPIV3WRITE

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param lc 2 letter code of the language of the interface. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the country of the user (passed through the cc field or inferred by the IP address).
 * @param cc 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request.
 * @param fields Comma separated list of fields requested in the response. Special values: \"updated\": returns field that were updated by the query (e.g. sending \"packagings\" or \"packagings_add\" would return \"packagings\"), \"none\": returns no fields, \"all\": returns all fields except generated fields that need to be explicitly requested such as \"knowledge_panels\". Defaults to \"updated\" for WRITE requests, and \"all\" for READ requests.
 * @param tagsLc 2 letter language code to request names of tags in a specific language.  For READ requets: if passed, all taxonomized tags of the response will include a lc_name property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.  For WRITE requests: if passed, taxonomized tags fields with a lc_name property will be considered to be in this language.
 * @param userId 
 * @param password 
 * @param product 
 */

@Serializable
data class PatchApiV3ProductBarcodeRequest (

    /* 2 letter code of the language of the interface. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the country of the user (passed through the cc field or inferred by the IP address). */
    @SerialName("lc")
    val lc: kotlin.String? = null,

    /* 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. */
    @SerialName("cc")
    val cc: kotlin.String? = null,

    /* Comma separated list of fields requested in the response. Special values: \"updated\": returns field that were updated by the query (e.g. sending \"packagings\" or \"packagings_add\" would return \"packagings\"), \"none\": returns no fields, \"all\": returns all fields except generated fields that need to be explicitly requested such as \"knowledge_panels\". Defaults to \"updated\" for WRITE requests, and \"all\" for READ requests. */
    @SerialName("fields")
    val fields: kotlin.String? = null,

    /* 2 letter language code to request names of tags in a specific language.  For READ requets: if passed, all taxonomized tags of the response will include a lc_name property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.  For WRITE requests: if passed, taxonomized tags fields with a lc_name property will be considered to be in this language. */
    @SerialName("tags_lc")
    val tagsLc: kotlin.String? = null,

    @SerialName("user_id")
    val userId: kotlin.String? = null,

    @SerialName("password")
    val password: kotlin.String? = null,

    @SerialName("product")
    val product: ProductUpdateAPIV3WRITE? = null

) {


}

