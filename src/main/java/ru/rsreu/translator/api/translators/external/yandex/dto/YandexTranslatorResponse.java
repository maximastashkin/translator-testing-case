package ru.rsreu.translator.api.translators.external.yandex.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class YandexTranslatorResponse {
    private List<YandexTranslationEntity> translations;
}
