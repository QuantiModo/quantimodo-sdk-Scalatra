package com.wordnik.client.api

import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_9
import com.wordnik.client.model.Inline_response_200_30
import com.wordnik.client.model.UserVariable
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UserVariableApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserVariableApi"
  override protected val applicationName: Option[String] = Some("UserVariable")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val userVariablesGetOperation = (apiOperation[Inline_response_200_9]("userVariablesGet")
      summary "Get all UserVariables"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("parentId").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("userId").description("").optional,
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
        queryParam[BigDecimal]("lastOriginalValue2").description("").optional,
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

  get("/userVariables",operation(userVariablesGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val parentId = params.getAs[Int]("parentId")
            

    
    println("parentId: " + parentId)
  
    
    
        
      
      val variableId = params.getAs[Int]("variableId")
            

    
    println("variableId: " + variableId)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
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
  
    
    
        
      
      val lastOriginalValue2 = params.getAs[BigDecimal]("lastOriginalValue2")
            

    
    println("lastOriginalValue2: " + lastOriginalValue2)
  
    
    
        
      
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

  

  val userVariablesPostOperation = (apiOperation[Inline_response_200_30]("userVariablesPost")
      summary "Store UserVariable"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[UserVariable]("body").description("").optional)
  )

  post("/userVariables",operation(userVariablesPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UserVariable]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val userVariablesIdGetOperation = (apiOperation[Inline_response_200_30]("userVariablesIdGet")
      summary "Get UserVariable"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/userVariables/{id}",operation(userVariablesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val userVariablesIdPutOperation = (apiOperation[Inline_response_200_2]("userVariablesIdPut")
      summary "Update UserVariable"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[UserVariable]("body").description("").optional)
  )

  put("/userVariables/{id}",operation(userVariablesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UserVariable]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val userVariablesIdDeleteOperation = (apiOperation[Inline_response_200_2]("userVariablesIdDelete")
      summary "Delete UserVariable"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/userVariables/{id}",operation(userVariablesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}