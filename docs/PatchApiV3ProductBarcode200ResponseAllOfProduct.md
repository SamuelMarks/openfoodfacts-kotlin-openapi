
# PatchApiV3ProductBarcode200ResponseAllOfProduct

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **abbreviatedProductName** | **kotlin.String** | Abbreviated name in requested language |  [optional] |
| **code** | **kotlin.String** | barcode of the product (can be EAN-13 or internal codes for some food stores), for products without a barcode, Open Food Facts assigns a number starting with the 200 reserved prefix  |  [optional] |
| **codesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **genericName** | **kotlin.String** | Legal name of the product as regulated by the European authorities.  |  [optional] |
| **id** | **kotlin.String** | internal identifier for the product, usually set to the value of &#x60;code&#x60;, except on the producers platform where it is prefixed by the owner  |  [optional] |
| **lc** | **kotlin.String** | Main language of the product. This is a duplicate of &#x60;lang&#x60; property (for historical reasons).  |  [optional] |
| **lang** | **kotlin.String** | Main language of the product.  This should be the main language of product packaging (if one is predominant).  Main language is also used to decide which ingredients list to parse.  |  [optional] |
| **novaGroup** | **kotlin.Int** | Nova group as an integer from 1 to 4. See https://world.openfoodfacts.org/nova  |  [optional] |
| **novaGroups** | **kotlin.String** |  |  [optional] |
| **obsolete** | **kotlin.String** |  |  [optional] |
| **obsoleteSinceDate** | **kotlin.String** | A date at which the product was declared obsolete. This means it&#39;s not produced any more.  |  [optional] |
| **productName** | **kotlin.String** | The name of the product  |  [optional] |
| **productNameEn** | **kotlin.String** | The name of the product can also be in many other languages like product_name_fr (for French).  |  [optional] |
| **productQuantity** | **kotlin.String** | The size in g or ml for the whole product. It&#39;s a normalized version of the quantity field.  |  [optional] |
| **productQuantityUnit** | **kotlin.String** | The unit (either g or ml) for the correponding product_quantity.  |  [optional] |
| **quantity** | **kotlin.String** | Quantity and Unit.  |  [optional] |
| **additivesN** | **kotlin.Int** | Number of food additives.  |  [optional] |
| **checked** | **kotlin.String** |  |  [optional] |
| **complete** | **kotlin.Int** |  |  [optional] |
| **completeness** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **ecoscoreGrade** | **kotlin.String** | See also: &#x60;ecoscore_tags&#x60;  |  [optional] |
| **ecoscoreScore** | **kotlin.Int** | See also: &#x60;ecoscore_tags&#x60;  |  [optional] |
| **foodGroups** | **kotlin.String** |  |  [optional] |
| **foodGroupsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **nutrientLevels** | [**GetProductByBarcode200ResponseAllOfAllOfNutrientLevels**](GetProductByBarcode200ResponseAllOfAllOfNutrientLevels.md) |  |  [optional] |
| **packagingText** | **kotlin.String** | Recycling instructions as raw text, e.g. Plastic bottle to recycle, Plastic cap to recycle. This will get automatically parsed and will be used to compute the Eco-Score. You can either request it (if it exists) or send it in a specific language.  |  [optional] |
| **packagings** | [**kotlin.collections.List&lt;PackagingComponentREAD&gt;**](PackagingComponentREAD.md) | The packagings object is an array of individual packaging component objects.  The Packaging data document explains how packaging data is structured in Open Food Facts: https://openfoodfacts.github.io/openfoodfacts-server/dev/explain-packaging-data/  The shape, material and recycling properties of each packaging component are linked to entries in the packaging_shapes, packaging_materials and packaging_recycling taxonomies:  https://world.openfoodfacts.org/data/taxonomies/packaging_shapes.json https://world.openfoodfacts.org/data/taxonomies/packaging_materials.json https://world.openfoodfacts.org/data/taxonomies/packaging_recycling.json  If the tags_lc field is set, the properties will include a lc_name field with the translation in the requested language. |  [optional] |
| **packagingsComplete** | **kotlin.Int** | Indicate if the packagings array contains all the packaging parts of the product. This field can be set by users when they enter or verify packaging data. Possible values are 0 or 1. |  [optional] |
| **pnnsGroups1** | **kotlin.String** | Category of food according to [French Nutrition and Health Program](https://fr.wikipedia.org/wiki/Programme_national_nutrition_sant%C3%A9)  |  [optional] |
| **pnnsGroups1Tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **pnnsGroups2** | **kotlin.String** | Sub Category of food according to [French Nutrition and Health Program](https://fr.wikipedia.org/wiki/Programme_national_nutrition_sant%C3%A9)  |  [optional] |
| **pnnsGroups2Tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **popularityKey** | **kotlin.Int** | An imprecise measurement of popularity based on Scan statistics. A higher value means higher popularity.  |  [optional] |
| **popularityTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Indicators for the popularity of a product, like the amount of scans in a specific year.  |  [optional] |
| **scansN** | **kotlin.Int** |  |  [optional] |
| **uniqueScansN** | **kotlin.Int** |  |  [optional] |
| **servingQuantity** | **kotlin.String** | Normalized version of serving_size. Note that this is NOT the number of servings by product. &lt;small&gt;(in perl, see &#x60;normalize_serving_size&#x60;)&lt;/small&gt;  |  [optional] |
| **servingQuantityUnit** | **kotlin.String** | The unit (either g or ml) for the correponding serving_quantity.  |  [optional] |
| **servingSize** | **kotlin.String** | Serving size text (generally in g or ml). We expect a quantity + unit but the user is free to input any string.  |  [optional] |
| **brands** | **kotlin.String** | List of brands (not taxonomized) |  [optional] |
| **brandsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **categories** | **kotlin.String** |  |  [optional] |
| **categoriesHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **categoriesLc** | **kotlin.String** | Categories language code |  [optional] |
| **categoriesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **checkersTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **cities** | **kotlin.String** |  |  [optional] |
| **citiesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **correctorsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **countries** | **kotlin.String** | List of countries where the product is sold.  |  [optional] |
| **countriesHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **countriesLc** | **kotlin.String** | Countries language code |  [optional] |
| **countriesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ecoscoreTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | All ecoscore of a product. Most of the time it&#39;s only one value, but it might eventually be more for products composed of sub-products. See also: &#x60;ecoscore_score&#x60;, &#x60;ecoscore_grade&#x60;.  |  [optional] |
| **embCodes** | **kotlin.String** | Packager code. EMB is the French system of traceability codes for packager.  |  [optional] |
| **embCodesOrig** | **kotlin.String** |  |  [optional] |
| **embCodesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **labels** | **kotlin.String** |  |  [optional] |
| **labelsHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **labelsLc** | **kotlin.String** |  |  [optional] |
| **labelsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **entryDatesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The data as a series of tag: &#x60;yyyy-mm-dd&#x60;, &#x60;yyyy-mm&#x60;, &#x60;yyyy&#x60;  |  [optional] |
| **manufacturingPlaces** | **kotlin.String** | Places where the product was manufactured or transformed.  |  [optional] |
| **manufacturingPlacesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **novaGroupsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **nutrientLevelsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **imageFrontSmallUrl** | **kotlin.String** |  |  [optional] |
| **imageFrontThumbUrl** | **kotlin.String** |  |  [optional] |
| **imageFrontUrl** | **kotlin.String** |  |  [optional] |
| **imageNutritionSmallUrl** | **kotlin.String** |  |  [optional] |
| **imageNutritionThumbUrl** | **kotlin.String** |  |  [optional] |
| **imageNutritionUrl** | **kotlin.String** |  |  [optional] |
| **imageSmallUrl** | **kotlin.String** |  |  [optional] |
| **imageThumbUrl** | **kotlin.String** |  |  [optional] |
| **imageUrl** | **kotlin.String** |  |  [optional] |
| **images** | [**GetProductByBarcode200ResponseAllOfAllOfImages**](GetProductByBarcode200ResponseAllOfAllOfImages.md) |  |  [optional] |
| **lastImageDatesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **lastImageT** | **kotlin.Int** |  |  [optional] |
| **selectedImages** | [**GetProductByBarcode200ResponseAllOfAllOfSelectedImages**](GetProductByBarcode200ResponseAllOfAllOfSelectedImages.md) |  |  [optional] |
| **ecoscoreData** | [**GetProductByBarcode200ResponseAllOfAllOfEcoscoreData**](GetProductByBarcode200ResponseAllOfAllOfEcoscoreData.md) |  |  [optional] |
| **ecoscoreExtendedDataVersion** | **kotlin.String** |  |  [optional] |
| **environmentImpactLevel** | **kotlin.String** |  |  [optional] |
| **environmentImpactLevelTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **additivesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **allergens** | **kotlin.String** | comma separated list of allergens |  [optional] |
| **allergensLc** | **kotlin.String** | language in which &#x60;allergens&#x60; where input |  [optional] |
| **allergensHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **allergensTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredients** | [**kotlin.collections.List&lt;GetProductByBarcode200ResponseAllOfAllOfIngredientsInner&gt;**](GetProductByBarcode200ResponseAllOfAllOfIngredientsInner.md) | This structure gives the different ingredients and some information about them, like estimate on their quantity.  |  [optional] |
| **ingredientsAnalysis** | [**GetProductByBarcode200ResponseAllOfAllOfIngredientsAnalysis**](GetProductByBarcode200ResponseAllOfAllOfIngredientsAnalysis.md) |  |  [optional] |
| **ingredientsAnalysisTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredientsFromOrThatMayBeFromPalmOilN** | **kotlin.Int** |  |  [optional] |
| **ingredientsFromPalmOilN** | **kotlin.Int** |  |  [optional] |
| **ingredientsFromPalmOilTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **ingredientsHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredientsN** | **kotlin.Int** |  |  [optional] |
| **ingredientsNTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredientsOriginalTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredientsPercentAnalysis** | **kotlin.Int** |  |  [optional] |
| **ingredientsSweetenersN** | **kotlin.Int** | Number of sweeteners additives in the ingredients. Undefined if ingredients are not specified.  |  [optional] |
| **ingredientsNonNutritiveSweetenersN** | **kotlin.Int** | Number of non-nutritive sweeteners additives (as specified in the Nutri-Score formula) in the ingredients. Undefined if ingredients are not specified.  |  [optional] |
| **ingredientsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **ingredientsLc** | **kotlin.String** | Language that was used to parse the ingredient list. If &#x60;ingredients_text&#x60; is available for the product main language (&#x60;lang&#x60;), &#x60;ingredients_lc&#x3D;lang&#x60;, otherwise we look at &#x60;ingredients_text&#x60; fields for other languages and set &#x60;ingredients_lc&#x60; to the first non-empty &#x60;ingredient_text&#x60;.   |  [optional] |
| **ingredientsText** | **kotlin.String** | Raw list of ingredients. This will get automatically parsed and get used to compute the Eco-Score or find allergens, etc..  It&#39;s a copy of ingredients_text in the main language of the product (see &#x60;lang&#x60; proprety).  |  [optional] |
| **ingredientsTextWithAllergens** | **kotlin.String** | Same text as &#x60;ingredients_text&#x60; but where allergens have HTML elements around them to identify them  |  [optional] |
| **ingredientsThatMayBeFromPalmOilN** | **kotlin.Int** |  |  [optional] |
| **ingredientsThatMayBeFromPalmOilTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **ingredientsWithSpecifiedPercentN** | **kotlin.Int** |  |  [optional] |
| **ingredientsWithSpecifiedPercentSum** | **kotlin.Int** |  |  [optional] |
| **ingredientsWithUnspecifiedPercentN** | **kotlin.Int** |  |  [optional] |
| **ingredientsWithUnspecifiedPercentSum** | **kotlin.Int** |  |  [optional] |
| **knownIngredientsN** | **kotlin.Int** |  |  [optional] |
| **origins** | **kotlin.String** | Origins of ingredients  |  [optional] |
| **originsHierarchy** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **originsLc** | **kotlin.String** |  |  [optional] |
| **originsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **traces** | **kotlin.String** | List of substances that might cause allergies that are present in trace amounts in the product (this does not include the ingredients, as they are not only present in trace amounts). It is taxonomized with the allergens taxonomy.  |  [optional] |
| **tracesHierarchy** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **tracesLc** | **kotlin.String** |  |  [optional] |
| **tracesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **unknownIngredientsN** | **kotlin.Int** |  |  [optional] |
| **noNutritionData** | **kotlin.String** | When a product does not have nutrition data displayed on the packaging, the user can check the field \&quot;Nutrition facts are not specified on the product\&quot;. By doing so, the no_nutrition_data field takes the value \&quot;on\&quot;. This case is frequent (thousands of products).  |  [optional] |
| **nutritionDataPer** | [**inline**](#NutritionDataPer) | The nutrition data on the package can be per serving or per 100g.  This is essential to understand if &#x60;&lt;nutrient&gt;_value&#x60; and &#x60;&lt;nutrient&gt;&#x60; values in &#x60;nutriments&#x60; applies for a serving or for 100g.  **IMPORTANT:** When writing products, this setting applies to all existing nutrients values for the product, not only the nutrient values sent in the write request. So it should not be changed unless all nutrients values are provided with values that match the nutrition_data_per field.  |  [optional] |
| **nutritionDataPreparedPer** | [**inline**](#NutritionDataPreparedPer) | The nutrition data for prepared product on the package (if any) can be per serving or per 100g.  This is essential to understand if &#x60;&lt;nutrient&gt;_prepared_value&#x60; and &#x60;&lt;nutrient&gt;_prepared&#x60; values in &#x60;nutriments&#x60; applies for a serving or for 100g.  See also important note on &#x60;nutrition_data_per&#x60;.  |  [optional] |
| **nutriments** | [**GetProductByBarcode200ResponseAllOfAllOfNutriments**](GetProductByBarcode200ResponseAllOfAllOfNutriments.md) |  |  [optional] |
| **nutriscoreData** | [**GetProductByBarcode200ResponseAllOfAllOfNutriscoreData**](GetProductByBarcode200ResponseAllOfAllOfNutriscoreData.md) |  |  [optional] |
| **nutriscoreGrade** | [**inline**](#NutriscoreGrade) | Nutri-Score for the product as a letter.  See https://world.openfoodfacts.org/nutriscore.  |  [optional] |
| **nutriscoreScore** | **kotlin.Int** | Nutri-Score for the product as an integer (see also &#x60;nutriscore_grade&#x60;).  |  [optional] |
| **nutriscoreScoreOpposite** | **kotlin.Int** |  |  [optional] |
| **nutritionGradeFr** | **kotlin.String** | Nutrition grade (‘a’ to ‘e’), https://world.openfoodfacts.org/nutriscore.  |  [optional] |
| **nutritionGrades** | **kotlin.String** | Nutrition grades as a comma separated list.  Some products with multiple components might have multiple Nutri-Score  |  [optional] |
| **nutritionGradesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **nutritionScoreBeverage** | **kotlin.Int** |  |  [optional] |
| **nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredients** | **kotlin.Int** |  |  [optional] |
| **nutritionScoreWarningFruitsVegetablesNutsEstimateFromIngredientsValue** | **kotlin.Int** |  |  [optional] |
| **nutritionScoreWarningNoFiber** | **kotlin.Int** |  |  [optional] |
| **otherNutritionalSubstancesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **unknownNutrientsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **vitaminsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **dataQualityBugsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **dataQualityErrorsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **dataQualityInfoTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **dataQualityTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **dataQualityWarningsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **dataSources** | **kotlin.String** | Source of data imported from producers.  |  [optional] |
| **dataSourcesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **lastCheckDatesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **lastCheckedT** | **kotlin.Int** |  |  [optional] |
| **lastChecker** | **kotlin.String** |  |  [optional] |
| **states** | **kotlin.String** | comma separated list of values indicating some states of the product, like things to be done, or to be completed. See [states taxonomy](https://static.openfoodfacts.net/data/taxonomies/states.json)  |  [optional] |
| **statesHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **statesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **miscTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | Information about different aspect of the product  |  [optional] |
| **additivesOriginalTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **additivesPrevOriginalTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **addedCountriesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **allergensFromIngredients** | **kotlin.String** |  |  [optional] |
| **allergensFromUser** | **kotlin.String** |  |  [optional] |
| **aminoAcidsPrevTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **aminoAcidsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **carbonFootprintPercentOfKnownIngredients** | **kotlin.Int** |  |  [optional] |
| **categoriesProperties** | [**GetProductByBarcode200ResponseAllOfAllOfCategoriesProperties**](GetProductByBarcode200ResponseAllOfAllOfCategoriesProperties.md) |  |  [optional] |
| **categoriesPropertiesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **categoryProperties** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **ciqualFoodNameTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **comparedToCategory** | **kotlin.String** | the category to use for comparison.  **TODO** explain how it is chosen.  |  [optional] |
| **conservationConditions** | **kotlin.String** |  |  [optional] |
| **customerService** | **kotlin.String** | Contact info of customer service.  |  [optional] |
| **expirationDate** | **kotlin.String** |  |  [optional] |
| **link** | **kotlin.String** | link to the product on the website of the producer  |  [optional] |
| **mainCountriesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **mineralsPrevTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **mineralsTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **ownerFields** | [**GetProductByBarcode200ResponseAllOfAllOfOwnerFields**](GetProductByBarcode200ResponseAllOfAllOfOwnerFields.md) |  |  [optional] |
| **novaGroupsMarkers** | [**GetProductByBarcode200ResponseAllOfAllOfNovaGroupsMarkers**](GetProductByBarcode200ResponseAllOfAllOfNovaGroupsMarkers.md) |  |  [optional] |
| **nucleotidesTags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **origin** | **kotlin.String** |  |  [optional] |
| **purchasePlaces** | **kotlin.String** | Country, state, or city where the product can be purchased.  |  [optional] |
| **purchasePlacesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **stores** | **kotlin.String** | Distributor name.  |  [optional] |
| **storesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **tracesFromIngredients** | **kotlin.String** |  |  [optional] |
| **tracesFromUser** | **kotlin.String** |  |  [optional] |
| **createdT** | **kotlin.Int** | Date when the product was added (UNIX timestamp format). See also &#x60;entry_dates_tags&#x60;  |  [optional] |
| **creator** | **kotlin.String** | The contributor who added the product first.  |  [optional] |
| **editorsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of editors who edited the product.  |  [optional] |
| **informersTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **interfaceVersionCreated** | **kotlin.String** |  |  [optional] |
| **interfaceVersionModified** | **kotlin.String** |  |  [optional] |
| **languages** | [**kotlin.Any**](.md) |  |  [optional] |
| **languagesCodes** | [**kotlin.Any**](.md) | Same as &#x60;languages&#x60; but by language code, instead of language tags  |  [optional] |
| **languagesHierarchy** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **languagesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **lastEditDatesTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **lastEditor** | **kotlin.String** |  |  [optional] |
| **lastModifiedBy** | **kotlin.String** | The username of the user who last modified the product.  |  [optional] |
| **lastModifiedT** | **kotlin.Int** | Date when the product page was last modified.  |  [optional] |
| **owner** | **kotlin.String** | Id of the producer in case he provides his own data about a product (producer platform).  |  [optional] |
| **ownersTags** | **kotlin.String** | Tagyfied version of owner  |  [optional] |
| **photographersTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **rev** | **kotlin.Int** | revision number of this product version (each edit adds a revision) |  [optional] |
| **sources** | [**kotlin.collections.List&lt;GetProductByBarcode200ResponseAllOfAllOfSourcesInner&gt;**](GetProductByBarcode200ResponseAllOfAllOfSourcesInner.md) |  |  [optional] |
| **sourcesFields** | [**GetProductByBarcode200ResponseAllOfAllOfSourcesFields**](GetProductByBarcode200ResponseAllOfAllOfSourcesFields.md) |  |  [optional] |
| **teams** | **kotlin.String** |  |  [optional] |
| **teamsTags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **updateKey** | **kotlin.String** |  |  [optional] |
| **knowledgePanels** | [**Panels**](Panels.md) |  |  [optional] |
| **attributeGroups** | [**kotlin.collections.List&lt;GetProductByBarcode200ResponseAllOfAllOfAttributeGroupsInner&gt;**](GetProductByBarcode200ResponseAllOfAllOfAttributeGroupsInner.md) | Each element is an attribute that can help compute a personal ranking for the product |  [optional] |


<a id="NutritionDataPer"></a>
## Enum: nutrition_data_per
| Name | Value |
| ---- | ----- |
| nutritionDataPer | serving, 100g |


<a id="NutritionDataPreparedPer"></a>
## Enum: nutrition_data_prepared_per
| Name | Value |
| ---- | ----- |
| nutritionDataPreparedPer | serving, 100g |


<a id="NutriscoreGrade"></a>
## Enum: nutriscore_grade
| Name | Value |
| ---- | ----- |
| nutriscoreGrade | a, b, c, d, e |



