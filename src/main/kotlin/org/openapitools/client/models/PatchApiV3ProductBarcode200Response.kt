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

import org.openapitools.client.models.PatchApiV3ProductBarcode200ResponseAllOfProduct
import org.openapitools.client.models.ResponseStatusResult
import org.openapitools.client.models.WarningOrErrorMessage

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param statusId Overall status of the request: whether it failed or succeeded, with or without warnings or errors.
 * @param result 
 * @param warnings List of warnings. Warnings are used to alert about something that may be wrong, but is not necessarily wrong (e.g. a nutrient value that is unexpectedly high).
 * @param errors List of errors. Errors are used to alert about something that is definitely wrong (e.g. a nutrient value thaty is impossibly high).
 * @param product 
 */


data class PatchApiV3ProductBarcode200Response (

    /* Overall status of the request: whether it failed or succeeded, with or without warnings or errors. */
    @Json(name = "status_id")
    val statusId: PatchApiV3ProductBarcode200Response.StatusId? = null,

    @Json(name = "result")
    val result: ResponseStatusResult? = null,

    /* List of warnings. Warnings are used to alert about something that may be wrong, but is not necessarily wrong (e.g. a nutrient value that is unexpectedly high). */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<WarningOrErrorMessage>? = null,

    /* List of errors. Errors are used to alert about something that is definitely wrong (e.g. a nutrient value thaty is impossibly high). */
    @Json(name = "errors")
    val errors: kotlin.collections.List<WarningOrErrorMessage>? = null,

    @Json(name = "product")
    val product: PatchApiV3ProductBarcode200ResponseAllOfProduct? = null

) {

    /**
     * Overall status of the request: whether it failed or succeeded, with or without warnings or errors.
     *
     * Values: success,success_with_warnings,success_with_errors,failure
     */
    @JsonClass(generateAdapter = false)
    enum class StatusId(val value: kotlin.String) {
        @Json(name = "success") success("success"),
        @Json(name = "success_with_warnings") success_with_warnings("success_with_warnings"),
        @Json(name = "success_with_errors") success_with_errors("success_with_errors"),
        @Json(name = "failure") failure("failure");
    }

}

