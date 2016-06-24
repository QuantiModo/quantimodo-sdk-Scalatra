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

package com.wordnik.client.model

import java.util.Date


case class UserVariable (
  parent_id: Option[Int],  // ID of the parent variable if this variable has any parent
user_id: Option[Int],  // User ID
client_id: Option[String],  // client_id
variable_id: Int,  // ID of variable
default_unit_id: Option[Int],  // ID of unit to use for this variable
minimum_allowed_value: Option[Float],  // Minimum reasonable value for this variable (uses default unit)
maximum_allowed_value: Option[Float],  // Maximum reasonable value for this variable (uses default unit)
filling_value: Option[Float],  // Value for replacing null measurements
join_with: Option[Int],  // The Variable this Variable should be joined with. If the variable is joined with some other variable then it is not shown to user in the list of variables
onset_delay: Option[Int],  // How long it takes for a measurement in this variable to take effect
duration_of_action: Option[Int],  // Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect
variable_category_id: Option[Int],  // ID of variable category
updated: Option[Int],  // updated
_public: Option[Int],  // Is variable public
cause_only: Option[Boolean],  // A value of 1 indicates that this variable is generally a cause in a causal relationship.  An example of a causeOnly variable would be a variable such as Cloud Cover which would generally not be influenced by the behaviour of the user
filling_type: Option[String],  // 0 -&gt; No filling, 1 -&gt; Use filling-value
number_of_measurements: Option[Int],  // Number of measurements
number_of_processed_measurements: Option[Int],  // Number of processed measurements
measurements_at_last_analysis: Option[Int],  // Number of measurements at last analysis
last_unit_id: Option[Int],  // ID of last Unit
last_original_unit_id: Option[Int],  // ID of last original Unit
last_value: Option[Float],  // Last Value
last_original_value: Option[Int],  // Last original value which is stored
last_source_id: Option[Int],  // ID of last source
number_of_correlations: Option[Int],  // Number of correlations for this variable
status: Option[String],  // status
error_message: Option[String],  // error_message
last_successful_update_time: Option[Date],  // When this variable or its settings were last updated
standard_deviation: Option[Float],  // Standard deviation
variance: Option[Float],  // Variance
minimum_recorded_value: Option[Float],  // Minimum recorded value of this variable
maximum_recorded_daily_value: Option[Float],  // Maximum recorded daily value of this variable
mean: Option[Float],  // Mean
median: Option[Float],  // Median
most_common_unit_id: Option[Int],  // Most common Unit ID
most_common_value: Option[Float],  // Most common value
number_of_unique_daily_values: Option[Float],  // Number of unique daily values
number_of_changes: Option[Int],  // Number of changes
skewness: Option[Float],  // Skewness
kurtosis: Option[Float],  // Kurtosis
latitude: Option[Float],  // Latitude
longitude: Option[Float],  // Longitude
location: Option[String],  // Location
experiment_start_time: Option[Date],  // Earliest measurement start_time to be used in analysis. Use ISO 8601 datetime format
experiment_end_time: Option[Date],  // Latest measurement start_time to be used in analysis. Use ISO 8601 datetime format
created_at: Option[Date],  // When the record was first created. Use ISO 8601 datetime format
updated_at: Option[Date],  // When the record in the database was last updated. Use ISO 8601 datetime format
outcome: Option[Boolean],  // Outcome variables (those with &#x60;outcome&#x60; &#x3D;&#x3D; 1) are variables for which a human would generally want to identify the influencing factors.  These include symptoms of illness, physique, mood, cognitive performance, etc.  Generally correlation calculations are only performed on outcome variables
sources: Option[String],  // Comma-separated list of source names to limit variables to those sources
earliest_source_time: Option[Int],  // Earliest source time
latest_source_time: Option[Int],  // Latest source time
earliest_measurement_time: Option[Int],  // Earliest measurement time
latest_measurement_time: Option[Int],  // Latest measurement time
earliest_filling_time: Option[Int],  // Earliest filling time
latest_filling_time: Option[Int]  // Latest filling time
)
