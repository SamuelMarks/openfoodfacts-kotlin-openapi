
# PatchApiV3ProductBarcode200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **statusId** | [**inline**](#StatusId) | Overall status of the request: whether it failed or succeeded, with or without warnings or errors. |  [optional] |
| **result** | [**ResponseStatusResult**](ResponseStatusResult.md) |  |  [optional] |
| **warnings** | [**kotlin.collections.List&lt;WarningOrErrorMessage&gt;**](WarningOrErrorMessage.md) | List of warnings. Warnings are used to alert about something that may be wrong, but is not necessarily wrong (e.g. a nutrient value that is unexpectedly high). |  [optional] |
| **errors** | [**kotlin.collections.List&lt;WarningOrErrorMessage&gt;**](WarningOrErrorMessage.md) | List of errors. Errors are used to alert about something that is definitely wrong (e.g. a nutrient value thaty is impossibly high). |  [optional] |
| **product** | [**PatchApiV3ProductBarcode200ResponseAllOfProduct**](PatchApiV3ProductBarcode200ResponseAllOfProduct.md) |  |  [optional] |


<a id="StatusId"></a>
## Enum: status_id
| Name | Value |
| ---- | ----- |
| statusId | success, success_with_warnings, success_with_errors, failure |



