# Spring Boot Email Notification Service

This is a Sample Template Spring Boot application that sends an email notification where you can use
when there's a failure in making an HTTP outbound call or any kind of use cases.

## Prerequisites

* Java 17
* Springboot 3.1.2 
* Gradle 8.2.1
* A Gmail account

## Dependencies

* Spring Boot Starter Mail

## Getting Started

### Clone the repository

```
git clone https://github.com/markortiz905/template-springboot-email-notification.git
```

### Configuration

Set your Gmail username and password in the `application.yml` file:

```yaml
spring:
  mail:
    host: smtp.gmail.com
    port: 587
    username: your-email@gmail.com
    password: your-email-password
    properties.mail.smtp:
      auth: true
      starttls.enable: true
```

**Please note:**

- You might need to enable "Less secure apps" in your Google account to let the application send an email. This option is in the Google Account Settings, under the Security tab. However, it's not recommended for production applications because it makes your account more vulnerable.
- If you have two-factor authentication (2FA) enabled for your Google account, you will need to generate and use an App Password instead of your regular password. You can generate an App Password from your Google Account settings.
- Storing sensitive information, like email and password, in your configuration files is not a best practice. Consider using environment variables or a secure secret management system instead.
- Frequent or large-scale email sending may be subject to Gmail's usage limits. If you plan to send a large number of emails, consider using a professional transactional email service like SendGrid, Mailgun, or AWS SES.

### Build and Run

Navigate to the project directory and use Gradle to build and run the project:

```
gradlew bootRun
```

## How it Works

TBW

## Contributing

If you want to contribute to this project, please submit a pull request.
You can also raise an issue or improvement.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
