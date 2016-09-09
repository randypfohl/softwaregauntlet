
# EXECUTING AUTOMATED TESTS
(requires Java 8 JDK)
~~~
.\gradlew.bat clean [test suite] -Penv=[environment] -Pbrowser=[browser]"
~~~
For example:
~~~
".\gradlew.bat clean evt -Penv=dev -Pbrowser=ie"
~~~
'Environment' argument is optional, defaulting to "local"  
'Browser' argument is optional, defaulting to "chrome"  
  
##Supported TEST SUITES
(can be found in the build.gradle file)
  
* debug  
    * Debugging of tests under development
    * Test 'group' annotation - TestType.DEV

* bvt
    * Build Verification (primarily local execution)
    * Test 'group' annotation - TestType.EVT and TestType.DEV
    
* evt
    * Environment Validation (verifies deployed build is testable)
    * Test 'group' annotation - TestType.EVT

* sprint
    * Sprint Validation (committed user stories are acceptable)
    * Test 'group' annotation - TestType.SPRINT
    
* regression
    * All tests executed
    * Test 'group' annotation - N/A
    
* release
    * Build is releasable
    * Test 'troup' annotation - TestType.RELEASE
    
* production
    * Only tests appropriate for 'Production' execution
    * Test 'group' annotation - TestType.PRODUCTION

##Supported ENVIRONMENTS

* n/a
    * Local Machine
* dev
    * Development


#DEVELOPING / MAINTAINING AUTOMATED TESTS

   To start from scratch, begin by copying the PowerShell script in the 'setup' directory from the repository to your local machine (only PC/Windows supported at this time).
   This script will perform the following steps to get your system ready for developing test automation
1.  Install PsGet Utils
2.  Install PoshGit
3.  Add PoshGit support to PowerShell Profile


4.  Modify the color of dark-red used in the PowerShell console, because it is too dark to be readable (TO BE IMPLEMENTED)
5.  Install the Java JDK (TO BE IMPLEMENTED)
6.  Set JAVA_HOME (TO BE IMPLEMENTED)
7.  Add JAVA_HOME/bin to PATH (TO BE IMPLEMENTED)
8.  Install latest version of IntelliJ Community edition (TO BE IMPLEMENTED)