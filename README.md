Introduction
Thank you for downloading this release of the Java Platform, Standard Edition Development Kit (JDK). The JDK is a development environment for building applications and components using the Java programming language.

The JDK includes tools useful for developing, testing, and monitoring programs written in the Java programming language and running on the Java platform.

Installation
Installation instructions are located on the Java SE documentation site.

JDK Documentation
The on-line Java Platform, Standard Edition (Java SE) Documentation contains API specifications, feature descriptions, developer guides, reference pages for JDK tools and utilities, and links to related information. The Java SE documentation is also available in a download bundle which you can install on your machine. To obtain the documentation bundle visit the Java SE download page. For API documentation, refer to the The Java Platform, Standard Edition API Specification. This documentation provides brief descriptions of the API with an emphasis on specifications, not on code examples

Release Notes
See the Release Notes for additional information pertaining to this release. Please check the on-line release notes for the latest information as they will be updated as needed.

Compatibility
See the JDK 17 Migration Guide for a list of known compatibility issues. Every effort has been made to support programs written for previous versions of the Java platform. Although some incompatible changes were necessary, most software should migrate to the current version with no changes. Most failures to do so are considered bugs, except for a small number of cases where compatibility was deliberately broken, as described on our compatibility web page. Some compatibility-breaking changes were required to close potential security holes or to fix implementation or design bugs.

Bug Reports and Feedback 
The JDK Bug Database web site lets you search for and examine existing bug reports, submit your own bug reports, and tell us which bug fixes matter most to you. To directly submit a bug or request a feature, fill out this form:

http://bugreport.java.com/bugreport/

You can send feedback to the Java SE documentation team.

Please do not seek technical support through the Bug Database or our development teams. For support options, see Support and Services on Oracle Support web site.

Contents of the JDK
This section contains a general summary of the files and directories in the JDK.

Executables
(In the bin/ subdirectory) An implementation of the Java Runtime Environment (JRE). The JRE includes a Java Virtual Machine (JVM™), class libraries, and other files that support the execution of programs written in the Java programming language. This directory also includes tools and utilities that will help you develop, execute, debug, and document programs written in the Java programming language. For further information, see the JDK 17 tools specification at https://docs.oracle.com/en/java/javase/17/docs/specs/man/index.html

Configuration files
(In the conf/ subdirectory) Files that contain user-configurable options. Files in this directory can be edited to change the JDK's access permissions, configure security algorithms, and set the Java Cryptography Extension Policy Files which might be used to limit the JDK's cryptographic strength.

C header Files
(In the include/ subdirectory) C-language header files that support native-code programming with the Java Native Interface and the Java Virtual Machine (JVM) Debugger Interface.

Compiled Java Modules
(in the jmods/ subdirectory) Compiled modules used by jlink to create custom runtimes.

Copyright and License files
(in the legal/ subdirectory) License and copyright files for each module. Includes third party notices as .md (markdown)files.

Additional Libraries
(In the lib/ subdirectory) Additional class libraries and support files required by the JDK. These files are not intended for external use.

Configuration
Configuring the JRE or JDK is not considered a modification for redistribution purposes.

You may configure the software by modifying the files under the conf/ directory as per the Java Platform, Standard Edition (Java SE) Documentation, including selecting one or creating your own Java Cryptography Extension policy file under conf/security/policy. Once you select or create your own you are not required to include alternative policy files.

Root CA certificates may be added to or removed from the Java SE certificate file located in lib/security/cacerts through the use of the keytool utility available in the bin/ subdirectory of the JDK.

You may update the Timezone data included in the Java Runtime Environment by using the Java Time Zone Updater tool available in the Java SE Downloads page.

Unlimited Strength Java Cryptography Extension
The default JCE policy files bundled in this Java Runtime Environment allow for "unlimited" cryptographic strengths. 

For convenience, this software also contains the historic "limited" strength policy files which restricts cryptographic strengths.  To use the limited strength policy, instead of the default unlimited policy, you must update the "crypto.policy" Security property (in /conf/security/java.security) to point to the appropriate directory.

You are advised to consult your export/import control counsel or attorney to determine the exact requirements of your location, and what policy settings should be used.
