
# PackagingComponentWRITE

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numberOfUnits** | **kotlin.Int** | Number of units of this packaging component contained in the product (e.g. 6 for a pack of 6 bottles) |  [optional] |
| **shape** | [**AnyOfLessThanGreaterThan**](AnyOfLessThanGreaterThan.md) | The shape property is canonicalized using the packaging_shapes taxonomy. |  [optional] |
| **material** | [**AnyOfLessThanGreaterThan**](AnyOfLessThanGreaterThan.md) | The material property is canonicalized using the packaging_materials taxonomy. |  [optional] |
| **recycling** | [**AnyOfLessThanGreaterThan**](AnyOfLessThanGreaterThan.md) | The recycling property is canonicalized using the packaging_recycling taxonomy. |  [optional] |
| **quantityPerUnit** | **kotlin.String** | Quantity (weight or volume) of food product contained in the packaging component. (e.g. 75cl for a wine bottle) |  [optional] |
| **weightSpecified** | [**PackagingComponentWRITEWeightSpecified**](PackagingComponentWRITEWeightSpecified.md) |  |  [optional] |
| **weightMeasured** | [**PackagingComponentWRITEWeightMeasured**](PackagingComponentWRITEWeightMeasured.md) |  |  [optional] |
| **brands** | **kotlin.String** | A comma separated list of brands / product names for the packaging component (e.g. \&quot;Tetra Pak\&quot;, Tetra Brik\&quot; |  [optional] |
| **labels** | **kotlin.String** | A comma separated list of labels, canonicalized with the packaging_labels taxonomy (e.g. \&quot;en:FSC, fr:Encre végétale\&quot;) |  [optional] |



