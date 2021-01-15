# mavenstuff

Simple maven multi module project.
Core module includes one class, which have only one method and test for it (simply checks returned value)
Helloworld module includes one class with main, which imports ru.gurchiy.Core from local m2 repo and get number from class instance.

to start this project print:
```mvn clean compile assembly:single```

also ```mvn checkstyle:checkstyle``` command generates strange checkstyle result in target/site/checkstyle.html

## problems


all additional tasks
