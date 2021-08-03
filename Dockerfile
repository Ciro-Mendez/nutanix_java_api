#Use an existing docker image as a base
FROM centos

#Port to use
EXPOSE 7000

# Install Java.
COPY jdk-8u231-linux-x64.rpm /
RUN rpm -i /jdk-8u231-linux-x64.rpm
# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

#Copy jar file 
COPY ./target/restapi-1.0-SNAPSHOT-jar-with-dependencies.jar .

#Tell the image what to do when it starts as container
CMD ["java","-jar","restapi-1.0-SNAPSHOT-jar-with-dependencies.jar"]
