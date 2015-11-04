package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_27
import java.math.BigDecimal
import com.wordnik.client.model.Variable
import com.wordnik.client.model.Inline_response_200_28
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class VariableApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "VariableApi"
  override protected val applicationName: Option[String] = Some("Variable")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val variablesGetOperation = (apiOperation[Inline_response_200_27]("variablesGet")
      summary "Get all Variables"
      parameters(queryParam[Int]("id").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("parentId").description("").optional,
        queryParam[String]("name").description("").optional,
        queryParam[Int]("variableCategoryId").description("").optional,
        queryParam[Int]("defaultUnitId").description("").optional,
        queryParam[String]("combinationOperation").description("").optional,
        queryParam[BigDecimal]("fillingValue").description("").optional,
        queryParam[BigDecimal]("maximumAllowedValue").description("").optional,
        queryParam[BigDecimal]("minimumAllowedValue").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[Int]("_public").description("").optional,
        queryParam[Boolean]("causeOnly").description("").optional,
        queryParam[BigDecimal]("mostCommonValue").description("").optional,
        queryParam[Int]("mostCommonUnitId").description("").optional,
        queryParam[BigDecimal]("standardDeviation").description("").optional,
        queryParam[BigDecimal]("variance").description("").optional,
        queryParam[BigDecimal]("mean").description("").optional,
        queryParam[BigDecimal]("median").description("").optional,
        queryParam[BigDecimal]("numberOfMeasurements").description("").optional,
        queryParam[BigDecimal]("numberOfUniqueValues").description("").optional,
        queryParam[BigDecimal]("skewness").description("").optional,
        queryParam[BigDecimal]("kurtosis").description("").optional,
        queryParam[BigDecimal]("latitude").description("").optional,
        queryParam[BigDecimal]("longitude").description("").optional,
        queryParam[String]("location").description("").optional,
        queryParam[String]("status").description("").optional,
        queryParam[String]("errorMessage").description("").optional,
        queryParam[String]("lastSuccessfulUpdateTime").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[String]("productUrl").description("").optional,
        queryParam[String]("imageUrl").description("").optional,
        queryParam[BigDecimal]("price").description("").optional,
        queryParam[Int]("numberOfUserVariables").description("").optional,
        queryParam[Boolean]("outcome").description("").optional,
        queryParam[BigDecimal]("minimumRecordedValue").description("").optional,
        queryParam[BigDecimal]("maximumRecordedValue").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/variables",operation(variablesGetOperation)) {
    
    
    
        
      
      val id = params.getAs[Int]("id")
            

    
    println("id: " + id)
  
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val parentId = params.getAs[Int]("parentId")
            

    
    println("parentId: " + parentId)
  
    
    
        
      
      val name = params.getAs[String]("name")
            

    
    println("name: " + name)
  
    
    
        
      
      val variableCategoryId = params.getAs[Int]("variableCategoryId")
            

    
    println("variableCategoryId: " + variableCategoryId)
  
    
    
        
      
      val defaultUnitId = params.getAs[Int]("defaultUnitId")
            

    
    println("defaultUnitId: " + defaultUnitId)
  
    
    
        
      
      val combinationOperation = params.getAs[String]("combinationOperation")
            

    
    println("combinationOperation: " + combinationOperation)
  
    
    
        
      
      val fillingValue = params.getAs[BigDecimal]("fillingValue")
            

    
    println("fillingValue: " + fillingValue)
  
    
    
        
      
      val maximumAllowedValue = params.getAs[BigDecimal]("maximumAllowedValue")
            

    
    println("maximumAllowedValue: " + maximumAllowedValue)
  
    
    
        
      
      val minimumAllowedValue = params.getAs[BigDecimal]("minimumAllowedValue")
            

    
    println("minimumAllowedValue: " + minimumAllowedValue)
  
    
    
        
      
      val onsetDelay = params.getAs[Int]("onsetDelay")
            

    
    println("onsetDelay: " + onsetDelay)
  
    
    
        
      
      val durationOfAction = params.getAs[Int]("durationOfAction")
            

    
    println("durationOfAction: " + durationOfAction)
  
    
    
        
      
      val _public = params.getAs[Int]("_public")
            

    
    println("_public: " + _public)
  
    
    
        
      
      val causeOnly = params.getAs[Boolean]("causeOnly")
            

    
    println("causeOnly: " + causeOnly)
  
    
    
        
      
      val mostCommonValue = params.getAs[BigDecimal]("mostCommonValue")
            

    
    println("mostCommonValue: " + mostCommonValue)
  
    
    
        
      
      val mostCommonUnitId = params.getAs[Int]("mostCommonUnitId")
            

    
    println("mostCommonUnitId: " + mostCommonUnitId)
  
    
    
        
      
      val standardDeviation = params.getAs[BigDecimal]("standardDeviation")
            

    
    println("standardDeviation: " + standardDeviation)
  
    
    
        
      
      val variance = params.getAs[BigDecimal]("variance")
            

    
    println("variance: " + variance)
  
    
    
        
      
      val mean = params.getAs[BigDecimal]("mean")
            

    
    println("mean: " + mean)
  
    
    
        
      
      val median = params.getAs[BigDecimal]("median")
            

    
    println("median: " + median)
  
    
    
        
      
      val numberOfMeasurements = params.getAs[BigDecimal]("numberOfMeasurements")
            

    
    println("numberOfMeasurements: " + numberOfMeasurements)
  
    
    
        
      
      val numberOfUniqueValues = params.getAs[BigDecimal]("numberOfUniqueValues")
            

    
    println("numberOfUniqueValues: " + numberOfUniqueValues)
  
    
    
        
      
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
  
    
    
        
      
      val status = params.getAs[String]("status")
            

    
    println("status: " + status)
  
    
    
        
      
      val errorMessage = params.getAs[String]("errorMessage")
            

    
    println("errorMessage: " + errorMessage)
  
    
    
        
      
      val lastSuccessfulUpdateTime = params.getAs[String]("lastSuccessfulUpdateTime")
            

    
    println("lastSuccessfulUpdateTime: " + lastSuccessfulUpdateTime)
  
    
    
        
      
      val createdAt = params.getAs[String]("createdAt")
            

    
    println("createdAt: " + createdAt)
  
    
    
        
      
      val updatedAt = params.getAs[String]("updatedAt")
            

    
    println("updatedAt: " + updatedAt)
  
    
    
        
      
      val productUrl = params.getAs[String]("productUrl")
            

    
    println("productUrl: " + productUrl)
  
    
    
        
      
      val imageUrl = params.getAs[String]("imageUrl")
            

    
    println("imageUrl: " + imageUrl)
  
    
    
        
      
      val price = params.getAs[BigDecimal]("price")
            

    
    println("price: " + price)
  
    
    
        
      
      val numberOfUserVariables = params.getAs[Int]("numberOfUserVariables")
            

    
    println("numberOfUserVariables: " + numberOfUserVariables)
  
    
    
        
      
      val outcome = params.getAs[Boolean]("outcome")
            

    
    println("outcome: " + outcome)
  
    
    
        
      
      val minimumRecordedValue = params.getAs[BigDecimal]("minimumRecordedValue")
            

    
    println("minimumRecordedValue: " + minimumRecordedValue)
  
    
    
        
      
      val maximumRecordedValue = params.getAs[BigDecimal]("maximumRecordedValue")
            

    
    println("maximumRecordedValue: " + maximumRecordedValue)
  
    
    
        
      
      val limit = params.getAs[Int]("limit")
            

    
    println("limit: " + limit)
  
    
    
        
      
      val offset = params.getAs[Int]("offset")
            

    
    println("offset: " + offset)
  
    
    
        
      
      val sort = params.getAs[String]("sort")
            

    
    println("sort: " + sort)
  
  }

  

  val variablesPostOperation = (apiOperation[Inline_response_200_28]("variablesPost")
      summary "Store Variable"
      parameters(bodyParam[Variable]("body").description("").optional)
  )

  post("/variables",operation(variablesPostOperation)) {
    
    
    
                
bodyParam[Variable]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variablesIdGetOperation = (apiOperation[Inline_response_200_28]("variablesIdGet")
      summary "Get Variable"
      parameters(pathParam[Int]("id").description(""))
  )

  get("/variables/{id}",operation(variablesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

  

  val variablesIdPutOperation = (apiOperation[Inline_response_200_2]("variablesIdPut")
      summary "Update Variable"
      parameters(pathParam[Int]("id").description(""),
        bodyParam[Variable]("body").description("").optional)
  )

  put("/variables/{id}",operation(variablesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
                
bodyParam[Variable]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variablesIdDeleteOperation = (apiOperation[Inline_response_200_2]("variablesIdDelete")
      summary "Delete Variable"
      parameters(pathParam[Int]("id").description(""))
  )

  delete("/variables/{id}",operation(variablesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

}