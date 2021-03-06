# Springboot AWS S3 Demo
Sample Springboot application to use Local AWS Profile to access S3. 
## Prerequisites
   1. Install the basic requirements to build any springboot application. ( Java 8 or 11, Maven)  
   2. Set the local aws profile (You can use [cago](https://gitlab.com/electric-it/cago), [Gossamer3](https://github.com/GESkunkworks/gossamer3)). check my [video](www.youtube.com) on how to setup aws profile in local.  
   3. Verify your `C:\Users\<user_name>\.aws\credentials` file. It should look like:

```sh
[default]
aws_access_key_id        = ASIATEXY7LUCWTLQKUT6
aws_secret_access_key    = ZDlnrjXriWa7ieou5PmS3KFI6GYJQ0E6tmHD+ct0
aws_session_token        = FwoGZXIvYXdzEEMaDLqlHgnn0uL3c1IfUCKSAqPSFY2BeEk64aL8Y5FebkMc6dOKo/hwDvDc8Ch..........
aws_security_token       = FwoGZXIvYXdzEEMaDLqlHgnn0uL3c1IfUCKSAqPSFY2BeEk64aL8Y5FebkMc6dOKo/hwDvDc8Ch..........
x_principal_arn          = arn:aws:sts::216344255749:assumed-role/<aws_role>/<aws_user_name>
x_security_token_expires = 2021-03-09T15:58:37+05:30
``` 
   3. Change the `src\main\resources\application.yml` according to your AWS Profile name (above one is `default`).
  
## How to run
1. locate the pom.xml file and run `mvn clean package`
2. run `java -jar target\springboot-s3-demo-0.0.1-SNAPSHOT.jar`
3. Once Springboot application is started, browse: `http://localhost:8080/api/v1/buckets`. This will list all the available buckets in the vpc.
