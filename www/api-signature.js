//  
//  ApiSignaturePlugin
//
//  Created by Dmitriy Devayev on 12/12/2014.
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