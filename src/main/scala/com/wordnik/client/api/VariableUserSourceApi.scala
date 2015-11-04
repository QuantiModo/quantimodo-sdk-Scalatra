package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_25
import com.wordnik.client.model.VariableUserSource
import com.wordnik.client.model.Inline_response_200_26
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class VariableUserSourceApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "VariableUserSourceApi"
  override protected val applicationName: Option[String] = Some("VariableUserSource")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val variableUserSourcesGetOperation = (apiOperation[Inline_response_200_25]("variableUserSourcesGet")
      summary "Get all VariableUserSources"
      parameters(queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("userId").description("").optional,
        queryParam[Int]("timestamp").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/variableUserSources",operation(variableUserSourcesGetOperation)) {
    
    
    
        
      
      val variableId = params.getAs[Int]("variableId")
            

    
    println("variableId: " + variableId)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
      val timestamp = params.getAs[Int]("timestamp")
            

    
    println("timestamp: " + timestamp)
  
    
    
        
      
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

  

  val variableUserSourcesPostOperation = (apiOperation[Inline_response_200_26]("variableUserSourcesPost")
      summary "Store VariableUserSource"
      parameters(bodyParam[VariableUserSource]("body").description("").optional)
  )

  post("/variableUserSources",operation(variableUserSourcesPostOperation)) {
    
    
    
                
bodyParam[VariableUserSource]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variableUserSourcesIdGetOperation = (apiOperation[Inline_response_200_26]("variableUserSourcesIdGet")
      summary "Get VariableUserSource"
      parameters(pathParam[Int]("id").description(""),
        queryParam[Int]("sourceId").description(""))
  )

  get("/variableUserSources/{id}",operation(variableUserSourcesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val sourceId = params.getAs[Int]("sourceId")
            

    
    println("sourceId: " + sourceId)
  
  }

  

  val variableUserSourcesIdPutOperation = (apiOperation[Inline_response_200_2]("variableUserSourcesIdPut")
      summary "Update VariableUserSource"
      parameters(pathParam[Int]("id").description(""),
        queryParam[Int]("sourceId").description(""),
        bodyParam[VariableUserSource]("body").description("").optional)
  )

  put("/variableUserSources/{id}",operation(variableUserSourcesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val sourceId = params.getAs[Int]("sourceId")
            

    
    println("sourceId: " + sourceId)
  
    
    
                
bodyParam[VariableUserSource]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variableUserSourcesIdDeleteOperation = (apiOperation[Inline_response_200_2]("variableUserSourcesIdDelete")
      summary "Delete VariableUserSource"
      parameters(pathParam[Int]("id").description(""),
        queryParam[Int]("sourceId").description(""))
  )

  delete("/variableUserSources/{id}",operation(variableUserSourcesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val sourceId = params.getAs[Int]("sourceId")
            

    
    println("sourceId: " + sourceId)
  
  }

}