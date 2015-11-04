package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_13
import com.wordnik.client.model.Source
import com.wordnik.client.model.Inline_response_200_14
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class SourceApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "SourceApi"
  override protected val applicationName: Option[String] = Some("Source")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val sourcesGetOperation = (apiOperation[Inline_response_200_13]("sourcesGet")
      summary "Get all Sources"
      parameters(queryParam[String]("clientId").description("").optional,
        queryParam[String]("name").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/sources",operation(sourcesGetOperation)) {
    
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val name = params.getAs[String]("name")
            

    
    println("name: " + name)
  
    
    
        
      
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

  

  val sourcesPostOperation = (apiOperation[Inline_response_200_14]("sourcesPost")
      summary "Store Source"
      parameters(bodyParam[Source]("body").description("").optional)
  )

  post("/sources",operation(sourcesPostOperation)) {
    
    
    
                
bodyParam[Source]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val sourcesIdGetOperation = (apiOperation[Inline_response_200_14]("sourcesIdGet")
      summary "Get Source"
      parameters(pathParam[Int]("id").description(""))
  )

  get("/sources/{id}",operation(sourcesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

  

  val sourcesIdPutOperation = (apiOperation[Inline_response_200_2]("sourcesIdPut")
      summary "Update Source"
      parameters(pathParam[Int]("id").description(""),
        bodyParam[Source]("body").description("").optional)
  )

  put("/sources/{id}",operation(sourcesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
                
bodyParam[Source]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val sourcesIdDeleteOperation = (apiOperation[Inline_response_200_2]("sourcesIdDelete")
      summary "Delete Source"
      parameters(pathParam[Int]("id").description(""))
  )

  delete("/sources/{id}",operation(sourcesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

}