
# ProductUpdateAPIV3WRITE

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **packagings** | [**kotlin.collections.List&lt;PackagingComponentWRITE&gt;**](PackagingComponentWRITE.md) | The packagings object is an array of individual packaging component objects.  The Packaging data document explains how packaging data is structured in Open Food Facts: https://openfoodfacts.github.io/openfoodfacts-server/dev/explain-packaging-data/ |  [optional] |
| **packagingsAdd** | [**kotlin.collections.List&lt;PackagingComponentWRITE&gt;**](PackagingComponentWRITE.md) | The packagings object is an array of individual packaging component objects.  The Packaging data document explains how packaging data is structured in Open Food Facts: https://openfoodfacts.github.io/openfoodfacts-server/dev/explain-packaging-data/ |  [optional] |
| **packagingsComplete** | **kotlin.Int** | Indicate if the packagings array contains all the packaging parts of the product. This field can be set by users when they enter or verify packaging data. Possible values are 0 or 1. |  [optional] |
| **lang** | **kotlin.String** | 2 letter language code of the main language of the product (the most prominent on the packaging) |  [optional] |
| **quantity** | **kotlin.String** |  |  [optional] |
| **servingSize** | **kotlin.String** |  |  [optional] |
| **categoriesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of categories |  [optional] |



