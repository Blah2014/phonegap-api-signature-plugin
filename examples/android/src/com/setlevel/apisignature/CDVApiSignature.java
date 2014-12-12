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
            String hmac = args.getString(1);
            this.createApiSignature(message, hmac, callbackContext);
            return true;
        }
        return false;
    }

    private void createApiSignature(String message, String hmac, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
        	message = message + secretKey;
        	
        	if(hmac.equalsIgnoreCase("sha-1")){
        		callbackContext.success(sha1(message));
        	} else if (hmac.equalsIgnoreCase("sha-224")){
        		callbackContext.success(sha224(message));
            } else if (hmac.equalsIgnoreCase("sha-256")){
            	callbackContext.success(sha256(message));
            } else if (hmac.equalsIgnoreCase("sha-384")){
            	callbackContext.success(sha384(message));
            } else if (hmac.equalsIgnoreCase("sha-512")){
            	callbackContext.success(sha512(message));
            }
			
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
    
    private String sha1(String message) {
    	MessageDigest md;
    	
    	try {
			md = MessageDigest.getInstance("SHA-1");
			
			md.update(message.getBytes());
			
			byte byteData[] = md.digest();
			 
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        
	        return sb.toString();
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "";
	}
    
    private String sha224(String message) {
    	MessageDigest md;
    	
    	try {
			md = MessageDigest.getInstance("SHA-224");
			
			md.update(message.getBytes());
			
			byte byteData[] = md.digest();
			 
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        
	        return sb.toString();
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "Android do not support SHA-224";
		}
    	
	}
    
    private String sha256(String message) {
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
	        
	        return sb.toString();
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "";
	}
    
    private String sha384(String message) {
    	MessageDigest md;
    	
    	try {
			md = MessageDigest.getInstance("SHA-384");
			
			md.update(message.getBytes());
			
			byte byteData[] = md.digest();
			 
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        
	        return sb.toString();
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "";
	}
    
    private String sha512(String message) {
    	MessageDigest md;
    	
    	try {
			md = MessageDigest.getInstance("SHA-512");
			
			md.update(message.getBytes());
			
			byte byteData[] = md.digest();
			 
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	        	sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        
	        return sb.toString();
	        
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return "";
	}
}
