# User API Spec

## Register User

- Endpoint: POST /api/users

Request Body:

```json
{
  "username": "kanglerian",
  "password": "lerian123",
  "name": "Lerian Febriana"
}
```

Response Body (Success):

```json
{
  "data": "OK"
}
```

Response Body (Failed):

```json
{
  "errors": "Username must not blank etc."
}
```

## Login User

- Endpoint: POST /api/auth/login

Request Body:

```json
{
  "username": "kanglerian",
  "password": "lerian123",
}
```

Response Body (Success):

```json
{
  "data": {
    "token": "TOKEN",
    "expiredAt": 31231231 // miliseconds
  }
}
```

Response Body (Failed, 401):

```json
{
  "errors": "Username or password wrong"
}
```

## Update User

- Endpoint: PATCH /api/users/current

Request Header:

- X-API-TOKEN: Token (Mandatory)

Request Body:

```json
{
  "username": "kanglerian", // put if only want to update name
  "password": "new password", // put if only want to update password
}
```

Response Body (Success):

```json
{
  "data": {
    "token": "TOKEN",
    "expiredAt": 31231231 // miliseconds
  }
}
```

Response Body (Failed, 401):

```json
{
  "errors": "Username or password wrong"
}
```

## Get User

- Endpoint: GET /api/users/current

Request Header:

- X-API-TOKEN: Token (Mandatory)

Response Body (Success):

```json
{
  "data": {
    "username": "kanglerian",
    "name": "Lerian Febriana"
  }
}
```

Response Body (Failed, 401):

```json
{
  "errors": "Unauthorized"
}
```

## Logout User

- Endpoint: DELETE /api/auth/logout

Request Header:

- X-API-TOKEN: Token (Mandatory)

Response Body (Success):

```json
{
  "data": "OK"
}
```