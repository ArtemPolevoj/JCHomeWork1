FROM bellsoft/liberica-openjdk-alpine:19
COPY /src/main/java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out src/org/example/Main.java
CMD java -classpath ./out org/example/Main