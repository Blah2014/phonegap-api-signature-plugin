phonegap-api-signature-plugin
=============================

Implementation of the SHA-256

<h2>Supported platforms</h2>
<ul>
  <li>iOS</li>
  <li>Android</li>
</ul>

<h2>Installation</h2>

<h5>Cordova CLI</h5>
```
cordova plugin add com.setlevel.apisignature
```
or
```
cordova plugin add https://github.com/Blah2014/phonegap-api-signature-plugin
```

<h5>Phonegap CLI</h5>
```
phonegap local plugin add https://github.com/Blah2014/phonegap-api-signature-plugin
```

<h5>plugman CLI</h5>
```
plugman --platform ios --project ./platforms/ios --plugin https://github.com/Blah2014/phonegap-api-signature-plugin
```

## Usage
```
<script>
    ApiSignature.createApiSignature(str, function(sig){
      alert('Signature: ' + sig)
    });
</script>
```
## Insert ApiSignature Secret_Key
###### iOS
In CDVApiSignature.m replace "Secret_Key" with your Secret_Key from API.

###### Android
In CDVApiSignature.java replace "Secret_Key" with your Secret_Key from API.
