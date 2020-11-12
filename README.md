# Maven Run

This is a plain project showing how to run maven tests on initialisation of a docker image.

# Motivation

Originally, I wanted a cron job to perform the rask of running the tests. Although, that worked, I also needed another way just in case, so here it is. Sometimes you just need to run the tests in the container and not as part of the pipeline, so heres an example how to do it.

# Prerequisites

Just docker installed on your host machine.

# Process

We need to build image which will run the tests then run the container to confirm the output of the tests is created.

To build do the following:

```console
$ docker build -t startshell .
```

Which will create an image named startshell.
The final part of buil process runs the shell script which simple runthe maven command.

To verify that the test has run you can run the container and check the target directory contents for the surefire output.

```console
$ docker run -it --name testcon startshell sh
```

Job Done!
