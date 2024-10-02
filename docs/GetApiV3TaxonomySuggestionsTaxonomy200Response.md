
# GetApiV3TaxonomySuggestionsTaxonomy200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **statusId** | [**inline**](#StatusId) | Overall status of the request: whether it failed or succeeded, with or without warnings or errors. |  [optional] |
| **result** | [**ResponseStatusResult**](ResponseStatusResult.md) |  |  [optional] |
| **warnings** | [**kotlin.collections.List&lt;WarningOrErrorMessage&gt;**](WarningOrErrorMessage.md) | List of warnings. Warnings are used to alert about something that may be wrong, but is not necessarily wrong (e.g. a nutrient value that is unexpectedly high). |  [optional] |
| **errors** | [**kotlin.collections.List&lt;WarningOrErrorMessage&gt;**](WarningOrErrorMessage.md) | List of errors. Errors are used to alert about something that is definitely wrong (e.g. a nutrient value thaty is impossibly high). |  [optional] |
| **suggestions** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of sorted strings suggestions in the language requested in the \&quot;lc\&quot; field. |  [optional] |
| **matchedSynonyms** | [**kotlin.Any**](.md) | Dictionary of strings associating canonical names (as seen in suggestions field) with the synonym that best matches the query. An entry is present for all suggestions, even when the synonym is the same with the canonical name.  This value is present only if get_synonyms parameter is present.  |  [optional] |


<a id="StatusId"></a>
## Enum: status_id
| Name | Value |
| ---- | ----- |
| statusId | success, success_with_warnings, success_with_errors, failure |



