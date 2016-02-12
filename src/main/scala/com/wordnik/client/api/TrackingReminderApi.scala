package com.wordnik.client.api

import com.wordnik.client.model.Inline_response_200_6
import com.wordnik.client.model.TrackingReminder
import com.wordnik.client.model.Inline_response_200_23
import com.wordnik.client.model.Inline_response_200_2

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class TrackingReminderApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "TrackingReminderApi"
  override protected val applicationName: Option[String] = Some("TrackingReminder")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val trackingRemindersGetOperation = (apiOperation[Inline_response_200_6]("trackingRemindersGet")
      summary "Get tracking reminders"
      parameters(queryParam[String]("accessToken").description("").optional,
        queryParam[String]("clientId").description("").optional,
        queryParam[Int]("userId").description("").optional,
        queryParam[Int]("variableId").description("").optional,
        queryParam[Boolean]("popUp").description("").optional,
        queryParam[Boolean]("sms").description("").optional,
        queryParam[Boolean]("email").description("").optional,
        queryParam[Boolean]("notificationBar").description("").optional,
        queryParam[String]("lastReminded").description("").optional,
        queryParam[String]("lastTracked").description("").optional,
        queryParam[String]("createdAt").description("").optional,
        queryParam[String]("updatedAt").description("").optional,
        queryParam[Int]("limit").description("").optional,
        queryParam[Int]("offset").description("").optional,
        queryParam[String]("sort").description("").optional)
  )

  get("/trackingReminders",operation(trackingRemindersGetOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
        
      
      val clientId = params.getAs[String]("clientId")
            

    
    println("clientId: " + clientId)
  
    
    
        
      
      val userId = params.getAs[Int]("userId")
            

    
    println("userId: " + userId)
  
    
    
        
      
      val variableId = params.getAs[Int]("variableId")
            

    
    println("variableId: " + variableId)
  
    
    
        
      
      val popUp = params.getAs[Boolean]("popUp")
            

    
    println("popUp: " + popUp)
  
    
    
        
      
      val sms = params.getAs[Boolean]("sms")
            

    
    println("sms: " + sms)
  
    
    
        
      
      val email = params.getAs[Boolean]("email")
            

    
    println("email: " + email)
  
    
    
        
      
      val notificationBar = params.getAs[Boolean]("notificationBar")
            

    
    println("notificationBar: " + notificationBar)
  
    
    
        
      
      val lastReminded = params.getAs[String]("lastReminded")
            

    
    println("lastReminded: " + lastReminded)
  
    
    
        
      
      val lastTracked = params.getAs[String]("lastTracked")
            

    
    println("lastTracked: " + lastTracked)
  
    
    
        
      
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

  

  val trackingRemindersPostOperation = (apiOperation[Inline_response_200_23]("trackingRemindersPost")
      summary "Store TrackingReminder"
      parameters(queryParam[String]("accessToken").description("").optional,
        bodyParam[TrackingReminder]("body").description("").optional)
  )

  post("/trackingReminders",operation(trackingRemindersPostOperation)) {
    
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[TrackingReminder]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val trackingRemindersIdGetOperation = (apiOperation[Inline_response_200_23]("trackingRemindersIdGet")
      summary "Get TrackingReminder"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  get("/trackingReminders/{id}",operation(trackingRemindersIdGetOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

  

  val trackingRemindersIdPutOperation = (apiOperation[Inline_response_200_2]("trackingRemindersIdPut")
      summary "Update TrackingReminder"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional,
        bodyParam[TrackingReminder]("body").description("").optional)
  )

  put("/trackingReminders/{id}",operation(trackingRemindersIdPutOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
    
    
                
bodyParam[TrackingReminder]("body").description("").optional
    
    println("body: " + body)
  
  }

  

  val trackingRemindersIdDeleteOperation = (apiOperation[Inline_response_200_2]("trackingRemindersIdDelete")
      summary "Delete TrackingReminder"
      parameters(pathParam[Int]("id").description(""),
        queryParam[String]("accessToken").description("").optional)
  )

  delete("/trackingReminders/{id}",operation(trackingRemindersIdDeleteOperation)) {
    
    
    
      val id = params.getOrElse("id", halt(400))
                

    
    println("id: " + id)
  
    
    
        
      
      val accessToken = params.getAs[String]("accessToken")
            

    
    println("accessToken: " + accessToken)
  
  }

}