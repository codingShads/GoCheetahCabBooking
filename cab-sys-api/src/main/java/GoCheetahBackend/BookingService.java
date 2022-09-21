/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheetahBackend;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
    * @author ThileebanS
    */
@WebService(serviceName = "BookingService")
public class BookingService {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "getPERSON")
    public Person getPERSON(@WebParam(name="id") int id) {
        DBConn util = new DBConn();
        return util.getPerson(id);
    }
    
    @WebMethod(operationName = "getpersons")
    public List<Person> getPersons(){
        DBConn util = new DBConn();
        return util.getPersons();
                
    }
    
    @WebMethod(operationName = "authenticate")
    public User authenticate(@WebParam(name="username") String username, @WebParam(name="password")String password){
        DBConn util = new DBConn();
        User user = util.getUser(username);
        
            
        if(user.getPassword() != null && user.getPassword().equals(password)){
            return user;
        }
        return new User();
    }
    
    @WebMethod(operationName = "addperson")
    public boolean addPerson(@WebParam(name="person") Person p){
        DBConn util = new DBConn();
        return util.addPerson(p);
    }
    
    @WebMethod(operationName = "updatePerson")
    public boolean updatePerson(@WebParam(name="person") Person p){
        DBConn util = new DBConn();
        return util.updatePerson(p);
    }
    
    @WebMethod(operationName = "deletePerson")
    public boolean deletePerson(@WebParam(name="id") int id){
        DBConn util = new DBConn();
        return util.deletePerson(id);
    }
}
