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
 * 
 *
 * @param gln 
 * @param gpcCategoryCode 
 * @param gpcCategoryName 
 * @param isAllergenRelevantDataProvided 
 * @param lastChangeDateTime 
 * @param partyName 
 * @param productionVariantDescription 
 * @param publicationDateTime 
 */


data class GetProductByBarcode200ResponseAllOfAllOfSourcesFieldsOrgGs1 (

    @Json(name = "gln")
    val gln: kotlin.String? = null,

    @Json(name = "gpcCategoryCode")
    val gpcCategoryCode: kotlin.String? = null,

    @Json(name = "gpcCategoryName")
    val gpcCategoryName: kotlin.String? = null,

    @Json(name = "isAllergenRelevantDataProvided")
    val isAllergenRelevantDataProvided: kotlin.String? = null,

    @Json(name = "lastChangeDateTime")
    val lastChangeDateTime: kotlin.String? = null,

    @Json(name = "partyName")
    val partyName: kotlin.String? = null,

    @Json(name = "productionVariantDescription")
    val productionVariantDescription: kotlin.String? = null,

    @Json(name = "publicationDateTime")
    val publicationDateTime: kotlin.String? = null

) {


}

