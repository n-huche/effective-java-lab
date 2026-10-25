# effective-java-lab

Experiments for every item of *Effective Java*, 3rd Edition (Joshua Bloch), written by hand with JUnit 5.

Java 21 · Maven · JUnit Jupiter 5.11

```bash
mvn test
```

Each item has a test class at `src/test/java/effectivejava/chapterNN/ItemNNXxxTest.java`.

## Chapter 2: Creating and Destroying Objects

- **Item 1:** Consider static factory methods instead of constructors — [`Item01StaticFactoryMethodsTest`](src/test/java/effectivejava/chapter02/Item01StaticFactoryMethodsTest.java)
- **Item 2:** Consider a builder when faced with many constructor parameters — [`Item02BuilderTest`](src/test/java/effectivejava/chapter02/Item02BuilderTest.java)
- **Item 3:** Enforce the singleton property with a private constructor or an enum type — [`Item03SingletonTest`](src/test/java/effectivejava/chapter02/Item03SingletonTest.java)
- **Item 4:** Enforce noninstantiability with a private constructor — [`Item04NoninstantiabilityTest`](src/test/java/effectivejava/chapter02/Item04NoninstantiabilityTest.java)
- **Item 5:** Prefer dependency injection to hardwiring resources — [`Item05DependencyInjectionTest`](src/test/java/effectivejava/chapter02/Item05DependencyInjectionTest.java)
- **Item 6:** Avoid creating unnecessary objects — [`Item06UnnecessaryObjectsTest`](src/test/java/effectivejava/chapter02/Item06UnnecessaryObjectsTest.java)
- **Item 7:** Eliminate obsolete object references — [`Item07ObsoleteObjectReferencesTest`](src/test/java/effectivejava/chapter02/Item07ObsoleteObjectReferencesTest.java)
- **Item 8:** Avoid finalizers and cleaners — [`Item08FinalizersAndCleanersTest`](src/test/java/effectivejava/chapter02/Item08FinalizersAndCleanersTest.java)
- **Item 9:** Prefer try-with-resources to try-finally — [`Item09TryWithResourcesTest`](src/test/java/effectivejava/chapter02/Item09TryWithResourcesTest.java)

## Chapter 3: Methods Common to All Objects

- **Item 10:** Obey the general contract when overriding equals — [`Item10EqualsContractTest`](src/test/java/effectivejava/chapter03/Item10EqualsContractTest.java)
- **Item 11:** Always override hashCode when you override equals — [`Item11HashCodeTest`](src/test/java/effectivejava/chapter03/Item11HashCodeTest.java)
- **Item 12:** Always override toString — [`Item12ToStringTest`](src/test/java/effectivejava/chapter03/Item12ToStringTest.java)
- **Item 13:** Override clone judiciously — [`Item13CloneTest`](src/test/java/effectivejava/chapter03/Item13CloneTest.java)
- **Item 14:** Consider implementing Comparable — [`Item14ComparableTest`](src/test/java/effectivejava/chapter03/Item14ComparableTest.java)

## Chapter 4: Classes and Interfaces

- **Item 15:** Minimize the accessibility of classes and members — [`Item15AccessibilityTest`](src/test/java/effectivejava/chapter04/Item15AccessibilityTest.java)
- **Item 16:** In public classes, use accessor methods, not public fields — [`Item16AccessorMethodsTest`](src/test/java/effectivejava/chapter04/Item16AccessorMethodsTest.java)
- **Item 17:** Minimize mutability — [`Item17ImmutabilityTest`](src/test/java/effectivejava/chapter04/Item17ImmutabilityTest.java)
- **Item 18:** Favor composition over inheritance — [`Item18CompositionOverInheritanceTest`](src/test/java/effectivejava/chapter04/Item18CompositionOverInheritanceTest.java)
- **Item 19:** Design and document for inheritance or else prohibit it — [`Item19DesignForInheritanceTest`](src/test/java/effectivejava/chapter04/Item19DesignForInheritanceTest.java)
- **Item 20:** Prefer interfaces to abstract classes — [`Item20InterfacesOverAbstractClassesTest`](src/test/java/effectivejava/chapter04/Item20InterfacesOverAbstractClassesTest.java)
- **Item 21:** Design interfaces for posterity — [`Item21InterfacesForPosterityTest`](src/test/java/effectivejava/chapter04/Item21InterfacesForPosterityTest.java)
- **Item 22:** Use interfaces only to define types — [`Item22InterfacesOnlyForTypesTest`](src/test/java/effectivejava/chapter04/Item22InterfacesOnlyForTypesTest.java)
- **Item 23:** Prefer class hierarchies to tagged classes — [`Item23ClassHierarchiesOverTaggedClassesTest`](src/test/java/effectivejava/chapter04/Item23ClassHierarchiesOverTaggedClassesTest.java)
- **Item 24:** Favor static member classes over nonstatic — [`Item24StaticMemberClassesTest`](src/test/java/effectivejava/chapter04/Item24StaticMemberClassesTest.java)
- **Item 25:** Limit source files to a single top-level class — [`Item25SingleTopLevelClassTest`](src/test/java/effectivejava/chapter04/Item25SingleTopLevelClassTest.java)

