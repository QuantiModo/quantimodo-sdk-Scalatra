package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_17
import java.math.BigDecimal
import com.wordnik.client.model.Inline_response_200_18
import com.wordnik.client.model.Unit
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UnitApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UnitApi"
  override protected val applicationName: Option[String] = Some("Unit")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val unitsGetOperation = (apiOperation[Inline_response_200_17]("unitsGet")
      summary "Get all Units"
      parameters(queryParam[String]("clientId").description("").optional,
        queryParam[String]("name").description("").optional,
        queryParam[String]("abbreviatedName").description("").optional,
        queryParam[Boolean]("categoryId").description("").optional,
        queryParam[BigDecimal]("minimumValue").description("").optional,
        queryParam[BigDecimal]("maximumValue").description("").optional,
        queryParam[Int]("updated").description("").optional,
        queryParam[BigDecimal]("multiply").description("").optional,
        queryParam[BigDecimal]("add").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/units",operation(unitsGetOperation)) {
    
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val name = params.getAs[String]("name")
            

    
    println("name: " + name)
  
    
    
        
      
      val abbreviatedName = params.getAs[String]("abbreviatedName")
            

    
    println("abbreviatedName: " + abbreviatedName)
  
    
    
        
      
      val categoryId = params.getAs[Boolean]("categoryId")
            

    
    println("categoryId: " + categoryId)
  
    
    
        
      
      val minimumValue = params.getAs[BigDecimal]("minimumValue")
            

    
    println("minimumValue: " + minimumValue)
  
    
    
        
      
      val maximumValue = params.getAs[BigDecimal]("maximumValue")
            

    
    println("maximumValue: " + maximumValue)
  
    
    
        
      
      val updated = params.getAs[Int]("updated")
            

    
    println("updated: " + updated)
  
    
    
        
      
      val multiply = params.getAs[BigDecimal]("multiply")
            

    
    println("multiply: " + multiply)
  
    
    
        
      
      val add = params.getAs[BigDecimal]("add")
            

    
    println("add: " + add)
  
    
    
        
      
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

  

  val unitsPostOperation = (apiOperation[Inline_response_200_18]("unitsPost")
      summary "Store Unit"
      parameters(bodyParam[Unit]("body").description("").optional)
  )

  post("/units",operation(unitsPostOperation)) {
    
    
    
                
bodyParam[Unit]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val unitsIdGetOperation = (apiOperation[Inline_response_200_18]("unitsIdGet")
      summary "Get Unit"
      parameters(pathParam[Int]("id").description(""))
  )

  get("/units/{id}",operation(unitsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

  

  val unitsIdPutOperation = (apiOperation[Inline_response_200_2]("unitsIdPut")
      summary "Update Unit"
      parameters(pathParam[Int]("id").description(""),
        bodyParam[Unit]("body").description("").optional)
  )

  put("/units/{id}",operation(unitsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
                
bodyParam[Unit]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val unitsIdDeleteOperation = (apiOperation[Inline_response_200_2]("unitsIdDelete")
      summary "Delete Unit"
      parameters(pathParam[Int]("id").description(""))
  )

  delete("/units/{id}",operation(unitsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
  }

}