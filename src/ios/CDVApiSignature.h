//
//  CDVApiSignature.h
//  ApiSignatureTest
//
//  Created by Dmitriy Devayev on 12/11/14.
//
//

#import <Cordova/CDV.h>

@interface CDVApiSignature : CDVPlugin

- (void)createApiSignature:(CDVInvokedUrlCommand*)command;

- (NSString*) sha1:(NSString *)clear;
- (NSString*) sha224:(NSString *)clear;
- (NSString*) sha256:(NSString *)clear;
- (NSString*) sha384:(NSString *)clear;
- (NSString*) sha512:(NSString *)clear;

@end
