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

import org.openapitools.client.models.GetProductByBarcode200ResponseAllOfAllOfImages1Sizes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This represents an image uploaded for this product. 
 *
 * @param sizes 
 * @param uploadedT The time the image was uploaded (as unix timestamp). 
 * @param uploader The contributor that uploaded the image. 
 */


data class GetProductByBarcode200ResponseAllOfAllOfImages1 (

    @Json(name = "sizes")
    val sizes: GetProductByBarcode200ResponseAllOfAllOfImages1Sizes? = null,

    /* The time the image was uploaded (as unix timestamp).  */
    @Json(name = "uploaded_t")
    val uploadedT: kotlin.String? = null,

    /* The contributor that uploaded the image.  */
    @Json(name = "uploader")
    val uploader: kotlin.String? = null

) {


}

