package kr.silee.chapter5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Trader
{
    private final String name;
    private final String city;
}
