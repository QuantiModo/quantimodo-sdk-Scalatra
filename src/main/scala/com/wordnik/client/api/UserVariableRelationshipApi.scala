package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_8
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_29
import com.wordnik.client.model.UserVariableRelationship
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UserVariableRelationshipApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UserVariableRelationshipApi"
  override protected val applicationName: Option[String] = Some("UserVariableRelationship")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val userVariableRelationshipsGetOperation = (apiOperation[Inline_response_200_8]("userVariableRelationshipsGet")
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
        queryParam[Int]("userId").description("").optional,
        queryParam[String]("vote").description("").optional,
        queryParam[BigDecimal]("valuePredictingHighOutcome").description("").optional,
        queryParam[BigDecimal]("valuePredictingLowOutcome").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/userVariableRelationships",operation(userVariableRelationshipsGetOperation)) {
    
    
    
        
      
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
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
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

  

  val userVariableRelationshipsPostOperation = (apiOperation[Inline_response_200_29]("userVariableRelationshipsPost")
      summary "Store UserVariableRelationship"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[UserVariableRelationship]("body").description("").optional)
  )

  post("/userVariableRelationships",operation(userVariableRelationshipsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UserVariableRelationship]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val userVariableRelationshipsIdGetOperation = (apiOperation[Inline_response_200_29]("userVariableRelationshipsIdGet")
      summary "Get UserVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/userVariableRelationships/{id}",operation(userVariableRelationshipsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val userVariableRelationshipsIdPutOperation = (apiOperation[Inline_response_200_2]("userVariableRelationshipsIdPut")
      summary "Update UserVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[UserVariableRelationship]("body").description("").optional)
  )

  put("/userVariableRelationships/{id}",operation(userVariableRelationshipsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UserVariableRelationship]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val userVariableRelationshipsIdDeleteOperation = (apiOperation[Inline_response_200_2]("userVariableRelationshipsIdDelete")
      summary "Delete UserVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/userVariableRelationships/{id}",operation(userVariableRelationshipsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}