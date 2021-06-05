var sayi = 10
let student={id:1, name:"Onur"}
//console.log(student);

function save(puan =10,ogrenci) {
    //console.log(ogrenci.name+" : "+puan)
}
save(undefined,student);

let students = ["Onur Bulut","Hakan Kalaycı","Feyza Durmuş"]

//console.log(students)

let students2 =[student,{id:2, name:"Halit"},
"Kocaeli",{city:"İstanbul"}]

//console.log(students2)

//rest
//params
//varargs
let showProducts= function (id,...products) {
console.log(id)    
console.log(products)
    
}

//console.log(typeof showProducts)

//showProducts(10,["Elma","Armut","Karpuz"])
//rest : paramatreye istediğimiz kadar parametre gönderiyoruz dizi olarak tutuyor
//spread : ayrıştırmak

let points = [1,2,3,4,5,50,60,14]
console.log(...points)
console.log(Math.max(...points))
console.log(..."ABC","D",..."EFG","H")

//Destructuring

let populations = [10000,20000,30000,[40000,100000]]
let [small,medium,high,[veryhigh,maximum]] = populations
console.log(small)
console.log(medium)
console.log(high)
console.log(veryhigh)
console.log(maximum)

function someFunction([small1],number) {
    console.log(small1)
   
}
someFunction(populations)

let category = {id:1,name:"İçecek"}
console.log(category.id)
console.log(category["name"])

let {id,name} = category

console.log(id)
console.log(name)