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

- (NSString*) sha256:(NSString *)clear;

@end
