# 🚀 Research Assistant – Spring Boot + Gemini API

A Spring Boot-based REST API that uses **Google's Gemini 1.5 Flash** model to help process research content. This backend allows users to send raw text and perform operations like summarizing or generating topic suggestions using AI.

---

## 🔍 Features

- Accepts content and an operation via a POST request.
- Supported operations:
  - `summarize`: Generates a concise summary of the given content.
  - `suggest`: Recommends related topics and further reading.
- Uses `WebClient` for non-blocking API calls.
- JSON response parsing via Jackson.

---

## ⚙️ Tech Stack

- Java 17  
- Spring Boot  
- WebClient  
- Lombok  
- Jackson  
- Gemini API (Google Generative Language)

---

