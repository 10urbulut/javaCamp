class Customer{

    constructor(id,customerNumber){

    }

}
let customer = Customer(1,"12345");
//prototyping
customer.name="Murat Kurtboğan"
console.log(customer.name)

class IndividualCustomer extends Customer{
constructor(firstName,id,customerNumber){
    super(id,customerNumber)
    this.firstName=firstName
}


}

class CorporateCustomer{

    constructor(companyName)
    
}