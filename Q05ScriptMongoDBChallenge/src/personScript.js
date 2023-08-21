use person_address_db;

db.createCollection("Person", {
validator: {
$jsonSchema: {
bsonType: "object",
required: ["name", "age", "phone", "height", "email", "cpf", "birthday", "address"],
properties: {
name: { bsonType: "string" },
age: { bsonType: "int" },
phone: { bsonType: "string" },
height: { bsonType: "double" },
email: { bsonType: "string" },
cpf: { bsonType: "string" },
birthday: { bsonType: "date" },
address: {
bsonType: "object",
required: ["zip", "street", "complement", "neighborhood", "city", "state", "country"],
properties: {
zip: { bsonType: "string" },
street: { bsonType: "string" },
complement: { bsonType: "string" },
neighborhood: { bsonType: "string" },
city: { bsonType: "string" },
state: { bsonType: "string" },
country: { bsonType: "string" }
}
}
}
}
}
});

db.createCollection("Address", {
validator: {
$jsonSchema: {
bsonType: "object",
required: ["zip", "street", "complement", "neighborhood", "city", "state", "country"],
properties: {
zip: { bsonType: "string" },
street: { bsonType: "string" },
complement: { bsonType: "string" },
neighborhood: { bsonType: "string" },
city: { bsonType: "string" },
state: { bsonType: "string" },
country: { bsonType: "string" }
}
}
}
});