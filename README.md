phonegap-api-signature-plugin
=============================

This plugin provides an implementation of the (SHA-1, SHA-224, SHA-256, SHA-384, and SHA-512)

<h5>Important</h5>
Android do not support SHA-224

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
// SHA-1
<script>
    ApiSignature.createApiSignature(str, 'sha-1', function(sig){
      alert('Signature: ' + sig)
    });
</script>

// SHA-224
<script>
    ApiSignature.createApiSignature(str, 'sha-224', function(sig){
      alert('Signature: ' + sig)
    });
</script>

// SHA-256
<script>
    ApiSignature.createApiSignature(str, 'sha-256', function(sig){
      alert('Signature: ' + sig)
    });
</script>

// SHA-384
<script>
    ApiSignature.createApiSignature(str, 'sha-384', function(sig){
      alert('Signature: ' + sig)
    });
</script>

// SHA-512
<script>
    ApiSignature.createApiSignature(str, 'sha-512', function(sig){
      alert('Signature: ' + sig)
    });
</script>
```
## Insert ApiSignature Secret_Key
###### iOS
In CDVApiSignature.m replace "Secret_Key" with your Secret_Key from API.

###### Android
In CDVApiSignature.java replace "Secret_Key" with your Secret_Key from API.
