package me.m41k0n.info_musicos;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class GptChatRequest {
    public static String getInfo(String nameArtist) {
        OpenAiService service = new OpenAiService(System.getenv("SECRET_OPENAPI"));
        CompletionRequest request = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("faça um resumo da briografia desse artista: " + nameArtist)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var response = service.createCompletion(request);
        return response.getChoices().get(0).getText();
    }
}