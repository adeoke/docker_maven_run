FROM maven:3.6.3-openjdk-8

WORKDIR /usr/src

COPY simpletest/pom.xml .
COPY test.sh .
COPY simpletest/src src

RUN chmod 777 /usr/src
RUN chmod +x test.sh

RUN ./test.sh
