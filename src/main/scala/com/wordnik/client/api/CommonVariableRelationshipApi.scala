package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_12
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_13
import com.wordnik.client.model.CommonVariableRelationship
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class CommonVariableRelationshipApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CommonVariableRelationshipApi"
  override protected val applicationName: Option[String] = Some("CommonVariableRelationship")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val commonVariableRelationshipsGetOperation = (apiOperation[Inline_response_200_12]("commonVariableRelationshipsGet")
      summary "Get all CommonVariableRelationships"
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
        queryParam[BigDecimal]("strengthScore").description("").optional,
        queryParam[String]("strengthLevel").description("").optional,
        queryParam[Int]("upVotes").description("").optional,
        queryParam[Int]("downVotes").description("").optional,
        queryParam[BigDecimal]("valuePredictingHighOutcome").description("").optional,
        queryParam[BigDecimal]("valuePredictingLowOutcome").description("").optional,
        queryParam[Int]("numberOfUsers").description("").optional,
        queryParam[String]("dataSource").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/commonVariableRelationships",operation(commonVariableRelationshipsGetOperation)) {
    
    
    
        
      
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
  
    
    
        
      
      val strengthScore = params.getAs[BigDecimal]("strengthScore")
            

    
    println("strengthScore: " + strengthScore)
  
    
    
        
      
      val strengthLevel = params.getAs[String]("strengthLevel")
            

    
    println("strengthLevel: " + strengthLevel)
  
    
    
        
      
      val upVotes = params.getAs[Int]("upVotes")
            

    
    println("upVotes: " + upVotes)
  
    
    
        
      
      val downVotes = params.getAs[Int]("downVotes")
            

    
    println("downVotes: " + downVotes)
  
    
    
        
      
      val valuePredictingHighOutcome = params.getAs[BigDecimal]("valuePredictingHighOutcome")
            

    
    println("valuePredictingHighOutcome: " + valuePredictingHighOutcome)
  
    
    
        
      
      val valuePredictingLowOutcome = params.getAs[BigDecimal]("valuePredictingLowOutcome")
            

    
    println("valuePredictingLowOutcome: " + valuePredictingLowOutcome)
  
    
    
        
      
      val numberOfUsers = params.getAs[Int]("numberOfUsers")
            

    
    println("numberOfUsers: " + numberOfUsers)
  
    
    
        
      
      val dataSource = params.getAs[String]("dataSource")
            

    
    println("dataSource: " + dataSource)
  
    
    
        
      
      val limit = params.getAs[Int]("limit")
            

    
    println("limit: " + limit)
  
    
    
        
      
      val offset = params.getAs[Int]("offset")
            

    
    println("offset: " + offset)
  
    
    
        
      
      val sort = params.getAs[String]("sort")
            

    
    println("sort: " + sort)
  
  }

  

  val commonVariableRelationshipsPostOperation = (apiOperation[Inline_response_200_13]("commonVariableRelationshipsPost")
      summary "Store CommonVariableRelationship"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[CommonVariableRelationship]("body").description("").optional)
  )

  post("/commonVariableRelationships",operation(commonVariableRelationshipsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[CommonVariableRelationship]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val commonVariableRelationshipsIdGetOperation = (apiOperation[Inline_response_200_13]("commonVariableRelationshipsIdGet")
      summary "Get CommonVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/commonVariableRelationships/{id}",operation(commonVariableRelationshipsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val commonVariableRelationshipsIdPutOperation = (apiOperation[Inline_response_200_2]("commonVariableRelationshipsIdPut")
      summary "Update CommonVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[CommonVariableRelationship]("body").description("").optional)
  )

  put("/commonVariableRelationships/{id}",operation(commonVariableRelationshipsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[CommonVariableRelationship]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val commonVariableRelationshipsIdDeleteOperation = (apiOperation[Inline_response_200_2]("commonVariableRelationshipsIdDelete")
      summary "Delete CommonVariableRelationship"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/commonVariableRelationships/{id}",operation(commonVariableRelationshipsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}