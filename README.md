# FDSBooking-Services
Food booking microservices

Food Delivery system data model
--------------------------------

Mongo database using for store the data.

{
    "_id" : ObjectId("5eecb14a7b7fd3492e23b516"),
    "name" : "Krishna",
    "phoneNumber" : "9171146197",
    "email" : "test@mail.com",
    "address" : "Chennai",
    "sex" : "Male",
    "active" : true
}

{
    "_id" : ObjectId("5eecc5207b7fd3492e23b9f5"),
    "name" : "Sapathi",
    "price" : 10.0,
    "foodType" : "Veg"
}


{
    "_id" : ObjectId("5eecc7667b7fd3492e23ba80"),
    "orderDateTime" : ISODate("2020-01-21T10:10:00.000Z"),
    "deliveryDateTime" : ISODate("2020-01-21T10:30:00.000Z"),
    "deliveryPerson" : "Bala",
    "userInfo" : {
        "referenceId" : ObjectId("5eecb14a7b7fd3492e23b516"),
        "userName" : "Krishna",
        "phoneNumber" : "9171146197"
    },
    "orderedItems" : [ 
        {
            "_id" : ObjectId("5eecc5207b7fd3492e23b9f5"),
            "name" : "Idly",
            "price" : 15,
            "foodType" : "Veg"
        }, 
        {
            "_id" : ObjectId("5eecc5207b7fd3492e23b9f5"),
            "name" : "Vadai",
            "price" : 15,
            "foodType" : "Veg"
        }
    ],
    "restarantsInfo" : {
        "referenceId" : ObjectId("5eecb6e67b7fd3492e23b5f8"),
        "name" : "A2B",
        "rating" : "4"
    },
    "rating" : "4",
    "status" : "Ordered"
}

{
    "_id" : ObjectId("5eecb6e67b7fd3492e23b5f8"),
    "name" : "A2B",
    "address" : "Velachery",
    "pincode" : "600042",
    "rating" : "4",
    "active" : true,
    "foodItems" : [ 
        {
            "_id" : ObjectId("5eecc5c07b7fd3492e23ba2b"),
            "name" : "Idly",
            "price" : 10,
            "foodType" : "Veg"
        }, 
        {
            "_id" : ObjectId("5eecc5d07b7fd3492e23ba2e"),
            "name" : "Vadai",
            "price" : 15,
            "foodType" : "Veg"
        }, 
        {
            "_id" : ObjectId("5eecc5fc7b7fd3492e23ba3b"),
            "name" : "FriedRice",
            "price" : 100,
            "foodType" : "Veg"
        }, 
        {
            "_id" : ObjectId("5eecc5207b7fd3492e23b9f5"),
            "name" : "Sapathi",
            "price" : 10,
            "foodType" : "Veg"
        }
    ]
}


{
    "_id" : ObjectId("5eed7f727b7fd3492e23bc95"),
    "orderReferenceId" : ObjectId("5eecc7667b7fd3492e23ba80"),
    "status" : "Booked",
    "paymentType" : "Credit_card",
    "amount" : 100,
    "paymentgateway" : "Amazon"
}
