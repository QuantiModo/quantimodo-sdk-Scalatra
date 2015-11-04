package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_9
import com.wordnik.client.model.Credential
import com.wordnik.client.model.Inline_response_200_10
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class CredentialApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "CredentialApi"
  override protected val applicationName: Option[String] = Some("Credential")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val credentialsGetOperation = (apiOperation[Inline_response_200_9]("credentialsGet")
      summary "Get all Credentials"
      parameters(queryParam[Boolean]("connectorId").description("").optional,
        queryParam[String]("attrKey").description("").optional,
        queryParam[String]("attrValue").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/credentials",operation(credentialsGetOperation)) {
    
    
    
        
      
      val connectorId = params.getAs[Boolean]("connectorId")
            

    
    println("connectorId: " + connectorId)
  
    
    
        
      
      val attrKey = params.getAs[String]("attrKey")
            

    
    println("attrKey: " + attrKey)
  
    
    
        
      
      val attrValue = params.getAs[String]("attrValue")
            

    
    println("attrValue: " + attrValue)
  
    
    
        
      
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

  

  val credentialsPostOperation = (apiOperation[Inline_response_200_10]("credentialsPost")
      summary "Store Credential"
      parameters(bodyParam[Credential]("body").description("").optional)
  )

  post("/credentials",operation(credentialsPostOperation)) {
    
    
    
                
bodyParam[Credential]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val credentialsIdGetOperation = (apiOperation[Inline_response_200_10]("credentialsIdGet")
      summary "Get Credential"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("attrKey").description(""))
  )

  get("/credentials/{id}",operation(credentialsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val attrKey = params.getAs[String]("attrKey")
            

    
    println("attrKey: " + attrKey)
  
  }

  

  val credentialsIdPutOperation = (apiOperation[Inline_response_200_2]("credentialsIdPut")
      summary "Update Credential"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("attrKey").description(""),
        bodyParam[Credential]("body").description("").optional)
  )

  put("/credentials/{id}",operation(credentialsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val attrKey = params.getAs[String]("attrKey")
            

    
    println("attrKey: " + attrKey)
  
    
    
                
bodyParam[Credential]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val credentialsIdDeleteOperation = (apiOperation[Inline_response_200_2]("credentialsIdDelete")
      summary "Delete Credential"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("attrKey").description(""))
  )

  delete("/credentials/{id}",operation(credentialsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val attrKey = params.getAs[String]("attrKey")
            

    
    println("attrKey: " + attrKey)
  
  }

}