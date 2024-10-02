
# TitleElement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | A short name of this panel, not including any actual values |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **type** | [**inline**](#Type) | Used to indicate how the value of this item is measured, such as \&quot;grade\&quot; for Nutri-Score and Eco-Score or \&quot;percentage\&quot; for Salt |  [optional] |
| **grade** | [**inline**](#Grade) | The value for this panel where it corresponds to a A to E grade such as the Nutri-Score of the Eco-Score. |  [optional] |
| **&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The numeric value of the panel, where the type is \&quot;percentage\&quot; |  [optional] |
| **iconUrl** | **kotlin.String** |  |  [optional] |
| **iconColorFromEvaluation** | **kotlin.String** |  |  [optional] |
| **iconSize** | **kotlin.String** | If set to \&quot;small\&quot;, the icon should be displayed at a small size.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | grade, percentage |


<a id="Grade"></a>
## Enum: grade
| Name | Value |
| ---- | ----- |
| grade | a, b, c, d, e, unknown |



