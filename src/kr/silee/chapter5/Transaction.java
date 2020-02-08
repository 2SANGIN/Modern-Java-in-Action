package kr.silee.chapter5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Transaction
{
    private final Trader trader;
    private final int    year;
    private final int    value;
}