## Chapter 5: Generics

- **Item 26:** Don't use raw types — [`Item26RawTypesTest`](src/test/java/effectivejava/chapter05/Item26RawTypesTest.java)
- **Item 27:** Eliminate unchecked warnings — [`Item27UncheckedWarningsTest`](src/test/java/effectivejava/chapter05/Item27UncheckedWarningsTest.java)
- **Item 28:** Prefer lists to arrays — [`Item28ListsOverArraysTest`](src/test/java/effectivejava/chapter05/Item28ListsOverArraysTest.java)
- **Item 29:** Favor generic types — [`Item29GenericTypesTest`](src/test/java/effectivejava/chapter05/Item29GenericTypesTest.java)
- **Item 30:** Favor generic methods — [`Item30GenericMethodsTest`](src/test/java/effectivejava/chapter05/Item30GenericMethodsTest.java)
- **Item 31:** Use bounded wildcards to increase API flexibility — [`Item31BoundedWildcardsTest`](src/test/java/effectivejava/chapter05/Item31BoundedWildcardsTest.java)
- **Item 32:** Combine generics and varargs judiciously — [`Item32GenericsAndVarargsTest`](src/test/java/effectivejava/chapter05/Item32GenericsAndVarargsTest.java)
- **Item 33:** Consider typesafe heterogeneous containers — [`Item33TypesafeHeterogeneousContainersTest`](src/test/java/effectivejava/chapter05/Item33TypesafeHeterogeneousContainersTest.java)

## Chapter 6: Enums and Annotations

- **Item 34:** Use enums instead of int constants — [`Item34EnumsOverIntConstantsTest`](src/test/java/effectivejava/chapter06/Item34EnumsOverIntConstantsTest.java)
- **Item 35:** Use instance fields instead of ordinals — [`Item35InstanceFieldsOverOrdinalsTest`](src/test/java/effectivejava/chapter06/Item35InstanceFieldsOverOrdinalsTest.java)
- **Item 36:** Use EnumSet instead of bit fields — [`Item36EnumSetTest`](src/test/java/effectivejava/chapter06/Item36EnumSetTest.java)
- **Item 37:** Use EnumMap instead of ordinal indexing — [`Item37EnumMapTest`](src/test/java/effectivejava/chapter06/Item37EnumMapTest.java)
- **Item 38:** Emulate extensible enums with interfaces — [`Item38ExtensibleEnumsTest`](src/test/java/effectivejava/chapter06/Item38ExtensibleEnumsTest.java)
- **Item 39:** Prefer annotations to naming patterns — [`Item39AnnotationsOverNamingPatternsTest`](src/test/java/effectivejava/chapter06/Item39AnnotationsOverNamingPatternsTest.java)
- **Item 40:** Consistently use the Override annotation — [`Item40OverrideAnnotationTest`](src/test/java/effectivejava/chapter06/Item40OverrideAnnotationTest.java)
- **Item 41:** Use marker interfaces to define types — [`Item41MarkerInterfacesTest`](src/test/java/effectivejava/chapter06/Item41MarkerInterfacesTest.java)

## Chapter 7: Lambdas and Streams

