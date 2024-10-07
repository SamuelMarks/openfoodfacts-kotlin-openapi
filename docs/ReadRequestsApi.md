# ReadRequestsApi

All URIs are relative to *https://world.openfoodfacts.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getProductByBarcode**](ReadRequestsApi.md#getProductByBarcode) | **GET** /api/v3/product/{barcode} | READ Product - Get information for a specific product by barcode (API V3) |


<a id="getProductByBarcode"></a>
# **getProductByBarcode**
> GetProductByBarcode200Response getProductByBarcode(barcode, cc, lc, tagsLc, fields, knowledgePanelsIncluded, knowledgePanelsExcluded)

READ Product - Get information for a specific product by barcode (API V3)

Retrieve information for a product with a specific barcode.  The fields parameter allows to specify what fields to retrieve.

### Example
```kotlin
// Import classes:
//import io.offscale.openfoodfacts.client.infrastructure.*
//import io.offscale.openfoodfacts.client.models.*

val apiInstance = ReadRequestsApi()
val barcode : kotlin.String = 3017620422003 // kotlin.String | The barcode of the product to be fetched 
val cc : kotlin.String = us // kotlin.String | 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request.
val lc : kotlin.String = fr // kotlin.String | 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request.
val tagsLc : kotlin.String = tagsLc_example // kotlin.String | 2 letter language code to request names of tags in a specific language.  For READ requests: if passed, all taxonomized tags of the response will include a `lc_name` property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.
val fields : kotlin.String = fields_example // kotlin.String | Comma separated list of fields requested in the response.  Special values: * \"none\": returns no fields * \"raw\": returns all fields as stored internally in the database * \"all\": returns all fields except generated fields that need to be explicitly requested such as \"knowledge_panels\".  Defaults to \"all\" for READ requests. The \"all\" value can also be combined with fields like \"attribute_groups\" and \"knowledge_panels\".'
val knowledgePanelsIncluded : kotlin.String = health_card, environment_card // kotlin.String | When knowledge_panels are requested, you can specify which panels should be in the response. All the others will be excluded.
val knowledgePanelsExcluded : kotlin.String = health_card, environment_card // kotlin.String | When knowledge_panels are requested, you can specify which panels to exclude from the response. All the others will be included. If a panel is both excluded and included (with the knowledge_panels_excluded parameter), it will be excluded.
try {
    val result : GetProductByBarcode200Response = apiInstance.getProductByBarcode(barcode, cc, lc, tagsLc, fields, knowledgePanelsIncluded, knowledgePanelsExcluded)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReadRequestsApi#getProductByBarcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReadRequestsApi#getProductByBarcode")
    e.printStackTrace()
}
```

### Parameters
| **barcode** | **kotlin.String**| The barcode of the product to be fetched  | |
| **cc** | **kotlin.String**| 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. | [optional] |
| **lc** | **kotlin.String**| 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. | [optional] |
| **tagsLc** | **kotlin.String**| 2 letter language code to request names of tags in a specific language.  For READ requests: if passed, all taxonomized tags of the response will include a &#x60;lc_name&#x60; property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon. | [optional] |
| **fields** | **kotlin.String**| Comma separated list of fields requested in the response.  Special values: * \&quot;none\&quot;: returns no fields * \&quot;raw\&quot;: returns all fields as stored internally in the database * \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;.  Defaults to \&quot;all\&quot; for READ requests. The \&quot;all\&quot; value can also be combined with fields like \&quot;attribute_groups\&quot; and \&quot;knowledge_panels\&quot;.&#39; | [optional] |
| **knowledgePanelsIncluded** | **kotlin.String**| When knowledge_panels are requested, you can specify which panels should be in the response. All the others will be excluded. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgePanelsExcluded** | **kotlin.String**| When knowledge_panels are requested, you can specify which panels to exclude from the response. All the others will be included. If a panel is both excluded and included (with the knowledge_panels_excluded parameter), it will be excluded. | [optional] |

### Return type

[**GetProductByBarcode200Response**](GetProductByBarcode200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

