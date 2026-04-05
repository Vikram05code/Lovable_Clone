package com.vikram.lovable_clone.mapper;

import com.vikram.lovable_clone.dto.chat.ChatResponse;
import com.vikram.lovable_clone.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
