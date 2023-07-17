package com.reihaneh.bakeryshop.service.impl;

import com.reihaneh.bakeryshop.domain.LoginHistory;
import com.reihaneh.bakeryshop.repository.LoginHistoryRepository;
import com.reihaneh.bakeryshop.service.LoginHistoryService;
import com.reihaneh.bakeryshop.service.dto.LoginHistoryDto;
import org.springframework.stereotype.Service;

@Service
public class LoginHistoryServiceImpl extends BaseServiceImpl<LoginHistory, LoginHistoryDto, LoginHistoryRepository, Long> implements LoginHistoryService {

    public LoginHistoryServiceImpl(LoginHistoryRepository repository) {
        super(repository, LoginHistory.class, LoginHistoryDto.class);
    }
}
