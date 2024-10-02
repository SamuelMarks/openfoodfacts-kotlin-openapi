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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.Call
import okhttp3.HttpUrl

import org.openapitools.client.models.GetProductByBarcode200Response

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class ReadRequestsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://world.openfoodfacts.org")
        }
    }

    /**
     * READ Product - Get information for a specific product by barcode (API V3)
     * Retrieve information for a product with a specific barcode.  The fields parameter allows to specify what fields to retrieve.
     * @param barcode The barcode of the product to be fetched 
     * @param cc 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. (optional)
     * @param lc 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. (optional)
     * @param tagsLc 2 letter language code to request names of tags in a specific language.  For READ requests: if passed, all taxonomized tags of the response will include a &#x60;lc_name&#x60; property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon. (optional)
     * @param fields Comma separated list of fields requested in the response.  Special values: * \&quot;none\&quot;: returns no fields * \&quot;raw\&quot;: returns all fields as stored internally in the database * \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;.  Defaults to \&quot;all\&quot; for READ requests. The \&quot;all\&quot; value can also be combined with fields like \&quot;attribute_groups\&quot; and \&quot;knowledge_panels\&quot;.&#39; (optional)
     * @param knowledgePanelsIncluded When knowledge_panels are requested, you can specify which panels should be in the response. All the others will be excluded. (optional)
     * @param knowledgePanelsExcluded When knowledge_panels are requested, you can specify which panels to exclude from the response. All the others will be included. If a panel is both excluded and included (with the knowledge_panels_excluded parameter), it will be excluded. (optional)
     * @return GetProductByBarcode200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getProductByBarcode(barcode: kotlin.String, cc: kotlin.String? = null, lc: kotlin.String? = null, tagsLc: kotlin.String? = null, fields: kotlin.String? = null, knowledgePanelsIncluded: kotlin.String? = null, knowledgePanelsExcluded: kotlin.String? = null) : GetProductByBarcode200Response {
        val localVarResponse = getProductByBarcodeWithHttpInfo(barcode = barcode, cc = cc, lc = lc, tagsLc = tagsLc, fields = fields, knowledgePanelsIncluded = knowledgePanelsIncluded, knowledgePanelsExcluded = knowledgePanelsExcluded)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetProductByBarcode200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * READ Product - Get information for a specific product by barcode (API V3)
     * Retrieve information for a product with a specific barcode.  The fields parameter allows to specify what fields to retrieve.
     * @param barcode The barcode of the product to be fetched 
     * @param cc 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. (optional)
     * @param lc 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. (optional)
     * @param tagsLc 2 letter language code to request names of tags in a specific language.  For READ requests: if passed, all taxonomized tags of the response will include a &#x60;lc_name&#x60; property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon. (optional)
     * @param fields Comma separated list of fields requested in the response.  Special values: * \&quot;none\&quot;: returns no fields * \&quot;raw\&quot;: returns all fields as stored internally in the database * \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;.  Defaults to \&quot;all\&quot; for READ requests. The \&quot;all\&quot; value can also be combined with fields like \&quot;attribute_groups\&quot; and \&quot;knowledge_panels\&quot;.&#39; (optional)
     * @param knowledgePanelsIncluded When knowledge_panels are requested, you can specify which panels should be in the response. All the others will be excluded. (optional)
     * @param knowledgePanelsExcluded When knowledge_panels are requested, you can specify which panels to exclude from the response. All the others will be included. If a panel is both excluded and included (with the knowledge_panels_excluded parameter), it will be excluded. (optional)
     * @return ApiResponse<GetProductByBarcode200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getProductByBarcodeWithHttpInfo(barcode: kotlin.String, cc: kotlin.String?, lc: kotlin.String?, tagsLc: kotlin.String?, fields: kotlin.String?, knowledgePanelsIncluded: kotlin.String?, knowledgePanelsExcluded: kotlin.String?) : ApiResponse<GetProductByBarcode200Response?> {
        val localVariableConfig = getProductByBarcodeRequestConfig(barcode = barcode, cc = cc, lc = lc, tagsLc = tagsLc, fields = fields, knowledgePanelsIncluded = knowledgePanelsIncluded, knowledgePanelsExcluded = knowledgePanelsExcluded)

        return request<Unit, GetProductByBarcode200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getProductByBarcode
     *
     * @param barcode The barcode of the product to be fetched 
     * @param cc 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. (optional)
     * @param lc 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. (optional)
     * @param tagsLc 2 letter language code to request names of tags in a specific language.  For READ requests: if passed, all taxonomized tags of the response will include a &#x60;lc_name&#x60; property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon. (optional)
     * @param fields Comma separated list of fields requested in the response.  Special values: * \&quot;none\&quot;: returns no fields * \&quot;raw\&quot;: returns all fields as stored internally in the database * \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;.  Defaults to \&quot;all\&quot; for READ requests. The \&quot;all\&quot; value can also be combined with fields like \&quot;attribute_groups\&quot; and \&quot;knowledge_panels\&quot;.&#39; (optional)
     * @param knowledgePanelsIncluded When knowledge_panels are requested, you can specify which panels should be in the response. All the others will be excluded. (optional)
     * @param knowledgePanelsExcluded When knowledge_panels are requested, you can specify which panels to exclude from the response. All the others will be included. If a panel is both excluded and included (with the knowledge_panels_excluded parameter), it will be excluded. (optional)
     * @return RequestConfig
     */
    fun getProductByBarcodeRequestConfig(barcode: kotlin.String, cc: kotlin.String?, lc: kotlin.String?, tagsLc: kotlin.String?, fields: kotlin.String?, knowledgePanelsIncluded: kotlin.String?, knowledgePanelsExcluded: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (cc != null) {
                    put("cc", listOf(cc.toString()))
                }
                if (lc != null) {
                    put("lc", listOf(lc.toString()))
                }
                if (tagsLc != null) {
                    put("tags_lc", listOf(tagsLc.toString()))
                }
                if (fields != null) {
                    put("fields", listOf(fields.toString()))
                }
                if (knowledgePanelsIncluded != null) {
                    put("knowledge_panels_included", listOf(knowledgePanelsIncluded.toString()))
                }
                if (knowledgePanelsExcluded != null) {
                    put("knowledge_panels_excluded", listOf(knowledgePanelsExcluded.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v3/product/{barcode}".replace("{"+"barcode"+"}", encodeURIComponent(barcode.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
