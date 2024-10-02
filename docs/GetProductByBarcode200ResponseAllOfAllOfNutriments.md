
# GetProductByBarcode200ResponseAllOfAllOfNutriments

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **alcohol** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Quantity of alcohol  (per 100g or per serving) in a standard unit (g or ml)  |  [optional] |
| **carbohydrates** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **energy** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | It is the same as &#x60;energy-kj&#x60; if we have it, or computed from &#x60;energy-kcal&#x60; otherwise  (per 100g or per serving) in kj  |  [optional] |
| **energyValue** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | energy_value will be equal to energy-kj_value if we have it or to energy-kcal_value otherwise  |  [optional] |
| **energyUnit** | [**inline**](#EnergyUnit) | Equal to energy-kj_unit if we have it or to energy-kcal_unit otherwise  |  [optional] |
| **energyKcal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | energy in kcal, if it is specified  (per 100g or per serving) in a standard unit (g or ml)  |  [optional] |
| **energyKj** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | energy in kj, if it is specified  (per 100g or per serving) in a standard unit (g or ml)  |  [optional] |
| **fat** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **fruitsVegetablesLegumesEstimateFromIngredients** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An estimate, from the ingredients list of the percentage of fruits, vegetable and legumes. This is an important information for Nutri-Score (2023 version) computation.  |  [optional] |
| **fruitsVegetablesNutsEstimateFromIngredients** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An estimate, from the ingredients list of the percentage of fruits, vegetable and nuts. This is an important information for Nutri-Score (2021 version) computation.  |  [optional] |
| **novaGroup** | **kotlin.Int** |  |  [optional] |
| **nutritionScoreFr** | [**kotlin.Any**](.md) |  |  [optional] |
| **proteins** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **salt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **saturatedFat** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **sodium** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **sugars** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **carbonFootprintFromKnownIngredientsProduct** | **kotlin.Int** |  |  [optional] |
| **carbonFootprintFromKnownIngredientsServing** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **erythritol** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | erythritol is a polyol which is not providing any energy. As such, it needs not be taken into account when computing the energy of a product. Eryhtritol is now displayed on nutrition facts sheet of some products, mainly in the USA. This value is entered either by contributors, either by imports.  |  [optional] |


<a id="EnergyUnit"></a>
## Enum: energy_unit
| Name | Value |
| ---- | ----- |
| energyUnit | kcal, kj |



