FROM openjdk:8-jdk
# Use JDK 8 for CORBA compatibility
WORKDIR /app
COPY . /app

# Generate Java bindings from IDL
RUN idlj -fall Hello.idl

# Compile all Java files including generated stubs/skeletons
RUN javac *.java HelloApp/*.java

# Start the CORBA server
CMD ["java", "HelloServer"]
