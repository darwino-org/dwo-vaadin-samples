GROUPID=com.vaadin.dalvik
VERSION=7.6.3

# -------------------------------------------------------------
# Vaadin Libraries for Dalvik
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-client -Dfile=vaadin-client-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-client-compiled -Dfile=vaadin-client-compiled-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-client-compiler -Dfile=vaadin-client-compiler-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-push -Dfile=vaadin-push-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-server -Dfile=vaadin-server-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-shared -Dfile=vaadin-shared-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-themes -Dfile=vaadin-themes-7.6.3.experimental-dalvik.jar
mvn install:install-file -DgroupId=$GROUPID -Dversion=$VERSION -Dpackaging=jar -DartifactId=vaadin-widgets -Dfile=vaadin-widgets-7.6.3.experimental-dalvik.jar
