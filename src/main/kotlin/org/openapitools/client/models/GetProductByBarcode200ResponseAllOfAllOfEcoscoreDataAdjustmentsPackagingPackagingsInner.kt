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
 * @param ecoscoreMaterialScore 
 * @param ecoscoreShapeRatio 
 * @param material 
 * @param shape 
 */


data class GetProductByBarcode200ResponseAllOfAllOfEcoscoreDataAdjustmentsPackagingPackagingsInner (

    @Json(name = "ecoscore_material_score")
    val ecoscoreMaterialScore: kotlin.Int? = null,

    @Json(name = "ecoscore_shape_ratio")
    val ecoscoreShapeRatio: kotlin.Int? = null,

    @Json(name = "material")
    val material: kotlin.String? = null,

    @Json(name = "shape")
    val shape: kotlin.String? = null

) {


}

