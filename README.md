# JAVA_SERVLET_ASSIGN8
week9_MVC
## >> รายละเอียด <<
## web.xml
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| web.xml |  [web.xml](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/web/WEB-INF/web.xml) | config file มีการใช้ context สำหรับเก็บ max หน่วยกิต  |
## view
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| index.html |  [index.html](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/tree/master/web/index.html) | หน้า login  |
| login_fail.jsp |    [login_fail.jsp](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/tree/master/web/login_fail.jsp)   | ถ้า login ไม่ผ่าน ตัว LoginServlet จะ forward มาหน้านี้ |
| subject_list.jsp |    [subject_list.jsp](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/tree/master/web/subject_list.jsp)   | login สำเร็จ จะ set session User, session subjectlist และมาหน้านี้ เพื่อแสดงรายการวิชาต่างๆ |
| summary.jsp |    [summary.jsp](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/tree/master/web/summary.jsp)   | หน้านี้จะแสดง รายการที่เรากด regist subject ซึ่ง จะอยุใน session แล้ว loop เอามาแสดง |

## my.model
| Main Files   |      Link      |  Description |
|----------|-------------|------|
| Users.java |  [Users.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/model/Users.java) | เป็น model ที่เป็นตัวสำหรับดึง DB ของ Users  |
| Subjects.java |    [Subjects.java](https://github.com/prakasitz/JAVA_SERVLET_ASSIGN8/blob/master/src/java/my/model/Subjects.java)   | สำหรับการดึง DB ของ Subjects |

## my.db
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
