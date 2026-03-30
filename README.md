# FinVault — Cloud Native Microservices Banking Platform

A production-grade digital banking platform built with Java and 
Spring Boot following microservices architecture.

## Services
- Account Service (port 8081) — manages bank accounts
- Transaction Service (port 8082) — handles money transfers
- Notification Service (port 8083) — email and SMS alerts
- Auth Service (port 8084) — JWT security and OAuth2
- AI Service (port 8085) — spending insights via OpenAI
- API Gateway (port 8080) — single entry point
- Eureka Server (port 8761) — service discovery

## Tech Stack
Java 21, Spring Boot 3.5, Spring Cloud, Spring Security,
JWT, OAuth2, PostgreSQL, Apache Kafka, Docker, Kubernetes,
GitHub Actions, Prometheus, Grafana, Spring AI

## Architecture
Microservices | Event Driven | REST API | CI/CD | Cloud Native
