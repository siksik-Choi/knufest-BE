package LlikelionKNU.KNUfest.domain.booth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Booth {
    Long id;
    String boothName;
    int likes;
    boolean Likable;
}
