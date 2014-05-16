import com.grails.security.userroles.*

class BootStrap {

    def init = { servletContext ->
	
		System.out.println("before adding new humans with cors");
		new grailsapp.Human(name:"Ganesh1", address:"404 happy valley1").save(flush: true);
		new grailsapp.Human(name:"Ganesh2", address:"404 happy valley2").save(flush: true);
		new grailsapp.Human(name:"Ganesh3", address:"404 happy valley3").save(flush: true);
		System.out.println("after adding new humans");
		
		
		System.out.println("before adding user and role for grails security");
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def testUser = new User(username: 'basicuser', password: 'basicpassword').save(flush: true)
		UserRole.create testUser, adminRole, true
		System.out.println("after adding user and role for grails security");
    }
    def destroy = {
    }
}
