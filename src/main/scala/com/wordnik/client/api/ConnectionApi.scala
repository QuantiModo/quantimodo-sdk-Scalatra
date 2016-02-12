package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_3
import com.wordnik.client.model.Inline_response_200_14
import com.wordnik.client.model.Connection
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ConnectionApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ConnectionApi"
  override protected val applicationName: Option[String] = Some("Connection")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val connectionsGetOperation = (apiOperation[Inline_response_200_3]("connectionsGet")
      summary "Get all Connections"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("userId").description("").optional,
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

  get("/connections",operation(connectionsGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
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

  

  val connectionsPostOperation = (apiOperation[Inline_response_200_14]("connectionsPost")
      summary "Store Connection"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[Connection]("body").description("").optional)
  )

  post("/connections",operation(connectionsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[Connection]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val connectionsIdGetOperation = (apiOperation[Inline_response_200_14]("connectionsIdGet")
      summary "Get Connection"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/connections/{id}",operation(connectionsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val connectionsIdPutOperation = (apiOperation[Inline_response_200_2]("connectionsIdPut")
      summary "Update Connection"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[Connection]("body").description("").optional)
  )

  put("/connections/{id}",operation(connectionsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[Connection]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val connectionsIdDeleteOperation = (apiOperation[Inline_response_200_2]("connectionsIdDelete")
      summary "Delete Connection"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/connections/{id}",operation(connectionsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}