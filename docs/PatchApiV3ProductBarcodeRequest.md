
# PatchApiV3ProductBarcodeRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lc** | **kotlin.String** | 2 letter code of the language of the interface. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the language may be inferred by the country of the user (passed through the cc field or inferred by the IP address). |  [optional] |
| **cc** | **kotlin.String** | 2 letter code of the country of the user. Used for localizing some fields in returned values (e.g. knowledge panels). If not passed, the country may be inferred by the IP address of the request. |  [optional] |
| **fields** | **kotlin.String** | Comma separated list of fields requested in the response. Special values: \&quot;updated\&quot;: returns field that were updated by the query (e.g. sending \&quot;packagings\&quot; or \&quot;packagings_add\&quot; would return \&quot;packagings\&quot;), \&quot;none\&quot;: returns no fields, \&quot;all\&quot;: returns all fields except generated fields that need to be explicitly requested such as \&quot;knowledge_panels\&quot;. Defaults to \&quot;updated\&quot; for WRITE requests, and \&quot;all\&quot; for READ requests. |  [optional] |
| **tagsLc** | **kotlin.String** | 2 letter language code to request names of tags in a specific language.  For READ requets: if passed, all taxonomized tags of the response will include a lc_name property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.  For WRITE requests: if passed, taxonomized tags fields with a lc_name property will be considered to be in this language. |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **password** | **kotlin.String** |  |  [optional] |
| **product** | [**ProductUpdateAPIV3WRITE**](ProductUpdateAPIV3WRITE.md) |  |  [optional] |



