package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_24
import com.wordnik.client.model.Inline_response_200_25
import com.wordnik.client.model.UnitCategory
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class UnitCategoryApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "UnitCategoryApi"
  override protected val applicationName: Option[String] = Some("UnitCategory")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val unitCategoriesGetOperation = (apiOperation[Inline_response_200_24]("unitCategoriesGet")
      summary "Get unit categories"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("name").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/unitCategories",operation(unitCategoriesGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
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

  

  val unitCategoriesPostOperation = (apiOperation[Inline_response_200_25]("unitCategoriesPost")
      summary "Store UnitCategory"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[UnitCategory]("body").description("").optional)
  )

  post("/unitCategories",operation(unitCategoriesPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UnitCategory]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val unitCategoriesIdGetOperation = (apiOperation[Inline_response_200_25]("unitCategoriesIdGet")
      summary "Get UnitCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/unitCategories/{id}",operation(unitCategoriesIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val unitCategoriesIdPutOperation = (apiOperation[Inline_response_200_2]("unitCategoriesIdPut")
      summary "Update UnitCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[UnitCategory]("body").description("").optional)
  )

  put("/unitCategories/{id}",operation(unitCategoriesIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[UnitCategory]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val unitCategoriesIdDeleteOperation = (apiOperation[Inline_response_200_2]("unitCategoriesIdDelete")
      summary "Delete UnitCategory"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/unitCategories/{id}",operation(unitCategoriesIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}