package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_29
import com.wordnik.client.model.Vote
import com.wordnik.client.model.Inline_response_200_30
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class VoteApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "VoteApi"
  override protected val applicationName: Option[String] = Some("Vote")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val votesGetOperation = (apiOperation[Inline_response_200_29]("votesGet")
      summary "Get all Votes"
      parameters(queryParam[String]("clientId").description("").optional,
        queryParam[Int]("userId").description("").optional,
        queryParam[Int]("causeId").description("").optional,
        queryParam[Int]("effectId").description("").optional,
        queryParam[Int]("value").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/votes",operation(votesGetOperation)) {
    
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
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

  

  val votesPostOperation = (apiOperation[Inline_response_200_30]("votesPost")
      summary "Store Vote"
      parameters(bodyParam[Vote]("body").description("").optional)
  )

  post("/votes",operation(votesPostOperation)) {
    
    
    
                
bodyParam[Vote]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val votesIdGetOperation = (apiOperation[Inline_response_200_30]("votesIdGet")
      summary "Get Vote"
      parameters(pathParam[Int]("id").description(""))
  )

  get("/votes/{id}",operation(votesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

  

  val votesIdPutOperation = (apiOperation[Inline_response_200_2]("votesIdPut")
      summary "Update Vote"
      parameters(pathParam[Int]("id").description(""),
        bodyParam[Vote]("body").description("").optional)
  )

  put("/votes/{id}",operation(votesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
                
bodyParam[Vote]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val votesIdDeleteOperation = (apiOperation[Inline_response_200_2]("votesIdDelete")
      summary "Delete Vote"
      parameters(pathParam[Int]("id").description(""))
  )

  delete("/votes/{id}",operation(votesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

}