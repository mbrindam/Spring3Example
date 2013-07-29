package com.mbrindam.samples.services;

import com.mbrindam.samples.webservices.Account;



  
/**  
 * The Interface AccountService.  
 */  
public interface AccountService  
{  
     /**  
      * Gets the account details.  
      *  
      * @param accountNumber the account number  
      * @return the account details  
      */  
     public Account getAccountDetails(String accountNumber);  
}  