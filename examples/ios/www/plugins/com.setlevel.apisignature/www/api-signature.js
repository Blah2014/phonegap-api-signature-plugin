cordova.define("com.setlevel.apisignature.ApiSignature", function(require, exports, module) { 
    //  
    //  InMobiPlugin
    //
    //  Created by Dmitriy Devayev on 10/8/14.
    //
    //

    var cordova = require('cordova');

    function ApiSignature() {
        var self = this;

        self.createApiSignature = function(str, hmac, callback) {
            cordova.exec(function(signature) {
                callback(signature);
            }, function() {}, "CDVApiSignature", "createApiSignature", [str, hmac]);
        };
    }

    module.exports = new ApiSignature();
});
