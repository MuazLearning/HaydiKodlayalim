# Mutation
```graphql
mutation {
    createVehicle(vehicle: {
        type: "SW", modelCode: "2019", brandName: "Mercedes"
    })
    {
        id,
        launchDate,
        brandName
    }
}
```
![createVehicle](./img/CreateVehicle.png)

---
# Query

```graphql
query {
    getById(id: 1) {
        id
        type
        modelCode
        brandName
        launchDate
    }
}
```

![createVehicle](./img/GetById.png)

---

```graphql
query {
    getVehicles(type: "SW") {
        id
        modelCode
        brandName
        launchDate
    }
}
```

![createVehicle](./img/GetVehicles.png)

---
```graphql
query {
    getVehicles(type: "S%") {
        id
        modelCode
        brandName
        launchDate
    }
}
```

![createVehicle](./img/GetVehicles2.png)