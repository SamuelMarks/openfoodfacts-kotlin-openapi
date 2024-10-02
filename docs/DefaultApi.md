# DefaultApi

All URIs are relative to *https://world.openfoodfacts.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getApiV3TagTagtypeTagOrTagid**](DefaultApi.md#getApiV3TagTagtypeTagOrTagid) | **GET** /api/v3/tag/{tagtype}/{tag_or_tagid} | Get knowledge panels for a tag |
| [**getApiV3TaxonomySuggestionsTaxonomy**](DefaultApi.md#getApiV3TaxonomySuggestionsTaxonomy) | **GET** /api/v3/taxonomy_suggestions | Get taxonomy entries suggestions |
| [**patchApiV3ProductBarcode**](DefaultApi.md#patchApiV3ProductBarcode) | **PATCH** /api/v3/product/{barcode} | WRITE Product - Create or update product, or analyze test product (API V3 - Implementation in progress) |
| [**postApiV3ProductRevert**](DefaultApi.md#postApiV3ProductRevert) | **POST** /api/v3/product_revert | Revert a product to a previous revision |


<a id="getApiV3TagTagtypeTagOrTagid"></a>
# **getApiV3TagTagtypeTagOrTagid**
> GetApiV3TagTagtypeTagOrTagid200Response getApiV3TagTagtypeTagOrTagid(tagtype, tagOrTagid, cc, lc)

Get knowledge panels for a tag

Return knowledge panels for a tag.  Currently the knowledge panels returned are:  Categories: - Packaging stats for a category

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tagtype : kotlin.String = categories // kotlin.String | Type of the tag
val tagOrTagid : kotlin.String = tagOrTagid_example // kotlin.String | Tag name (e.g. yogurts) or tag id (e.g. en:yogurts)
val cc : kotlin.String = us // kotlin.String | 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request.
val lc : kotlin.String = fr // kotlin.String | 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request.
try {
    val result : GetApiV3TagTagtypeTagOrTagid200Response = apiInstance.getApiV3TagTagtypeTagOrTagid(tagtype, tagOrTagid, cc, lc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getApiV3TagTagtypeTagOrTagid")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getApiV3TagTagtypeTagOrTagid")
    e.printStackTrace()
}
```

### Parameters
| **tagtype** | **kotlin.String**| Type of the tag | |
| **tagOrTagid** | **kotlin.String**| Tag name (e.g. yogurts) or tag id (e.g. en:yogurts) | |
| **cc** | **kotlin.String**| 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lc** | **kotlin.String**| 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. | [optional] |

### Return type

[**GetApiV3TagTagtypeTagOrTagid200Response**](GetApiV3TagTagtypeTagOrTagid200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApiV3TaxonomySuggestionsTaxonomy"></a>
# **getApiV3TaxonomySuggestionsTaxonomy**
> GetApiV3TaxonomySuggestionsTaxonomy200Response getApiV3TaxonomySuggestionsTaxonomy(tagtype, cc, lc, string, categories, shape, limit, getSynonyms, term)

Get taxonomy entries suggestions

Open Food Facts uses multilingual [taxonomies](https://wiki.openfoodfacts.org/Global_taxonomies) to normalize entries for categories, labels, ingredients, packaging shapes / materials / recycling instructions and many more fields.  This API returns taxonomy entries suggestions that can be used in product edit forms, search forms etc. (for instance in autocomplete dropdowns using libraries like Tagify or select2 on the Web).  Suggestions filtering:  The string parameter allows to get only suggestions that contain a specific string (useful for autocomplete suggestions).  Suggestions ordering:  - For packaging shapes and materials, suggestions are ordered first by the number of packaging components they appear in (restricted by country, categories and shape (for materials) if they are passed as parameters). - for all other taxonomies, results are ordered alphabetically  If a string is passed, an additional sort is done to put first suggestions that start with the string, followed by suggestions with a word that start with the string, and then suggestions that contain the string anywhere.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tagtype : kotlin.String = additives // kotlin.String | 
val cc : kotlin.String = us // kotlin.String | 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request.
val lc : kotlin.String = fr // kotlin.String | 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request.
val string : kotlin.String = pe // kotlin.String | Optional string used to filter suggestions (useful for autocomplete).  If passed, suggestions starting with the string will be returned first, followed by suggestions matching the string at the beginning of a word, and suggestions matching the string inside a word.
val categories : kotlin.String = yougurts // kotlin.String | Comma separated list of categories tags (e.g. \"en:fats,en:unsalted-butters\" or categories names in the language indicated by the \"lc\" field (e.g. \"graisses, beurres salés\" in French)
val shape : kotlin.String = bottle // kotlin.String | Shape of packaging component (tag identified in the packaging_shapes taxonomy, or plain text tag name in the language indicated by the \"lc\" field)
val limit : kotlin.String = limit_example // kotlin.String | Maximum number of suggestions. Default is 25, max is 400.
val getSynonyms : kotlin.String = getSynonyms_example // kotlin.String | Whether or not to include \"matched_synonyms\" in the response. Set to 1 to include.
val term : kotlin.String = term_example // kotlin.String | Alias for the \"string\" parameter provided for backward compatibility. \"string\" takes precedence.
try {
    val result : GetApiV3TaxonomySuggestionsTaxonomy200Response = apiInstance.getApiV3TaxonomySuggestionsTaxonomy(tagtype, cc, lc, string, categories, shape, limit, getSynonyms, term)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getApiV3TaxonomySuggestionsTaxonomy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getApiV3TaxonomySuggestionsTaxonomy")
    e.printStackTrace()
}
```

### Parameters
| **tagtype** | **kotlin.String**|  | [optional] |
| **cc** | **kotlin.String**| 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. | [optional] |
| **lc** | **kotlin.String**| 2 letter code of the language of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the Accept-Language header of the request. | [optional] |
| **string** | **kotlin.String**| Optional string used to filter suggestions (useful for autocomplete).  If passed, suggestions starting with the string will be returned first, followed by suggestions matching the string at the beginning of a word, and suggestions matching the string inside a word. | [optional] |
| **categories** | **kotlin.String**| Comma separated list of categories tags (e.g. \&quot;en:fats,en:unsalted-butters\&quot; or categories names in the language indicated by the \&quot;lc\&quot; field (e.g. \&quot;graisses, beurres salés\&quot; in French) | [optional] |
| **shape** | **kotlin.String**| Shape of packaging component (tag identified in the packaging_shapes taxonomy, or plain text tag name in the language indicated by the \&quot;lc\&quot; field) | [optional] |
| **limit** | **kotlin.String**| Maximum number of suggestions. Default is 25, max is 400. | [optional] |
| **getSynonyms** | **kotlin.String**| Whether or not to include \&quot;matched_synonyms\&quot; in the response. Set to 1 to include. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **term** | **kotlin.String**| Alias for the \&quot;string\&quot; parameter provided for backward compatibility. \&quot;string\&quot; takes precedence. | [optional] |

### Return type

[**GetApiV3TaxonomySuggestionsTaxonomy200Response**](GetApiV3TaxonomySuggestionsTaxonomy200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchApiV3ProductBarcode"></a>
# **patchApiV3ProductBarcode**
> PatchApiV3ProductBarcode200Response patchApiV3ProductBarcode(barcode, patchApiV3ProductBarcodeRequest)

WRITE Product - Create or update product, or analyze test product (API V3 - Implementation in progress)

This API allows to create or update a product (if the product already exists, its data is updated, otherwise it is created), or to analyze a test product (in which case no product is created or updated). To analyze a product, the \&quot;barcode\&quot; path component needs to contain the value \&quot;test\&quot; instead of a barcode.  New API to send structured product data in a JSON format instead of in a flattened list of key / value pairs field as-in the current product add / edit API that relies on a multipart/form-data format.  Important: this new Product WRITE API is under development. The initial deployment will support only packaging fields.  This new API will be used in particular to send structured packaging data: https://openfoodfacts.github.io/openfoodfacts-server/dev/explain-packaging-data/  The new API can then be gradually extended to support other product fields.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val barcode : kotlin.String = barcode_example // kotlin.String | Barcode of the product to create or update, or \"test\" to analyze the product data sent without creating or updating a product
val patchApiV3ProductBarcodeRequest : PatchApiV3ProductBarcodeRequest = {"lc":"fr","cc":"fr","fields":"product_name,packagings","tags_lc":"fr","userid":"string","password":"string","code":"string","product":{"packagings":[{"number_of_units":6,"shape":{"id":"en:bottle"},"material":{"id":"en:plastic"},"recycling":{"id":"en:recycle"},"quantity_per_unit":"25 cl","weight_measured":10}],"packagings_add":[{"number_of_units":6,"shape":{"id":"en:bottle"},"material":{"id":"en:plastic"},"recycling":{"id":"en:recycle"},"quantity_per_unit":"25 cl","weight_measured":10}]}} // PatchApiV3ProductBarcodeRequest | Structured data for the product is passed in the product field.  For complex structures such as the packagings object, it is possible to replace pre-existing data, or completing it:  - an object sent in the packagings field will replace any pre-existing data. - an object sent in the field suffixed with _add (e.g. packagings_add) will be merged with any pre-existing data. 
try {
    val result : PatchApiV3ProductBarcode200Response = apiInstance.patchApiV3ProductBarcode(barcode, patchApiV3ProductBarcodeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#patchApiV3ProductBarcode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#patchApiV3ProductBarcode")
    e.printStackTrace()
}
```

### Parameters
| **barcode** | **kotlin.String**| Barcode of the product to create or update, or \&quot;test\&quot; to analyze the product data sent without creating or updating a product | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchApiV3ProductBarcodeRequest** | [**PatchApiV3ProductBarcodeRequest**](PatchApiV3ProductBarcodeRequest.md)| Structured data for the product is passed in the product field.  For complex structures such as the packagings object, it is possible to replace pre-existing data, or completing it:  - an object sent in the packagings field will replace any pre-existing data. - an object sent in the field suffixed with _add (e.g. packagings_add) will be merged with any pre-existing data.  | [optional] |

### Return type

[**PatchApiV3ProductBarcode200Response**](PatchApiV3ProductBarcode200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="postApiV3ProductRevert"></a>
# **postApiV3ProductRevert**
> PostApiV3ProductRevert200Response postApiV3ProductRevert(postApiV3ProductRevertRequest)

Revert a product to a previous revision

For moderators only, revert a product to a previous revision.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val postApiV3ProductRevertRequest : PostApiV3ProductRevertRequest =  // PostApiV3ProductRevertRequest | The code and rev fields are mandatory. 
try {
    val result : PostApiV3ProductRevert200Response = apiInstance.postApiV3ProductRevert(postApiV3ProductRevertRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#postApiV3ProductRevert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#postApiV3ProductRevert")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postApiV3ProductRevertRequest** | [**PostApiV3ProductRevertRequest**](PostApiV3ProductRevertRequest.md)| The code and rev fields are mandatory.  | [optional] |

### Return type

[**PostApiV3ProductRevert200Response**](PostApiV3ProductRevert200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

