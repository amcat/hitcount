#!/bin/bash
current_version=$(echo -n $(grep -oP "<version>\K([0-9\.]+)" pom.xml))

echo "Current version: $current_version"
read -p "New version [$current_version]: " new_version
new_version=${new_version:-${current_version}}
echo "Upgrading pom.xml, README.md and plugin-descriptor.properties"
sed -i "s/${current_version}/${new_version}/g" README.md pom.xml plugin-descriptor.properties
