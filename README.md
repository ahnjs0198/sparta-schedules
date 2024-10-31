# API 명세서

---

##  Schedules

### 1. Get

| Method | URL        | descripe        |
|:------:|------------|:----------------|
|  GET   | /schedules | 전체 일정을 가지고 옵니다. |


전체 일정을 가지고 옵니다.

**Response**
```json=
{
    schedules:[
        {
            id:"[id]",
            todo:"[할일]",
            name:"[작성자명]",
            password:"[비밀번호]",
            date:"[작성/수정일]"
        }
        ...
    ]
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 목록 가져오기 성공 |
| 400  | 목록 가져오기 실패 |
| 401  |     권한 없음      |




---
### 2. Get

| Method | URL             | descripe         |
|:------:|-----------------|:-----------------|
|  GET   | /schedules/{id} | 선택한 일정을 가지고 옵니다. |

 
선택한 일정을 가지고 옵니다.

**Response**
```json=
{     
    id:"[id]",
    todo:"[할일]",
    name:"[작성자명]",
    password:"[비밀번호]",
    date:"[작성/수정일]"   
}
```

| Code | Description |
|:----:|:-----------:|
| 200  | 일정 가져오기 성공  |
| 400  | 일정 가져오기 실패  |
| 401  |    권한 없음    |




---
### 2. Post

| Method | URL        | descripe                         |
|:------:|------------|:---------------------------------|
|  POST  | /schedules | Request를 보내면 그에 맞게 일정 DB에 추가합니다. |

**Request**
```json=
{
    todo:"[일정]",
    name:"[작성자명]",
    password:"[비밀번호]",
    date:"[작성일]"
}
```
일정을 새로 추가합니다.

**Response**
```json=
{
    id:"[id]",
    state:"[state]"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 등록 성공   |
| 400  |  일정 등록 실패   |
| 401  |    권한 없음    |


---
### 3. Patch

| Method | URL        | descripe                              |
|:------:|------------|:--------------------------------------|
| Patch  | /schedules | Request 를 보내면 그에 맞게 일정 DB에 정보를 변경합니다. |

**Request**
```json=
{
    id:"[일정 id]",
    todo:"[일정]",
    name:"[작성자명]",
    password:"[비밀번호]",
    date:"[수정일]",
}
```
일정을 변경합니다.

**Response**
```json=
{
    state:"[state]"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 변경 성공   |
| 400  |  일정 변경 실패   |
| 401  |    권한 없음    |


---
### 4. Delete

| Method | URL        | descripe                               |
|:------:|------------|:---------------------------------------|
| Delete | /schedules | Request 를 보내면 그에 맞게 일정 DB에서 정보를 삭제합니다. |

**Request**
```json=
{
    id:"[id]"
}
```
일정을 삭제합니다.

**Response**
```json=
{
    state:"[state]"
}
```

| Code | Description |
|:----:|:-----------:|
| 200  |  일정 삭제 성공   |
| 400  |  일정 삭제 실패   |
| 401  |    권한 없음    |


---