FROM jorgeacf/maven:latest

RUN dnf install -y tree

COPY settings.xml /home/jenkins/settings.xml

COPY settings.xml settings.xml

RUN touch test.txt
