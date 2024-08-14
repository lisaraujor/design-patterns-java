# About this project
I am developing this project with the aim of putting into practice my studies on Design Patterns and SOLID Principles in Java.


## S.O.L.I.D. Principles

### 1) Single Responsibility:
A class should have one responsibility, so it should have only one reason to change.

    1.1) In Sales project example, Sale is only responsible for representing a sale and SalesReport is only responsible for generating sales report;

### 2) Open-closed Principle:
Open for extension, closed for modification; we should not modify existing code, only add new extensions.

### 3) Liskov Substitution:
Any instance of a derived class should be substitutable for an instance of its base class without affecting the correctness of the program.
    
    3.1) In my example, CreditCard/DebitCard are instances of abstract class (extends) NubankCard, which implements InterfacePaymentInstrument. When I replace them with NubankRewards, which implements InterfacePaymentInstrument (just like NubankCard does), this change doesn't affect the program.

### 4) Interface Segregation:
This principle focuses on designing interfaces (or abstract classes) that are specific to their client's needs; no client should be forced to depend on methods it does not use. Instead of creating a large interface that covers all the possible methods, it's better to create smaller, more focused interfaces for specific use cases. This approach results in interfaces that are more cohesive and less coupled.
    
    4.1) sjdaskjdh




