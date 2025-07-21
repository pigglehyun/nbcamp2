# 📗Spring



[✏️과제 TIL 주소 ](https://sharp-houseboat-a45.notion.site/2-23434f9f370b803b9dbac6894bf91184?source=copy_link)    



## **1. Memo - week2 branch**

- keyword를 활용한 메모 검색

  👉  JPQL을 활용한 Query문 작성

   `@Query("select m from Memo m where m.contents like concat('%',:keyword,'%') order by m.modifiedAt desc ")`

</br>

## **2. Pattern & Validation - week3 branch**

- @Pattern을 활용한 이메일 검사

  👉
   ` @Pattern(regexp = "^[a-zA-z0-9]+" + "@" +"[a-zA-z0-9]+" +"\\." +"[a-zA-z0-9]+$",       
            message = "올바른 이메일 형식을 입력해주세요. ( 예 : ssar01@nate.com )"`

- @Pattern을 활용한 비밀번호 검사

  👉 
`@Pattern(regexp = "^(?=.*[a-zA-Z])" + "(?=.*[0-9])" +                 /"(?=.*[!@#$%^&*])" +"[a-zA-Z0-9!@#$%^&*]{1,15}$",
message = "비밀번호는 숫자, 영문자, 특수 문자(!@#$%^&*)를 포함한 15자 이하여야 합니다.")`

</br>

## **3. 배포하기 -  week4 branch**

  👉 배포 성공
  
<img width="784" height="406" alt="image" src="https://github.com/user-attachments/assets/0b2ae88d-b030-4539-b1be-e86e8e514eaa" />

TODO : CI/CD 구축해보기

