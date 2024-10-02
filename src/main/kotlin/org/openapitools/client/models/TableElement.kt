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

import org.openapitools.client.models.TableElementColumnsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Element to display a table.
 *
 * @param id An id for the table.
 * @param title Title of the column. 
 * @param rows 
 * @param columns 
 */


data class TableElement (

    /* An id for the table. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Title of the column.  */
    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "rows")
    val rows: kotlin.String? = null,

    @Json(name = "columns")
    val columns: kotlin.collections.List<TableElementColumnsInner>? = null

) {


}

