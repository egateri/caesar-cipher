### Project Name
Caeser Cipher

### Author
- Name : Eliud Gateri
- Email: egateri@gmail.com
- Student: Moringa School

### About this project
Caeser Cipher Project is developed using [JAVA][1] to create a program to encrypt a message or decrypt a cipher text using a shift key.

[1]: <https://www.java.com/en/> "Java"


### Live Link
 This program is to be run on command line and is not available on live environment.

### BDD
As a user, I would like to;
1. Have an option to choose either to encrypt a message or decrypt a cipher text.
1. Enter a message or cipher text I want to encrypt or decrypt.
1. Enter a shift key I would like to use to encrypt or decrypt the message.
1. Be able to validate the inputs( - ensure the cipher text and the message do not contain special character and that the shift key is an Integer).  
1. Support both lower case and upper case encryption and decryption.
1. Test the program to ensure there are no bugs and the program is running as expected.
1. Seperate the UI (user Experience) and Business Logic.


### Technologies and Languages used
1. Java (JDK 11) 
1. IntelliJ IDEA 
1. Gradle Build Tool 


### Dependencies
1. [JDK 11 Release][1]
1. [IntelliJ IDEA][2]
1. [Gradle Build Tool 8.2][3]

[1]: <https://www.oracle.com/ke/java/technologies/javase/jdk11-archive-downloads.html/> "Java 11"
[2]: <https://www.jetbrains.com/idea/download/?section=linux/> "Intellij IDEA"
[3]: <https://docs.gradle.org/8.2/release-notes.html?_gl=1*zfbn5*_ga*MTU1NjA5MzMwLjE2OTI2ODQ0ODk.*_ga_7W7NC6YNPT*MTY5MjY4NDQ5MC4xLjEuMTY5MjY4NDU4MS41Ny4wLjA/> "Gradle"


### Setup and Installations Instructions

Follow these steps to install and run the project locally on your machine:

Ensure Java is installed on your computer  - JDK 11 or JDK 17:

```bash
java --version
```

Ensure Gradle is installed on your computer:

```bash
 gradle -v
```

Clone the repo and navigate to the project folder:

```bash
git clone https://github.com/egateri/caesar-cipher.git
cd caesar-cipher
```

Build the application using gradle:

```bash
gradle build 
#For linux computers use below command to build the application
./gradlew build  
```

Run the application:

```bash
java -jar build/libs/caesercipher-1.0-SNAPSHOT.jar 

```  
Test the application by following the command prompts

### Dockerize the Application

Follow these steps to dockerize the application and run the image on container environment:

Ensure Docker is installed:

```bash
docker -v
```

Clone the repo and navigate to the project folder:

```bash
git clone https://github.com/egateri/caesar-cipher.git
cd caesar-cipher
```

Build the docker image:

```bash
docker build -t caesercipher:1.0 . 
```

Run the application in a container environment:

```bash
docker run -d  caesercipher:1.0

```  
Test the application by following the command prompts

### Run the Application from IntelliJ IDEA

Follow these steps run the program in Intellij IDEA

Ensure Java is installed on your computer  - JDK 11 or JDK 17:

```bash
java --version
```

Ensure Gradle is installed on your computer:

```bash
 gradle -v
```

Clone the repo and navigate to the project folder:

```bash
git clone https://github.com/egateri/caesar-cipher.git
```

Open the clone project using Intellij IDEA:

Install all the project dependencies by refreshing gradle

Use the run button the test the application.

Test the application by following the command prompts. Enter wrong input types and values


### Contact Information
- Name : Eliud Gateri
- Email: egateri@gmail.com
- Student: Moringa School
- Phone : 0700 XXX 000

###  License and Copyright Information
[MIT](LICENSE)