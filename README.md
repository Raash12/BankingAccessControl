
---

## Classes Description

### `bank.Account`
- Represents a simple bank account with:
  - `private` fields: `accountNumber`, `balance`
  - `protected` method: `deposit(double amount)` – accessible to subclasses
  - `default/package-private` method: `withdraw(double amount)` – accessible only within the same package
  - `private` method: `applyInternalFee()` – only accessible inside the class
  - `public` method: `applyMonthlyFee()` – calls the internal private fee method
- Demonstrates **encapsulation** and **controlled access** to data.

### `bank.BankTest`
- Tests `Account` methods from the **same package**.
- Shows that all access levels (`private`, `protected`, `default`, `public`) behave as expected within the same package.

### `testbank.TestAccess`
- Tests access to `Account` from **another package**.
- Only `public` and `protected` (through inheritance) methods are accessible.
- Shows that `withdraw` (default) and `applyInternalFee` (private) are **not accessible** outside the `bank` package.

### `testbank.PremiumAccount`
- Subclass of `Account`.
- Can access the `protected` `deposit()` method from the parent class.
- Demonstrates **inheritance and protected access**.

### `testbank.TestPremium`
- Tests `PremiumAccount` functionality.
- Shows how a subclass can use protected methods from the parent class, even when the subclass is in a different package.

---

## Key Concepts Demonstrated
1. **Java Access Modifiers**
   - `private`: Accessible only within the same class.
   - `default (package-private)`: Accessible only within the same package.
   - `protected`: Accessible in the same package and in subclasses.
   - `public`: Accessible from anywhere.

2. **Inheritance**
   - Subclasses inherit methods and can access `protected` members.

3. **Encapsulation**
   - Sensitive data (`balance`) is kept private with controlled access through methods.

4. **Package Organization**
   - Demonstrates how Java packages affect accessibility of class members.

---

# Compile bank package
javac bank/*.java

# Compile testbank package (ensure bank package is in classpath)
javac -cp . testbank/*.java
Run the tests

bash
Copy code
# Run BankTest
java -cp . bank.BankTest

# Run TestAccess
java -cp . testbank.TestAccess

# Run TestPremium
java -cp . testbank.TestPremium
Expected Output
BankTest.java

yaml
Copy code
Account No: ACC123
Balance: 1000.0
Deposited 300.0. Balance: 1300.0
Withdrawn 100.0. Balance: 1200.0
Internal fee applied. Balance: 1195.0
TestAccess.java

yaml
Copy code
Account No: EXT123
Balance: 2000.0
Internal fee applied. Balance: 1995.0
TestPremium.java

yaml
Copy code
Premium Balance: 6000.0
Learning Outcomes
Understand how access modifiers control visibility across packages.

Learn how inheritance allows subclasses to access protected members.

Practice Java package structure and compilation/run commands.

Understand encapsulation and controlled access of sensitive data.



