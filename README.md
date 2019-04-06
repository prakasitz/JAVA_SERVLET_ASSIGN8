# JAVA_SERVLET_ASSIGN8
week9_MVC
## >> รายละเอียด <<

## my.model
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| Users.java |  [Users.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/model/Users.java) | เป็น model ที่เป็นตัวสำหรับดึง DB ของ Users  |
| Subjects.java |    [Subjects.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/model/Subjects.java)   | สำหรับการดึง DB ของ Subjects |

## my.DB
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| UserDB.java |  [Users.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/db/UserDB.java) | จำลองฐานข้อมูลของ Users |
| SubjectDB.java |    [Subjects.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/db/SubjectDB.java)   | ำลองฐานข้อมูลของ Subjects |


## my.controller
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| LoginServlet.java |  [LoginServlet.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/controller/LoginServlet.java) | ใช้ในการ check user ที่ login และ set เข้าไปใน session พร้อม set subjectList เข้าไปใน session ด้วย |
| AddSubjectServlet.java |    [AddSubjectServlet.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/controller/AddSubjectServlet.java)   | เมื่อกด register จะทำมาหน้านี้ และจะทำการดึง obj ของรายการนั้นออกมา เพื่อ add เข้าสู่ session regist |
| DeleteSubjectServlet.java | [DeleteSubjectServlet.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/controller/DeleteSubjectServlet.java) | (การบ้าน) เมื่อกด remove ในหน้า summary จะทำการ ลบ obj ออกจาก array แล้ว set เข้า session regist ใหม่ |
