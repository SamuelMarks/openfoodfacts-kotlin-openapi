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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 *
 * @param ecoscoreMaterialScore 
 * @param ecoscoreShapeRatio 
 * @param material 
 * @param shape 
 */

@Serializable
data class GetProductByBarcode200ResponseAllOfAllOfEcoscoreDataAdjustmentsPackagingPackagingsInner (

    @SerialName("ecoscore_material_score")
    val ecoscoreMaterialScore: kotlin.Int? = null,

    @SerialName("ecoscore_shape_ratio")
    val ecoscoreShapeRatio: kotlin.Int? = null,

    @SerialName("material")
    val material: kotlin.String? = null,

    @SerialName("shape")
    val shape: kotlin.String? = null

) {


}

