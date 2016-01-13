# default-kesession

Empty kmodule.xml KieModule on the classpath that includes all resources in a single default KieBase. The example shows the retrieval of the default KieSession from the classpath.


# named-kiesession

kmodule.xml that has one named KieBase and one named KieSession. The examples
shows the retrieval of the named KieSession from the classpath.


# kiebase-inclusion

'kmodule.xml' demonstrates that one KieBase can include the resources from another KieBase, from another KieModule. In this case it inherits the named KieBase from the 'name-kiesession' example. The included KieBase can be from the current KieModule or any other KieModule that is in the pom.xml dependency list.

依赖：named-kiesession。


# multiple-kbases

Demonstrates that the 'kmodule.xml' can contain any number of KieBase or KieSession declarations. Introduces the 'packages' attribute to select the folders for the resources to be included in the KieBase.

kmodule.xml produces 6 different named KieBases. 'kbase1' includes all resources from the KieModule. The other KieBases include resources from other selected folders, via the 'packages' attribute. Note the use of wildcard '*', to select this package and all packages below it.


# kcontainer-from-repository

The project does not contain a kmodule.xml, nor does the pom.xml have any dependencies for other KieModules. Instead the Java code demonstrates the loading of a dynamic KieModule from a Maven repository.


# default-kiesession-from-file

Dynamic KieModules can also be loaded from any Resource location. The loaded KieModule provides default KieBase and KieSession definitions.

No kmodue.xml file exists.

依赖：default-kiesession。


# kie-module-form-multiple-files

Programmatically provide the list of dependant KieModules, without using Maven to resolve anything.

Creates two resources. One is for the main KieModule 'exRes1' the other is for the dependency 'exRes2'. Even though kie-ci is not present and thus Maven is not available to resolve the dependencies, this shows how you can manually specify the dependent KieModules, for the vararg.

No kmodue.xml file exists.

依赖：named-kiesession、kiebase-include。