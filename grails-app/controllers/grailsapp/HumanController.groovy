package grailsapp
import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

@Secured(['ROLE_ADMIN'])
class HumanController extends RestfulController<Human> {

	static responseFormats = ["xml","json"]
	
	HumanController(){
		super(Human)
	}
	
}
