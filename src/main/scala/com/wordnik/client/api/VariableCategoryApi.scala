package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_31
import java.math.BigDecimal
import com.wordnik.client.model.VariableCategory
import com.wordnik.client.model.Inline_response_200_32
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class VariableCategoryApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "VariableCategoryApi"
  override protected val applicationName: Option[String] = Some("VariableCategory")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val variableCategoriesGetOperation = (apiOperation[Inline_response_200_31]("variableCategoriesGet")
      summary "Get all VariableCategories"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("name").description("").optional,
        queryParam[BigDecimal]("fillingValue").description("").optional,
        queryParam[BigDecimal]("maximumAllowedValue").description("").optional,
        queryParam[BigDecimal]("minimumAllowedValue").description("").optional,
        queryParam[Int]("durationOfAction").description("").optional,
        queryParam[Int]("onsetDelay").description("").optional,
        queryParam[String]("combinationOperation").description("").optional,
        queryParam[Int]("updated").description("").optional,
        queryParam[Boolean]("causeOnly").description("").optional,
        queryParam[Int]("_public").description("").optional,
        queryParam[Boolean]("outcome").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[String]("imageUrl").description("").optional,
        queryParam[Int]("defaultUnitId").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/variableCategories",operation(variableCategoriesGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val name = params.getAs[String]("name")
            

    
    println("name: " + name)
  
    
    
        
      
      val fillingValue = params.getAs[BigDecimal]("fillingValue")
            

    
    println("fillingValue: " + fillingValue)
  
    
    
        
      
      val maximumAllowedValue = params.getAs[BigDecimal]("maximumAllowedValue")
            

    
    println("maximumAllowedValue: " + maximumAllowedValue)
  
    
    
        
      
      val minimumAllowedValue = params.getAs[BigDecimal]("minimumAllowedValue")
            

    
    println("minimumAllowedValue: " + minimumAllowedValue)
  
    
    
        
      
      val durationOfAction = params.getAs[Int]("durationOfAction")
            

    
    println("durationOfAction: " + durationOfAction)
  
    
    
        
      
      val onsetDelay = params.getAs[Int]("onsetDelay")
            

    
    println("onsetDelay: " + onsetDelay)
  
    
    
        
      
      val combinationOperation = params.getAs[String]("combinationOperation")
            

    
    println("combinationOperation: " + combinationOperation)
  
    
    
        
      
      val updated = params.getAs[Int]("updated")
            

    
    println("updated: " + updated)
  
    
    
        
      
      val causeOnly = params.getAs[Boolean]("causeOnly")
            

    
    println("causeOnly: " + causeOnly)
  
    
    
        
      
      val _public = params.getAs[Int]("_public")
            

    
    println("_public: " + _public)
  
    
    
        
      
      val outcome = params.getAs[Boolean]("outcome")
            

    
    println("outcome: " + outcome)
  
    
    
        
      
      val createdAt = params.getAs[String]("createdAt")
            

    
    println("createdAt: " + createdAt)
  
    
    
        
      
      val updatedAt = params.getAs[String]("updatedAt")
            

    
    println("updatedAt: " + updatedAt)
  
    
    
        
      
      val imageUrl = params.getAs[String]("imageUrl")
            

    
    println("imageUrl: " + imageUrl)
  
    
    
        
      
      val defaultUnitId = params.getAs[Int]("defaultUnitId")
            

    
    println("defaultUnitId: " + defaultUnitId)
  
    
    
        
      
      val limit = params.getAs[Int]("limit")
            

    
    println("limit: " + limit)
  
    
    
        
      
      val offset = params.getAs[Int]("offset")
            

    
    println("offset: " + offset)
  
    
    
        
      
      val sort = params.getAs[String]("sort")
            

    
    println("sort: " + sort)
  
  }

  

  val variableCategoriesPostOperation = (apiOperation[Inline_response_200_32]("variableCategoriesPost")
      summary "Store VariableCategory"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[VariableCategory]("body").description("").optional)
  )

  post("/variableCategories",operation(variableCategoriesPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[VariableCategory]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variableCategoriesIdGetOperation = (apiOperation[Inline_response_200_32]("variableCategoriesIdGet")
      summary "Get VariableCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/variableCategories/{id}",operation(variableCategoriesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val variableCategoriesIdPutOperation = (apiOperation[Inline_response_200_2]("variableCategoriesIdPut")
      summary "Update VariableCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[VariableCategory]("body").description("").optional)
  )

  put("/variableCategories/{id}",operation(variableCategoriesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[VariableCategory]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val variableCategoriesIdDeleteOperation = (apiOperation[Inline_response_200_2]("variableCategoriesIdDelete")
      summary "Delete VariableCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/variableCategories/{id}",operation(variableCategoriesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}