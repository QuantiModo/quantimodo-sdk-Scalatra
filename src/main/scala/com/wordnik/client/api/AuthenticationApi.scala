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


import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class AuthenticationApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "AuthenticationApi"
  override protected val applicationName: Option[String] = Some("Authentication")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val v2AuthSocialAuthorizeCodeGetOperation = (apiOperation[Unit]("v2AuthSocialAuthorizeCodeGet")
      summary "Second Step in Social Authentication flow with JWT Token"
      parameters(queryParam[String]("code").description(""),
        queryParam[String]("provider").description(""))
  )

  get("/v2/auth/social/authorizeCode",operation(v2AuthSocialAuthorizeCodeGetOperation)) {
    
    
                val code = params.getAs[String]("code")

    println("code: " + code)
    
    
                val provider = params.getAs[String]("provider")

    println("provider: " + provider)
  }

  

  val v2AuthSocialAuthorizeTokenGetOperation = (apiOperation[Unit]("v2AuthSocialAuthorizeTokenGet")
      summary "Native Social Authentication"
      parameters(queryParam[String]("accessToken").description(""),
        queryParam[String]("provider").description(""),
        queryParam[String]("refreshToken").description("").optional)
  )

  get("/v2/auth/social/authorizeToken",operation(v2AuthSocialAuthorizeTokenGetOperation)) {
    
    
                val accessToken = params.getAs[String]("accessToken")

    println("accessToken: " + accessToken)
    
    
                val provider = params.getAs[String]("provider")

    println("provider: " + provider)
    
    
                val refreshToken = params.getAs[String]("refreshToken")

    println("refreshToken: " + refreshToken)
  }

  

  val v2AuthSocialLoginGetOperation = (apiOperation[Unit]("v2AuthSocialLoginGet")
      summary "First Setp in Social Authentication flow with JWT Token"
      parameters(queryParam[String]("redirectUrl").description(""),
        queryParam[String]("provider").description(""))
  )

  get("/v2/auth/social/login",operation(v2AuthSocialLoginGetOperation)) {
    
    
                val redirectUrl = params.getAs[String]("redirectUrl")

    println("redirectUrl: " + redirectUrl)
    
    
                val provider = params.getAs[String]("provider")

    println("provider: " + provider)
  }

  

  val v2Oauth2AccessTokenGetOperation = (apiOperation[Unit]("v2Oauth2AccessTokenGet")
      summary "Get a user access token"
      parameters(queryParam[String]("clientId").description(""),
        queryParam[String]("clientSecret").description(""),
        queryParam[String]("grantType").description(""),
        queryParam[String]("code").description(""),
        queryParam[String]("responseType").description("").optional,
        queryParam[String]("scope").description("").optional,
        queryParam[String]("redirectUri").description("").optional,
        queryParam[String]("state").description("").optional)
  )

  get("/v2/oauth2/access_token",operation(v2Oauth2AccessTokenGetOperation)) {
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val clientSecret = params.getAs[String]("clientSecret")

    println("clientSecret: " + clientSecret)
    
    
                val grantType = params.getAs[String]("grantType")

    println("grantType: " + grantType)
    
    
                val code = params.getAs[String]("code")

    println("code: " + code)
    
    
                val responseType = params.getAs[String]("responseType")

    println("responseType: " + responseType)
    
    
                val scope = params.getAs[String]("scope")

    println("scope: " + scope)
    
    
                val redirectUri = params.getAs[String]("redirectUri")

    println("redirectUri: " + redirectUri)
    
    
                val state = params.getAs[String]("state")

    println("state: " + state)
  }

  

  val v2OauthAuthorizeGetOperation = (apiOperation[Unit]("v2OauthAuthorizeGet")
      summary "Request Authorization Code"
      parameters(queryParam[String]("clientId").description(""),
        queryParam[String]("clientSecret").description(""),
        queryParam[String]("responseType").description(""),
        queryParam[String]("scope").description(""),
        queryParam[String]("redirectUri").description("").optional,
        queryParam[String]("state").description("").optional)
  )

  get("/v2/oauth/authorize",operation(v2OauthAuthorizeGetOperation)) {
    
    
                val clientId = params.getAs[String]("clientId")

    println("clientId: " + clientId)
    
    
                val clientSecret = params.getAs[String]("clientSecret")

    println("clientSecret: " + clientSecret)
    
    
                val responseType = params.getAs[String]("responseType")

    println("responseType: " + responseType)
    
    
                val scope = params.getAs[String]("scope")

    println("scope: " + scope)
    
    
                val redirectUri = params.getAs[String]("redirectUri")

    println("redirectUri: " + redirectUri)
    
    
                val state = params.getAs[String]("state")

    println("state: " + state)
  }

}