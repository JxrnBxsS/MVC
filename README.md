# MVC
English
Requirements:
1) Write a program using the MVC (Model-View-Controller) Design Pattern or a similar concept in any programming language.
2) The program simulates receiving a singer’s voice, with an interface for entering: Song name, Song duration (in seconds), Singer(s) name (up to 3 singers, names must be in English) Once the data is entered, the program will display the song’s score and store all the information. (The data can be stored in any format, such as Relational Databases (SQL-based), NoSQL Databases, JSON File / CSV File or Any other suitable method) Security aspects do not need to be considered.
3) Create separate models based on the number of singers. If there is only one singer, calculate the score using the formula: (Total duration of all previous songs sung before this one) % 100
4) If there are two singers, calculate the score using the formula: (Song duration × Total number of characters in both singers' names) % 100
5) If there are three singers, calculate the score using the formula: (Total number of characters in all previous singers' names × Total number of characters in the current singers' names) % 100

My Result:
MVC = 40/50, Requirement = 21/30, Code quality = 20/20 --> Total = 81/100
The separation of MVC is quite well done. The Model can still be further separated according to the requirements. The requirements are partially clear, but the Model was not separated as instructed in the problem statement. The code is clean, with well-named variables.

--------------------------------
ภาษาไทย
ความต้องการของโจทย์
1) เขียนโปรแกรมโดยใช้แนวคิด MVC (Model-View-Controller) Design Pattern หรือแนวคิดอื่น ๆ ที่คล้ายคลึง โดยใช้ภาษาโปรแกรมใดก็ได้เขียนโปรแกรมโดยใช้แนวคิด MVC (Model-View-Controller)
Design Pattern หรือแนวคิดอื่น ๆ ที่คล้ายคลึง โดยใช้ภาษาโปรแกรมใดก็ได้
2) โปรแกรมจะจําลองการรับเสียงร้องของคน โดยจําลองหน้าจอรับชื่อเพลง ระยะเวลาของเพลง (หน่วยเป็นวินาที) และชื่อคนร้องไม่เกิน 3 คนเป็นภาษาอังกฤษ เมื่อใส่ข้อมูลแล้วจะแสดงคะแนนของเพลงนั้น และเก็บ
ข้อมูลทั้งหมดไว้ สามารถเก็บอย่างไรก็ได้ (ฐานข้อมูลจําลองสามารถใช้งานได้ทั้งฐานข้อมูลแบบ Relational หรือ NOSQL หรือ JSON File หรือ CSV File หรือวิธีการอื่น ๆ ขึ้นอยู่กับความถนัด แต่ต้องมีโครงสร้างของ
ข้อมูลครบถ้วนตามที่โจทย์กําหนดให้) โดยนักศึกษาไม่จําเป็นต้องคํานึงถึงหลักความปลอดภัยใด ๆ ของระบบ
3) ให้สร้างโมเดลแยกกันตามจํานวนคนร้อง หากคนร้องมีเพียงคนเดียว ให้คํานวณคะแนนเท่ากับ (จํานวนวินาทีที่ร้องเพลงมาก่อนหน้าเพลงนี้ทั้งหมดรวมกัน % 100)
4) หากคนร้องมีสองคน ให้คํานวณคะแนนเท่ากับ (ระยะเวลาของเพลงนี้x จํานวนตัวอักษรของชื่อคนร้องทั้งคู่ในรอบนี้รวมกัน) % 100
5) หากคนร้องมีสามคน ให้คํานวณคะแนนเท่ากับ (จํานวนตัวอักษรของชื่อคนร้องก่อนหน้านี้ทั้งหมด x จํานวนตัวอักษรของชื่อคนร้องทั้งหมดในรอบนี้) % 100

ผลสรุป:
MVC = 40/50, ความต้องการของโจทย์ = 21/30, คุณภาพของโค้ดโปรแกรม = 20/20 --> รวม = 81/100
แยกส่วน MVC ทำได้ค่อนข้างดี Model ยังสามารถแยกออกมาตาม requirement ได้อีก เคลียร์ Requirement ได้ระดับหนึ่ง แต่ไม่ได้สร้าง Model แยกกันตามที่โจทย์สั่ง โค้ดสะอาด มีการตั้งชื่อตัวแปรที่ดี
