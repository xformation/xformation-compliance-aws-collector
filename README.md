# xformation-compliance-aws-collector
collector for AWS compliance data

1. to create jar with all dependency we have to fire command
mvn package
2. After that you will find two jar files into /target folder 
one is xform-aws-cli-0.0.1-SNAPSHOT-jar-with-dependencies.jar and another one is xform-aws-cli-0.0.1-SNAPSHOT.jar
3. TO get All vpc fire command
java -jar xform-aws-cli-0.0.1-SNAPSHOT-jar-with-dependencies.jar vpcs
4. To get Particular vpc or vpc By Id 
java -jar xform-aws-cli-0.0.1-SNAPSHOT-jar-with-dependencies.jar vpc <enter vpc id>

 
