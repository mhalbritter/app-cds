# AppCDS

1. Generate the cache file:
   ```shell
   java -XX:ArchiveClassesAtExit=classes.jsa -jar build/libs/cds-test-0.0.1-SNAPSHOT.jar    
   ```
2. Use the cache file:
   ```shell
   java -XX:SharedArchiveFile=classes.jsa -jar build/libs/cds-test-0.0.1-SNAPSHOT.jar
   ```

## Reading

* https://docs.oracle.com/en/java/javase/17/vm/class-data-sharing.html
