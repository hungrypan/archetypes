## maven-archetype-quickstart

本项目是一个javase的maven项目
项目的pom中添加了maven-archtype-plugin插件用于生成骨架

###### 在项目根目录下执行以下命令,根据本项目生成骨架资源文件

```
mvn archetype:create-from-project
```

###### 修改骨架资源文件

* 修改骨架资源配置文件`target/generated-sources/archetype/src/main/resources/META-INF/maven/archetype-metadata.xml`,
用于创建空文件夹

```xml
<fileSets>
    <fileSet encoding="UTF-8">
      <directory>src/main/java</directory>
      <includes>
        <include>**/*.*</include>
      </includes>
    </fileSet>
    <fileSet encoding="UTF-8">
      <directory>src/main/resources</directory>
      <includes>
        <include>**/*.*</include>
      </includes>
    </fileSet>
    <fileSet encoding="UTF-8">
      <directory>src/test/java</directory>
      <includes>
        <include>**/*.*</include>
      </includes>
    </fileSet>
    <fileSet encoding="UTF-8">
      <directory>src/test/resources</directory>
      <includes>
        <include>**/*.*</include>
      </includes>
    </fileSet>
  </fileSets>
```

###### 修改骨架名称，`/target/generated-sources/archetype/pom.xml`
```
	<groupId>com.github.hungrypan.archetypes</groupId>
	<artifactId>maven-archetype-quickstart</artifactId>
	<version>1.0</version>
	<packaging>maven-archetype</packaging>
	<name>maven-archetype-quickstart</name>
```

  
###### 安装到本地仓库

```
#进入到生成的骨架资源目录下
cd /target/generated-sources/archetype

#安装
mvn install

#更新本地骨架资源库文件
mvn archetype:update-local-catalog
```

###### 使用骨架

```
#输入此命令根据提示选择骨架来创建项目
mvn archetype:generate -DarchetypeCatalog=local

#输入序号选择骨架，回车后根据提示继续
Choose archetype:
1: local -> com.github.hungrypan.archetypes:maven-archetype-webapp (maven-archetype-webapp)
2: local -> com.github.hungrypan.archetypes:maven-archetype-quickstart (maven-archetype-quickstart)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
```


