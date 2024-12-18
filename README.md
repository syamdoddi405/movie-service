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

Here's how you can resolve this and manually install the required dependencies for .NET Core on an Amazon Linux instance:

Step 1: Update the System
Before installing any dependencies, make sure your system is updated:

bash
Copy code
sudo yum update -y
Step 2: Identify Your Amazon Linux Version
To ensure compatibility, verify your Amazon Linux version:

bash
Copy code
cat /etc/os-release
If the output indicates Amazon Linux 2, you can proceed with the steps below.

Step 3: Install .NET Core Dependencies
Manually install the required libraries for .NET Core. Use the commands below to install dependencies for Amazon Linux 2:

bash
Copy code
sudo yum install -y \
    gcc \
    libcurl \
    libicu \
    libunwind \
    openssl \
    zlib \
    libuuid
Step 4: Add the Microsoft Repository
Import the Microsoft GPG key:

bash
Copy code
sudo rpm -Uvh https://packages.microsoft.com/config/amazon/2/packages-microsoft-prod.rpm
Update your package list:

bash
Copy code
sudo yum update -y
Step 5: Install .NET Core Runtime or SDK
Choose the version of .NET Core you need and install it:

Install .NET 6 Runtime:
bash
Copy code
sudo yum install -y dotnet-runtime-6.0
Install .NET 6 SDK:
bash
Copy code
sudo yum install -y dotnet-sdk-6.0
Install Other Versions:
You can find installation commands for other versions (like .NET 7) on the official Microsoft .NET download page.

Step 6: Verify Installation
Once the installation is complete, verify the version of .NET Core installed:

bash
Copy code
dotnet --version
   sudo yum update -y
sudo yum install -y dotnet-runtime-6.0
sudo yum install -y dotnet-sdk-6.0
dotnet --version

Step 4: Create a selft hosted runner for EC2 with Guthub
