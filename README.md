![Logo](https://s3-eu-west-1.amazonaws.com/org.paraio/para.png)
============================

> ### Amazon S3 Storage plugin for Para

[![Maven Central Version](https://img.shields.io/maven-central/v/com.erudika/para-storage-s3)](https://central.sonatype.com/artifact/com.erudika/para-storage-s3)
[![Join the chat at https://gitter.im/Erudika/para](https://badges.gitter.im/Erudika/para.svg)](https://gitter.im/Erudika/para?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## What is this?

**Para** was designed as a simple and modular back-end framework for object persistence and retrieval.
It enables your application to store objects directly to a data store (NoSQL) or any relational database (RDBMS)
and it also automatically indexes those objects and makes them searchable.

This plugin allows Para to store files in Amazon S3.

## Documentation

### [Read the Docs](https://paraio.org/docs)

## Getting started

The plugin is on Maven Central. Here's the Maven snippet to include in your `pom.xml`:

```xml
<dependency>
  <groupId>com.erudika</groupId>
  <artifactId>para-storage-s3</artifactId>
  <version>{see_green_version_badge_above}</version>
</dependency>
```

Alternatively you can download the JAR from the "Releases" tab above put it in a `lib` folder alongside the server
WAR file `para-x.y.z.war`. Para will look for plugins inside `lib` and pick up the S3 plugin.

### Configuration

Here are all the configuration properties for this plugin (these go inside your `application.conf`):
```ini
para.s3.bucket = "org.paraio.us-east-1"
para.s3.max_filesize_mb = 10
```

Finally, set the config property:
```ini
para.fs = "AWSFileStore"
```
This could be a Java system property or part of a `application.conf` file on the classpath.
This tells Para to use the S3 `FileStore` implementation instead of the default one.

### Requirements

- AWS Java SDK v2
- [Para Core](https://github.com/Erudika/para)

## License
[Apache 2.0](LICENSE)
