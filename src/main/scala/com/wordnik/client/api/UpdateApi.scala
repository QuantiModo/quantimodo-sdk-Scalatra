package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_19
import com.wordnik.client.model.Update
import com.wordnik.client.model.Inline_response_200_20
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UpdateApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UpdateApi"
  override protected val applicationName: Option[String] = Some("Update")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val updatesGetOperation = (apiOperation[Inline_response_200_19]("updatesGet")
      summary "Get all Updates"
      parameters(queryParam[Int]("userId").description("").optional,
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

  get("/updates",operation(updatesGetOperation)) {
    
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
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

  

  val updatesPostOperation = (apiOperation[Inline_response_200_20]("updatesPost")
      summary "Store Update"
      parameters(bodyParam[Update]("body").description("").optional)
  )

  post("/updates",operation(updatesPostOperation)) {
    
    
    
                
bodyParam[Update]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val updatesIdGetOperation = (apiOperation[Inline_response_200_20]("updatesIdGet")
      summary "Get Update"
      parameters(pathParam[Int]("id").description(""))
  )

  get("/updates/{id}",operation(updatesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

  

  val updatesIdPutOperation = (apiOperation[Inline_response_200_2]("updatesIdPut")
      summary "Update Update"
      parameters(pathParam[Int]("id").description(""),
        bodyParam[Update]("body").description("").optional)
  )

  put("/updates/{id}",operation(updatesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
                
bodyParam[Update]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val updatesIdDeleteOperation = (apiOperation[Inline_response_200_2]("updatesIdDelete")
      summary "Delete Update"
      parameters(pathParam[Int]("id").description(""))
  )

  delete("/updates/{id}",operation(updatesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

}