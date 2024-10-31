# API 명세서

---

##  Schedular

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
            createdAt:"[작성일]",
            editedAt:"[수정일]"
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
### 2-2. Post

| Method | URL        | descripe                                              |
|:------:| ---------- |:----------------------------------------------------- |
|  POST  | /milestone | Request 를 보내면 그에 맞게 마일스톤 DB에 추가합니다. |

**Request**
```json=
{
    name:"[milestone name]",
    description:"[milestone description]",
    dueDate:"[date]"
}
```
마일스톤을 새로 추가합니다.

**Response**
```json=
{
    id:"[id]",
    state:"[state]"
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 목록 가져오기 성공 |
| 400  | 목록 가져오기 실패 |
| 401  |     권한 없음      |


---
### 2-3. Patch

| Method | URL        | descripe                                                     |
|:------:| ---------- |:------------------------------------------------------------ |
| Patch  | /milestone | Request 를 보내면 그에 맞게 마일스톤 DB에 정보를 변경합니다. |

**Request**
```json=
{
    id:"[milestone id]",
    name:"[milestone name]",
    description:"[milestone description]",
    dueDate:"[date]",
}
```
마일스톤을 변경합니다.

**Response**
```json=
{
    state:"[state]"
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 마일스톤 변경 성공 |
| 400  | 마일스톤 변경 실패 |
| 401  |     권한 없음      |


---
### 2-4. Delete

| Method | URL        | descripe                                                       |
|:------:| ---------- |:-------------------------------------------------------------- |
| Delete | /milestone | Request 를 보내면 그에 맞게 마일스톤 DB에서 정보를 삭제합니다. |

**Request**
```json=
{
    id:"[id]"
}
```
마일스톤을 삭제합니다.

**Response**
```json=
{
    state:"[state]"
}
```

| Code |    Description     |
|:----:|:------------------:|
| 200  | 마일스톤 삭제 성공 |
| 400  | 마일스톤 삭제 실패 |
| 401  |     권한 없음      |


---