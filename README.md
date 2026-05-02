# 🛒 E-Commerce Automation Framework
#
## 📌 Project Overview
This project is a Selenium-based Automation Framework developed using Java, TestNG, and Maven.  
It follows the Page Object Model (POM) design pattern and supports parallel execution with thread-safe WebDriver handling.

---

## 🛠️ Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports

---

## 🚀 Key Features
- Page Object Model (POM) for maintainable test design
- Parallel execution using ThreadLocal WebDriver
- TestNG framework integration
- TestNG Groups (Smoke & Regression)
- Extent Reports for test reporting
- Screenshot capture on test failure
- Retry mechanism for failed test cases
- Listener implementation (ITestListener)

---

## 🧪 Test Scenarios Covered
- ✅ Login Functionality Test
- ✅ Add to Cart Test

---

## 📂 Project Structure
ECommerceAutomationFramework
│
├── src/test/java
│ ├── com.base # Base setup (WebDriver initialization)
│ ├── com.tests # Test classes (LoginTest, CartTest)
│ ├── com.pages # Page Object classes
│ ├── com.utils # Utilities (Screenshot, Retry)
│ ├── com.listeners # TestNG Listeners
│ ├── com.reports # Extent Report setup
│
├── Screenshots # Failure screenshots
├── test-output # TestNG default reports
├── testng.xml # Test suite configuration
├── pom.xml # Maven dependencies


---

## ▶️ How to Run the Project
1. Import project into Eclipse
2. Right-click on `testng.xml`
3. Click **Run As → TestNG Suite**

---

## ⚙️ Execution Types
- Smoke Tests
- Regression Tests
- Parallel Execution (multi-threaded)

---

## 📊 Reports
- Extent Report is generated after execution
- Screenshots are captured for failed test cases
- TestNG reports available in `test-output` folder

---

## 🔁 Retry Mechanism
Failed test cases are automatically retried using TestNG `IRetryAnalyzer`.

---

## 🧠 Framework Highlights
- Thread-safe WebDriver using ThreadLocal
- Scalable and modular architecture
- Suitable for CI/CD integration
- Designed as per industry standards

---

## 👩‍💻 Author
Sharmila C