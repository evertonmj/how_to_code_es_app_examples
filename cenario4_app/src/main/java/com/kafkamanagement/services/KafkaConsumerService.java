
package com.kafkamanagement.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkamanagement.models.Transfer;
import com.kafkamanagement.models.User;
import com.kafkamanagement.repositories.TransferRepository;
import com.kafkamanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TransferRepository transferRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "kafka_topic", groupId = "kafka-group")
    public void consume(String message) throws Exception {
        // Aqui identificamos o tipo de mensagem e processamos conforme o tipo.
        if (message.contains("register")) {
            User user = objectMapper.readValue(message, User.class);
            userRepository.save(user);
        } else if (message.contains("transfer")) {
            Transfer transfer = objectMapper.readValue(message, Transfer.class);
            transferRepository.save(transfer);
        } else if (message.contains("login")) {
            // Processar um login (poderia incluir lógica de autenticação)
            System.out.println("Login recebido: " + message);
        }
    }
}
