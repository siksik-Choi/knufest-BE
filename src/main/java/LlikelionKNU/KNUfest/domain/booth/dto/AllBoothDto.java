package LlikelionKNU.KNUfest.domain.booth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class AllBoothDto {
    private int count;
    private List<BoothDto> boothDtoes;
}
