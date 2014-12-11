//
//  ApiSignature.java
//  ApiSignaturePlugin
//
//  Created by Dmitriy Devayev on 12/10/2014.
//
//

package com.setlevel.apisignature;

import org.apache.cordova.*;

import org.json.JSONArray;
import org.json.JSONException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CDVApiSignature extends CordovaPlugin {
	String secretKey = "Secret_Key";
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("createApiSignature")) {
            String message = args.getString(0);
            this.createApiSignature(message, callbackContext);
            return true;
        }
        return false;
    }

    private void createApiSignature(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
        	message = message + secretKey;
        	
        	MessageDigest md;
			try {
				md = MessageDigest.getInstance("SHA-256");
				
				md.update(message.getBytes());
				
				byte byteData[] = md.digest();
				 
		        //convert the byte to hex format method 1
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < byteData.length; i++) {
		        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		        }
		        
		        callbackContext.success(sb.toString());
		        
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
