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

import org.openapitools.client.models.GetProductByBarcode200ResponseAllOfAllOfImages1SizesFull

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The available image sizes for the product (both reduced and full).  The reduced images are the ones with numbers as the key( 100, 200 etc)  while the full images have `full` as the key. 
 *
 * @param full 
 */

@Serializable
data class GetProductByBarcode200ResponseAllOfAllOfImages1Sizes (

    @SerialName("full")
    val full: GetProductByBarcode200ResponseAllOfAllOfImages1SizesFull? = null

) {


}

