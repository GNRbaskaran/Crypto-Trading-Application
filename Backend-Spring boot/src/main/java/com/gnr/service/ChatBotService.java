package com.gnr.service;

import com.gnr.model.CoinDTO;
import com.gnr.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
