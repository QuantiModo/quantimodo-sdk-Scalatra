package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_5
import java.math.BigDecimal
import com.wordnik.client.model.MeasurementPost
import java.io.File
import com.wordnik.client.model.Inline_response_200_20
import com.wordnik.client.model.Measurement
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class MeasurementApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "MeasurementApi"
  override protected val applicationName: Option[String] = Some("Measurement")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val measurementsGetOperation = (apiOperation[Inline_response_200_5]("measurementsGet")
      summary "Get measurements for this user"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[Int]("userId").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("connectorId").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Int]("sourceId").description("").optional,
        queryParam[String]("startTime").description("").optional,
        queryParam[BigDecimal]("value").description("").optional,
        queryParam[Int]("unitId").description("").optional,
        queryParam[BigDecimal]("originalValue").description("").optional,
        queryParam[Int]("originalUnitId").description("").optional,
        queryParam[Int]("duration").description("").optional,
        queryParam[String]("note").description("").optional,
        queryParam[BigDecimal]("latitude").description("").optional,
        queryParam[BigDecimal]("longitude").description("").optional,
        queryParam[String]("location").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[String]("error").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/measurements",operation(measurementsGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val connectorId = params.getAs[Int]("connectorId")
            

    
    println("connectorId: " + connectorId)
  
    
    
        
      
      val variableId = params.getAs[Int]("variableId")
            

    
    println("variableId: " + variableId)
  
    
    
        
      
      val sourceId = params.getAs[Int]("sourceId")
            

    
    println("sourceId: " + sourceId)
  
    
    
        
      
      val startTime = params.getAs[String]("startTime")
            

    
    println("startTime: " + startTime)
  
    
    
        
      
      val value = params.getAs[BigDecimal]("value")
            

    
    println("value: " + value)
  
    
    
        
      
      val unitId = params.getAs[Int]("unitId")
            

    
    println("unitId: " + unitId)
  
    
    
        
      
      val originalValue = params.getAs[BigDecimal]("originalValue")
            

    
    println("originalValue: " + originalValue)
  
    
    
        
      
      val originalUnitId = params.getAs[Int]("originalUnitId")
            

    
    println("originalUnitId: " + originalUnitId)
  
    
    
        
      
      val duration = params.getAs[Int]("duration")
            

    
    println("duration: " + duration)
  
    
    
        
      
      val note = params.getAs[String]("note")
            

    
    println("note: " + note)
  
    
    
        
      
      val latitude = params.getAs[BigDecimal]("latitude")
            

    
    println("latitude: " + latitude)
  
    
    
        
      
      val longitude = params.getAs[BigDecimal]("longitude")
            

    
    println("longitude: " + longitude)
  
    
    
        
      
      val location = params.getAs[String]("location")
            

    
    println("location: " + location)
  
    
    
        
      
      val createdAt = params.getAs[String]("createdAt")
            

    
    println("createdAt: " + createdAt)
  
    
    
        
      
      val updatedAt = params.getAs[String]("updatedAt")
            

    
    println("updatedAt: " + updatedAt)
  
    
    
        
      
      val error = params.getAs[String]("error")
            

    
    println("error: " + error)
  
    
    
        
      
      val limit = params.getAs[Int]("limit")
            

    
    println("limit: " + limit)
  
    
    
        
      
      val offset = params.getAs[Int]("offset")
            

    
    println("offset: " + offset)
  
    
    
        
      
      val sort = params.getAs[String]("sort")
            

    
    println("sort: " + sort)
  
  }

  

  val measurementsPostOperation = (apiOperation[Inline_response_200_5]("measurementsPost")
      summary "Post a new set or update existing measurements to the database"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[MeasurementPost]("body").description("").optional)
  )

  post("/measurements",operation(measurementsPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[MeasurementPost]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val measurementsCsvGetOperation = (apiOperation[File]("measurementsCsvGet")
      summary "Get Measurements CSV"
      parameters(queryParam[String]("accessToken").description("").optional)
  )

  get("/measurements/csv",operation(measurementsCsvGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val measurementsRequestCsvPostOperation = (apiOperation[Int]("measurementsRequestCsvPost")
      summary "Post Request for Measurements CSV"
      parameters(queryParam[String]("accessToken").description("").optional)
  )

  post("/measurements/request_csv",operation(measurementsRequestCsvPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val measurementsIdGetOperation = (apiOperation[Inline_response_200_20]("measurementsIdGet")
      summary "Get Measurement"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/measurements/{id}",operation(measurementsIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val measurementsIdPutOperation = (apiOperation[Inline_response_200_2]("measurementsIdPut")
      summary "Update Measurement"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[Measurement]("body").description("").optional)
  )

  put("/measurements/{id}",operation(measurementsIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[Measurement]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val measurementsIdDeleteOperation = (apiOperation[Inline_response_200_2]("measurementsIdDelete")
      summary "Delete Measurement"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/measurements/{id}",operation(measurementsIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}