package com.project.SpringTGBot.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/start", "Start bot"),
            new BotCommand("/help", "bot info")
    );

    String HELP_TEXT = "This bot will help to count the number of messages in the chat. " +
            "The following commands are available to you:\n\n" +
            "/start - Start bot\n" +
            "/help - bot info";

    public class Buttons {
        private static final InlineKeyboardButton START_BUTTON = new InlineKeyboardButton("Start");
        private static final InlineKeyboardButton HELP_BUTTON = new InlineKeyboardButton("Help");

        public static InlineKeyboardMarkup inlineMarkup() {
            START_BUTTON.setCallbackData("/start");
            HELP_BUTTON.setCallbackData("/help");

            List<InlineKeyboardButton> rowInline = List.of(START_BUTTON, HELP_BUTTON);
            List<List<InlineKeyboardButton>> rowsInLine = List.of(rowInline);

            InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
            markupInline.setKeyboard(rowsInLine);

            return markupInline;
        }
    }
}
