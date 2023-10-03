package com.mps.consumeData.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgBox {
    private List<MsgDto> msgBoxes=new ArrayList<>();
}
