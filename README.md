# GraphqlDemo
## Start project
mvn install
Run project, access localhost:8080/graphiql

## Example of Query
```
query{
  findStudentById(id:1){
    name,
    course{
      name
    }
  }
}
```

## Example of Mutation
```
mutation teacher{
  insert(teacher:{id:2,name:"sssss"}) {
    id,
    name
  }
}
```
