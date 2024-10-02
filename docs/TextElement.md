
# TextElement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | the type of text, might influence the way you display it.  |  [optional] |
| **html** | **kotlin.String** | Text to display in HTML format. |  [optional] |
| **language** | **kotlin.String** | Language of the text. The name of the language is returned in the language requested when making the API call. e.g. if the text is in Polish, and the requested language is French, the language field will contain \&quot;Polonais\&quot; (French for \&quot;Polish\&quot;). Only set for specific fields such as the list of ingredients of a product. |  [optional] |
| **lc** | **kotlin.String** | 2 letter language code for the text. Only set for specific fields such as the list of ingredients of a product. |  [optional] |
| **editFieldId** | **kotlin.String** | id of the field used to edit this text in the product edit API. |  [optional] |
| **editFieldType** | **kotlin.String** | Type of the product field. |  [optional] |
| **editFieldValue** | **kotlin.String** | Current value of the product field. This may differ from the html field which can contain extra formating. |  [optional] |
| **sourceUrl** | **kotlin.String** | Link to the source |  [optional] |
| **sourceText** | **kotlin.String** | name of the source |  [optional] |
| **sourceLc** | **kotlin.String** | Source locale name |  [optional] |
| **sourceLanguage** | **kotlin.String** | Human readable source locale name |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | summary, warning, notes |



