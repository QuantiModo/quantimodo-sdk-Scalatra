/**
 * QuantiModo
 * Welcome to QuantiModo API! QuantiModo makes it easy to retrieve normalized user data from a wide array of devices and applications. [Learn about QuantiModo](https://quantimo.do) or contact us at <api@quantimo.do>.         Before you get started, you will need to: * Sign in/Sign up, and add some data at [https://app.quantimo.do/api/v2/account/connectors](https://app.quantimo.do/api/v2/account/connectors) to try out the API for yourself * Create an app to get your client id and secret at [https://app.quantimo.do/api/v2/apps](https://app.quantimo.do/api/v2/apps) * As long as you're signed in, it will use your browser's cookie for authentication.  However, client applications must use OAuth2 tokens to access the API.     ## Application Endpoints These endpoints give you access to all authorized users' data for that application. ### Getting Application Token Make a `POST` request to `/api/v2/oauth/access_token`         * `grant_type` Must be `client_credentials`.         * `clientId` Your application's clientId.         * `client_secret` Your application's client_secret.         * `redirect_uri` Your application's redirect url.                ## Example Queries ### Query Options The standard query options for QuantiModo API are as described in the table below. These are the available query options in QuantiModo API: <table>            <thead>                <tr>                    <th>Parameter</th>                    <th>Description</th>                </tr>            </thead>            <tbody>                <tr>                    <td>limit</td>                    <td>The LIMIT is used to limit the number of results returned.  So if you have 1000 results, but only want to the first 10, you would set this to 10 and offset to 0. The maximum limit is 200 records.</td>                </tr>                <tr>                    <td>offset</td>                    <td>Suppose you wanted to show results 11-20. You'd set the    offset to 10 and the limit to 10.</td>                </tr>                <tr>                    <td>sort</td>                    <td>Sort by given field. If the field is prefixed with '-', it    will sort in descending order.</td>                </tr>            </tbody>        </table>         ### Pagination Conventions Since the maximum limit is 200 records, to get more than that you'll have to make multiple API calls and page through the results. To retrieve all the data, you can iterate through data by using the `limit` and `offset` query parameters.For example, if you want to retrieve data from 61-80 then you can use a query with the following parameters,         `/v2/variables?limit=20&offset=60`         Generally, you'll be retrieving new or updated user data. To avoid unnecessary API calls, you'll want to store your last refresh time locally.  Initially, it should be set to 0. Then whenever you make a request to get new data, you should limit the returned results to those updated since your last refresh by appending append         `?lastUpdated=(ge)&quot2013-01-D01T01:01:01&quot`         to your request.         Also for better pagination, you can get link to the records of first, last, next and previous page from response headers: * `Total-Count` - Total number of results for given query * `Link-First` - Link to get first page records * `Link-Last` - Link to get last page records * `Link-Prev` - Link to get previous records set * `Link-Next` - Link to get next records set         Remember, response header will be only sent when the record set is available. e.g. You will not get a ```Link-Last``` & ```Link-Next``` when you query for the last page.         ### Filter operators support API supports the following operators with filter parameters: <br> **Comparison operators**         Comparison operators allow you to limit results to those greater than, less than, or equal to a specified value for a specified attribute. These operators can be used with strings, numbers, and dates. The following comparison operators are available: * `gt` for `greater than` comparison * `ge` for `greater than or equal` comparison * `lt` for `less than` comparison * `le` for `less than or equal` comparison         They are included in queries using the following format:         `(<operator>)<value>`         For example, in order to filter value which is greater than 21, the following query parameter should be used:         `?value=(gt)21` <br><br> **Equals/In Operators**         It also allows filtering by the exact value of an attribute or by a set of values, depending on the type of value passed as a query parameter. If the value contains commas, the parameter is split on commas and used as array input for `IN` filtering, otherwise the exact match is applied. In order to only show records which have the value 42, the following query should be used:         `?value=42`         In order to filter records which have value 42 or 43, the following query should be used:         `?value=42,43` <br><br> **Like operators**         Like operators allow filtering using `LIKE` query. This operator is triggered if exact match operator is used, but value contains `%` sign as the first or last character. In order to filter records which category that start with `Food`, the following query should be used:         `?category=Food%` <br><br> **Negation operator**         It is possible to get negated results of a query by prefixed the operator with `!`. Some examples:         `//filter records except those with value are not 42 or 43`<br> `?value=!42,43`         `//filter records with value not greater than 21`<br> `?value=!(ge)21` <br><br> **Multiple constraints for single attribute**         It is possible to apply multiple constraints by providing an array of query filters:         Filter all records which value is greater than 20.2 and less than 20.3<br> `?value[]=(gt)20.2&value[]=(lt)20.3`         Filter all records which value is greater than 20.2 and less than 20.3 but not 20.2778<br> `?value[]=(gt)20.2&value[]=(lt)20.3&value[]=!20.2778`<br><br> 
 *
 * OpenAPI spec version: 2.0.6
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_3
import com.wordnik.client.model.Inline_response_200_4
import com.wordnik.client.model.Inline_response_200_5
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_1
import com.wordnik.client.model.Inline_response_200_6
import com.wordnik.client.model.Inline_response_200_7
import com.wordnik.client.model.Inline_response_200_8
import com.wordnik.client.model.Inline_response_200_9
import com.wordnik.client.model.Inline_response_200_10

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ApplicationEndpointsApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ApplicationEndpointsApi"
  override protected val applicationName: Option[String] = Some("ApplicationEndpoints")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val v2ApplicationConnectionsGetOperation = (apiOperation[Inline_response_200_3]("v2ApplicationConnectionsGet")
      summary "Get all Connections"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("connectorId").description("").optional,
        queryParam[String]("connectStatus").description("").optional,
        queryParam[String]("connectError").description("").optional,
        queryParam[String]("updateRequestedAt").description("").optional,
        queryParam[String]("updateStatus").description("").optional,
        queryParam[String]("updateError").description("").optional,
        queryParam[String]("lastSuccessfulUpdatedAt").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/connections",operation(v2ApplicationConnectionsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val connectorId = params.getAs[Int]("connectorId")

    println("connectorId: " + connectorId)
    
    
                val connectStatus = params.getAs[String]("connectStatus")

    println("connectStatus: " + connectStatus)
    
    
                val connectError = params.getAs[String]("connectError")

    println("connectError: " + connectError)
    
    
                val updateRequestedAt = params.getAs[String]("updateRequestedAt")

    println("updateRequestedAt: " + updateRequestedAt)
    
    
                val updateStatus = params.getAs[String]("updateStatus")

    println("updateStatus: " + updateStatus)
    
    
                val updateError = params.getAs[String]("updateError")

    println("updateError: " + updateError)
    
    
                val lastSuccessfulUpdatedAt = params.getAs[String]("lastSuccessfulUpdatedAt")

    println("lastSuccessfulUpdatedAt: " + lastSuccessfulUpdatedAt)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationCredentialsGetOperation = (apiOperation[Inline_response_200_4]("v2ApplicationCredentialsGet")
      summary "Get all Credentials"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("connectorId").description("").optional,
        queryParam[String]("attrKey").description("").optional,
        queryParam[String]("attrValue").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/credentials",operation(v2ApplicationCredentialsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val connectorId = params.getAs[Int]("connectorId")

    println("connectorId: " + connectorId)
    
    
                val attrKey = params.getAs[String]("attrKey")

    println("attrKey: " + attrKey)
    
    
                val attrValue = params.getAs[String]("attrValue")

    println("attrValue: " + attrValue)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationMeasurementsGetOperation = (apiOperation[Inline_response_200_5]("v2ApplicationMeasurementsGet")
      summary "Get measurements for all users using your application"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("connectorId").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("sourceId").description("").optional,
        queryParam[String]("startTime").description("").optional,
        queryParam[BigDecimal]("value").description("").optional,
        queryParam[Int]("unitId").description("").optional,
        queryParam[BigDecimal]("originalValue").description("").optional,
        queryParam[Int]("originalUnitId").description("").optional,
        queryParam[Int]("duration").description("").optional,
        queryParam[String]("note").description("").optional,
        queryParam[BigDecimal]("latitude").description("").optional,
        queryParam[BigDecimal]("longitude").description("").optional,
        queryParam[String]("location").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[String]("error").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/measurements",operation(v2ApplicationMeasurementsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val connectorId = params.getAs[Int]("connectorId")

    println("connectorId: " + connectorId)
    
    
                val variableId = params.getAs[Int]("variableId")

    println("variableId: " + variableId)
    
    
                val sourceId = params.getAs[Int]("sourceId")

    println("sourceId: " + sourceId)
    
    
                val startTime = params.getAs[String]("startTime")

    println("startTime: " + startTime)
    
    
                val value = params.getAs[BigDecimal]("value")

    println("value: " + value)
    
    
                val unitId = params.getAs[Int]("unitId")

    println("unitId: " + unitId)
    
    
                val originalValue = params.getAs[BigDecimal]("originalValue")

    println("originalValue: " + originalValue)
    
    
                val originalUnitId = params.getAs[Int]("originalUnitId")

    println("originalUnitId: " + originalUnitId)
    
    
                val duration = params.getAs[Int]("duration")

    println("duration: " + duration)
    
    
                val note = params.getAs[String]("note")

    println("note: " + note)
    
    
                val latitude = params.getAs[BigDecimal]("latitude")

    println("latitude: " + latitude)
    
    
                val longitude = params.getAs[BigDecimal]("longitude")

    println("longitude: " + longitude)
    
    
                val location = params.getAs[String]("location")

    println("location: " + location)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val error = params.getAs[String]("error")

    println("error: " + error)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationTrackingRemindersGetOperation = (apiOperation[Inline_response_200_1]("v2ApplicationTrackingRemindersGet")
      summary "Get tracking reminders"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/trackingReminders",operation(v2ApplicationTrackingRemindersGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationUpdatesGetOperation = (apiOperation[Inline_response_200_6]("v2ApplicationUpdatesGet")
      summary "Get all Updates"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("connectorId").description("").optional,
        queryParam[Int]("numberOfMeasurements").description("").optional,
        queryParam[Boolean]("success").description("").optional,
        queryParam[String]("message").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/updates",operation(v2ApplicationUpdatesGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val connectorId = params.getAs[Int]("connectorId")

    println("connectorId: " + connectorId)
    
    
                val numberOfMeasurements = params.getAs[Int]("numberOfMeasurements")

    println("numberOfMeasurements: " + numberOfMeasurements)
    
    
                val success = params.getAs[Boolean]("success")

    println("success: " + success)
    
    
                val message = params.getAs[String]("message")

    println("message: " + message)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationUserVariableRelationshipsGetOperation = (apiOperation[Inline_response_200_7]("v2ApplicationUserVariableRelationshipsGet")
      summary "Get all UserVariableRelationships"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("id").description("").optional,
        queryParam[String]("confidenceLevel").description("").optional,
        queryParam[BigDecimal]("confidenceScore").description("").optional,
        queryParam[String]("direction").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[String]("errorMessage").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[Int]("outcomeVariableId").description("").optional,
        queryParam[Int]("predictorVariableId").description("").optional,
        queryParam[Int]("predictorUnitId").description("").optional,
        queryParam[BigDecimal]("sinnRank").description("").optional,
        queryParam[String]("strengthLevel").description("").optional,
        queryParam[BigDecimal]("strengthScore").description("").optional,
        queryParam[String]("vote").description("").optional,
        queryParam[BigDecimal]("valuePredictingHighOutcome").description("").optional,
        queryParam[BigDecimal]("valuePredictingLowOutcome").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/userVariableRelationships",operation(v2ApplicationUserVariableRelationshipsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val id = params.getAs[Int]("id")

    println("id: " + id)
    
    
                val confidenceLevel = params.getAs[String]("confidenceLevel")

    println("confidenceLevel: " + confidenceLevel)
    
    
                val confidenceScore = params.getAs[BigDecimal]("confidenceScore")

    println("confidenceScore: " + confidenceScore)
    
    
                val direction = params.getAs[String]("direction")

    println("direction: " + direction)
    
    
                val durationOfAction = params.getAs[Int]("durationOfAction")

    println("durationOfAction: " + durationOfAction)
    
    
                val errorMessage = params.getAs[String]("errorMessage")

    println("errorMessage: " + errorMessage)
    
    
                val onsetDelay = params.getAs[Int]("onsetDelay")

    println("onsetDelay: " + onsetDelay)
    
    
                val outcomeVariableId = params.getAs[Int]("outcomeVariableId")

    println("outcomeVariableId: " + outcomeVariableId)
    
    
                val predictorVariableId = params.getAs[Int]("predictorVariableId")

    println("predictorVariableId: " + predictorVariableId)
    
    
                val predictorUnitId = params.getAs[Int]("predictorUnitId")

    println("predictorUnitId: " + predictorUnitId)
    
    
                val sinnRank = params.getAs[BigDecimal]("sinnRank")

    println("sinnRank: " + sinnRank)
    
    
                val strengthLevel = params.getAs[String]("strengthLevel")

    println("strengthLevel: " + strengthLevel)
    
    
                val strengthScore = params.getAs[BigDecimal]("strengthScore")

    println("strengthScore: " + strengthScore)
    
    
                val vote = params.getAs[String]("vote")

    println("vote: " + vote)
    
    
                val valuePredictingHighOutcome = params.getAs[BigDecimal]("valuePredictingHighOutcome")

    println("valuePredictingHighOutcome: " + valuePredictingHighOutcome)
    
    
                val valuePredictingLowOutcome = params.getAs[BigDecimal]("valuePredictingLowOutcome")

    println("valuePredictingLowOutcome: " + valuePredictingLowOutcome)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationUserVariablesGetOperation = (apiOperation[Inline_response_200_8]("v2ApplicationUserVariablesGet")
      summary "Get all UserVariables"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("parentId").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("defaultUnitId").description("").optional,
        queryParam[BigDecimal]("minimumAllowedValue").description("").optional,
        queryParam[BigDecimal]("maximumAllowedValue").description("").optional,
        queryParam[BigDecimal]("fillingValue").description("").optional,
        queryParam[Int]("joinWith").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[Int]("variableCategoryId").description("").optional,
        queryParam[Int]("updated").description("").optional,
        queryParam[Int]("_public").description("").optional,
        queryParam[Boolean]("causeOnly").description("").optional,
        queryParam[String]("fillingType").description("").optional,
        queryParam[Int]("numberOfMeasurements").description("").optional,
        queryParam[Int]("numberOfProcessedMeasurements").description("").optional,
        queryParam[Int]("measurementsAtLastAnalysis").description("").optional,
        queryParam[Int]("lastUnitId").description("").optional,
        queryParam[Int]("lastOriginalUnitId").description("").optional,
        queryParam[Int]("lastOriginalValue").description("").optional,
        queryParam[BigDecimal]("lastValue").description("").optional,
        queryParam[Int]("lastSourceId").description("").optional,
        queryParam[Int]("numberOfCorrelations").description("").optional,
        queryParam[String]("status").description("").optional,
        queryParam[String]("errorMessage").description("").optional,
        queryParam[String]("lastSuccessfulUpdateTime").description("").optional,
        queryParam[BigDecimal]("standardDeviation").description("").optional,
        queryParam[BigDecimal]("variance").description("").optional,
        queryParam[BigDecimal]("minimumRecordedValue").description("").optional,
        queryParam[BigDecimal]("maximumRecordedValue").description("").optional,
        queryParam[BigDecimal]("mean").description("").optional,
        queryParam[BigDecimal]("median").description("").optional,
        queryParam[Int]("mostCommonUnitId").description("").optional,
        queryParam[BigDecimal]("mostCommonValue").description("").optional,
        queryParam[BigDecimal]("numberOfUniqueDailyValues").description("").optional,
        queryParam[Int]("numberOfChanges").description("").optional,
        queryParam[BigDecimal]("skewness").description("").optional,
        queryParam[BigDecimal]("kurtosis").description("").optional,
        queryParam[BigDecimal]("latitude").description("").optional,
        queryParam[BigDecimal]("longitude").description("").optional,
        queryParam[String]("location").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Boolean]("outcome").description("").optional,
        queryParam[String]("sources").description("").optional,
        queryParam[Int]("earliestSourceTime").description("").optional,
        queryParam[Int]("latestSourceTime").description("").optional,
        queryParam[Int]("earliestMeasurementTime").description("").optional,
        queryParam[Int]("latestMeasurementTime").description("").optional,
        queryParam[Int]("earliestFillingTime").description("").optional,
        queryParam[Int]("latestFillingTime").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/userVariables",operation(v2ApplicationUserVariablesGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val parentId = params.getAs[Int]("parentId")

    println("parentId: " + parentId)
    
    
                val variableId = params.getAs[Int]("variableId")

    println("variableId: " + variableId)
    
    
                val defaultUnitId = params.getAs[Int]("defaultUnitId")

    println("defaultUnitId: " + defaultUnitId)
    
    
                val minimumAllowedValue = params.getAs[BigDecimal]("minimumAllowedValue")

    println("minimumAllowedValue: " + minimumAllowedValue)
    
    
                val maximumAllowedValue = params.getAs[BigDecimal]("maximumAllowedValue")

    println("maximumAllowedValue: " + maximumAllowedValue)
    
    
                val fillingValue = params.getAs[BigDecimal]("fillingValue")

    println("fillingValue: " + fillingValue)
    
    
                val joinWith = params.getAs[Int]("joinWith")

    println("joinWith: " + joinWith)
    
    
                val onsetDelay = params.getAs[Int]("onsetDelay")

    println("onsetDelay: " + onsetDelay)
    
    
                val durationOfAction = params.getAs[Int]("durationOfAction")

    println("durationOfAction: " + durationOfAction)
    
    
                val variableCategoryId = params.getAs[Int]("variableCategoryId")

    println("variableCategoryId: " + variableCategoryId)
    
    
                val updated = params.getAs[Int]("updated")

    println("updated: " + updated)
    
    
                val _public = params.getAs[Int]("_public")

    println("_public: " + _public)
    
    
                val causeOnly = params.getAs[Boolean]("causeOnly")

    println("causeOnly: " + causeOnly)
    
    
                val fillingType = params.getAs[String]("fillingType")

    println("fillingType: " + fillingType)
    
    
                val numberOfMeasurements = params.getAs[Int]("numberOfMeasurements")

    println("numberOfMeasurements: " + numberOfMeasurements)
    
    
                val numberOfProcessedMeasurements = params.getAs[Int]("numberOfProcessedMeasurements")

    println("numberOfProcessedMeasurements: " + numberOfProcessedMeasurements)
    
    
                val measurementsAtLastAnalysis = params.getAs[Int]("measurementsAtLastAnalysis")

    println("measurementsAtLastAnalysis: " + measurementsAtLastAnalysis)
    
    
                val lastUnitId = params.getAs[Int]("lastUnitId")

    println("lastUnitId: " + lastUnitId)
    
    
                val lastOriginalUnitId = params.getAs[Int]("lastOriginalUnitId")

    println("lastOriginalUnitId: " + lastOriginalUnitId)
    
    
                val lastOriginalValue = params.getAs[Int]("lastOriginalValue")

    println("lastOriginalValue: " + lastOriginalValue)
    
    
                val lastValue = params.getAs[BigDecimal]("lastValue")

    println("lastValue: " + lastValue)
    
    
                val lastSourceId = params.getAs[Int]("lastSourceId")

    println("lastSourceId: " + lastSourceId)
    
    
                val numberOfCorrelations = params.getAs[Int]("numberOfCorrelations")

    println("numberOfCorrelations: " + numberOfCorrelations)
    
    
                val status = params.getAs[String]("status")

    println("status: " + status)
    
    
                val errorMessage = params.getAs[String]("errorMessage")

    println("errorMessage: " + errorMessage)
    
    
                val lastSuccessfulUpdateTime = params.getAs[String]("lastSuccessfulUpdateTime")

    println("lastSuccessfulUpdateTime: " + lastSuccessfulUpdateTime)
    
    
                val standardDeviation = params.getAs[BigDecimal]("standardDeviation")

    println("standardDeviation: " + standardDeviation)
    
    
                val variance = params.getAs[BigDecimal]("variance")

    println("variance: " + variance)
    
    
                val minimumRecordedValue = params.getAs[BigDecimal]("minimumRecordedValue")

    println("minimumRecordedValue: " + minimumRecordedValue)
    
    
                val maximumRecordedValue = params.getAs[BigDecimal]("maximumRecordedValue")

    println("maximumRecordedValue: " + maximumRecordedValue)
    
    
                val mean = params.getAs[BigDecimal]("mean")

    println("mean: " + mean)
    
    
                val median = params.getAs[BigDecimal]("median")

    println("median: " + median)
    
    
                val mostCommonUnitId = params.getAs[Int]("mostCommonUnitId")

    println("mostCommonUnitId: " + mostCommonUnitId)
    
    
                val mostCommonValue = params.getAs[BigDecimal]("mostCommonValue")

    println("mostCommonValue: " + mostCommonValue)
    
    
                val numberOfUniqueDailyValues = params.getAs[BigDecimal]("numberOfUniqueDailyValues")

    println("numberOfUniqueDailyValues: " + numberOfUniqueDailyValues)
    
    
                val numberOfChanges = params.getAs[Int]("numberOfChanges")

    println("numberOfChanges: " + numberOfChanges)
    
    
                val skewness = params.getAs[BigDecimal]("skewness")

    println("skewness: " + skewness)
    
    
                val kurtosis = params.getAs[BigDecimal]("kurtosis")

    println("kurtosis: " + kurtosis)
    
    
                val latitude = params.getAs[BigDecimal]("latitude")

    println("latitude: " + latitude)
    
    
                val longitude = params.getAs[BigDecimal]("longitude")

    println("longitude: " + longitude)
    
    
                val location = params.getAs[String]("location")

    println("location: " + location)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val outcome = params.getAs[Boolean]("outcome")

    println("outcome: " + outcome)
    
    
                val sources = params.getAs[String]("sources")

    println("sources: " + sources)
    
    
                val earliestSourceTime = params.getAs[Int]("earliestSourceTime")

    println("earliestSourceTime: " + earliestSourceTime)
    
    
                val latestSourceTime = params.getAs[Int]("latestSourceTime")

    println("latestSourceTime: " + latestSourceTime)
    
    
                val earliestMeasurementTime = params.getAs[Int]("earliestMeasurementTime")

    println("earliestMeasurementTime: " + earliestMeasurementTime)
    
    
                val latestMeasurementTime = params.getAs[Int]("latestMeasurementTime")

    println("latestMeasurementTime: " + latestMeasurementTime)
    
    
                val earliestFillingTime = params.getAs[Int]("earliestFillingTime")

    println("earliestFillingTime: " + earliestFillingTime)
    
    
                val latestFillingTime = params.getAs[Int]("latestFillingTime")

    println("latestFillingTime: " + latestFillingTime)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationVariableUserSourcesGetOperation = (apiOperation[Inline_response_200_9]("v2ApplicationVariableUserSourcesGet")
      summary "Get all VariableUserSources"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("timestamp").description("").optional,
        queryParam[Int]("earliestMeasurementTime").description("").optional,
        queryParam[Int]("latestMeasurementTime").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/variableUserSources",operation(v2ApplicationVariableUserSourcesGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val variableId = params.getAs[Int]("variableId")

    println("variableId: " + variableId)
    
    
                val timestamp = params.getAs[Int]("timestamp")

    println("timestamp: " + timestamp)
    
    
                val earliestMeasurementTime = params.getAs[Int]("earliestMeasurementTime")

    println("earliestMeasurementTime: " + earliestMeasurementTime)
    
    
                val latestMeasurementTime = params.getAs[Int]("latestMeasurementTime")

    println("latestMeasurementTime: " + latestMeasurementTime)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

  

  val v2ApplicationVotesGetOperation = (apiOperation[Inline_response_200_10]("v2ApplicationVotesGet")
      summary "Get all Votes"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("causeId").description("").optional,
        queryParam[Int]("effectId").description("").optional,
        queryParam[Int]("value").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/v2/application/votes",operation(v2ApplicationVotesGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val causeId = params.getAs[Int]("causeId")

    println("causeId: " + causeId)
    
    
                val effectId = params.getAs[Int]("effectId")

    println("effectId: " + effectId)
    
    
                val value = params.getAs[Int]("value")

    println("value: " + value)
    
    
                val createdAt = params.getAs[String]("createdAt")

    println("createdAt: " + createdAt)
    
    
                val updatedAt = params.getAs[String]("updatedAt")

    println("updatedAt: " + updatedAt)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[String]("sort")

    println("sort: " + sort)
  }

}