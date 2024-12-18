---------------------------
Refered youtube channel: https://www.youtube.com/watch?v=21V0w6pVYLY&t=329s&ab_channel=IntegrationNinjas 

Step 1: Set Up Your AWS EC2 Instance
Launch an EC2 instance with an appropriate AMI (e.g., Amazon Linux 2 or Ubuntu).
Install Docker on your EC2 instance:
bash
Copy code
sudo yum install docker -y    # For Amazon Linux
sudo systemctl start docker
sudo systemctl enable docker
Step 2: Docker file for Your Spring Boot Application
	From eclipse-temurin:17-jdk-alpine
	WORKDIR /app
	COPY target/movie-service.jar movie-service.jar
	EXPOSE 8080
	CMD ["java", "-jar", "movie-service.jar"]

### **Step 3: Update the System in EC2 instance**
sudo yum update -y
cat /etc/os-release
bash
sudo yum install -y \
    gcc \
    libcurl \
    libicu \
    libunwind \
    openssl \
    zlib \
    libuuid
	
Note: skip failed files.
   sudo yum update -y
sudo yum install -y dotnet-runtime-6.0
sudo yum install -y dotnet-sdk-6.0
dotnet --version

Step 4: Create a selft hosted runner for EC2 with Guthub
