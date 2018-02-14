# DonateZEN_Hello 
ลิงก์วิด๊โอ https://www.youtube.com/watch?v=tzwS6KFJM0w&feature=youtu.be

# สิ่งที่จำเป็นต้องมี
 - Apache Tomcat
 - Apache Maven
 - MySQL 
 
# SQL Script

```bash
 CREATE TABLE CollectWord
 (
 idCollectWord INT NOT NILL AUTO_INCREMENT  PRIMARY KEY, 
 word VARCHAR(255)
 );
 
 INSERT INTO CollectWord('word') VALUES ('HelloWorld'); 
```

 
# สิ่งที่ควรทำก่อนการ Deploy
Clone โปรเจคแล้ว สร้างไฟล์ config.properties ใน /src/main/resources 
```bash
DONATEZEN_URL= //ที่อยู่ของฐานข้อมูล
DONATEZEN_PORT = //Port ของการเข้าฐานข้อมูลนั้น 
DONATEZEN_DBNAME = //ชื่อ Schema 
DONATEZEN_USR = // ชื่อผู้ใช้ของฐานข้อมูล
DONATEZEN_PAS = //รหัสผ่านของฐานข้อมูล
```

# สมาชิกในกลุ่ม 
```bash
58130500006 นาย อภิวิชญ์ บุญประเสริฐ
58130500045 นาย นวัช สมนึก
58130500046 นางสาว นัทธมน หวังอัครโรจน์
58130500052 นางสาว ปวีณา ศรีปัญญา
58130500060 นางสาว มัลลิกา กระเป๋าทอง
58130500072 นางสาว ศิวาพร เสน่หา
```
