export class Flight{
    id!:number;
    fromlocation!:string;
    tolocation!:string;
    totalseats!:number;
    price!:number;
    date!:string;
    constructor(
        id:number,
        fromlocation:string,
        tolocation:string,
        totalseats:number,
        price:number,
        date:string,
    ){}

    
}