
# Panel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | **kotlin.String** | Type of the panel. If set to \&quot;card\&quot;, the panel and its sub-panels should be displayed in a card. If set to \&quot;inline\&quot;, the panel should have its content always displayed. |  [optional] |
| **expanded** | **kotlin.Boolean** | If true, the panel is to be displayed already expanded. If false, only the title should be displayed, and the user should be able to click or tap it to open the panel and display the elements. |  [optional] |
| **expandFor** | **kotlin.String** | If set to \&quot;large\&quot;, the content of the panel should be expanded on large screens, but it should still be possible to unexpand it. |  [optional] |
| **evaluation** | [**inline**](#Evaluation) | A simple assessment of the panel value, typically used to format fonts, et.c e.g. bad &#x3D; red |  [optional] |
| **titleElement** | [**TitleElement**](TitleElement.md) |  |  [optional] |
| **elements** | [**kotlin.collections.List&lt;Element&gt;**](Element.md) | An ordered list of elements to display in the content of the panel. |  [optional] |
| **level** | **kotlin.String** | a message level, as levels we use in log. It might help theming the panel visualy  |  [optional] |
| **propertySize** | [**inline**](#PropertySize) | size is either empty (normal display)  or small to indicate a panel that should have a smaller font size  |  [optional] |
| **topics** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |


<a id="Evaluation"></a>
## Enum: evaluation
| Name | Value |
| ---- | ----- |
| evaluation | good, average, neutral, bad, unknown |


<a id="PropertySize"></a>
## Enum: size
| Name | Value |
| ---- | ----- |
| propertySize | small |



