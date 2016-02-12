import com.wordnik.client.api._
import akka.actor.ActorSystem
import io.swagger.app.{ResourcesApp, SwaggerApp}
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new SwaggerApp

  override def init(context: ServletContext) {
    implicit val system = ActorSystem("appActorSystem")
    try {
      context mount (new VariableUserSourceApi, "/VariableUserSource/*")
      context mount (new MeasurementApi, "/Measurement/*")
      context mount (new TrackingReminderApi, "/TrackingReminder/*")
      context mount (new VariableApi, "/Variable/*")
      context mount (new UpdateApi, "/Update/*")
      context mount (new AggregatedCorrelationApi, "/AggregatedCorrelation/*")
      context mount (new ConnectorApi, "/Connector/*")
      context mount (new CommonVariableRelationshipApi, "/CommonVariableRelationship/*")
      context mount (new CorrelationApi, "/Correlation/*")
      context mount (new ConnectionApi, "/Connection/*")
      context mount (new UnitApi, "/Unit/*")
      context mount (new UserVariableApi, "/UserVariable/*")
      context mount (new SourceApi, "/Source/*")
      context mount (new VariableCategoryApi, "/VariableCategory/*")
      context mount (new UserVariableRelationshipApi, "/UserVariableRelationship/*")
      context mount (new ApplicationEndpointsApi, "/ApplicationEndpoints/*")
      context mount (new CredentialApi, "/Credential/*")
      context mount (new UnitCategoryApi, "/UnitCategory/*")
      context mount (new VoteApi, "/Vote/*")
      
      context mount (new ResourcesApp, "/api-docs/*")
    } catch {
      case e: Throwable => e.printStackTrace()
    }
  }
}