/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import domain.DomainObject;

/**
 *
 * @author Aleksa
 */
public interface Service {

    public DomainObject findDomainObject(DomainObject domainObject);
    
}
