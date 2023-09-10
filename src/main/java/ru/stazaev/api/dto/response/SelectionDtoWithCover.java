package ru.stazaev.api.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import ru.stazaev.store.entitys.PictureType;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectionDtoWithCover {
    @Schema(example = "my-new")
    private String tag;
    @Schema(example = "Для вечеринки")
    private String name;
    private List<FilmDto> films = new ArrayList<>();
    ResponsePictureDto pictureDto;
}