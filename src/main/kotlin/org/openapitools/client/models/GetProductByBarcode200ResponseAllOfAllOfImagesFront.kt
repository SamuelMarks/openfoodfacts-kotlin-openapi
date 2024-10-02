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

import dev.upvote.api.models.GetProductByBarcode200ResponseAllOfAllOfImagesFrontSizes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This represents an image (or part of it) selected for a specific role on this product. 
 *
 * @param angle The angle of the image rotation (if it was rotated).
 * @param coordinatesImageSize 
 * @param geometry 
 * @param imgid The id of the original/source image that was selected to edit(rotate, normalize etc) to produce this new image.
 * @param normalize Normalize colors.
 * @param rev 
 * @param sizes 
 * @param whiteMagic Photo on white background : Try to remove the background. 
 * @param x1 
 * @param x2 
 * @param y1 
 * @param y2 
 */

@Serializable
data class GetProductByBarcode200ResponseAllOfAllOfImagesFront (

    /* The angle of the image rotation (if it was rotated). */
    @SerialName("angle")
    val angle: kotlin.Int? = null,

    @SerialName("coordinates_image_size")
    val coordinatesImageSize: kotlin.String? = null,

    @SerialName("geometry")
    val geometry: kotlin.String? = null,

    /* The id of the original/source image that was selected to edit(rotate, normalize etc) to produce this new image. */
    @SerialName("imgid")
    val imgid: kotlin.String? = null,

    /* Normalize colors. */
    @SerialName("normalize")
    val normalize: kotlin.Any? = null,

    @SerialName("rev")
    val rev: kotlin.String? = null,

    @SerialName("sizes")
    val sizes: GetProductByBarcode200ResponseAllOfAllOfImagesFrontSizes? = null,

    /* Photo on white background : Try to remove the background.  */
    @SerialName("white_magic")
    val whiteMagic: kotlin.Any? = null,

    @SerialName("x1")
    val x1: kotlin.String? = null,

    @SerialName("x2")
    val x2: kotlin.String? = null,

    @SerialName("y1")
    val y1: kotlin.String? = null,

    @SerialName("y2")
    val y2: kotlin.String? = null

) {


}

