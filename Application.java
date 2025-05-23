package mainProgram;

public class Application {

	public static void main(String[] args) {
		// Start the Spring Boot application
				ApplicationContext context = SpringApplication.run(Application.class, args);

				// Test the chatbot
				testChatbot(context);
			}

			private static void testChatbot(ApplicationContext context) {
				// Get the ChatbotService bean
				ChatbotService chatbotService = context.getBean(ChatbotService.class);

				// Define a session ID for testing
				String sessionId = "test-session-1";

				// Send a test message
				String testMessage = "Hello, chatbot, what is your name?";
				String response = chatbotService.getChatbotResponse(sessionId, testMessage);

				// Print the chatbot's response
				System.out.println("User: " + testMessage);
				System.out.println("Chatbot: " + response);
			}
		

	}


