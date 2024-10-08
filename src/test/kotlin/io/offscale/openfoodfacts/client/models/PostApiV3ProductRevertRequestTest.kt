/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.offscale.openfoodfacts.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import io.offscale.openfoodfacts.client.models.PostApiV3ProductRevertRequest

class PostApiV3ProductRevertRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of PostApiV3ProductRevertRequest
        //val modelInstance = PostApiV3ProductRevertRequest()

        // to test the property `fields` - Comma separated list of fields requested in the response. Special values: \"updated\": returns field that were updated by the query (e.g. sending \"packagings\" or \"packagings_add\" would return \"packagings\"), \"none\": returns no fields, \"all\": returns all fields except generated fields that need to be explicitly requested such as \"knowledge_panels\". Defaults to \"updated\" for WRITE requests, and \"all\" for READ requests.
        should("test fields") {
            // uncomment below to test the property
            //modelInstance.fields shouldBe ("TODO")
        }

        // to test the property `tagsLc` - 2 letter language code to request names of tags in a specific language.  For READ requets: if passed, all taxonomized tags of the response will include a lc_name property with the translation in the requested language, if available. Otherwise, the property value will contain the name in the original language, prefixed by the 2 language code and a colon.  For WRITE requests: if passed, taxonomized tags fields with a lc_name property will be considered to be in this language.
        should("test tagsLc") {
            // uncomment below to test the property
            //modelInstance.tagsLc shouldBe ("TODO")
        }

        // to test the property `code` - Barcode of the product
        should("test code") {
            // uncomment below to test the property
            //modelInstance.code shouldBe ("TODO")
        }

        // to test the property `rev` - Revision number to revert to
        should("test rev") {
            // uncomment below to test the property
            //modelInstance.rev shouldBe ("TODO")
        }

    }
}
