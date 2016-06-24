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

import com.wordnik.client.model.Correlation
import com.wordnik.client.model.JsonErrorResponse
import com.wordnik.client.model.PostCorrelation
import com.wordnik.client.model.CommonResponse
import com.wordnik.client.model.VoteDelete
import com.wordnik.client.model.PostVote

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class CorrelationsApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CorrelationsApi"
  override protected val applicationName: Option[String] = Some("Correlations")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val v1AggregatedCorrelationsGetOperation = (apiOperation[List[Correlation]]("v1AggregatedCorrelationsGet")
      summary "Get aggregated correlations"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("effect").description("").optional,
        queryParam[String]("cause").description("").optional,
        queryParam[String]("correlationCoefficient").description("").optional,
        queryParam[String]("onsetDelay").description("").optional,
        queryParam[String]("durationOfAction").description("").optional,
        queryParam[String]("lastUpdated").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[Int]("sort").description("").optional)
  )

  get("/v1/aggregatedCorrelations",operation(v1AggregatedCorrelationsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val effect = params.getAs[String]("effect")

    println("effect: " + effect)
    
    
                val cause = params.getAs[String]("cause")

    println("cause: " + cause)
    
    
                val correlationCoefficient = params.getAs[String]("correlationCoefficient")

    println("correlationCoefficient: " + correlationCoefficient)
    
    
                val onsetDelay = params.getAs[String]("onsetDelay")

    println("onsetDelay: " + onsetDelay)
    
    
                val durationOfAction = params.getAs[String]("durationOfAction")

    println("durationOfAction: " + durationOfAction)
    
    
                val lastUpdated = params.getAs[String]("lastUpdated")

    println("lastUpdated: " + lastUpdated)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[Int]("sort")

    println("sort: " + sort)
  }

  

  val v1AggregatedCorrelationsPostOperation = (apiOperation[Unit]("v1AggregatedCorrelationsPost")
      summary "Store or Update a Correlation"
      parameters(bodyParam[PostCorrelation]("body").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  post("/v1/aggregatedCorrelations",operation(v1AggregatedCorrelationsPostOperation)) {
    
    
    bodyParam[PostCorrelation]("body").description("")
    println("body: " + body)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1CorrelationsGetOperation = (apiOperation[List[Correlation]]("v1CorrelationsGet")
      summary "Get correlations"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("effect").description("").optional,
        queryParam[String]("cause").description("").optional,
        queryParam[String]("correlationCoefficient").description("").optional,
        queryParam[String]("onsetDelay").description("").optional,
        queryParam[String]("durationOfAction").description("").optional,
        queryParam[String]("lastUpdated").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[Int]("sort").description("").optional)
  )

  get("/v1/correlations",operation(v1CorrelationsGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val effect = params.getAs[String]("effect")

    println("effect: " + effect)
    
    
                val cause = params.getAs[String]("cause")

    println("cause: " + cause)
    
    
                val correlationCoefficient = params.getAs[String]("correlationCoefficient")

    println("correlationCoefficient: " + correlationCoefficient)
    
    
                val onsetDelay = params.getAs[String]("onsetDelay")

    println("onsetDelay: " + onsetDelay)
    
    
                val durationOfAction = params.getAs[String]("durationOfAction")

    println("durationOfAction: " + durationOfAction)
    
    
                val lastUpdated = params.getAs[String]("lastUpdated")

    println("lastUpdated: " + lastUpdated)
    
    
                val limit = params.getAs[Int]("limit")

    println("limit: " + limit)
    
    
                val offset = params.getAs[Int]("offset")

    println("offset: " + offset)
    
    
                val sort = params.getAs[Int]("sort")

    println("sort: " + sort)
  }

  

  val v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGetOperation = (apiOperation[List[Correlation]]("v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet")
      summary "Search user correlations for a given cause"
      parameters(pathParam[Int]("organizationId").description(""),
        pathParam[Int]("userId").description(""),
        pathParam[String]("variableName").description(""),
        queryParam[String]("organizationToken").description(""),
        queryParam[String]("accessToken").description("").optional,
        queryParam[String]("includePublic").description("").optional)
  )

  get("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes",operation(v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGetOperation)) {
    
    
      val organizationId = params.getOrElse("organizationId", halt(400))
    
    println("organizationId: " + organizationId)
    
    
      val userId = params.getOrElse("userId", halt(400))
    
    println("userId: " + userId)
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
    
    
                val organizationToken = params.getAs[String]("organizationToken")

    println("organizationToken: " + organizationToken)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val includePublic = params.getAs[String]("includePublic")

    println("includePublic: " + includePublic)
  }

  

  val v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGetOperation = (apiOperation[List[CommonResponse]]("v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet")
      summary "Search user correlations for a given cause"
      parameters(pathParam[Int]("organizationId").description(""),
        pathParam[Int]("userId").description(""),
        pathParam[String]("variableName").description(""),
        queryParam[String]("organizationToken").description(""),
        queryParam[String]("accessToken").description("").optional,
        queryParam[String]("includePublic").description("").optional)
  )

  get("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects",operation(v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGetOperation)) {
    
    
      val organizationId = params.getOrElse("organizationId", halt(400))
    
    println("organizationId: " + organizationId)
    
    
      val userId = params.getOrElse("userId", halt(400))
    
    println("userId: " + userId)
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
    
    
                val organizationToken = params.getAs[String]("organizationToken")

    println("organizationToken: " + organizationToken)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val includePublic = params.getAs[String]("includePublic")

    println("includePublic: " + includePublic)
  }

  

  val v1PublicCorrelationsSearchSearchGetOperation = (apiOperation[List[Correlation]]("v1PublicCorrelationsSearchSearchGet")
      summary "Get average correlations for variables containing search term"
      parameters(pathParam[String]("search").description(""),
        queryParam[String]("effectOrCause").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/v1/public/correlations/search/{search}",operation(v1PublicCorrelationsSearchSearchGetOperation)) {
    
    
      val search = params.getOrElse("search", halt(400))
    
    println("search: " + search)
    
    
                val effectOrCause = params.getAs[String]("effectOrCause")

    println("effectOrCause: " + effectOrCause)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1VariablesVariableNameCausesGetOperation = (apiOperation[List[Correlation]]("v1VariablesVariableNameCausesGet")
      summary "Search user correlations for a given effect"
      parameters(pathParam[String]("variableName").description(""))
  )

  get("/v1/variables/{variableName}/causes",operation(v1VariablesVariableNameCausesGetOperation)) {
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
  }

  

  val v1VariablesVariableNameEffectsGetOperation = (apiOperation[List[Correlation]]("v1VariablesVariableNameEffectsGet")
      summary "Search user correlations for a given cause"
      parameters(pathParam[String]("variableName").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/v1/variables/{variableName}/effects",operation(v1VariablesVariableNameEffectsGetOperation)) {
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1VariablesVariableNamePublicCausesGetOperation = (apiOperation[List[Correlation]]("v1VariablesVariableNamePublicCausesGet")
      summary "Search public correlations for a given effect"
      parameters(pathParam[String]("variableName").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/v1/variables/{variableName}/public/causes",operation(v1VariablesVariableNamePublicCausesGetOperation)) {
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1VariablesVariableNamePublicEffectsGetOperation = (apiOperation[List[Correlation]]("v1VariablesVariableNamePublicEffectsGet")
      summary "Search public correlations for a given cause"
      parameters(pathParam[String]("variableName").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/v1/variables/{variableName}/public/effects",operation(v1VariablesVariableNamePublicEffectsGetOperation)) {
    
    
      val variableName = params.getOrElse("variableName", halt(400))
    
    println("variableName: " + variableName)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1VotesDeletePostOperation = (apiOperation[CommonResponse]("v1VotesDeletePost")
      summary "Delete vote"
      parameters(bodyParam[VoteDelete]("body").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  post("/v1/votes/delete",operation(v1VotesDeletePostOperation)) {
    
    
    bodyParam[VoteDelete]("body").description("")
    println("body: " + body)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

  

  val v1VotesPostOperation = (apiOperation[CommonResponse]("v1VotesPost")
      summary "Post or update vote"
      parameters(bodyParam[PostVote]("body").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  post("/v1/votes",operation(v1VotesPostOperation)) {
    
    
    bodyParam[PostVote]("body").description("")
    println("body: " + body)
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
  }

}