- **Item 42:** Prefer lambdas to anonymous classes — [`Item42LambdasOverAnonymousClassesTest`](src/test/java/effectivejava/chapter07/Item42LambdasOverAnonymousClassesTest.java)
- **Item 43:** Prefer method references to lambdas — [`Item43MethodReferencesTest`](src/test/java/effectivejava/chapter07/Item43MethodReferencesTest.java)
- **Item 44:** Favor the use of standard functional interfaces — [`Item44StandardFunctionalInterfacesTest`](src/test/java/effectivejava/chapter07/Item44StandardFunctionalInterfacesTest.java)
- **Item 45:** Use streams judiciously — [`Item45StreamsJudiciouslyTest`](src/test/java/effectivejava/chapter07/Item45StreamsJudiciouslyTest.java)
- **Item 46:** Prefer side-effect-free functions in streams — [`Item46SideEffectFreeStreamsTest`](src/test/java/effectivejava/chapter07/Item46SideEffectFreeStreamsTest.java)
- **Item 47:** Prefer Collection to Stream as a return type — [`Item47CollectionAsReturnTypeTest`](src/test/java/effectivejava/chapter07/Item47CollectionAsReturnTypeTest.java)
- **Item 48:** Use caution when making streams parallel — [`Item48ParallelStreamsTest`](src/test/java/effectivejava/chapter07/Item48ParallelStreamsTest.java)

## Chapter 8: Methods

- **Item 49:** Check parameters for validity — [`Item49ParameterValidityTest`](src/test/java/effectivejava/chapter08/Item49ParameterValidityTest.java)
- **Item 50:** Make defensive copies when needed — [`Item50DefensiveCopiesTest`](src/test/java/effectivejava/chapter08/Item50DefensiveCopiesTest.java)
- **Item 51:** Design method signatures carefully — [`Item51MethodSignaturesTest`](src/test/java/effectivejava/chapter08/Item51MethodSignaturesTest.java)
- **Item 52:** Use overloading judiciously — [`Item52OverloadingTest`](src/test/java/effectivejava/chapter08/Item52OverloadingTest.java)
- **Item 53:** Use varargs judiciously — [`Item53VarargsTest`](src/test/java/effectivejava/chapter08/Item53VarargsTest.java)
- **Item 54:** Return empty collections or arrays, not nulls — [`Item54EmptyCollectionsNotNullsTest`](src/test/java/effectivejava/chapter08/Item54EmptyCollectionsNotNullsTest.java)
- **Item 55:** Return optionals judiciously — [`Item55OptionalsTest`](src/test/java/effectivejava/chapter08/Item55OptionalsTest.java)
- **Item 56:** Write doc comments for all exposed API elements — [`Item56DocCommentsTest`](src/test/java/effectivejava/chapter08/Item56DocCommentsTest.java)

## Chapter 9: General Programming

- **Item 57:** Minimize the scope of local variables — [`Item57LocalVariableScopeTest`](src/test/java/effectivejava/chapter09/Item57LocalVariableScopeTest.java)
- **Item 58:** Prefer for-each loops to traditional for loops — [`Item58ForEachLoopsTest`](src/test/java/effectivejava/chapter09/Item58ForEachLoopsTest.java)
- **Item 59:** Know and use the libraries — [`Item59KnowTheLibrariesTest`](src/test/java/effectivejava/chapter09/Item59KnowTheLibrariesTest.java)
- **Item 60:** Avoid float and double if exact answers are required — [`Item60AvoidFloatAndDoubleTest`](src/test/java/effectivejava/chapter09/Item60AvoidFloatAndDoubleTest.java)
- **Item 61:** Prefer primitive types to boxed primitives — [`Item61PrimitivesOverBoxedTest`](src/test/java/effectivejava/chapter09/Item61PrimitivesOverBoxedTest.java)
- **Item 62:** Avoid strings where other types are more appropriate — [`Item62AvoidStringsTest`](src/test/java/effectivejava/chapter09/Item62AvoidStringsTest.java)
- **Item 63:** Beware the performance of string concatenation — [`Item63StringConcatenationTest`](src/test/java/effectivejava/chapter09/Item63StringConcatenationTest.java)
- **Item 64:** Refer to objects by their interfaces — [`Item64ReferByInterfacesTest`](src/test/java/effectivejava/chapter09/Item64ReferByInterfacesTest.java)
- **Item 65:** Prefer interfaces to reflection — [`Item65InterfacesOverReflectionTest`](src/test/java/effectivejava/chapter09/Item65InterfacesOverReflectionTest.java)
- **Item 66:** Use native methods judiciously — [`Item66NativeMethodsTest`](src/test/java/effectivejava/chapter09/Item66NativeMethodsTest.java)
- **Item 67:** Optimize judiciously — [`Item67OptimizeJudiciouslyTest`](src/test/java/effectivejava/chapter09/Item67OptimizeJudiciouslyTest.java)
- **Item 68:** Adhere to generally accepted naming conventions — [`Item68NamingConventionsTest`](src/test/java/effectivejava/chapter09/Item68NamingConventionsTest.java)

