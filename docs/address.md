# Address API Spec

## Create Address

Endpoint: POST /api/contacts/{idContact}/addresses

Request Header:

- X-API-TOKEN: Token (Mandatory)

Request Body:

```json
{
  "street": "Jl. Cibungkul",
  "city": "Kota Tasikmalaya",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "46151"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "random-string",
    "street": "Jl. Cibungkul",
    "city": "Kota Tasikmalaya",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode": "46151"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Contact is not found"
}
```

## Update Address

Endpoint: PUT /api/contacts/{idContact}/addresses/{idAddress}

Request Header:

- X-API-TOKEN: Token (Mandatory)

Request Body:

```json
{
  "street": "Jl. Cibungkul",
  "city": "Kota Tasikmalaya",
  "province": "Jawa Barat",
  "country": "Indonesia",
  "postalCode": "46151"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "random-string",
    "street": "Jl. Cibungkul",
    "city": "Kota Tasikmalaya",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode": "46151"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Address is not found"
}
```

## Get Address

Endpoint: GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header:

- X-API-TOKEN: Token (Mandatory)

Response Body (Success):

```json
{
  "data": {
    "id": "random-string",
    "street": "Jl. Cibungkul",
    "city": "Kota Tasikmalaya",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode": "46151"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Address is not found"
}
```

## Remove Address

Endpoint: GET /api/contacts/{idContact}/addresses/{idAddress}

Request Header:

- X-API-TOKEN: Token (Mandatory)

Response Body (Success):

```json
{
  "data": {
    "id": "random-string",
    "street": "Jl. Cibungkul",
    "city": "Kota Tasikmalaya",
    "province": "Jawa Barat",
    "country": "Indonesia",
    "postalCode": "46151"
  }
}
```

Response Body (Failed):

```json
{
  "errors": "Address is not found"
}
```

## List Address

Endpoint: GET /api/contacts/{idContact}/addresses

Request Header:

- X-API-TOKEN: Token (Mandatory)

Response Body (Success):

```json
{
  "data": [
    {
      "id": "random-string",
      "street": "Jl. Cibungkul",
      "city": "Kota Tasikmalaya",
      "province": "Jawa Barat",
      "country": "Indonesia",
      "postalCode": "46151"
    }
  ]
}
```

Response Body (Failed):

```json
{
  "errors": "Address is not found"
}
```
