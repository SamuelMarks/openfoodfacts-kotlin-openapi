
# PostApiV3ProductRevertRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fields** | **kotlin.String** | Comma separated list of fields requested in the response. Special values: \&quot;updated\&quot;: returns field that were updated by the query (e.g. sending \&quot;packagings\&quot; or \&quot;packagings_add\&quot; would return \&quot;packagings\&quot;), \&quot;none\&quot;: returns no fields, \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;. Defaults to \&quot;updated\&quot; for WRITE requests, and \&quot;all\&quot; for READ requests. |  [optional] |
| **tagsLc** | **kotlin.String** | 2 letter language code to request names of tags in a specific language.  For READ requets: if passed, all taxonomized tags of the response will include a lc_name property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.  For WRITE requests: if passed, taxonomized tags fields with a lc_name property will be considered to be in this language. |  [optional] |
| **code** | **kotlin.String** | Barcode of the product |  [optional] |
| **rev** | **kotlin.Int** | Revision number to revert to |  [optional] |



