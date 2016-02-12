package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_3
import com.wordnik.client.model.Inline_response_200_4
import com.wordnik.client.model.Inline_response_200_5
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_6
import com.wordnik.client.model.Inline_response_200_7
import com.wordnik.client.model.Inline_response_200_8
import com.wordnik.client.model.Inline_response_200_9
import com.wordnik.client.model.Inline_response_200_10
import com.wordnik.client.model.Inline_response_200_11

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
  

  val applicationConnectionsGetOperation = (apiOperation[Inline_response_200_3]("applicationConnectionsGet")
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

  get("/application/connections",operation(applicationConnectionsGetOperation)) {
    
    
    
        
      
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

  

  val applicationCredentialsGetOperation = (apiOperation[Inline_response_200_4]("applicationCredentialsGet")
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

  get("/application/credentials",operation(applicationCredentialsGetOperation)) {
    
    
    
        
      
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

  

  val applicationMeasurementsGetOperation = (apiOperation[Inline_response_200_5]("applicationMeasurementsGet")
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

  get("/application/measurements",operation(applicationMeasurementsGetOperation)) {
    
    
    
        
      
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

  

  val applicationTrackingRemindersGetOperation = (apiOperation[Inline_response_200_6]("applicationTrackingRemindersGet")
      summary "Get tracking reminders"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/application/trackingReminders",operation(applicationTrackingRemindersGetOperation)) {
    
    
    
        
      
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

  

  val applicationUpdatesGetOperation = (apiOperation[Inline_response_200_7]("applicationUpdatesGet")
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

  get("/application/updates",operation(applicationUpdatesGetOperation)) {
    
    
    
        
      
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

  

  val applicationUserVariableRelationshipsGetOperation = (apiOperation[Inline_response_200_8]("applicationUserVariableRelationshipsGet")
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

  get("/application/userVariableRelationships",operation(applicationUserVariableRelationshipsGetOperation)) {
    
    
    
        
      
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

  

  val applicationUserVariablesGetOperation = (apiOperation[Inline_response_200_9]("applicationUserVariablesGet")
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

  get("/application/userVariables",operation(applicationUserVariablesGetOperation)) {
    
    
    
        
      
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

  

  val applicationVariableUserSourcesGetOperation = (apiOperation[Inline_response_200_10]("applicationVariableUserSourcesGet")
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

  get("/application/variableUserSources",operation(applicationVariableUserSourcesGetOperation)) {
    
    
    
        
      
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

  

  val applicationVotesGetOperation = (apiOperation[Inline_response_200_11]("applicationVotesGet")
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

  get("/application/votes",operation(applicationVotesGetOperation)) {
    
    
    
        
      
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