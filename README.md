
# Animanager Records by [@medzdev](https://www.github.com/medzdev)

That repository stores the Animanager's information records microsservice. The main goal of this application is to manage the operations with records about the animals, caregivers and employees of the company.

The key responsibilities of that service:

- Deploy HTTP endpoints to create, update, read and delete information records of animals, caregivers and employees of the hospital.
- Manage those informations in a persistent structured database.

## Observations
- To run in a persistent database, you should provision it first.
- You should define an application.properties file that suits the project needs. Check the [gist](https://gist.github.com/medzdev/6a3085931a69fe29e3acc888051fe129) to get a copy of that.

## Run Locally

Clone the project

```bash
  git clone https://github.com/medzdev/animanager-records
```

Go to the project directory

```bash
  cd animanager-records
```

Build locally

```bash
  docker build --tag=animanager-records:latest .
```

Run the image in a container

```bash
  docker run --publish 8080:8080 animanager-records
```

## API Reference

### Human records

#### Get all information records stored in the database.

```http
GET /animanager/records/human
```

#### Get an specific record 

```http
GET /animanager/records/human/${id}
```

| Parameter | Type      | Description                                                   |
| :-------- |:----------|:--------------------------------------------------------------|
| `id`      | `UUID`    | **Required**. Id of an individual information record to fetch |


#### Insert a new human record (caregiver/employee)

```http
POST /animanager/records/human
```

| Parameter             | Type           | Description(All of them are Required)                                                                                    |
|:----------------------|:---------------|:-------------------------------------------------------------------------------------------------------------------------|
| `record_role`         | `String(Enum)` | That attribute stores an enum, only accepting `EMPLOYEE` or `CAREGIVER` as a valid value                                 |
| `first_name`          | `String`       | That attribute should receive the person's first name                                                                    |
| `last_name`           | `String`       | That attribute should receive the person's surname                                                                       |
| `phone_number`        | `String`       | That attribute should receive the person's contact phone number                                                          |
| `ssn`                 | `String`       | That attribute should receive the person's social security number  (SSN), for Brazilians, it should store the CPF number |
| `zip_code`            | `String`       | That attribute should receive the person's home postal code                                                              |
| `address_complements` | `String`       | That attribute should receive the person's home additional information, such as house number, unit, building, etc.       |

### Animal Record

### Get all information records stored in the database.

```http
GET /animanager/records/animal
```

#### Get an specific record

```http
GET /animanager/records/animal/${id}
```

| Parameter | Type      | Description                                                   |
|:----------|:----------|:--------------------------------------------------------------|
| `id`      | `UUID`    | **Required**. Id of an individual information record to fetch |

#### Insert a new animal record

```http
POST /animanager/records/animal
```
| Parameter              | Type           | Description(All of them are Required)                                                             |
|:-----------------------|:---------------|:--------------------------------------------------------------------------------------------------|
| `gender;`              | `String(Enum)` | That attribute should receive the animal's gender, only accepting `MALE`, `FEMALE` or `INTERSEX`. |
| `name;`                | `String`       | That attribute should receive the animal's name.                                                  |
| `age;`                 | `String`       | That attribute should receive the animal's age.                                                   |
| `species;`             | `String`       | That attribute should receive the animal's species.                                               |
| `breed;`               | `String`       | That attribute should receive the animal's breed.                                                 |
| ` neutered;`           | `Boolean`      | That attribute should receive the animal's neutered condition, only accpeting `TRUE` or `FALSE`.  |
| `vaccination_records;` | `String`       | That attribute should receive the animal's vaccination record, splitted by `;`.                   |
| `procedures_records;`  | `String`       | That attribute should receive the animal's procedures record, splitted by `;`.                    |
| `caregiver`            | `UUID`         | That attribute should receive the animal's caregiver information record ID.                       |
