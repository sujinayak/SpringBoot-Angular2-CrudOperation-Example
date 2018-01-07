import { Component, OnInit} from '@angular/core';
import { CustomerService } from '../service/customer.service';

@Component({
  moduleId:module.id,
  selector: 'customer',
  templateUrl: 'customer.component.html', 

  providers:[CustomerService]
})
export class CustomerComponent {

  name :String ; 
 products:String;
email :String ;
address :address; 
payment:number;
pointSale:number;
order: number;
cust : customer;
cust1 : customer[];
isEdit : boolean;
isadd : boolean;


constructor(private customerService:CustomerService)
{ 
  this.isEdit = false,
  this.cust={
    id : '',
    name : '',
    products:'',
    email :'' ,
    payment:0,
    pointSale:0,  
    order: 0    
  }
 // this.getAllCustomers();
   }
     ngOnInit(){
      this.getAllCustomers();
     }; 

   addCustomer()
{
  this.isEdit = false;
this.customerService.addCustomerInfo(this.cust);

this.getAllCustomers();

console.log((this.cust));
}

updateCustomer () {
  this.customerService.updateCustomerInfo(this.cust);
  this.isEdit = false;
  this.cust={
    id : '',
    name : '',
    products:'',
    email :'' ,
    payment:0,
    pointSale:0,  
    order: 0    
  }
}

getAllCustomers () {
  this.customerService.getAllCustomerInfo().subscribe(cust1=>
    {
      this.cust1 = cust1;
    }
  );
}


deleteCustomer (cu) {
  console.log(cu);
  this.customerService.deleteCustomer(cu);
  this.getAllCustomers();
  this.cust={
    id : '',
    name : '',
    products:'',
    email :'' ,
    payment:0,
    pointSale:0,  
    order: 0    
  }
}

editCustomer (cu) {
 this.cust = cu;
 this.isEdit = true;
  console.log(cu); 
}
}

interface address{
  street:String;
  city:String;
  state:String;
}
  
interface customer{

id:String;
name :String ; 
products:String;
email :String ; 
payment:number;
pointSale:number;
order: number;  
}
