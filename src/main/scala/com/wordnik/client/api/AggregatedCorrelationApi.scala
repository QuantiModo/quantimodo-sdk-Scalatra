package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_1
import com.wordnik.client.model.AggregatedCorrelation
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class AggregatedCorrelationApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "AggregatedCorrelationApi"
  override protected val applicationName: Option[String] = Some("AggregatedCorrelation")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val aggregatedCorrelationsGetOperation = (apiOperation[Inline_response_200]("aggregatedCorrelationsGet")
      summary "Get all AggregatedCorrelations"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[BigDecimal]("correlation").description("").optional,
        queryParam[Int]("causeId").description("").optional,
        queryParam[Int]("effectId").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[Int]("numberOfPairs").description("").optional,
        queryParam[BigDecimal]("valuePredictingHighOutcome").description("").optional,
        queryParam[BigDecimal]("valuePredictingLowOutcome").description("").optional,
        queryParam[BigDecimal]("optimalPearsonProduct").description("").optional,
        queryParam[Int]("numberOfUsers").description("").optional,
        queryParam[Int]("numberOfCorrelations").description("").optional,
        queryParam[BigDecimal]("statisticalSignificance").description("").optional,
        queryParam[String]("causeUnit").description("").optional,
        queryParam[Int]("causeUnitId").description("").optional,
        queryParam[Int]("causeChanges").description("").optional,
        queryParam[Int]("effectChanges").description("").optional,
        queryParam[BigDecimal]("aggregateQmScore").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[String]("status").description("").optional,
        queryParam[String]("errorMessage").description("").optional,
        queryParam[String]("lastSuccessfulUpdateTime").description("").optional,
        queryParam[BigDecimal]("reversePearsonCorrelationCoefficient").description("").optional,
        queryParam[BigDecimal]("predictivePearsonCorrelationCoefficient").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/aggregatedCorrelations",operation(aggregatedCorrelationsGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
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
  
    
    
        
      
      val numberOfUsers = params.getAs[Int]("numberOfUsers")
            

    
    println("numberOfUsers: " + numberOfUsers)
  
    
    
        
      
      val numberOfCorrelations = params.getAs[Int]("numberOfCorrelations")
            

    
    println("numberOfCorrelations: " + numberOfCorrelations)
  
    
    
        
      
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
  
    
    
        
      
      val aggregateQmScore = params.getAs[BigDecimal]("aggregateQmScore")
            

    
    println("aggregateQmScore: " + aggregateQmScore)
  
    
    
        
      
      val createdAt = params.getAs[String]("createdAt")
            

    
    println("createdAt: " + createdAt)
  
    
    
        
      
      val updatedAt = params.getAs[String]("updatedAt")
            

    
    println("updatedAt: " + updatedAt)
  
    
    
        
      
      val status = params.getAs[String]("status")
            

    
    println("status: " + status)
  
    
    
        
      
      val errorMessage = params.getAs[String]("errorMessage")
            

    
    println("errorMessage: " + errorMessage)
  
    
    
        
      
      val lastSuccessfulUpdateTime = params.getAs[String]("lastSuccessfulUpdateTime")
            

    
    println("lastSuccessfulUpdateTime: " + lastSuccessfulUpdateTime)
  
    
    
        
      
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

  

  val aggregatedCorrelationsPostOperation = (apiOperation[Inline_response_200_1]("aggregatedCorrelationsPost")
      summary "Store AggregatedCorrelation"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[AggregatedCorrelation]("body").description("").optional)
  )

  post("/aggregatedCorrelations",operation(aggregatedCorrelationsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[AggregatedCorrelation]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val aggregatedCorrelationsIdGetOperation = (apiOperation[Inline_response_200_1]("aggregatedCorrelationsIdGet")
      summary "Get AggregatedCorrelation"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/aggregatedCorrelations/{id}",operation(aggregatedCorrelationsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val aggregatedCorrelationsIdPutOperation = (apiOperation[Inline_response_200_2]("aggregatedCorrelationsIdPut")
      summary "Update AggregatedCorrelation"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[AggregatedCorrelation]("body").description("").optional)
  )

  put("/aggregatedCorrelations/{id}",operation(aggregatedCorrelationsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[AggregatedCorrelation]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val aggregatedCorrelationsIdDeleteOperation = (apiOperation[Inline_response_200_2]("aggregatedCorrelationsIdDelete")
      summary "Delete AggregatedCorrelation"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/aggregatedCorrelations/{id}",operation(aggregatedCorrelationsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}