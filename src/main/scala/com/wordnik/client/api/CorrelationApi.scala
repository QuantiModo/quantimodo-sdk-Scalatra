package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_17
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_18
import com.wordnik.client.model.Correlation
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class CorrelationApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CorrelationApi"
  override protected val applicationName: Option[String] = Some("Correlation")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val correlationsGetOperation = (apiOperation[Inline_response_200_17]("correlationsGet")
      summary "Get all Correlations"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("timestamp").description("").optional,
        queryParam[Int]("userId").description("").optional,
        queryParam[BigDecimal]("correlation").description("").optional,
        queryParam[Int]("causeId").description("").optional,
        queryParam[Int]("effectId").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[Int]("numberOfPairs").description("").optional,
        queryParam[BigDecimal]("valuePredictingHighOutcome").description("").optional,
        queryParam[BigDecimal]("valuePredictingLowOutcome").description("").optional,
        queryParam[BigDecimal]("optimalPearsonProduct").description("").optional,
        queryParam[BigDecimal]("vote").description("").optional,
        queryParam[BigDecimal]("statisticalSignificance").description("").optional,
        queryParam[String]("causeUnit").description("").optional,
        queryParam[Int]("causeUnitId").description("").optional,
        queryParam[Int]("causeChanges").description("").optional,
        queryParam[Int]("effectChanges").description("").optional,
        queryParam[BigDecimal]("qmScore").description("").optional,
        queryParam[String]("error").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[BigDecimal]("reversePearsonCorrelationCoefficient").description("").optional,
        queryParam[BigDecimal]("predictivePearsonCorrelationCoefficient").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/correlations",operation(correlationsGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val timestamp = params.getAs[Int]("timestamp")
            

    
    println("timestamp: " + timestamp)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
      val correlation = params.getAs[BigDecimal]("correlation")
            

    
    println("correlation: " + correlation)
  
    
    
        
      
      val causeId = params.getAs[Int]("causeId")
            

    
    println("causeId: " + causeId)
  
    
    
        
      
      val effectId = params.getAs[Int]("effectId")
            

    
    println("effectId: " + effectId)
  
    
    
        
      
      val onsetDelay = params.getAs[Int]("onsetDelay")
            

    
    println("onsetDelay: " + onsetDelay)
  
    
    
        
      
      val durationOfAction = params.getAs[Int]("durationOfAction")
            

    
    println("durationOfAction: " + durationOfAction)
  
    
    
        
      
      val numberOfPairs = params.getAs[Int]("numberOfPairs")
            

    
    println("numberOfPairs: " + numberOfPairs)
  
    
    
        
      
      val valuePredictingHighOutcome = params.getAs[BigDecimal]("valuePredictingHighOutcome")
            

    
    println("valuePredictingHighOutcome: " + valuePredictingHighOutcome)
  
    
    
        
      
      val valuePredictingLowOutcome = params.getAs[BigDecimal]("valuePredictingLowOutcome")
            

    
    println("valuePredictingLowOutcome: " + valuePredictingLowOutcome)
  
    
    
        
      
      val optimalPearsonProduct = params.getAs[BigDecimal]("optimalPearsonProduct")
            

    
    println("optimalPearsonProduct: " + optimalPearsonProduct)
  
    
    
        
      
      val vote = params.getAs[BigDecimal]("vote")
            

    
    println("vote: " + vote)
  
    
    
        
      
      val statisticalSignificance = params.getAs[BigDecimal]("statisticalSignificance")
            

    
    println("statisticalSignificance: " + statisticalSignificance)
  
    
    
        
      
      val causeUnit = params.getAs[String]("causeUnit")
            

    
    println("causeUnit: " + causeUnit)
  
    
    
        
      
      val causeUnitId = params.getAs[Int]("causeUnitId")
            

    
    println("causeUnitId: " + causeUnitId)
  
    
    
        
      
      val causeChanges = params.getAs[Int]("causeChanges")
            

    
    println("causeChanges: " + causeChanges)
  
    
    
        
      
      val effectChanges = params.getAs[Int]("effectChanges")
            

    
    println("effectChanges: " + effectChanges)
  
    
    
        
      
      val qmScore = params.getAs[BigDecimal]("qmScore")
            

    
    println("qmScore: " + qmScore)
  
    
    
        
      
      val error = params.getAs[String]("error")
            

    
    println("error: " + error)
  
    
    
        
      
      val createdAt = params.getAs[String]("createdAt")
            

    
    println("createdAt: " + createdAt)
  
    
    
        
      
      val updatedAt = params.getAs[String]("updatedAt")
            

    
    println("updatedAt: " + updatedAt)
  
    
    
        
      
      val reversePearsonCorrelationCoefficient = params.getAs[BigDecimal]("reversePearsonCorrelationCoefficient")
            

    
    println("reversePearsonCorrelationCoefficient: " + reversePearsonCorrelationCoefficient)
  
    
    
        
      
      val predictivePearsonCorrelationCoefficient = params.getAs[BigDecimal]("predictivePearsonCorrelationCoefficient")
            

    
    println("predictivePearsonCorrelationCoefficient: " + predictivePearsonCorrelationCoefficient)
  
    
    
        
      
      val limit = params.getAs[Int]("limit")
            

    
    println("limit: " + limit)
  
    
    
        
      
      val offset = params.getAs[Int]("offset")
            

    
    println("offset: " + offset)
  
    
    
        
      
      val sort = params.getAs[String]("sort")
            

    
    println("sort: " + sort)
  
  }

  

  val correlationsPostOperation = (apiOperation[Inline_response_200_18]("correlationsPost")
      summary "Store Correlation"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[Correlation]("body").description("").optional)
  )

  post("/correlations",operation(correlationsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[Correlation]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val correlationsIdGetOperation = (apiOperation[Inline_response_200_18]("correlationsIdGet")
      summary "Get Correlation Details"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/correlations/{id}",operation(correlationsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val correlationsIdPutOperation = (apiOperation[Inline_response_200_2]("correlationsIdPut")
      summary "Update Correlation"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[Correlation]("body").description("").optional)
  )

  put("/correlations/{id}",operation(correlationsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[Correlation]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val correlationsIdDeleteOperation = (apiOperation[Inline_response_200_2]("correlationsIdDelete")
      summary "Delete Correlation"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/correlations/{id}",operation(correlationsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}