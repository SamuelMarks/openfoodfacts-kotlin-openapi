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
 * Detail of data the Nutri-Score was computed upon.  **Note**: this might not be stable, don't rely too much on this, or, at least, tell us !  **TODO** document each property 
 *
 * @param energy 
 * @param energyPoints 
 * @param energyValue 
 * @param fiber 
 * @param fiberPoints 
 * @param fiberValue 
 * @param fruitsVegetablesNutsColzaWalnutOliveOils 
 * @param fruitsVegetablesNutsColzaWalnutOliveOilsPoints 
 * @param fruitsVegetablesNutsColzaWalnutOliveOilsValue 
 * @param grade 
 * @param isBeverage 
 * @param isCheese 
 * @param isFat 
 * @param isWater 
 * @param negativePoints 
 * @param positivePoints 
 * @param proteins 
 * @param proteinsPoints 
 * @param proteinsValue 
 * @param saturatedFat 
 * @param saturatedFatPoints 
 * @param saturatedFatRatio 
 * @param saturatedFatRatioPoints 
 * @param saturatedFatRatioValue 
 * @param saturatedFatValue 
 * @param score 
 * @param sodium 
 * @param sodiumPoints 
 * @param sodiumValue 
 * @param sugars 
 * @param sugarsPoints 
 * @param sugarsValue 
 */

@Serializable
data class GetProductByBarcode200ResponseAllOfAllOfNutriscoreData (

    @SerialName("energy")
    val energy: kotlin.Int? = null,

    @SerialName("energy_points")
    val energyPoints: kotlin.Int? = null,

    @SerialName("energy_value")
    val energyValue: kotlin.Int? = null,

    @SerialName("fiber")
    val fiber: kotlin.Int? = null,

    @SerialName("fiber_points")
    val fiberPoints: kotlin.Int? = null,

    @SerialName("fiber_value")
    val fiberValue: kotlin.Int? = null,

    @SerialName("fruits_vegetables_nuts_colza_walnut_olive_oils")
    val fruitsVegetablesNutsColzaWalnutOliveOils: kotlin.Int? = null,

    @SerialName("fruits_vegetables_nuts_colza_walnut_olive_oils_points")
    val fruitsVegetablesNutsColzaWalnutOliveOilsPoints: kotlin.Int? = null,

    @SerialName("fruits_vegetables_nuts_colza_walnut_olive_oils_value")
    val fruitsVegetablesNutsColzaWalnutOliveOilsValue: kotlin.Int? = null,

    @SerialName("grade")
    val grade: kotlin.String? = null,

    @SerialName("is_beverage")
    val isBeverage: kotlin.Int? = null,

    @SerialName("is_cheese")
    val isCheese: kotlin.Int? = null,

    @SerialName("is_fat")
    val isFat: kotlin.Int? = null,

    @SerialName("is_water")
    val isWater: kotlin.Int? = null,

    @SerialName("negative_points")
    val negativePoints: kotlin.Int? = null,

    @SerialName("positive_points")
    val positivePoints: kotlin.Int? = null,

    @SerialName("proteins")
    val proteins: Double? = null,

    @SerialName("proteins_points")
    val proteinsPoints: kotlin.Int? = null,

    @SerialName("proteins_value")
    val proteinsValue: Double? = null,

    @SerialName("saturated_fat")
    val saturatedFat: Double? = null,

    @SerialName("saturated_fat_points")
    val saturatedFatPoints: kotlin.Int? = null,

    @SerialName("saturated_fat_ratio")
    val saturatedFatRatio: Double? = null,

    @SerialName("saturated_fat_ratio_points")
    val saturatedFatRatioPoints: kotlin.Int? = null,

    @SerialName("saturated_fat_ratio_value")
    val saturatedFatRatioValue: Double? = null,

    @SerialName("saturated_fat_value")
    val saturatedFatValue: Double? = null,

    @SerialName("score")
    val score: kotlin.Int? = null,

    @SerialName("sodium")
    val sodium: Double? = null,

    @SerialName("sodium_points")
    val sodiumPoints: kotlin.Int? = null,

    @SerialName("sodium_value")
    val sodiumValue: Double? = null,

    @SerialName("sugars")
    val sugars: Double? = null,

    @SerialName("sugars_points")
    val sugarsPoints: kotlin.Int? = null,

    @SerialName("sugars_value")
    val sugarsValue: Double? = null

) {


}

