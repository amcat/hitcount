# Hitcount
Hitcount plugin for elasticsearch 2.x

# Building
```bash
mvn clean package
cp target/hitcount-5.4.3.jar hitcount.jar
```

# Upgrading hitcount plugin for new elastic
The upgrade plugin will ask you to enter te new version number of elastic and upgrade the building scripts accordingly.

```bash
./upgrade.sh
```

Make sure to run `git diff`. If it seems alright build the packges and commit the changes. After pushing, please create a new release on [github.com/amcat/hitcount/releases/new](https://github.com/amcat/hitcount/releases/new).

Note: For newer elasticsearch versions, you also need to create a zip file containing the plugin in a folder called 'elasticsearch' (see: releases) and upload it as binary release. This can presumably be automated. 
