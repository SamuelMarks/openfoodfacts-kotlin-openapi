
# PackagingComponentREAD

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numberOfUnits** | **kotlin.Int** | umber of units of this packaging component contained in the product (e.g. 6 for a pack of 6 bottles) |  [optional] |
| **shape** | [**PackagingComponentShape**](PackagingComponentShape.md) |  |  [optional] |
| **material** | [**PackagingComponentMaterial**](PackagingComponentMaterial.md) |  |  [optional] |
| **recycling** | [**PackagingComponentRecyclingInstruction**](PackagingComponentRecyclingInstruction.md) |  |  [optional] |
| **quantityPerUnit** | **kotlin.String** | Quantity (weight or volume) of food product contained in the packaging component. (e.g. 75cl for a wine bottle) |  [optional] |
| **quantityPerUnitValue** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Value parsed from the quantity field. |  [optional] |
| **quantityPerUnitUnit** | **kotlin.String** | Unit parsed and normalized from the quantity field. |  [optional] |
| **weightSpecified** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight (as specified by the manufacturer) of one unit of the empty packaging component (in grams). (e.g. for a 6 pack of 1.5l water bottles, it might be 30, the weight in grams of 1 empty water bottle without its cap which is a different packaging component). |  [optional] |
| **weightMeasured** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight (as measured by one or more users) of one unit of the empty packaging component (in grams). (e.g. for a 6 pack of 1.5l water bottles, it might be 30, the weight in grams of 1 empty water bottle without its cap which is a different packaging component). |  [optional] |
| **weightEstimated** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight (as estimated from similar products) of one unit of the empty packaging component (in grams). (e.g. for a 6 pack of 1.5l water bottles, it might be 30, the weight in grams of 1 empty water bottle without its cap which is a different packaging component). |  [optional] |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Weight of one unit of the empty packaging component. |  [optional] |
| **weightSourceId** | **kotlin.String** | Indicates which field was used to populate the \&quot;weight\&quot; field. Either \&quot;specified\&quot;, \&quot;measured\&quot;, or \&quot;estimated\&quot; |  [optional] |