## Chapter 10: Exceptions

- **Item 69:** Use exceptions only for exceptional conditions — [`Item69ExceptionsForExceptionalConditionsTest`](src/test/java/effectivejava/chapter10/Item69ExceptionsForExceptionalConditionsTest.java)
- **Item 70:** Use checked exceptions for recoverable conditions and runtime exceptions for programming errors — [`Item70CheckedVsRuntimeExceptionsTest`](src/test/java/effectivejava/chapter10/Item70CheckedVsRuntimeExceptionsTest.java)
- **Item 71:** Avoid unnecessary use of checked exceptions — [`Item71AvoidUnnecessaryCheckedExceptionsTest`](src/test/java/effectivejava/chapter10/Item71AvoidUnnecessaryCheckedExceptionsTest.java)
- **Item 72:** Favor the use of standard exceptions — [`Item72StandardExceptionsTest`](src/test/java/effectivejava/chapter10/Item72StandardExceptionsTest.java)
- **Item 73:** Throw exceptions appropriate to the abstraction — [`Item73ExceptionTranslationTest`](src/test/java/effectivejava/chapter10/Item73ExceptionTranslationTest.java)
- **Item 74:** Document all exceptions thrown by each method — [`Item74DocumentExceptionsTest`](src/test/java/effectivejava/chapter10/Item74DocumentExceptionsTest.java)
- **Item 75:** Include failure-capture information in detail messages — [`Item75FailureCaptureMessagesTest`](src/test/java/effectivejava/chapter10/Item75FailureCaptureMessagesTest.java)
- **Item 76:** Strive for failure atomicity — [`Item76FailureAtomicityTest`](src/test/java/effectivejava/chapter10/Item76FailureAtomicityTest.java)
- **Item 77:** Don't ignore exceptions — [`Item77DontIgnoreExceptionsTest`](src/test/java/effectivejava/chapter10/Item77DontIgnoreExceptionsTest.java)

## Chapter 11: Concurrency

- **Item 78:** Synchronize access to shared mutable data — [`Item78SynchronizeSharedMutableDataTest`](src/test/java/effectivejava/chapter11/Item78SynchronizeSharedMutableDataTest.java)
- **Item 79:** Avoid excessive synchronization — [`Item79ExcessiveSynchronizationTest`](src/test/java/effectivejava/chapter11/Item79ExcessiveSynchronizationTest.java)
- **Item 80:** Prefer executors, tasks, and streams to threads — [`Item80ExecutorsTest`](src/test/java/effectivejava/chapter11/Item80ExecutorsTest.java)
- **Item 81:** Prefer concurrency utilities to wait and notify — [`Item81ConcurrencyUtilitiesTest`](src/test/java/effectivejava/chapter11/Item81ConcurrencyUtilitiesTest.java)
- **Item 82:** Document thread safety — [`Item82ThreadSafetyDocumentationTest`](src/test/java/effectivejava/chapter11/Item82ThreadSafetyDocumentationTest.java)
- **Item 83:** Use lazy initialization judiciously — [`Item83LazyInitializationTest`](src/test/java/effectivejava/chapter11/Item83LazyInitializationTest.java)
- **Item 84:** Don't depend on the thread scheduler — [`Item84ThreadSchedulerTest`](src/test/java/effectivejava/chapter11/Item84ThreadSchedulerTest.java)

## Chapter 12: Serialization

- **Item 85:** Prefer alternatives to Java serialization — [`Item85AlternativesToSerializationTest`](src/test/java/effectivejava/chapter12/Item85AlternativesToSerializationTest.java)
- **Item 86:** Implement Serializable with great caution — [`Item86SerializableTest`](src/test/java/effectivejava/chapter12/Item86SerializableTest.java)
- **Item 87:** Consider using a custom serialized form — [`Item87CustomSerializedFormTest`](src/test/java/effectivejava/chapter12/Item87CustomSerializedFormTest.java)
- **Item 88:** Write readObject methods defensively — [`Item88ReadObjectDefensivelyTest`](src/test/java/effectivejava/chapter12/Item88ReadObjectDefensivelyTest.java)
- **Item 89:** For instance control, prefer enum types to readResolve — [`Item89EnumOverReadResolveTest`](src/test/java/effectivejava/chapter12/Item89EnumOverReadResolveTest.java)
- **Item 90:** Consider serialization proxies instead of serialized instances — [`Item90SerializationProxiesTest`](src/test/java/effectivejava/chapter12/Item90SerializationProxiesTest.java)
