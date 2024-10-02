
# Element

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The type of the included element object. The type also indicates which field contains the included element object. e.g. if the type is \&quot;text\&quot;, the included element object will be in the \&quot;text_element\&quot; field.  Note that in the future, new type of element may be added, so your code should ignore unrecognized types, and unknown properties.  TODO: add Map type  |  |
| **textElement** | [**TextElement**](TextElement.md) |  |  [optional] |
| **imageElement** | [**ImageElement**](ImageElement.md) |  |  [optional] |
| **actionElement** | **kotlin.String** |  |  [optional] |
| **panelElement** | [**PanelElement**](PanelElement.md) |  |  [optional] |
| **panelGroupElement** | [**PanelGroupElement**](PanelGroupElement.md) |  |  [optional] |
| **tableElement** | [**TableElement**](TableElement.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | text, image, action, panel, panel_group, table |



