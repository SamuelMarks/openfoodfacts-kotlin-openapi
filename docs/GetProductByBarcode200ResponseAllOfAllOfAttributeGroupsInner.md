
# GetProductByBarcode200ResponseAllOfAllOfAttributeGroupsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Unique id of the attribute.  It will be use to match against preferences parameters.  |  [optional] |
| **status** | [**inline**](#Status) | wether we have the information to really compute this criteria or not. |  [optional] |
| **title** | **kotlin.String** | A descriptive sentence about the situation of the product concerning attribute  |  [optional] |
| **match** | **kotlin.Float** | a numeric value for the match, telling how much the products ranks well for this particular attribute. The higher the value, the better the match.  |  [optional] |
| **grade** | [**inline**](#Grade) | every attribute as a grade for a to e |  [optional] |
| **name** | **kotlin.String** | The name of attribute, for eventual display |  [optional] |
| **iconUrl** | **kotlin.String** | an icon representing the attribute match (often using a color) |  [optional] |
| **description** | **kotlin.String** | An eventual description of the value of the property upon which this attribute is based |  [optional] |
| **descriptionShort** | **kotlin.String** | An eventual short description of the value of the property upon which this attribute is based |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | known, unknown |


<a id="Grade"></a>
## Enum: grade
| Name | Value |
| ---- | ----- |
| grade | unknown, a, b, c, d, e |



