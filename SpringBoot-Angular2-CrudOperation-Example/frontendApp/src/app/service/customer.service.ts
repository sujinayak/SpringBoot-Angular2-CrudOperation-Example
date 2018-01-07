import { Injectable } from '@angular/core';
import { Http, Response, Headers, URLSearchParams, RequestOptions } from '@angular/http';
import { CustomerComponent}  from '../components/customer.component';
import 'rxjs/add/operator/map' ;
import { Observable } from 'rxjs';
import 'rxjs/add/operator/catch';

@Injectable()
export class CustomerService  {
    
  
  constructor(private http: Http)
  {  }
  
  addCustomerInfo(customer ) 
  {    
    let headers = new Headers();
    headers.append('Content-Type','application/json');
   return this.http.post('http://localhost:8080/userInfo',JSON.stringify(customer),{headers:headers})
   .toPromise()
   .then(res => res.json());  
  }

  updateCustomerInfo (customer) {
    console.log('cust Name......'+customer.name);
    let headers = new Headers();
    headers.append('Content-Type','application/json');
   return this.http.post('http://localhost:8080/updateUserInfo',JSON.stringify(customer),{headers:headers})
   .toPromise()
   .then(res => res.json()); 
  }

  getAllCustomerInfo()
  {
    console.log('getAllCustomerInfo...initialized...');
    let headers = new Headers();
    headers.append('Content-Type','application/json');

    return this.http.get('http://localhost:8080/getAllcutomers')
    .map(res=>res.json());
  }

  deleteCustomer (customer) {
    console.log('cust Name......'+ customer.name);
    let headers = new Headers();
    headers.append('Content-Type','application/json');
    return this.http.post('http://localhost:8080/deleteCutomer',JSON.stringify(customer),{headers:headers})
    .toPromise();
  }
  
 
}
