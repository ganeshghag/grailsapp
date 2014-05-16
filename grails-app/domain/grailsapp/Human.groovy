package grailsapp
import grails.rest.*

@Resource(uri='/humans')
class Human {

    static constraints = {
		name blank: false
		address blank: false
    }
	
	String name;
	String address;
}
